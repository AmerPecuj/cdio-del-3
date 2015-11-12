package spillere;

public class Spiller {
	// Variable
	int balance;
	
	int laborCampsEjet;
	int fleetsEjet;
	
	// Constructor
	public Spiller() {
		
	}
	
	// Metoder
	// getter-metoder
	public int getLaborCampsEjet() {
		return laborCampsEjet;
	}
	
	public int getFleetsEjet() {
		return fleetsEjet;
	}
	
	// setter-metoder
	public void setLaborCampsEjet(int n) {
		this.laborCampsEjet = n;
	}
	
	public void setFleetsEjet(int n) {
		this.fleetsEjet = n;
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
