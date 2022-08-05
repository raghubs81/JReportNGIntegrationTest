package com.maga.jreportnginteg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.cafeduke.jreportng.LoggerFactory;

public class TestUtil
{
    public static final File DIR_JREPORT_TEST_RESOURCE = new File("src/main/resources");

    private TestUtil()
    {

    }

    public static void sleepInMilli(int milli)
    {
        try
        {
            Thread.sleep(milli);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void sleep(int sec)
    {
        sleepInMilli(sec * 1000);
    }

    public static void sleepAndLog(Logger logger, String mesg, int sleepInMilli)
    {
        sleepInMilli(sleepInMilli);
        System.out.println(mesg);
        logger.info(mesg);
    }

    /**
     * Invoke exitFatal (message, e, testClass);
     */
    public static void exitFatal(String message, Exception e, Class<?> testClass)
    {
        exitFatal(message, e, testClass, null);
    }

    /**
     * Exit all tests with fatal {@code message}. Create a .dif file with error {@code message} and stack trace.
     * Append {@code difPrefix} to the name of the .dif file. Exception {@code e} should have the stack trace.
     * 
     * @param message Fatal Error message
     * @param difPrefix Dif prefix
     * @param e Fatal exception.
     */
    public static void exitFatal(String message, Exception e, Class<?> testClass, String prefix)
    {
        prefix = (prefix == null) ? "" : ("." + prefix);
        String fileName = testClass.getName() + prefix + ".fatal.dif";
        Logger logger = LoggerFactory.getJReportLogger(testClass);
        try
        {
            message = "[FATAL] " + message;
            PrintWriter out = new PrintWriter(new FileWriter(fileName));
            e.printStackTrace(out);
            out.close();
            logger.log(Level.SEVERE, message, e);
        }
        catch (IOException ie)
        {
            logger.log(Level.SEVERE, "Error writing fatal dif '" + fileName + "'");
        }
        finally
        {
            Util.die(message, e);
        }
    }
}
