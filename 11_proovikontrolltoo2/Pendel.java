import java.lang.Math;

public class Pendel {
	int pikkus;
	public double vonkeperiood;
	Hammasratas pendlihammas;
	
	public Pendel(int alg_pikkus, Hammasratas hammas) {
		vonkeperiood = (2 * Math.PI * Math.sqrt(alg_pikkus/9.8));
		pikkus = alg_pikkus;
		pendlihammas = hammas;
	}
	
	public void Tiksu() {
		System.out.println("Tiksusin");
		pendlihammas.Liigu();
	}
	
}