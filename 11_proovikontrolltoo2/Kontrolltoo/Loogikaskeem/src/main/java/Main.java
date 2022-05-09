public class Main {
    public static void main(String args[]){
        //Lüliti lul1 ja ta sisendid lülitid lul2n1 lul2n2
        LoogikaOr lul1 = new LoogikaOr();
        LoogikaOr lul2n1 = new LoogikaOr();
        LoogikaOr lul2n2 = new LoogikaOr();

        //muudab uhe sisendi vaartuse
        lul2n1.signaal(1, true, "Luliti2n1 Seisund:");

        //uhendused nende lulitite vahel. Jooksutab automaatselt loogika
        lul1.uhendus(lul2n1.output, lul2n2.output, "Luliti 1 Seisund:");

    }
}
