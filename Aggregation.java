package com.Aggregation;
import java.io.*;
import java.util.*;

class Student
{
    String name;
    int id;
    String dept;

    Student(String name,int id,String dept)
    {
        this.name = name;
        this.id   = id;
        this.dept = dept;
    }
}
/*Department class contains list of student
 * Objects.It is associated with Student
 * class through its Object.
 */
class Department
{
    String name;
    private List<Student> students;
    Department(String name,List<Student>students)
    {
        this.name     = name;
        this.students = students;
    }

    public List<Student>getStudent()
    {
        return students;
    }

}

/*Institute class constains list of Department
 * Object.It is associated with Department
 * class through its Object
 */
class Institute
{
    String instituteName;
    private List<Department> departments;

    Institute(String instituteName,List<Department>departments)
    {
        this.instituteName = instituteName;
        this.departments   = departments;
    }
    //count total students of all departments in given institute.
    public int getTotalStudentInstitute()
    {
        int noOfStudent = 0;
        List<Student>students;
        for(Department dept:departments)
        {
            students = dept.getStudent();
            for(Student s:students)
            {
                noOfStudent++;
            }
        }
        return noOfStudent;
}
}
class AggExecute
{
    public static void main(String[]args)
    {
        Student s1 = new Student("annnie",1111,"CSE");
        Student s2 = new Student("hector",2222,"CSE");
        Student s3 = new Student("bridget",3333,"EE");
        Student s4 = new Student("nic",4444,"EE");

        List <Student> CSF = new ArrayList<Student>();
        CSF.add(s1);
        CSF.add(s2);
        //making List of EE Student
        List<Student>EE = new ArrayList<Student>();
        EE.add(s3);
        EE.add(s4);

        Department CSF1 = new Department("SALES",CSF);
        Department EE1  = new Department("CLERK",EE);
        
        List<Department>departments = new ArrayList<Department>();
        departments.add(CSF1);
        departments.add(EE1);

        //creating Institute of Instance
        
        Institute institute = new Institute("Nareshit",departments);
        System.out.println("Total Number of Institute.");
        System.out.println(institute.getTotalStudentInstitute());

    }
}


