import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
//        int a = scanner.nextInt("value = "+ a);

        char c = scanner.next().charAt(0);
        System.out.println("value = "+c);



    }


}
