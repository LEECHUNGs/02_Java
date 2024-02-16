
public class Main {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		
		int answer = 0;
        
        String[] a = {"aya", "ye", "woo", "ma"};
        
        int startLine = 0;
        boolean check = false;
        int beforeIndex = -2;
        
        String b = "";
        
        for(int i = 0; i<babbling.length; i++) {
            
        	System.out.println(babbling[i] + " 을 탐색");
            while(babbling[i].length() != startLine) {
            	
                for(int j = 0; j<a.length; j++) {
                	
                	System.out.println(babbling[i].indexOf((a[j]), startLine));
                	System.out.print("탐색 문장 : " + a[j] + " == " + babbling[i] + "????   ");
                    
                    // 문자열 등장 확인
                    if(babbling[i].indexOf((a[j]), startLine) == startLine) {
                        
                        // 연속 확인
                        if(beforeIndex == j) {
                            System.out.println("중복");
                            break;
                        }
                        
                        b += a[j];
                        
                        // 확인 시 이어지는 문자열 확인
                        beforeIndex = j;
                        startLine += a[j].length();
                        check = true;
                        
                        System.out.println("이전 문장 : " + a[beforeIndex]);
                        
                        break;
                    }
                    System.out.println(" ------> 탐색 실패");
                }
                
                // 탐색 확인 문자열 없으면 다음 문자열로
                if(!check) {
                    
                    
                    break;
                }
                
                
                check = false;
                
            }
            
            
            if(babbling[i].length() == startLine) {
            	System.out.println("'" + babbling[i] + "' 성공");
            	answer++;
            }
            
            startLine = 0;
            check = false;
            beforeIndex = -2;
            
            System.out.println("==============" + b + "=============");
            b = "";
            
        }
        
        System.out.println(answer);
	}
}
