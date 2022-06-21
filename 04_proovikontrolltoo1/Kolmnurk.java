import java.util.Arrays;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Kolmnurk{
	int[]coorX = {0, 0, 0};
	int[]coorY = {0, 0, 0};
	
	Kolmnurk(int t_x1, int t_y1, int t_x2, int t_y2, int t_x3, int t_y3){
		this.coorX[0] = t_x1;
		this.coorX[1] = t_x2;
		this.coorX[2] = t_x3;
		
		this.coorY[0] = t_y1;
		this.coorY[1] = t_y2;
		this.coorY[2] = t_y3;
	}
	
	void points(){ // Prints out all the points.
		System.out.println("Triangle points:");
		for(int i = 0; i< coorX.length; i++){
			System.out.println(coorX[i] +" "+ coorY[i]);
		}
	}
	
	void addPoint(int tempX, int tempY){ //Adds new point via Array copying.
		int e = coorX.length;
		coorX = Arrays.copyOf(coorX, coorX.length + 1);
		coorY = Arrays.copyOf(coorY, coorY.length + 1);
		coorX[e] = tempX; coorY[e] = tempY;
	}
	
	double circumference(){
		double circum = 0;
		double circ;
		for(int i = 0; i< (coorX.length - 1); i++){
			double circum_t = sqrt(pow(coorX[i] - coorX[i+1], 2) + pow(coorY[i] - coorY[i+1], 2) );
			circum = circum + circum_t;
			
			if(i == coorX.length - 2 ){
				circum_t = sqrt(pow(coorX[i+1] - coorX[0], 2) + pow(coorY[i+1] - coorY[0], 2) );
				circum = circum + circum_t;
				}
			}
		System.out.println("Circumference: " + circum);
		return circum;
	}
	
	public static void main( String args[] ){
		Kolmnurk esimene = new Kolmnurk(0,0,0,3,4,0);
		Kolmnurk teine = new Kolmnurk(0,0,4,1,0,4);
		esimene.points();
		double lahe = esimene.circumference();
		esimene.addPoint(4,4);
		esimene.points();
		lahe = esimene.circumference();
	}
}