import java.util.Scanner;

public class Kodu2proov{ 
	

	public static void main(String[] args){
		Scanner temp = new Scanner(System.in);
		System.out.println("Mis on masina nimi?");
		String sisenimi = temp.nextLine(); 
		
		Kodu2 test1 = new Kodu2(sisenimi);
		System.out.println(test1.getnimi());
		System.out.println("Selle masina nimi on " + test1.getnimi());
		
		Kodu2 test2 = new Kodu2("Peetri auto");
		System.out.println("Selle masina nimi on " + test2.getnimi());
	}
}