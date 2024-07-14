package exercice1;
public class EssaiTableauTrier {
	public static void main(String[] args) {
		
		TableauTrie t=new TableauTrie(10);
		t.inserer(1);
		t.inserer(3);
		t.inserer(4);
		t.afficher();
		t.inserer(2);
		t.afficher();
		t.inserer(0);
		
		
	}

	
}
