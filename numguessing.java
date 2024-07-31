import java.util.Random;
import java.util.Scanner;

public class numguessing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();


        int lowest_num = 1;

        int highest_num = 100;

        int numtoguess = random.nextInt(highest_num - lowest_num + 1);

        int counts=0;

        int max_counts=12;

        System.out.println("number guessing game");

        System.out.println("the number is selected btw" +lowest_num+"and"+highest_num+"you have to guess it");


        while(counts < max_counts){
            System.out.println("enter your guess number:");
            int user_input = sc.nextInt();
            counts++;

            
            if(user_input == numtoguess){
                System.out.println("yayy! you have guessed the number in "+counts+" counts");
                break;
        }

        else if(user_input < numtoguess){
            System.out.println("try larger number");
        }
        else{
            System.out.println("try smaller number");
        }
    }
    if(counts == max_counts){
        System.out.println("sorry,you have no attempts left. the correct number is:"+numtoguess);
    }
    System.out.println("thanks for playing");

}
}