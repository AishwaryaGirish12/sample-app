package com.myorg.project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {

    @Test
    public void testBuildMessage() {

        String result = App.buildMessage("DevOps Pipeline");
        assertEquals("Welcome to DevOps Pipeline! Maven build successful.", result);
    }

    @Test
    public void testBuildMessageNotNull() {

        String result = App.buildMessage("Test");
        assertNotNull(result);
    }
}
