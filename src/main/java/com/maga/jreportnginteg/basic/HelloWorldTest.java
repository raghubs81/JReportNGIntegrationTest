package com.maga.jreportnginteg.basic;

import org.testng.annotations.*;
import com.github.cafeduke.jreportng.AbstractTestCase;

public class HelloWorldTest extends AbstractTestCase
{       
   @Test
   public void testA ()
   {
      logger.info ("HelloWorld");
   } 
}
