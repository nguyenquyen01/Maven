/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.studentapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("S001", "John Doe", 20);
    }

    @Test
    public void testGetStudentId() {
        assertEquals("S001", student.getStudentId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    public void testSetAge() {
        student.setAge(25);
        assertEquals(25, student.getAge());
    }

    @Test
    public void testUpdateName() {
        student.updateName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }
}
