import java.util.Scanner;

public class Rep02Replace1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String input = scanner.nextLine();
        System.out.println("You Entered: " + input);
        scanner.close();
    }
}