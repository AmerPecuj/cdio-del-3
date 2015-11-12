package spillere;

public class Spiller {
	// Variable
	int balance;
	
	int laborCampsEjet;
	
	// Constructor
	public Spiller() {
		
	}
	
	// Metoder
	public int getLaborCampsEjet() {
		return laborCampsEjet;
	}

	public void setLaborCampsEjet(int laborCampsEjet) {
		this.laborCampsEjet = laborCampsEjet;
	}
	
	// Kontometoder
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int beloeb) {
		this.balance += beloeb;
	}
	
	// Hjaelpemetoder
	
	/*
	 * overfoerPenge(int beloeb, Spiller modtager);
	 * 
	 * Overfoerer penge fra spiller til modtager
	 */
	
	public void overfoerPenge(int beloeb, Spiller modtager) {
		if (beloeb <= this.getBalance()) {
			this.addBalance(-beloeb);
			modtager.addBalance(beloeb);			
		} else {
//			bankerot
		}
	}
	
	
}
