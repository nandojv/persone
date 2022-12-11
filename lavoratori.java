package profesercizi;

import java.util.ArrayList;

public class lavoratori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		   funzionario x=new funzionario ("bianchi",33,01);
		   funzionario y=new funzionario ("goku",40,100);
	       funzionario k=new funzionario ("gesko",38,200);
	         
	          operaio a=new operaio ("rossi",28,"semplice");
	          operaio b=new operaio ("bianchi",38,"specializzato");
	          operaio c=new operaio ("esposito",22,"semplice");
	          
				ArrayList<persona>persona= new ArrayList();
          
				persona.add(x);
				persona.add(y);
				persona.add(k);
				
				persona.add(a);
				persona.add(b);
				persona.add(c);
			
				for(int i=0;i<persona.size();i++)
				System.out.println(persona.get(i));
				
				
				
	}

}
