import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        //take Input from User
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter S,P or R");
        char user_move = input.next().charAt(0);
        char Upper_input = Character.toUpperCase(user_move);
        System.out.println("user gave " + Upper_input);
        
        //make computer to make there move
        // String abc = "SPR";
        // Random rnd = new Random();
        // int length = abc.length();
        // int randomValue = rnd.nextInt(length);
        // char computer_move = abc.charAt(randomValue);   //abc[2]
        // System.out.println("computer gave " + computer_move);

        //sir k0 part
        char[] arr = {'S','R','P'};
        int length = arr.length;
        Random random = new Random();
        int Generated_num = random.nextInt(length);
        char computer_move = arr[Generated_num];
        System.out.println("Computer Move " + computer_move);
                //computer = user -> draw!!
            //user "S"
            //Computer "R" -: c wins!
            //user wins 
        if(Upper_input == 'S' && computer_move == 'S')
        {
            System.out.println("Draw!!!");
        }
        else if(Upper_input == 'R' && computer_move == 'R')
        {
            System.out.println("Draw");

        }
        else if(Upper_input == 'P' && computer_move == 'P')
        {
            System.out.println("Draw");

        }
        else if(Upper_input == 'S' && computer_move == 'R')
        {
            System.out.println("LOse");

        }
          else if(Upper_input == 'S' && computer_move == 'P')
        {
            System.out.println("Won");

        }
        else if(Upper_input == 'R' && computer_move == 'S')
        {
            System.out.println("Won");

        }
        else if(Upper_input == 'P' && computer_move == 'S')
        {
            System.out.println("LOse");

        }
             else if(Upper_input == 'R' && computer_move == 'P')
        {
            System.out.println("lose");

        }
                else if(Upper_input == 'P' && computer_move == 'R')
        {
            System.out.println("Win");

        }

            //user "P"
            //Computer "R" -: c wins!
            //user wins 
            
            //user "R"
            //Computer "S" -: U wins!
            //c wins 
    }
}