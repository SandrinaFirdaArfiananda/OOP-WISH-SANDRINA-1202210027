public class Kapal extends TransportasiAir {
    protected String mesin;

    // constructor
    public TransportasiAir(int jumlahKursi, int biaya, String mesin) {
        super(jumlahkursi, biaya, mesin);
        this.mesin = mesin;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi air yang berjenis kapal dengan jumlah kursi " + jumlahkursi + " dengan biaya "
                + biaya + " dan jenis mesin" + mesin);
    }

    public void berlayar() {
        System.out.println("Transportasi air yang berjenis kapal berlayar menggunakan layar");

    }

    public void berlayar(int kecepatan) {
        System.out.println("Transportasi air yang berjenis kapal berlabuh di pelabuhan dengan kecepatan" + kecepatan);
    }

    public void Berlabuh() {

        System.out.println("Transportasi air yang berjenis sampan berlabuh di pelabuhan menggunakan jangkar");
    }

}
