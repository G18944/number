
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
    	if(n==0) {
    		eng = "zero";
    		return eng;
    	}
    	if(n>=10 && n<20) {
    		reigai(n,ten_nine);
    	}

    	if(n==10000) {
    		eng = "ten-thousand";
    		return eng;
    	}
    	
    	String[] ichi = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    	String[] jyu = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
    	
    	if(n>=0 && n<10) {
    		int o_n = n%10;
    		return ichi[o_n];
    	}
    	String[] hyaku = new String[10];
    	hyaku[0] = "";
    	for(int i=1; i<hyaku.length; i++) {
    		hyaku[i] = ichi[i] + "-" + "handred";
    	}
    	
    	String[] sen = new String[10];
    	sen[0] = "";
    	for(int i=1; i<sen.length; i++) {
    		sen[i] = ichi[i] + "-" + "thousand";
    	}
    
    	
    	ArrayList<String> english = new ArrayList<String>();
    	english.add(ichi[number.get(0)]);
    	if(n>=10) english.add(jyu[number.get(1)]);
    	if(n>=100) english.add(hyaku[number.get(2)]);
    	if(n>=1000) english.add(sen[number.get(3)]);
    	
		eng = english.get(english.size()-1)+ " ";
		
    	for(int i=english.size()-2; i>=0; i--) {
    		
    		if(i==0) { 
    			eng = eng +english.get(i);
    			break;
    		}
    		if(number.get(1) == 1) {
    			eng = eng + reigai(number.get(0),ten_nine);
    			break;
    		}
    		eng = eng + english.get(i) + " ";
    		
    	}
    	
        return eng;
    }
    static String reigai(int n, String[] ten_nine) {
		int t_n = n%10;
		return ten_nine[t_n];
    }
}
