package com.maga.jreportnginteg.basic;

import org.testng.Assert;
import org.testng.annotations.*;
import com.github.cafeduke.jreportng.AbstractTestCase;
import com.maga.jreportnginteg.common.TestUtil;

public class BasicTestFailure extends AbstractTestCase
{
   @BeforeClass
   public void setup ()
   {
      TestUtil.sleepAndLog (logger, "BeforeClass", 101);
   }
   
   @Test
   public void testWorks ()
   {
      TestUtil.sleepAndLog (logger, "testA", 301);
   }

   @Test
   public void testFails ()
   {
      Assert.assertTrue(false);
      TestUtil.sleepAndLog (logger, "Does not reach", 301);
   }
   
   @Test (dependsOnMethods="testFails")
   public void testDependsOnFailure01 ()
   {
      TestUtil.sleepAndLog (logger, "Does not reach", 301);
   }
   
   @Test (dependsOnMethods="testFails")
   public void testDependsOnFailure02 ()
   {
      TestUtil.sleepAndLog (logger, "Does not reach", 301);
   }
   
   @AfterClass
   public void clean()
   {
      TestUtil.sleepAndLog (logger, "AfterClass", 101);
   }   
}