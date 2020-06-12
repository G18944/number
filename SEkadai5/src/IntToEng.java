
import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String eng = null;
    	String[] ichi = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    	String[] ten_nine = {"ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    	if(n==0) eng = "zero";
    	if(n>=10 && n<20) {
    		int t_n = n%10;
    		return ten_nine[t_n];
    	}
    	
    	
        return eng;
    }
}
