
import java.awt.Color;

public class Chemise {
	
	String modelChemise;
	Taille taillechemise;
	Color couleur=Color.WHITE;
	
	
	public Chemise(String unModel, Taille uneTaille){
		modelChemise=unModel;
		this.taillechemise=uneTaille;
		}
	
	
	public Chemise(String unModel, Taille uneTaille, Color unecouleur){
		this.couleur=unecouleur;
		modelChemise=unModel;
		this.taillechemise=uneTaille;
	}

	@Override
	public String toString() {
		return "Chemise [modelChemise=" + modelChemise + ", taillechemise=" + taillechemise + ", couleur=" + couleur
				+ "]";
	}


	
	
	

		
	
		

		


	
	
}
