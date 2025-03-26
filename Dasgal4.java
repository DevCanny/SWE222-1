import java.util.Scanner;

public class Dasgal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Тоо оруулна уу: ");
        int number = scanner.nextInt();
        
        if (isLuckyNumber(number)) {
            System.out.println("Энэ тоо азын тоо юм.");
        } else {
            System.out.println("Энэ тоо азын тоо биш.");
        }
        
        scanner.close();
    }
    
    static boolean isLuckyNumber(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) return false;
            num /= 10;
        }
        return true;
    }
}