package student;

public class Student {
    private String studentcode;
    private String name;
    private String lastname;
    private Integer age;


    public Student(){
    }

    public Student(String studentcode, String name, String lastname, Integer age) {
        this.studentcode = studentcode;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
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
