import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//class 實例化成物件
        int score = sc.nextInt();//nextInt().nextFloat().nextLine().
        if (score>100||score<0){
            System.out.print("No");
        }
        else if (score<60){
            System.out.print("A");
        }
        else if (score<70){
            System.out.print("D");
        }
        else if (score<80){
            System.out.print("C");
        }
        else if (score<90){
            System.out.print("B");
        }
        else{
            System.out.print("A+");
        }
    }
} 
    

