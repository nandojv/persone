package profesercizi;



public class funzionario extends persona  {

	int matricola;

	public funzionario(String  cognome,int eta,int matricola) {
		
		super (cognome,eta);
		
		this.matricola=matricola;
	}
	public String toString() {
		return cognome+" "+eta+" "+matricola;
		
		
	}
	
	}

