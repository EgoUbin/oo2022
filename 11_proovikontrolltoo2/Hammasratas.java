public class Hammasratas {
	double hambaarv;
	double hetkehammas;
	Hammasratas yhendatudhammas;
	
	public Hammasratas(int alg_hammas) {
		hambaarv = alg_hammas;
		hetkehammas = 1;
	}
	
	public void YhendaHammas(Hammasratas yhendatav) {
		yhendatudhammas = yhendatav;
	}
	
	public void Liigu() {
		hetkehammas += 1;
		
		if (hetkehammas > hambaarv) {
			hetkehammas = 1;
		}
		
		if (yhendatudhammas != null) {
			double suhe = (yhendatudhammas.hambaarv / hambaarv);
			if (hetkehammas % suhe == 0) {
				yhendatudhammas.Liigu();
			}
		}
		
	}


}