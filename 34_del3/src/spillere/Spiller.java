package spillere;

import java.awt.Color;
import java.awt.color.*;

public class Spiller {
	// Variable
	protected String navn;
	protected int balance;
	protected int laborCampsEjet;
	protected int fleetsEjet;
	protected boolean bankerot = false;
	
	// Constructor
	public Spiller(String navn) {
		this.navn = navn;
		this.balance = 30000;
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
	
	public String getNavn() {
		return navn;
	}

	public boolean getBankerot() {
		return bankerot;
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
	
	public void setBankerot() {
		this.bankerot = true;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
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
	
	public void withdrawBalance (int beloeb) {
		this.balance -= beloeb;
	}
	
	// Hjaelpemetoder
	
	/*
	 * overfoerPenge(int beloeb, Spiller modtager);
	 * 
	 * Overfoerer penge fra spiller til modtager
	 */
	
	public void overfoerPenge(int beloeb, Spiller modtager) {
		if (beloeb <= this.getBalance()) {
			this.withdrawBalance(beloeb);
			modtager.addBalance(beloeb);
		} 
		else { // Bankerot
			this.withdrawBalance(this.getBalance()); // Den aktive spiller får trukket hele sine kapital
			modtager.addBalance(this.getBalance()); // Ejeren af feltet modtager resterne
//			this.resetPortefoelje // Den aktive spillers felter fritstilles
			this.setBankerot();
		}
	}
	
//	public void bankerot() { KAN KUN LAVES HVIS VI LAVER NEDARVNING/OVERRIDE
//		
//		this.withdrawBalance(this.getBalance());
//		modtager.addBalance
//		
//	}
	
	
}
