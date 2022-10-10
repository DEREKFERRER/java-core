import java.util.Scanner;
public class practice {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int[] input = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
       int largest = input[0];

       for(int num : input) {
           if (largest < num) {
             largest = num;
           }
       }
       System.out.println("largest number is " + largest);




    }
}
