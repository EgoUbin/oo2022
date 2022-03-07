public class Akvaarium{
	
		double pikkus;
		double laius;
		double korgus;
		double vesi;
		double ruumala;
		double amber;
		
	public Akvaarium(double tpikkus,double tlaius,double tkorgus){
		pikkus = tpikkus;
		laius = tlaius;
		korgus = tkorgus;
		System.out.println("Sisestatud andmed on: " + " " + pikkus + " " + laius + " " + korgus);
		} // Konstruktor
	
	public double getRuumala(){
		double ruumala = pikkus * laius * korgus;
		return ruumala;
		}
	
	public void getVesi(){
		System.out.println("Hetkene vee hulk on " + vesi);
	}
	
	public double addVesi(double veelisa){
		if((vesi + veelisa) < ruumala){vesi = vesi + veelisa; return vesi;}
		else{System.out.println("Ei saanud lisada " + veelisa + " vett"); return vesi;}
	}
	
	public double takeVesi(double veelisa){
		if((vesi - veelisa) >= 0){vesi = vesi - veelisa; return vesi;}
		else{System.out.println("Ei saanud võtta " + veelisa + " vett"); return vesi;}
	}
	
	public double putAmber(double veelisa){
		if((vesi-veelisa) >= 0){amber = amber + veelisa;vesi = vesi - veelisa; return amber;}
		else{System.out.println("Ei saanud ambrisse panna " + veelisa + " vett"); return amber;}
	}
	
	public double takeAmber(){
		if (((ruumala - (vesi + amber))/(pikkus * laius)) >= 2){vesi = vesi + amber;  amber = 0; return vesi;}
		else{System.out.println("Alles jaab alla 2cm. Ei saa kallata."); return vesi;}
	}
	
	public static void main(String []args){
		Akvaarium test1 = new Akvaarium(10, 5, 10);
		test1.ruumala = test1.getRuumala();
		System.out.println("Ruumala 1 on " + test1.ruumala);
		test1.addVesi(20);
		test1.getVesi();
		test1.takeVesi(10);
		test1.getVesi();		
		
		Akvaarium test2 = new Akvaarium(20, 10, 20);
		test2.ruumala = test2.getRuumala();
		System.out.println("Ruumala 2 on " + test2.ruumala);
		
		test2.amber = test1.putAmber(5);
		test1.getVesi();
		test2.takeAmber();
		test2.getVesi();
		
	}
}