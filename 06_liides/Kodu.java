public class Kodu{
	
	public static interface Transport{
		public void kiirus();
		public void maht();
	}
	
	static class Auto implements Transport{
		public void kiirus(){System.out.println("Auto kiirus on 20 km/h");}
		public void maht(){System.out.println("Auto mahutab 5 inimest");}
	}
	static class Kivi implements Transport{
		public void kiirus(){System.out.println("Kivi kiirus on 0 km/h");}
		public void maht(){System.out.println("Kivi mahutab 1-e inimese");}
	}
	
	public static void main(String []args){
		Auto auto1 = new Auto();
		Kivi kivi1 = new Kivi();
		auto1.kiirus();
		auto1.maht();
		kivi1.kiirus();
		kivi1.maht();
	}
	
}