package com.maga.jreportnginteg.common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.github.cafeduke.jreportng.AbstractTestCase;

public class TestCase extends AbstractTestCase
{
    private int id = -1;

    @BeforeClass
    @Parameters("id")
    public void beginClass(String id)
    {
        this.id = Integer.parseInt(id);
        logger.info(String.format("[Class=%s ohs-id=%d] Class level setup", this.getClass().getName(), this.id));
    }

    @AfterClass
    public void finishClass()
    {
        logger.info(String.format("[Class=%s ohs-id=%d] Class level cleanup", this.getClass().getName(), this.id));
    }
}
