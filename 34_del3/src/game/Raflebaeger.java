package game;

public class Raflebaeger {
	
	private Terninger Terning1 = new Terninger();
	private Terninger Terning2 = new Terninger();
	
	public Raflebaeger(){
	}
	
	public void kastTerninger() {
		
		Terning1.kastTerning();
		Terning2.kastTerning();
	}

	public int getSum() {
		int slag = Terning1.getTerning() + Terning2.getTerning();
		return slag;
	}
	
	public void setSum(int k, int i) {
		
		Terning1.setTerning(k);
		Terning2.setTerning(i);
	}
}
