package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EncodeTest {
    private Base64Encoder encoder;

    @Before
    public void setup() {
        this.encoder = new Base64Encoder();
    }

    @Test
    public void testEncode3() {
        assertEquals("VGV4dDAx",encoder.encode("Text01"));
    }




}