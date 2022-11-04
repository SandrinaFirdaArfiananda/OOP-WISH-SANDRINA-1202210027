public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String namaUser;
    integer nomorTelpon;

    public void setnamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void setnomorTelpon(Integer nomorTelpon) {
        this.nomorTelpon = nomorTelpon;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number
    // and success message
    public void register() {
        System.out.println("Register Success");
        System.out.println("Nama : " + namaUser);
        System.out.println("Phone Number : " + nomorTelpon);

    }
}
