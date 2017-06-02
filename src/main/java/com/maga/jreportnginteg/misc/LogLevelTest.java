package com.maga.jreportnginteg.misc;

import java.util.logging.Logger;
import org.testng.annotations.*;

import com.github.cafeduke.jreportng.AbstractTestCase;
import com.github.cafeduke.jreportng.JReportLogger;

public class LogLevelTest extends AbstractTestCase
{
   @JReportLogger
   public static Logger logger;
   
   @Test
   public void test ()
   {
      logger.severe("Severe");
      logger.warning("Warning");
      logger.info("Info");
      logger.fine("Fine");
      logger.finer("Finer");
      logger.finest("Finest");
   }
}
