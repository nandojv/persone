package profesercizi;




public class operaio extends persona {

	String mansione;
    

	public operaio(String cognome,int eta,String mansione) {
		super (cognome,eta);
		
		this.mansione=mansione;
		
		
		
	}
	public String toString() {
		return cognome+" "+eta+" "+mansione;
		
		
	}
	

	}

