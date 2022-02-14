public class Proov2{
	public static void main(String[] arg){
		Kilpkonn k1=new Kilpkonn();
		//k1.edasi();
		//k1.keera();
		//k1.edasi();
		//k1.keera();
		
		for(int i=0; i<arg.length; i++){
			if(arg[i].equals("e")){k1.edasi();}
			if(arg[i].equals("k")){k1.keera();}
		}
		System.out.println(k1);
		}
	}
