package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<flightPassanger> utasok = new ArrayList<flightPassanger>();
        try {
            Scanner beolvasas = new Scanner(new File("funny-airlines.csv"), "utf-8");
            String[] tomb = beolvasas.nextLine().split(";");

            while(beolvasas.hasNextLine()) {
                tomb = beolvasas.nextLine().split(";");
                //System.out.println(Arrays.toString(tomb));
                String Flightnumber = tomb[0];
                String Source = tomb[1];
                String Destination = tomb[2];
                String PassangerName = tomb[3];
                int PassangerID = Integer.parseInt(tomb[4]);
                String TicketID = tomb[5];
                String Seatnumber = tomb[6];
                int price = Integer.parseInt(tomb[7]);
                flightPassanger f = new flightPassanger(Flightnumber,Source,Destination,PassangerName,PassangerID,TicketID,Seatnumber, price);
                utasok.add(f);
            }
            beolvasas.close();
        } catch (Exception e){
            System.out.println("Hiba file nem található");
        }
        //2es feladat
        System.out.println("2. feladat");
        System.out.println("Járatok száma: " + utasok.size());
    }
}
