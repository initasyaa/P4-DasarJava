package paketA;

public class Mobil {
    private String nama;
    private String noBM;
    int jmlRoda;
    protected String bahanBakar;
    public boolean fullAC;

    public Mobil(String nama,String noBM){
        this.nama=nama;
        this.noBM=noBM;
        this.jmlRoda=4;
        this.bahanBakar="Besin";
        this.fullAC=true;
    }

    protected String getInfo(){
        String info = "Mobil : "+nama+"\nNomor BM : "+noBM+
                "\nJumlah Roda : "+jmlRoda+"\nJenis Bahan Bakar : "+
                bahanBakar+"\nFull AC : "+fullAC;
        return info;
    }
}
