public class LoogikaOr {
    boolean kan1 = false;
    boolean kan2 = false;
    boolean output = false;

    public void loogikaOR(){
        if((kan1 == true || kan2 == true)){
            output = true;
            System.out.println("Esimene sisend on " +kan1+ ". Teine sisend on " +kan2);
            System.out.println("Valjund on " +output);
        }
        else{
            output = false;
            System.out.println("Esimene sisend on " +kan1+ ". Teine sisend on " +kan2);
            System.out.println("Valjund on " +output);
        }
    }

    public void signaal(int kanal, boolean seisund, String nimetus){
        if(kanal == 1){kan1 = seisund; System.out.println(nimetus); loogikaOR();}
        else if(kanal == 2){kan2 = seisund; System.out.println(nimetus); loogikaOR();}
        else{System.out.println("ei ole reaalne lulitus");}
    }

    public void uhendus(boolean input1, boolean input2, String nimetus){
        kan1 = input1;
        kan2 = input2;
        System.out.println(nimetus);
        loogikaOR();
    }
}
