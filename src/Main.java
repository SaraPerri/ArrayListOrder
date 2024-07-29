import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student uno = new Student("Sara", 27);
        Student due = new Student("Marco", 31);
        Student tre = new Student("Antonio", 24);
        Student quattro = new Student("Claudio", 28);
        Student cinque = new Student("Gianna", 34);
        Student sei = new Student("Silvia", 23);
        Student sette = new Student("Riccardo", 31);
        Student otto = new Student("Leo", 36);
        Student nove = new Student("Simona", 26);
        Student dieci = new Student("John", 26);
        Student undici = new Student("Giuseppe", 38);
        Student dodici = new Student("Erika", 37);
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(uno, due, tre, quattro, cinque, sei, sette, otto, nove, dieci, undici, dodici));
        students.sort(Comparator.comparing(Student::getName));
        printArrayList(students);
    }

    public static void printArrayList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }
}
