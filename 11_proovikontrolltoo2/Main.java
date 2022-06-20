public class Main {
    public static void main(String[] args) throws InterruptedException {
		
		Hammasratas pendlihammas = new Hammasratas(20);
		Hammasratas yhendatav = new Hammasratas(30);
		pendlihammas.YhendaHammas(yhendatav);
		
		Pendel uuspendel = new Pendel(1, pendlihammas);
		
		int ooteaeg = (int)(uuspendel.vonkeperiood * 1000);
		System.out.println("Ooteaeg on " + uuspendel.vonkeperiood + " sekundit.");
		
		while (true) {
			Thread.sleep(ooteaeg);
			uuspendel.Tiksu();
			System.out.println("Hammas 1: " + pendlihammas.hetkehammas + ". Hammas 2: " + yhendatav.hetkehammas);
		}

    }
}