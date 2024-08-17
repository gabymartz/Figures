package student;

import exception.DuplicatedStudentCodeException;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("ups1", "Gabriel","Martillo", 19);
        Student s2 = new Student("ups2","Joel","Zapata", 22);

        Student s3 = new Student();
        s3.setStudentcode("ups3");
        s3.setName("Andy");
        s3.setLastname("Pluas");
        s3.setAge(30);

        printStudentProperties(s1);
        printStudentProperties(s2);
        printStudentProperties(s3);

        List<Student> studentList = new ArrayList<>();
        Student s4 = new Student("ups1","Gaby", "Sanz", 20);
        try {
            addStudent(s1, studentList);
            addStudent(s2, studentList);
            addStudent(s3, studentList);
            addStudent(s4, studentList);
        }catch (DuplicatedStudentCodeException ds){
            System.out.println(ds.getMessage());
        }
    }
    public static void addStudent(Student s, List<Student> studentList) throws DuplicatedStudentCodeException {
        for(Student st: studentList){
            if(st.getStudentcode().equalsIgnoreCase(s.getStudentcode())){
                System.out.println("-----------------------------");

                StringBuilder studentListMessage = new StringBuilder();
                for(Student student: studentList){
                    studentListMessage.append("\n").append(student.toString());
                }
                throw new DuplicatedStudentCodeException(
                        "Student Code: " + s.getStudentcode() + " already exists" + " {Please, insert another Code}.\n" +
                        "-> StudentList: "+ studentListMessage.toString());
            }
        }
        studentList.add(s);
    }
    public static void printStudentProperties(Student s){
        try {
            System.out.println("-----------------------------");
            System.out.println("Student Code:" + s.getStudentcode());
            System.out.println("Name:" + s.getName().toUpperCase());
            System.out.println("Lastname:" + s.getLastname().toUpperCase());
            System.out.println("Age:" + (s.getAge() + 1));
        } catch (NullPointerException ne){
            System.out.println("Student Attribute is null. Exception Message: " + ne.getMessage());
        }
    }
}
