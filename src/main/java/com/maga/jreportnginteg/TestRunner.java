package com.maga.jreportnginteg;

import java.util.*;
import org.testng.*;
import org.testng.xml.XmlSuite.FailurePolicy;
import com.github.cafeduke.jreportng.TestListener;
import com.maga.jreportnginteg.common.TestUtil;

public class TestRunner
{
   static
   {
      System.setProperty("jreport.org.prefix", "com.maga");
   }
   
   public static void main (String arg[])
   {
      TestNG testNG = new TestNG ();
      testNG.setVerbose(1);
      testNG.setConfigFailurePolicy(FailurePolicy.CONTINUE);  
      testNG.setListenerClasses(Arrays.asList(TestListener.class));
      
      List<String> listSuite = new ArrayList<String> ();
      listSuite.add(TestUtil.DIR_JREPORT_TEST_RESOURCE + "/Suite.xml");
      testNG.setTestSuites(listSuite);      
      testNG.run();
   }
}
