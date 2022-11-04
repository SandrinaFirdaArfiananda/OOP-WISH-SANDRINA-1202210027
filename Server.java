package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu mn1 = new Menu();
        mn1.setNama("Rendang");
        mn1.setKategori("makanan");
        mn1.setHarga("20000");

        Menu mn2 = new Menu();
        mn2.setNama("Ayam Bakar");
        mn2.setKategori("makanan");
        mn2.setHarga("15000");

        Menu mn3 = new Menu();
        mn3.setNama("Ayam Goreng");
        mn3.setKategori("makanan");
        mn3.setHarga("10000");

        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First

        // TODO Create User from register in Main Menu

        // TODO Display Menu

    }
}
