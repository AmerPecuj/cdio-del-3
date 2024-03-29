package fields;

import spillere.*;
import desktop_resources.GUI;
import game.*;

public class LaborCamp extends Ownable {
	// Variable
	protected int basisLeje = 100;
	int terningeSum;

	// Constructor
	public LaborCamp(String name) {
		this.name = name;
		pris = 2500; // Ens for alle labor camps
	}

	// Metoder
	// getLeje();
	@Override
	public int getLeje() {
		// basisLeje*(terningernes sum)*(antal labor camps ejet af ejeren)
		return basisLeje
				*getTerningeSum()
				*ejer.getLaborCampsEjet();
	}

	public void setTerningeSum(int sum) {
		terningeSum = sum;
	}

	public int getTerningeSum() {
		return terningeSum;
	}

	@Override
	public void koebFelt(Spiller spiller) {
		if(spiller.getBalance()>=getPris()&&ejer==null){
			if(GUI.getUserLeftButtonPressed("Dette felt har ingen ejer! "
					+ "Oensker du at koebe dette felt for " 
					+ getPris() + "?"	, "Ja", "Nej")){
				setEjer(spiller);
				spiller.withdrawBalance(getPris());
				spiller.addLaborCamp(); // Tilfoejer 1 til koeberens LaborCamp-beholdning
				spiller.addBalance(-getPris());
				spiller.addLaborCamp();
				GUI.showMessage("Du er nu retmaessig ejer af feltet!");
			}
		}
	}
}