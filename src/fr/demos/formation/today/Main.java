package fr.demos.formation.today;

public class Main {

	public static void main(String[] args) {

		Climatisation clim203 = new Climatisation("203", 37, 30, 1421);
		// clim203.temperature=10.5;
		// clim203.pression=1013;
		// clim203.NomSalle="salle 203";
		// clim203.tauxHumidite=30;

		Climatisation clim204 = new Climatisation("204", 12.5, 30, 1021);
		// clim204.temperature=12.5;
		// clim204.pression=1013;
		// clim204.NomSalle="salle 204";
		// clim204.tauxHumidite=30;

		clim203.getTemperatureFarenheit();
		clim203.getPressionPoucesMercure();

		System.out.println(clim203);
		System.out.println("la temp en far  " + clim203.getTemperatureFarenheit());
		System.out.println("inches of mercury" + clim203.getPressionPoucesMercure());
		System.out.println("inches of mercury" + clim204.getPressionPoucesMercure());
		System.out.println(clim204.getPression());

	}

}
