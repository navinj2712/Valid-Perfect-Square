import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        boolean output = findValidPerfectSquare(number);
        System.out.println("Output : " + output);
    }

    private static boolean findValidPerfectSquare(int number) {
        if (number == 1){
            return true;
        }
        for (int i = 1; i < number/2; i++){
            if (i * i == number){
                return true;
            }
        }
        return false;
    }
}
