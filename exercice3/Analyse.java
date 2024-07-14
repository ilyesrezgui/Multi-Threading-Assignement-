package exercice3;

public class Analyse {

	private String texte,sep;
	private int nbMots;
	private String[] mots;
	private String[] freq;

	public Analyse(String texte, String sep) {
		this.texte = texte;
		this.sep = sep;
		this.nbMots=0;
		mots= new String[nbMots()];
		freq= new String[nbMots()];
	}
	
	public int nbMots() {
		Decoupeur d= new Decoupeur(texte,sep);
		while((d.getIstr()!=texte.length())&&(d.ilresteDesMots()==true))
		{
			if(d.motSuivant()!="")
			{
				nbMots++;
			}
		}
		return nbMots;		
	}
	
	public void vocabulaire()
	{Decoupeur d= new Decoupeur(texte,sep);
	int i=0;
		while(d.getIstr()<texte.length()){
			mots[i]=d.motSuivant();
			i++;
		}		
	}
	
	public void afficheVocab()
	{
		for(int i=0;i<mots.length;i++)
		{
			System.out.print(mots[i]+"\t");
		}
	}
	
	public int fréquence(String mot) {
		int occ=0;
        for(int j=0;j<mots.length;j++)
				{
				if(mots[j].toUpperCase()==mot.toUpperCase())
				{
					occ++;
				}
		}
        return occ;		
	}
	
	/*public void suppOcc()
	{
		for(int i=0;i<freq.length;i++) {
			for(int j=i+1;j<freq.length;j++)
			{
				if(freq[i].toUpperCase()==freq[j].toUpperCase())
				{
					
				}
			}
		}
	}*/
	public void motsPlusFreq() {
		int j=0;
		for(int i=0;i<mots.length;i++)
		{  int occ=fréquence(mots[i]);
		   if(occ>=2)
		   {freq[j]=mots[i];
		   j++;
			   
		   }
			
		}
		
	}
	
	public void affichePlusFreq() {
		for(int i=0;i<freq.length;i++)
		{
			System.out.print(freq[i]+"\t");
		}
	
	}
	
	
}
