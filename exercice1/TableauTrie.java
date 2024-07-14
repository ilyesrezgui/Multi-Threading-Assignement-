package exercice1;

public class TableauTrie {
private int[] t;
private int capacite;
private int max;

public TableauTrie(int capacite) {
	this.capacite = capacite;
	this.t=new int[capacite];
	max=0;
}

public TableauTrie() {
	t=new int[20];
	max=0;
}

public void inserer(int entier) {
	
    if(max==capacite)
    {
    	System.out.println("Tableau saturé!");
    }
    else {
    	if(max==0)
    	{ 
    		t[max]=entier;
    		max++;
    	}
    	else if(t[max-1]<entier)
    	{
    		t[max]=entier;
    		max++;
    	}
    	else
    	{int i=0;	
    	boolean test=false;
		while (test==false) {
			if(t[i]>entier) {
				for(int j=max;j>i;j--) {
					t[j]=t[j-1];
				}
				t[i]=entier;
				test=true;
				max++;
				
			}
			i++;
		}
	    }
    }

}
public int chercher(int entier) {
	boolean b=false;
	int pos=-1,i=0;
	while(b==false && i<max) {
		if(t[i]==entier) {
			b=true;
			pos=i;
		}
		else i++;
	}
	return pos;
}
public void retirer(int entier) {
	int pos=chercher(entier);
	if(pos!=-1) {
		for(int i=pos;i<max;i++) {
			t[i]=t[i+1];
		}
		
}
}

public void afficher() {
	System.out.println("\nCeci est un nouveau affichage \n");
	for(int i=0;i<max;i++) {
		System.out.print(t[i]+" ");}
	System.out.println("\n");	

}



}
