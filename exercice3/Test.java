package exercice3;

public class Test {
	public static void main(String[] args)
	{
		Analyse lys= new Analyse("la vie,est belle.La vie ,,est jolie.", " ,.");
		System.out.println("Le nombre de mots de ce texte: "+lys.nbMots()+"\n");
		/*System.out.println("Les mots texte:\n ");
		lys.afficheVocab();
		System.out.println("\nLes mots les plus fréquents de ce texte: \n");
		lys.affichePlusFreq();*/
		
	}

}
