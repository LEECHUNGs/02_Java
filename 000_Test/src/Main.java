import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		String s = "abracadabra";
		int answer = 0;
        
        List<StringBuffer> al = new ArrayList<StringBuffer>();
        
        StringBuffer a = null;
        int count[] = {1, 0};
        
        int index = 0;
        int index2 = 0;
        while(index < s.length()) {
            
            al.add(new StringBuffer("" + s.charAt(index++)));
            a = al.get(index2++);
            
            System.out.println(a);
            
            for(; index<s.length(); index++) {
                
                a.append(s.charAt(index));
                
                System.out.println("a : " + a);
                
                if(a.charAt(0) == s.charAt(index)) count[0]++;
                else count[1]++;
                
                if(count[0] == count[1]) {
                	index++;
                    break;
                }
            }
            
            a = null;
            count[0] = 1;
            count[1] = 0;
        }
        
        answer = al.size();
        
        System.out.println(answer);
	}
}
