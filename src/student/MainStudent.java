package student;

import exception.DuplicatedCodeStudentException;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("ups1", "Gabriel","Martillo", 19);
        Student s2 = new Student("ups2","Joel","Zapata", 22);
        Student s5 = new Student("ups4","Alex", "Verstappen", 17);

        Student s3 = new Student();
        s3.setCodestudent("ups3");
        s3.setName("Andy");
        s3.setLastname("Pluas");
        s3.setAge(30);

        printStudentProperties(s1);
        printStudentProperties(s2);
        printStudentProperties(s3);
        printStudentProperties(s5);

        List<Student> studentList = new ArrayList<>();
        Student s4 = new Student("ups1","Gaby", "Sanz", 20);
        try {
            addStudent(s1, studentList);
            addStudent(s2, studentList);
            addStudent(s3, studentList);
            addStudent(s4, studentList);
            addStudent(s5, studentList);
        }catch (DuplicatedCodeStudentException ds){
            System.out.println(ds.getMessage());
        }
    }
    public static void addStudent(Student s, List<Student> studentList) throws DuplicatedCodeStudentException {
        for(Student st: studentList){
            if(st.getCodestudent().equalsIgnoreCase(s.getCodestudent())){
                System.out.println("-----------------------------");

                StringBuilder studentListMessage = new StringBuilder();
                for(Student student: studentList){
                    studentListMessage.append("\n").append(student.toString());
                }
                throw new DuplicatedCodeStudentException(
                        "Student Code " + s.getCodestudent() + " already exists" + " {Please, insert other Code}.\n" +
                        "-> StudentList: "+ studentListMessage.toString());
            }
        }
        studentList.add(s);
    }
    public static void printStudentProperties(Student s){
        try {
            System.out.println("-----------------------------");
            System.out.println("Student Code:" + s.getCodestudent());
            System.out.println("Name:" + s.getName().toUpperCase());
            System.out.println("Lastname:" + s.getLastname().toUpperCase());
            System.out.println("Age:" + (s.getAge() + 1));
        } catch (NullPointerException ne){
            System.out.println("Student Attribute is null. Exception Message: " + ne.getMessage());
        }
    }
}
