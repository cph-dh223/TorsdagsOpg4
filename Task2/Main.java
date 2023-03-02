import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "\nPlease type your age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println(age);
        int timeToRetier = 67 - age;
        System.out.println(timeToRetier);
    }    
}
