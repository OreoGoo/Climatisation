import fr.demos.formation.today.Climatisation;

public class test_tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Climatisation clim1=new Climatisation("203", 30, 30,1421);
		Climatisation clim2=new Climatisation("203", 37, 30,1410);
		Climatisation clim3=new Climatisation("203", 35, 30,0);
		Climatisation clim4=new Climatisation("203", 200, 30,0);
		int i;
		
		int [] tableau1 ={1,2,4,5};
		double somme=0;
		double sommepression=0;
		double moyennepression=0;
		double moyenne=0;
		int variablepression=0;
		
		for (i=0;i<tableau1.length;i++){
			if (i==0){
				System.out.println(tableau1[i]);}
		else
					if(i==tableau1.length-1){
						System.out.println(tableau1[i]);
					
			}
		
	}
			
		
		Climatisation [] tableau2={clim1,clim2,clim3,clim4};
		for (i=0;i<tableau1.length;i++){
			if (i==0){
				System.out.println(tableau2[i]);}
			else
				if(i==tableau1.length-1){
					System.out.println(tableau2[i]);
			}
		}
		//for (Climatisation parcourirClim : tableau2){
		
			//somme=parcourirClim.temperature+somme;
		for (i=0;i<tableau2.length;i++){
			somme=somme+tableau2[i].temperature;
		}
		moyenne=somme/tableau2.length;
		System.out.println("la moyenne des temperatures est de : "+moyenne);


		for (i=0;i<tableau2.length;i++){
			if (tableau2[i].pression>0){
			sommepression=sommepression+tableau2[i].pression;
			variablepression=variablepression+1;
			
		}}
		moyennepression=sommepression/variablepression;
		System.out.println("la moyenne des pressions : "+moyennepression);
		
	}

	}

