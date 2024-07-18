package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Base64DecoderTest {
    private Base64Decoder decoder;

    @Before
    public void setup() {
        this.decoder = new Base64Decoder();
    }

    @Test
    public void testDecode() {
        assertEquals("Text01", decoder.decodeBase64("VGV4dDAx"));
    }
}