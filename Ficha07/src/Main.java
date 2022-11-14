import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza uma comando:");
        String line = scanner.nextLine();
        Command command = Command.valueOf(line);
        if (command == Command.SAVE) {
            System.out.println("Game saved.");
        } else if (command == Command.LOAD) {
            System.out.println("Game loaded.");
        } else if (command == Command.EXIT) {
            System.out.println("Exiting Game.");
        } else if (command == Command.START) {
            System.out.println("Starting Game.");
        }

        System.out.println("Introduza um comando:");
        switch (command) {
            case SAVE:
                System.out.println("Game Saved.");
                break
                        ;
            case LOAD:
                System.out.println("Game Loaded.");
                break
                        ;
            case EXIT:
                System.out.println("Exiting Game.");
                break;
        }*/
//        List<Rational> rationalList = new ArrayList<Rational>();
//        Rational r1 = new Rational(4,2);
//        Rational r2 = new Rational(2,2);
//        Rational r3 = new Rational(5,2);
//        Rational r4 = new Rational(1,2);
//        rationalList.add(r1);
//        rationalList.add(r2);
//        rationalList.add(r3);
//        rationalList.add(r4);
//        Collections.sort(rationalList);
//        System.out.println(rationalList);
//        List<Student> studentList = new ArrayList<Student>();
//        Student s1 = new Student(1,"Julio");
//        Student s2 = new Student(2,"Abel");
//        Student s3 = new Student(3,"Guilherme");
//        Student s4 = new Student(4,"Paulo");
//        studentList.add(s2);
//        studentList.add(s1);
//        studentList.add(s4);
//        studentList.add(s3);
//        Collections.sort(studentList, new StudentsComparatorByName());
//        System.out.println(studentList.toString());
        Map<Integer, Course> courseMap = new HashMap<Integer, Course>();
        Course c1 = new Course(1,"Disciplina1",5,1);
        Course c2 = new Course(2,"Disciplina2",5,1);
        Course c3 = new Course(3,"Disciplina3",5,1);
        Course c4 = new Course(4,"Disciplina4",5,1);
        courseMap.put(c3.getCode(),c3);
        courseMap.put(c4.getCode(),c4);
        courseMap.put(c1.getCode(),c1);
        courseMap.put(c2.getCode(),c2);
        if (courseMap.containsValue(3)) {
            Course cc = courseMap.get(3);
        }

        Set<Integer> keys = courseMap.keySet();
        for (int key : keys) {
            System.out.print("\nKey: " + key);
            System.out.print(", Values: " + courseMap.get(key));

        }
        Collection<Course> stadiumSet = courseMap.values();

        List<Course> ano1 = new ArrayList<Course>();
        ano1.add(c1);
        ano1.add(c3);
        ano1.add(c4);
        ano1.add(c2);
    }
}