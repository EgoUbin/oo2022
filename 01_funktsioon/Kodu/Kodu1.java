import java.util.Scanner;

public class Kodu1{
	public static char kook(){
		Scanner sisestus = new Scanner(System.in); // Valmistab andmeid võtma.
		System.out.println("Kas tahad kooki? Y/N");
		char test = sisestus.next().charAt(0); //muudab sisestatud tähe char formaati.
		return test;
	}
	
	public static void main(String[] args){ 
		char vastus = kook(); //Kutsub funktsiooni.
		if (vastus == 'Y'){  //If funktsioon, et andmetega midagi teha.
			System.out.println("Palun. S66 kooki.");
		}
		else{
			System.out.println("Arusaadav, sa ei saa kooki.");
		}
	}
}