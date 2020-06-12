
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
    	if(n==0) eng = "zero";
    	if(n==1) eng = "one";
    	if(n==2) eng = "two";
    	if(n==3) eng = "three";
    	if(n==4) eng = "four";
    	if(n==5) eng = "five";
    	if(n==6) eng = "six";
    	if(n==7) eng = "seven";
    	if(n==8) eng = "eight";
    	if(n==9) eng = "nine";
    	if(n==10) eng = "ten";
    	
    	
        return eng;
    }
}
