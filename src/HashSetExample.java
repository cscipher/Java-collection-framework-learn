import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student>set = new HashSet<>();

        set.add(new Student("Cipher", 3));
        set.add(new Student("Cipher", 3));
        set.add(new Student("Cipher", 3));
        set.add(new Student("Cipher", 4));
        System.out.println(set);
    }
}

class Student {
    int rollno;
    String name;

    public Student(String name,int rollno){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
}
