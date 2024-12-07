package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsAndHashMethod {
    public static void main(String[] args) {
        Map<Student,Integer> studentMarks = new HashMap<>();

        Student s1 = new Student(1L,"Sayan");
        Student s2 = new Student(2L,"Ram");
        Student s3 = new Student(1L,"Sayan");

        studentMarks.put(s1,90);
        studentMarks.put(s2,95);
        studentMarks.put(s3,85);

        System.out.println(studentMarks.size());
        System.out.println(studentMarks);

    }
}

class Student{
    private Long id;
    private String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "[Id : "+ id + " Name : " + name+"]";
    }
}
