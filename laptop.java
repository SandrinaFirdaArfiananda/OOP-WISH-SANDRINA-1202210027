public class laptop extends Perangkat {
    protected boolean webcam = true;

    public laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        System.out
                .println("laptop ini memiliki " + drive + " ram : " + ram + " proce : " + processor + " webcam : "
                        + webcam);
    }

    public void bukaGame(String nama_game) {
        System.out.println("laptop berhasil" + nama_game);

    }

    public void kirimkanEmail(String email) {

        System.out.println("laptop telah berhasil mengirim" + email);
    }

    public void kirimkanEmail(String email1, String email2) {
        System.out.println("laptop telah berhasil mengirim 2 email " + email1 + " dan" + email2);
    }

}
