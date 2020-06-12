
import java.util.*;

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
    	ArrayList<Integer> number = new ArrayList<Integer>();
    	int m = n;   	
    	while(m>0) { 		
    		number.add(m%10);
    		m = m/10;
    	}
    	
    	   	
    	String[] ten_nine = {"ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    	if(n==0) eng = "zero";
    	if(n>=10 && n<20) {
    		int t_n = n%10;
    		return ten_nine[t_n];
    	}
    	if(n==100) eng = "one-hundred";
    	
    	String[] ichi = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    	String[] jyu = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
    	
    	if(n>=0 && n<10) {
    		int o_n = n%10;
    		return ichi[o_n];
    	}
    	
    	ArrayList<String> english = new ArrayList<String>();
    	english.add(ichi[number.get(0)]);
    	english.add(jyu[number.get(1)]);
    	
    	
    	
    	
			eng = english.get(english.size()-1)+ "-";
		
    	for(int i=english.size()-2; i>=0; i--) {
    		
    		
    		if(i==0) { 
    			eng = eng +english.get(i);
    			break;
    		}
    		eng = eng + english.get(i) + "-";
    		
    	}
    	
        return eng;
    }
}
