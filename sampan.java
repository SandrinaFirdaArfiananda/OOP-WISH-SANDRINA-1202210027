public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar) {
        super(jumlahkursi, biaya, layar);
        this.layar = layar;
    }

    public void informasi() {
        System.out
                .println("Transportasi air yang berjenis sampan dengan jumlah kursi " + jumlahkursi + " dengan biaya "
                        + biaya + " dan ukuran layar " + layar);
    }

    public void berlayar() {
        System.out.println("Transportasi air yang berjenis sampan berlayar menggunakan" + layar + "layar");

    }

    public void Berlabuh() {

        System.out.println("Transportasi air yang berjenis sampan berlabuh di pelabuhan menggunakan jangkar");
    }

    public void berlabuh(int jangkar) {
        System.out.println("Transportasi air yang berjenis sampan berlabuh di pelabuhan menggunakan jangkar" + jangkar
                + "jangkar");
    }

}
