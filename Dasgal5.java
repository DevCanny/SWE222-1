import java.util.Scanner;

public class Dasgal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Тоо оруулна уу: ");
        int number = scanner.nextInt();
        
        if (isLuckyNumber(number)) {
            System.out.println("Энэ тоо азын дугаар мөн.");
        } else {
            System.out.println("Энэ тоо азын дугаар биш.");
        }
        
        scanner.close();
    }
    
    static boolean isLuckyNumber(int num) {
        String numStr = String.valueOf(num);
        
        if (numStr.length() != 3) return false;
        
        char firstDigit = numStr.charAt(0);
        return numStr.charAt(1) == firstDigit && numStr.charAt(2) == firstDigit;
    }
}