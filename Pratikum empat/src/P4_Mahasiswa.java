public class P4_Mahasiswa {
    public int nrp;
    public String nama;
    public void info(){
        System.out.println("ini mahasiswa RPL Polbeng");

    }

    public static void main(String[] args) {
        P4_Mahasiswa it = new P4_Mahasiswa();
        it.nrp=5;
        it.nama="Andi";
        it.info();
    }
}
