public class MaDate {
private int jour ;
private int mois ;
private int ann�e ;
public MaDate(int jour, int mois, int ann�e) {
// ici contr�les sur les valeurs
this.jour = jour ;
this.mois = mois ;
this.ann�e = ann�e ;
}
public int getJour() { return this.jour ; }
public int getMois() { return this.mois ; }
public int getAnn�e() { return this.ann�e ;}
@Override
public String toString() {
	return "MaDate [jour=" + jour + ", mois=" + mois + ", ann�e=" + ann�e + "]";
}

}