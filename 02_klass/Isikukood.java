public class Isikukood{
	private String kood;
	public Isikukood(String uusKood){kood=uusKood;}
	public String sugu(){
			return(Integer.parseInt(kood.substring(0,1)) %2 == 0 ? "naine" : "mees");
		}
	public String aastakakstahte(){
		return String.valueOf(18+(Integer.parseInt(kood.substring(0, 1))-1)/2);
	}
	public String synniaasta(){
		return astakakstahte()+kood.substring(1,3);
	}
}