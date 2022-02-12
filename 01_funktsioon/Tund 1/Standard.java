public class Standard{
	
	public static double[] reaalarvudeks(String[] sd){
		double[] v=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			v[i]=Double.parseDouble(sd[i]);
		}
		return v;
	}
	
	public static double keskmine(double[] arvud){
		double kokku = 0;
		for(int i=0; i<arvud.length; i++){
			kokku = kokku + arvud[i];
		}
		return kokku / arvud.length;
	}
	
	public static void main(String[] args){
		double[] arvud = reaalarvudeks(args);
		double kesk = keskmine(arvud);
		
		System.out.println("Kesmine ");
	}
}