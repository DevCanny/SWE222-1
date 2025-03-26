public class Dasgal9 {
    private int number;
    
    public Dasgal9(int number) {
        this.number = number;
    }
    
    public boolean isLuckyNumber() {
        String numStr = String.valueOf(number);
        
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) return false;
            number /= 10;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] testNumbers = {246, 4884, 22, 135, 246810};
        
        for (int num : testNumbers) {
            Dasgal9 checker = new Dasgal9(num);
            System.out.println(num + " is lucky number: " + checker.isLuckyNumber());
        }
    }
}