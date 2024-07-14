package exercice3;

public class Decoupeur {

	private String str,sep;
	private int istr;
	
	public Decoupeur(String str,String sep)
	{
		this.str=str;
		this.sep=sep;
		this.istr=0;
	}
	
	public boolean ilresteDesMots() {
		int i=istr;
		while(i<str.length()){
			char a=str.charAt(i);
			if(sep.indexOf(a)==-1)
			{
				return true;
			}
			else
				i++;
		}
		return false;	
	}
	
	public String motSuivant()
	{
		if(ilresteDesMots()==true)
			{   String mot="";
			while((sep.indexOf(str.charAt(istr))==-1)&&(istr!=str.length()))
				{
				mot+=str.charAt(istr);
				istr++;
				}
			return mot;
			}
		else
		    return "";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getSep() {
		return sep;
	}

	public void setSep(String sep) {
		this.sep = sep;
	}

	public int getIstr() {
		return istr;
	}

	public void setIstr(int istr) {
		this.istr = istr;
	}
	

}
