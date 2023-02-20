package com.mile1.service;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	@Test
	public String findGrade(Student studentObject){
	       int[] marks = studentObject.getMarks();
	       int sum = 0;
	       String grade = "";
	       for(int mark: marks){
	           if(mark<35)
	                grade = "F";
	            else{
	                sum += mark;
	                if(sum <= 150)
	                    grade = "D"; 
	                else if(sum >= 150 && sum <= 200)
	                    grade = "C";
	                else if(sum >= 200 && sum <= 250)
	                    grade = "B";
	                else if(sum >= 250 && sum <= 300)
	                    grade = "A";
	            }
	       }
	    return grade;
	    }

		@Test
	    public String validate(Student studentObject) throws NullStudentException, NullNameException, NullMarksArrayException{
	        String gradeScored = "";
	        if(studentObject == null)
	            throw new NullStudentException();
	        else{
	            if(studentObject.getName() == null)
	                throw new NullNameException();
	            else if(studentObject.getMarks() == null)
	                throw new NullMarksArrayException();
	            else
	                gradeScored = findGrade(studentObject);
	        }
	        return gradeScored;
	    }
}
