public class Tervitus {
	public static void main(String[] arg) {
		if(arg.length==1){
			System.out.println("Tere, "+arg[0]);
		}
		//Kui nimesid on väh 2, ss tervitage kahte esimest.
		
		if(arg.length>=2){
			System.out.println("Tere, " +arg[0] +" ja " +arg[1]);
		}
		else System.out.println(" Pole kahte nime");
	}
}