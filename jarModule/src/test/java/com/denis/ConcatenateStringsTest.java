package com.denis;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConcatenateStringsTest {

    @Test
    public void testConcatenate() throws Exception {
        String result = ConcatenateStrings.concatenate("Hey" , "you");
        assertNotNull(result);
        assertEquals("Heyyou", result);
    }

    @Test
    public void testConcatenate_If_Strings_Are_Null() throws Exception {

        String result = ConcatenateStrings.concatenate(null, "hey");
        assertEquals("Please fill in all fields!", result);

        result = ConcatenateStrings.concatenate("hey", null);
        assertEquals("Please fill in all fields!", result);

        result = ConcatenateStrings.concatenate(null, null);
        assertEquals("Please fill in all fields!", result);

    }

    @Test
    public void testConcatenate_If_Strings_Are_Empty() throws Exception {

        String result = ConcatenateStrings.concatenate("", "");
        assertEquals("Please fill in all fields!", result);


    }


}