public class Proov2{
	public static void main(String[] args){
		Arvutaja<String, String> a=new Puhverdaja<String, String>(new EsitaheLeidja());
		System.out.println(a.f("tere"));
		System.out.println(a.f("tere"));
		System.out.println(a.f("kere"));
		System.out.println(((Puhverdaja)a).puhver);
	}
}