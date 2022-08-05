package com.maga.jreportnginteg.packB;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maga.jreportnginteg.common.TestCase;
import com.maga.jreportnginteg.common.TestUtil;

public class ClassB1 extends TestCase
{
    @BeforeClass
    public void setup()
    {
        TestUtil.sleepAndLog(logger, "Setup", 25);
    }

    @Test
    public void test()
    {
        TestUtil.sleepAndLog(logger, "Test " + getClass().getSimpleName(), 100);
    }

    @AfterClass
    public void clean()
    {
        TestUtil.sleepAndLog(logger, "Clean", 25);
    }
}
