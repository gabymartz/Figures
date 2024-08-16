package student;

public class Student {
    private String codestudent;
    private String name;
    private String lastname;
    private int age;


    public Student(){}

    public Student(String codestudent, String name, String lastname, int age) {
        this.codestudent = codestudent;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getCodestudent() {
        return codestudent;
    }

    public void setCodestudent(String codestudent) {
        this.codestudent = codestudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
