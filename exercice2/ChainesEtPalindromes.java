package exercice2;

public class ChainesEtPalindromes {
private String str;

public ChainesEtPalindromes(String str) {
	this.str = str;
}

public String inverser() {
	String res="";
	for(int i=str.length()-1;i>=0;i--) {
		res+=str.charAt(i); 
	}
	return res;
}
public boolean estPalindrome() {
	int pos1=0;
	int pos2=str.length()-1;
	String ch=str.toUpperCase();
	while(pos2>pos1) {
		if((ch.charAt(pos1))!=(ch.charAt(pos2))) {
			return false;
		}
		pos1+=1;
		pos2-=1;
	}
	return true;
}

}
