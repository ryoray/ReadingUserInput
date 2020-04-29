package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();     // We use this to handle line character (Enter key)

        // Every time after we using scanner after reading a number with scanner,
        // we MUST use nextLine method call to handle the enter key

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2020 - yearOfBirth;


        System.out.println("Your name is " + name + ", and you are " + age + " years old");

        scanner.close();
    }
}
