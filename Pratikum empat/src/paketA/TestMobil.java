package paketA;
import  paketA.Mobil;
public class TestMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Innova","B3210");
        avanza.jmlRoda=4;
        avanza.bahanBakar="Solar";
        avanza.fullAC=true;
        System.out.println(avanza.getInfo());
    }
}
