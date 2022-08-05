package com.maga.jreportnginteg.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.cafeduke.jreportng.AbstractTestCase;

public class BasicFailureTest extends AbstractTestCase
{
    @Test
    public void testA()
    {
        logger.info("Basic failure test");
        Assert.assertTrue(false, "Assertion failed");
    }
}
