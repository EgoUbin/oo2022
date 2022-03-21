public class Kodu{
	
	public static interface Kujund{
		double getRuumala();
		double getPindala();
	}
	
	static class RistTahukas implements Kujund{
		double pikkus;
		double korgus;
		double laius;
		double pindala;
		double ruumala;
		public double getPindala(){pindala = ((pikkus * korgus) + (pikkus * laius) + (laius * korgus))*2; return pindala;}
		public double getRuumala(){ruumala = pikkus * laius * korgus; return ruumala;}
		
	}
	static class Kera implements Kujund{
		double raadius;
		double pindala;
		double ruumala;
		public double getPindala(){pindala = 4 * 3.14 * (raadius * raadius); return pindala;}
		public double getRuumala(){ruumala = (4/3) * 3.14 * (raadius * raadius * raadius); return ruumala;}
	}
	
	public static void main(String []args){
		RistTahukas kujund1 = new RistTahukas();
		Kera kujund2 = new Kera();
		kujund1.pikkus = 10;
		kujund1.laius = 20;
		kujund1.korgus = 2;
		kujund1.getPindala();
		System.out.println("Kujund 1 pindala on " + kujund1.pindala);
		kujund1.getRuumala();
		System.out.println("Kujund 1 ruumala on " + kujund1.ruumala);
		
		kujund2.raadius = 12;
		kujund2.getPindala();
		System.out.println("Kujund 2 pindala on " + kujund2.pindala);
		kujund2.getRuumala();
		System.out.println("Kujund 2 ruumala on " + kujund2.ruumala);
	}
}