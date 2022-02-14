public class Kilpkonn{
	private int x, y, suund;
	//suund: 0 -> x++; 1 -> y++; 2 -> x--; 3 -> y--;
public String toString(){
		return"("+x+", "+y+", suund, "+suund+")";
	}		
	public void edasi(){
		if(suund==0){x++;}
		if(suund==1){y++;}
		if(suund==2){x--;}
		if(suund==3){y--;}
	}
	public void keera(){
		if(suund < 4){suund++;}
		else{suund = 0;}
	}
}