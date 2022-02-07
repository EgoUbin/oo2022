public class Funktsioonid1{
	public static double sentimeetriteks(double tollid){
		return tollid*2.54;
	}
	
	public static double tollideks(double sentimeetrid){
		return sentimeetrid/2.54;
	}
	
	public static void main(String[] args){
		if(args.length>0){
			double t=Double.parseDouble(args[0]);
			System.out.println(sentimeetriteks(t));
			System.out.println(tollideks(t));
		}
		
	}
}
