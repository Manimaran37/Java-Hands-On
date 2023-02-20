package com.mile1.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class ATest {
	
	Student data;
	StudentReport studentReport;
	String expected;

	@Before
	public void setUp() throws Exception {
		data = new Student("Mani", new int[] {85,80,90});
        expected = "A";
	}

	@Test
	public void test() {
		studentReport = new StudentReport();
		try {
			String resultGrade = studentReport.validate(data);
			assertEquals(expected, resultGrade);
		} catch (NullStudentException e) {
			e.printStackTrace();
		} catch (NullNameException e) {
			e.printStackTrace();
		} catch (NullMarksArrayException e) {
			e.printStackTrace();
		}
	}

}
