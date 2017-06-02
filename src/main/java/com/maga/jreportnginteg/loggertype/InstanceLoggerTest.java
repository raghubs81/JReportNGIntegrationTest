package com.maga.jreportnginteg.loggertype;

import org.testng.annotations.*;
import com.github.cafeduke.jreportng.AbstractTestCase;
import com.maga.jreportnginteg.common.TestUtil;

public class InstanceLoggerTest extends AbstractTestCase
{
   @BeforeClass
   public void setup ()
   {
      TestUtil.sleepAndLog (logger, "BeforeClass", 101);
   }
   
   @Test
   public void testA ()
   {
      TestUtil.sleepAndLog (logger, "testA", 301);
   }

   @Test
   public void testB ()
   {
      TestUtil.sleepAndLog (logger, "testB", 301);
   }
   
   @AfterClass
   public void clean()
   {
      TestUtil.sleepAndLog (logger, "AfterClass", 101);
   }   
}