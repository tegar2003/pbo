package week1;
import java.util.Scanner;

public class Latihan2c {        

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             double hasil1, hasil2, d=5, t=10;
             double phi = 3.14;
             
        hasil2 = d / 2;
        hasil1 = (phi * hasil2 * hasil2 * t);
       
        System.out.println("Volume Tabung : " + hasil1);
    }
}