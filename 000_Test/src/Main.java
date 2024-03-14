import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		String today = "2022.05.19";
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		String[] terms = {"A 6", "B 12", "C 3"};
		
		String[] todayArray = today.split(".");
        char privacie = ' ';
        
        System.out.println(Integer.parseInt(privacies[0].substring(0, 4)));
        int[] day = new int[3];
        for(int i = 0; i<privacies.length; i++) {
            day[0] = Integer.parseInt(privacies[i].substring(0, 4));
            day[1] = Integer.parseInt(privacies[i].substring(5, 7));
            day[2] = Integer.parseInt(privacies[i].substring(8, 10));
            
            privacie = privacies[i].charAt(11);
            
            System.out.println(privacie);
        }
	}
}
