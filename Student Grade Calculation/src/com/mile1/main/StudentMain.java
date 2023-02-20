package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

	static Student data[] = new Student[6];
    static{
        // for(int i=0; i<data.length; i++){

        // }
        // data[0] = new Student("Sekar", new int[] {35,35,35});
        // data[1] = new Student(null, new int[] {35,35,35});
        // data[2] = null;
        // data[3] = new Student("Manoj", null);

        data[0] = new Student("A1", new int[] {85,80,90});
        data[1] = new Student("B1", new int[] {50,50,50});
        data[2] = new Student("C1", new int[] {13,99,13});
        data[3] = null;
        data[4] = new Student(null, new int[] {13,88,13});
        data[5] = new Student("C3", null);
//        data[6] = new Student("A2", new int[] {77,55,12});
//        data[7] = new Student("A5", new int[] {13,88,13});

    }

    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();
        System.out.println("Grade Calculation: ");
        String resultGrade = null;

        for(int i=0; i<data.length; i++){
            try{
                resultGrade = studentReport.validate(data[i]);
            }
            catch(NullNameException e){
                resultGrade = "NullNameException occured";
            }
            catch(NullMarksArrayException e){
                resultGrade = "NullMarksArrayException occured";
            }
            catch(NullStudentException e){
                resultGrade = "NullStudentException occured";
            }
            System.out.println("GRADE = " + resultGrade);
        }
        System.out.println("Number of objects with Marks array as null = " + studentService.findNumberOfNullMarks(data));
        System.out.println("Number of objects with Name array as null = " + studentService.findNumberOfNullNames(data));
        System.out.println("Number of objects that are entirely null = " + studentService.findNumberOfNullObjects(data));

    }
}
