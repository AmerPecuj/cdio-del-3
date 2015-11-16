package spillere;

public class Spiller {
	// Variable
	protected int balance;
	
	protected int laborCampsEjet;
	protected int fleetsEjet;
	
	// Constructor
	public Spiller() {
		
	}
	
	/*
	 * METODER
	 */
	
	/*
	 * Getter-metoder
	 */
	
	public int getLaborCampsEjet() {
		return laborCampsEjet;
	}
	
	public int getFleetsEjet() {
		return fleetsEjet;
	}
	
	/*
	 * Setter-metoder
	 */
	
	public void setLaborCampsEjet(int n) {
		this.laborCampsEjet = n;
	}
	
	public void setFleetsEjet(int n) {
		this.fleetsEjet = n;
	}
	
	public void addLaborCamp() {
		if (getLaborCampsEjet() < 2) laborCampsEjet += 1;
	}
	
	public void addFleet() {
		if (getFleetsEjet() < 4) fleetsEjet += 1;
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
