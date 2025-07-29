import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 建立 Scanner 物件以接收輸入
        String name = sc.nextLine();          // 讀取一行字串輸入
        System.out.println("hello, " + name); // 輸出結果
    }
}