import java.util.Scanner;

public class Rep02Replace2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String input = scanner.nextLine();
        
        int index = input.toLowerCase().indexOf("hate");
        if (index != -1) {
            System.out.println("First occurence of 'hate' is at index: " + index);
        } else {
            System.out.println("'hate' was not found.");
        }
        
        scanner.close();
    }
}