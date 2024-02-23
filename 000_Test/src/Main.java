import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		String skip = "zyxwv";
		String s = "abcdef";
		int index = 100;
		
		String answer = "";
        StringBuffer sbS = new StringBuffer(s);
        StringBuffer sbResult = new StringBuffer("");
        
        int indexSub = 0;
        for(int i = 0; i<sbS.length(); i++) {
           
        	System.out.print("스킵 문자 : ");
            for(int j = 0; j<skip.length(); j++) {
                
                if(sbS.charAt(i) < skip.charAt(j) && skip.charAt(j) <= sbS.charAt(i) + index) {
                	System.out.print(skip.charAt(j));
                    indexSub++;
                }
            }
            
            System.out.println();
            // u - w x y z a
            sbResult.append((char)((sbS.charAt(i)-'a'+index+indexSub)%('z' + 1-'a') + 'a'));
            indexSub = 0;
        } 
        
        answer = sbResult.toString();
        
        System.out.println(answer);
	}
}
