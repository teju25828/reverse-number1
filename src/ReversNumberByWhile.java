import java.util.Scanner;

public class ReversNumberByWhile {

    public static void main(String[] args) {
        int number,reverse=0,remainder;
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        number = scanner.nextInt();
        while (number!=0)
        {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse number is --> "+reverse);
    }
}
