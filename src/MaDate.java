public class MaDate {
private int jour ;
private int mois ;
private int année ;
public MaDate(int jour, int mois, int année) {
// ici contrôles sur les valeurs
this.jour = jour ;
this.mois = mois ;
this.année = année ;
}
public int getJour() { return this.jour ; }
public int getMois() { return this.mois ; }
public int getAnnée() { return this.année ;}
@Override
public String toString() {
	return "MaDate [jour=" + jour + ", mois=" + mois + ", année=" + année + "]";
}

}