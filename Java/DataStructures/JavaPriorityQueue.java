package Java.DataStructures;

import java.util.*;

class Student {

    private final int id;
    private final String name;
    private final float CGPA;

    public Student(int id, String name, float CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public float getCGPA() {
        return CGPA;
    }
}

class Priorities {

    public final PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED"))
                priorityQueue.poll();
            else {
                String[] details = event.split(" ");
                priorityQueue.add(new Student(Integer.parseInt(details[3]), details[1], Float.parseFloat(details[2])));
            }
        });

        List<Student> students = new ArrayList<>();
        while (!priorityQueue.isEmpty())
            students.add(priorityQueue.poll());

        return students;
    }
}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}