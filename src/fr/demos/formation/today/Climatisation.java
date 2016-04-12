package fr.demos.formation.today;

import java.io.Serializable;

public class Climatisation implements Serializable {
	private static final long serialVersionUID = 1L; // a voir si sa marche 

	String NomSalle;// appareil emetteur qui creer la données
	private double temperature;// degres celsius
	private double pression;// hectoPascal
	private double tauxHumidite;// pourcentage
	private long datation = System.currentTimeMillis();// timestamp
	private static final double AJOUT_FAR = 40.18;
	private static final double FACTEUR_FAR = 1.8; // staitic veut dire variable
													// de classe; final vzeut
													// dire variable fixe (comme
													// pi par exemple)
	private static final double CONSTANTE = 0.0295299831;

	public Climatisation(String NomSalle, double temperature, double tauxHumidite, double pression) {
		// this(NomSalle,temperature,tauxHumidite);

		this.temperature = temperature;
		this.tauxHumidite = tauxHumidite;
		this.NomSalle = NomSalle;
		this.pression = pression;

	}

	public Climatisation(String NomSalle, double temperature, double tauxHumidite) {
		this(NomSalle, temperature, tauxHumidite, 0);
		// this.temperature=temperature;
		// this.tauxHumidite=tauxHumidite;
		// this.NomSalle=NomSalle;

	}

	@Override
	public String toString() {
		return "Climatisation [NomSalle=" + NomSalle + ", temperature=" + temperature + ", pression=" + pression
				+ ", tauxHumidite=" + tauxHumidite + ",Date " + new java.util.Date(this.datation) + ")]";
	}

	public double getTemperatureFarenheit() {
		return this.temperature + AJOUT_FAR * FACTEUR_FAR - AJOUT_FAR;
	}

	public double getPressionPoucesMercure() {
		return Math.rint(this.pression * CONSTANTE * 100) / 100;// rint (double
																// a) permet
																// d'arrondir
																// comme la
																// methode
																// round( double
																// a) qui
																// arrondi au
																// plus proche,
																// floor (double
																// a) arrondie a
																// l'inferieur
																// ceil (double
																// a) arrondie
																// au sup
	}// rint etant une methode static on l'appel sur la classe Math.

	public String getNomSalle() {
		return NomSalle;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPression() {
		return pression;
	}

	public double getTauxHumidite() {
		return tauxHumidite;
	}

	public long getDatation() {
		return datation;
	}

}
