import java.util.Scanner;

public class getUserInput {

    public static int Integer(){
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("Wrong format, please try again");
        }
        return sc.nextInt();
    }
}
