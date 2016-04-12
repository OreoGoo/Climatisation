package fr.demos.formation.today;

public class Addition {
	
	
	
	

	public static void main(String[] args) throws NumberFormatException  {
		// faire une boucle sur args, recup les entiers, (utiliser Integer.parseinT)
		int s=0;

		for (int i=0; i<args.length;i++){
			
			try {
		int valeur = Integer.parseInt(args[i]); // ce qui plante c'est le parse int
		s=s+valeur;
		
	}catch (NumberFormatException a){
		System.out.println(a.getMessage() +"     veuillez apprendre a taper des chiffres");
		return;
	}
		
		}
System.out.println(s);	
		

	}




	
}

	

