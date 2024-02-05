package edu.kh.control.branch;

public class BranchRun {
	
	public static void main(String[] args) {
		BranchExample branchEx = new BranchExample();
		
		//branchEx.ex1();
		//branchEx.ex2();
		//branchEx.ex3();
		//branchEx.ex4();
		branchEx.RSPGame();
		
		String t = "99999999999999999999999";
		String p = "99";
		
		int answer = 0;
        StringBuffer a = new StringBuffer(t);
        
        for(int i = 0; i<a.length()-p.length()+1; i++) {
            if(Long.parseLong(a.substring(i, i+p.length())) <= Long.parseLong(p)) {
                System.out.println(a.substring(i, i+p.length()));
                answer++;
            }
        }
        System.out.println(answer);
	}
}
