/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.test;

import com.ecommerce.hello.utilities.Tag;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ananda
 */
public class TagTest {

    public TagTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("i am before class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("i am after class");
    }

    @Before
    public void setUp() {
        System.out.println("i am before");
    }

    @After
    public void tearDown() {
        System.out.println("i am after");
    }

    @Test
    public void hello() {
        System.out.println("i am real logic");
    }

    @Test
    public void tagTest() {
        String[] a = new String[]{"food"};
        String expected = "food";
        assertEquals(expected, Tag.convertTag(a));
        // System.out.println(Tag.convertTag(a));
    }

    @Test
    public void idTest() {
        int expected = 1;
        assertEquals(expected, 1);
    }

    @Test
    public void nameTest() {
        String expected = "ananda";
        assertEquals(expected, "ananda");
    }
}
