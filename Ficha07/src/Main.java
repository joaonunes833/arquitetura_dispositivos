import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        List<Rational> rationalList = new ArrayList<Rational>();
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(2,2);
        Rational r3 = new Rational(5,2);
        Rational r4 = new Rational(1,2);
        rationalList.add(r1);
        rationalList.add(r2);
        rationalList.add(r3);
        rationalList.add(r4);
        Collections.sort(rationalList);
        System.out.println(rationalList);
    }
}