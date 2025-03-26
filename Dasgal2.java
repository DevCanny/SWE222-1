import java.util.Scanner;

public class Dasgal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        
        System.out.println("Үнэн/Худал тест эхэллээ!");
        
        System.out.println("1. Java нь объект хандалтат хэл мөн үү? (true/false)");
        String answer1 = scanner.nextLine();
        if (answer1.toLowerCase().equals("true")) correctAnswers++;
        
        System.out.println("2. Python нь компилируемах хэл мөн үү? (true/false)");
        String answer2 = scanner.nextLine();
        if (answer2.toLowerCase().equals("false")) correctAnswers++;
        
        System.out.println("3. Компьютер бүр интернэтэд холбогдсон байдаг. (true/false)");
        String answer3 = scanner.nextLine();
        if (answer3.toLowerCase().equals("false")) correctAnswers++;
        
        System.out.println("Таны зөв хариулсан асуулт: " + correctAnswers);
        
        scanner.close();
    }
}