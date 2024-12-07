package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/***
 * This is demonstration of the Comparator in JAVA
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Sayan", 7.5),
                new Student(2, "Rahul", 7.2),
                new Student(3, "Neha", 7.2),
                new Student(3, "John", 7.3)
        );
        List<Student> list1=new ArrayList<>();
        list1.add(new Student(4,"Bob",6.9));
        System.out.println("list 1 :" +list1);
        list1.addAll(list);
        System.out.println("list 1 :" +list1);
//        list.sort((s1,s2)->s1.getName().compareTo(s2.getName()));

        Comparator<Student> comp = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing(Student::getName);
        list1.sort(comp);

//        list.sort((s1,s2)->{
//            if(s1.getGpa()-s2.getGpa() < 0)
//                return -1;
//            else if(s1.getGpa()-s2.getGpa() > 0)
//                return 1;
//            else
//                return s1.getName().compareTo(s2.getName());
//        });
        for(Student s : list1)
            System.out.println(s);
    }

}

class Student{
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
