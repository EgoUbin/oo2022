public class Funktsioonid1{
	public static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	
	public static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
	}
	public static double[] reaalarvudeks(String[] sd){
		double[] v=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			v[i]=Double.parseDouble(sd[i]);
		}
		return v;
	}
	public static void main(String[] args){
		if(args.length>0){
			double[] arvud =reaalarvudeks(args);
			for(int i=0; i<arvud.length; i++){
				System.out.println(sentimeetriteks(arvud[i]));
			}
		}
		
	}
}