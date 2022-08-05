package com.maga.jreportnginteg.common;

import java.nio.file.Paths;

public class Util
{
    /**
     * Log error message {@code mesg} and exit.
     *
     * @param mesg Error message
     */
    public static void die(String mesg)
    {
        die(mesg, null);
    }

    /**
     * Log error message {@code mesg}, exception {@code e} and exit.
     * 
     * @param mesg Error message
     * @param e Exception
     */
    public static void die(String mesg, Exception e)
    {
        if (mesg == null)
            mesg = "Error occured during test run";

        if (e == null)
            e = new Exception(mesg);

        System.out.println(mesg);
        e.printStackTrace();
        System.exit(1);
    }

    public static String getNormalizePath(String first, String... more)
    {
        if (first == null)
            return null;
        return Paths.get(first, more).normalize().toFile().getPath().replace("\\", "/");
    }
}
