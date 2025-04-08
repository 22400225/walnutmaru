import java.util.Scanner;

public class Rep02Replace3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a line of text:");
            String input = scanner.nextLine();
            
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            String noSpaces = input.replaceAll("\\s", "").toLowerCase();
            int index = noSpaces.indexOf("hate");
            
            if (index != -1) {
                String replaced = input.replaceAll("(?i)hate", "love");
                System.out.println("I have replaced that line to read: \n" + replaced);
            } else {
                System.out.println("'hate' was not found.");
            }
        }
        
        scanner.close();
    }
}