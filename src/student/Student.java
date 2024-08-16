package student;

public class Student {
    private String studentcode;
    private String name;
    private String lastname;
    private Integer age;


    public Student(){
    }

    public Student(String codestudent, String name, String lastname, Integer age) {
        this.studentcode = codestudent;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getCodestudent() {
        return studentcode;
    }

    public void setCodestudent(String codestudent) {
        this.studentcode = codestudent;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "CodeStudent'" + studentcode + '\'' +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
