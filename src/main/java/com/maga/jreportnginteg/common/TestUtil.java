package com.maga.jreportnginteg.common;

import java.io.File;
import java.util.logging.Logger;

public class TestUtil
{
   public static final File DIR_JREPORT_TEST_RESOURCE = new File ("src/main/resources");
   
   private TestUtil ()
   {
      
   }
   
   public static void sleepInMilli (int milli)
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
   
   public static void sleep (int sec)
   {
      sleepInMilli(sec * 1000);
   }   
   
   public static void sleepAndLog (Logger logger, String mesg, int sleepInMilli)
   {
      sleepInMilli (sleepInMilli);
      System.out.println(mesg);
      logger.info (mesg);      
   }
}
