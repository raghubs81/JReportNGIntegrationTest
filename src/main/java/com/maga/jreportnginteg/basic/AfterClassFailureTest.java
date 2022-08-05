package com.maga.jreportnginteg.basic;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.cafeduke.jreportng.AbstractTestCase;

public class AfterClassFailureTest extends AbstractTestCase
{
    @BeforeClass
    public void setup()
    {
        logger.info("setup");
    }

    @Test
    public void test()
    {
        logger.info("Test");
    }

    @AfterClass
    public void cleanup()
    {
        logger.info("cleanup");
        Assert.assertTrue(false, "clenaup failed");
    }
}
