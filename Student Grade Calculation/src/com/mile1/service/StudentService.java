package com.mile1.service;

import org.junit.Test;

import com.mile1.bean.Student;

public class StudentService {

	@Test
	public int findNumberOfNullMarks(Student data[]){
        int countMarks = 0;
        for(int i=0; i<data.length; i++){
            if(data[i] == null){}
            else if(data[i].getMarks() == null)
                countMarks++;
        }
        return countMarks;
    }
    
	@Test
    public int findNumberOfNullNames(Student data[]){
        int countNames = 0;
        for(int i=0; i<data.length; i++){
            if(data[i] == null){}
            else if(data[i].getName() == null)
                countNames++;
        }
        
        return countNames;
    }

	@Test
    public int findNumberOfNullObjects(Student data[]){
        int countObjects = 0;
        for(int i=0; i<data.length; i++){
            if(data[i] == null)
                countObjects++;
        }
        
        return countObjects;
    }
}
