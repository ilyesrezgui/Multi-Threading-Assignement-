package exercice2;

public class EssaiChainesEtPalindromes {
public static void main(String[] args) {
	
	ChainesEtPalindromes ch1=new ChainesEtPalindromes("ELle");
	ChainesEtPalindromes ch2=new ChainesEtPalindromes("hello");
	
	System.out.print("L'inverse de ch1 est: "+ ch1.inverser()+"\n");
	System.out.print("ch1 est Palindrome :"+ch1.estPalindrome()+"\n");
	System.out.print("ch2 est Palindrome :"+ch2.estPalindrome()+"\n");
}
}
