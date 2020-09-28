package student;

import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Scanner s = new Scanner(System.in);

        String name;
        int score;

        while (true) {
            //Input first student's data
            System.out.print("Enter name for first student, minimum of 1 letter: ");
            name = s.nextLine();
            stu1.setName(name);

            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s: ", i, stu1.getName());
                score = s.nextInt();
                stu1.setScore(i, score);
            }

            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }

        }

        System.out.println("\n-----------------------------\n");
         s.nextLine();
        while (true) {
            // data for 2nd student
            System.out.print("Enter name for second student: ");
            name = s.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s: ", i, stu2.getName());
                score = s.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        System.out.println("\n-----------------------------\n");
        s.nextLine();
        while (true) {
            // data for 3rd student
            System.out.print("Enter name for third student: ");
            name = s.nextLine();
            stu3.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s: ", i, stu3.getName());
                score = s.nextInt();
                stu3.setScore(i, score);
            }
            String errormsg = stu3.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
            System.out.println("\n-----------------------------\n");
        }

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);

    }
}
