package Week8;
import java.util.*;
class Student implements Comparable {
    private int id;
    private String name;
    private double cgpa;

    public Student() {

    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {

        Student student = null;
        if (o instanceof Student) {
            student = (Student) o;
        }
        if (student.cgpa == this.cgpa && student.name == this.name) {
            return Integer.compare(student.id, this.id);
        } else if (student.cgpa == this.cgpa) {
            return this.name.compareTo(student.name);
        } else {
            return Double.compare(student.cgpa, this.cgpa);
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {

        PriorityQueue <Student> queue = new PriorityQueue<>();

        for (String event: events) {

            Scanner scanner= new Scanner(event);
            String command= scanner.next();

            switch (command){
                case "ENTER":
                    String name=scanner.next();
                    Double cgpa=scanner.nextDouble();
                    int id=scanner.nextInt();
                    Student student1= new Student(id,name,cgpa);
                    queue.add(student1);

                    break;

                case "SERVED":
                    queue.poll();
                    break;
            }
        }

        List<Student> studentList = new ArrayList<>();
        while (!queue.isEmpty()){
            studentList.add(queue.poll());
        }

        return studentList;
    }
}
public class JavaPriorityQueue {
    public static void main(String[] args) {
        Priorities priorities = new Priorities();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String event = sc.nextLine();
            list.add(event);
        }

        List<Student> students = priorities.getStudents(list);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
