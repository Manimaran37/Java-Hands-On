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

public class StudentGradeCalculationTest {
	Student[] data;
	StudentReport studentReport;
	StudentService studentService;
	String[] expectedStrings;
	int[] expectedNullValues;
	int[] resultNullValues;
	
	@Before
	public void setUp() throws Exception {
		data = new Student[6];

        data[0] = new Student("A1", new int[] {85,80,90});
        data[1] = new Student("B1", new int[] {50,50,50});
        data[2] = new Student("C1", new int[] {13,99,13});
        data[3] = null;
        data[4] = new Student(null, new int[] {13,88,13});
        data[5] = new Student("C3", null);
        
        expectedStrings = new String[] {"A", "D", "F","NullStudentException", "NullNameException", "NullMarksArrayException"};
        expectedNullValues = new int[] {1, 1, 1};
	}

	@Test
	public void test() {
		studentReport = new StudentReport();
		studentService = new StudentService();
		String[] resultStrings = new String[expectedStrings.length];
		resultNullValues = new int[expectedNullValues.length];
		for(int i=0; i<data.length; i++){
            try{
                resultStrings[i] = studentReport.validate(data[i]);
            }
            catch(NullNameException e){
                resultStrings[i] = "NullNameException";
                resultNullValues[i-expectedNullValues.length] = studentService.findNumberOfNullNames(data); 
            }
            catch(NullMarksArrayException e){
                resultStrings[i] = "NullMarksArrayException";
                resultNullValues[i-expectedNullValues.length] = studentService.findNumberOfNullMarks(data); 

            }
            catch(NullStudentException e){
                resultStrings[i] = "NullStudentException";
                resultNullValues[i-expectedNullValues.length] = studentService.findNumberOfNullObjects(data); 

            }
            assertEquals(expectedStrings[i], resultStrings[i]);
            
        }
		for(int j=0; j<resultNullValues.length; j++) {
			assertEquals(expectedNullValues[j], resultNullValues[j]);
		}
		
	}

}
