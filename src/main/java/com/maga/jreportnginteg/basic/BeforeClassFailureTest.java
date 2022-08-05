package com.maga.jreportnginteg.basic;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.cafeduke.jreportng.AbstractTestCase;

public class BeforeClassFailureTest extends AbstractTestCase
{
    @BeforeClass
    public void setup()
    {
        logger.info("setup -- @BeforeClass failed");
        Assert.assertTrue(false, "Setup failed");
    }

    @Test
    public void test()
    {
        logger.info("Test -- setup failed");
    }

    @AfterClass
    public void cleanup()
    {
        logger.info("cleanup");
        Assert.assertTrue(false, "Setup failed");
    }
}
