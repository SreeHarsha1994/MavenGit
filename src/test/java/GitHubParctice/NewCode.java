package GitHubParctice;

import org.testng.annotations.Test;

public class NewCode {
	@Test
	public void codebase() {
		String s="mom";
		String s1="";
		String copy=s1;
		for(int i=0;i<s.length()-1;i++) {
			s1=s1+s.charAt(i);
		}
		if(copy.equals(s)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("not");
		}
	}

}
