import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite algum número: ");
        int n = scn.nextInt();

        if( n % 2 != 0 ){
            System.out.println("Weird");
        }else if(n > 2 && n < 5){
            System.out.println("Not Weird");
        }else if( n >= 6 && n <= 20 ){
            System.out.println("Weird");
        }else if( n > 20 ){
            System.out.println("Not Weird");
        }
    }
}