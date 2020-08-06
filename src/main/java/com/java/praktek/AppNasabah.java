package com.java.praktek;

import com.java.praktek.bankir.NasabahPerorangan;
import java.util.*;

public class AppNasabah{

    public static void main(String[] args) {
        Scanner inputClass = new Scanner(System.in);
        System.out.print("Masukan nomor telfon anda: ");
        String noTelp = inputClass.nextLine();
        NasabahPerorangan nasabah = new NasabahPerorangan("1920118075", "kam.argana", "Gg.Andir V", noTelp, "false");
        System.out.println(nasabah.toString());
    }
}