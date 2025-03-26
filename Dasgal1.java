import java.util.Scanner;

public class Dasgal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number == 9999) {
            System.out.println("Алтан дугаар байна");
        } else if (number == 8888) {
            System.out.println("Мөнгөн дугаар байна");
        } else {
            System.out.println("Энгийн дугаар байна");
        }
        
        scanner.close();
    }
}