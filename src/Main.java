import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  deklaracije;
        byte a2;
        //definicija
        short x = 2;
        int myWidth;
        long myHeight;
        //inicijalizacija
        myWidth = 5252;

        float decimal = 3.12323F;
        double decimalni = 3.12323;
        char znak = 'A';
        char znak1 = 'H';
        int zy = (int) x;
        boolean znak2 = znak == znak1;
        int baze = 2211;
        int algoritmi = 66;
        int praktikum = 3;
        int osnove = 3;
        double prosjek = (double) (baze + algoritmi + praktikum + osnove) / 4;
        System.out.println(x + myWidth);
        System.out.println(x - myWidth);
        System.out.println(x * myWidth);
        System.out.println((x / myWidth));//cjelobrojno djeljenje
        System.out.println(x % myWidth);//rezultat je ostatak
        System.out.println((float) x / myWidth);

        System.out.println("Dijelimo double sa int=" + (decimalni / myWidth));
        System.out.println("Dijelimo float sa int=" + (decimal / myWidth));
        System.out.println("Dijelimo int sa float=" + (myWidth / decimal));
        System.out.println("Dijelimo int sa double=" + (myWidth / decimalni));
        System.out.printf("Dijelimo int sa double (printf) : %f%n", (myWidth / decimalni));
        System.out.println("Dijelimo short sa float=" + (x / decimal));
        System.out.println("Char tip podataka -unicode=" + znak);
        System.out.println("Znak1" + znak1);
        System.out.println("Boolean primjer=" + znak2);
        System.out.println("Prosjek je=" + prosjek);
        System.out.println("Zaokruzen prosjek je " + Math.round(prosjek));
        System.out.println("Broj Pi : " + Math.PI);
        System.out.println("Broj E : " + Math.E);
        /*  Izračunaj 10na3
         E zaokruži na cijeli broj
        /izračunaj korijen od 400
        Zaokruži broj E na dvije decimale */
        System.out.println("10 ^ 3=" + Math.pow(10, 3));
        System.out.println("E zaokruzen na cijeli broj je=" + Math.round(Math.E));
        System.out.println("Korijen od 400 je " + Math.sqrt(400));
        System.out.println("E zaokruzen na 2 decimale=" + Math.round(Math.E * 100.0) / 100.0);
        //System.out.println("E zaokruzen na 2 decimale=" +Math.round(Math.E);
        System.out.println("E zaokruzen na 2 decimale kao float=" + Math.round((Math.E * 100) / 100f));
        //Domaca zadaca
        //  1.Zadatak Napisi program koji ce zbrojiti 2 broja
        //  te na kraju ispisati rezultat  (Oblikuj tekst ispisa kao zbroj brojeva 4+2=6)
        Scanner scanner = new Scanner(System.in);

        // Unos prvog broja
        System.out.print("Unesite prvi broj: ");
        int broj1 = scanner.nextInt();

        // Unos drugog broja
        System.out.print("Unesite drugi broj: ");
        int broj2 = scanner.nextInt();

        // Zbrajanje brojeva
        int rezultat = broj1 + broj2;

        // Ispis rezultata u obliku "4+2=6"
        System.out.println(broj1 + "+" + broj2 + "=" + rezultat);
        // 2.nacin
        int a = 4;
        int b = 2;
        int c = a + b;
        System.out.println("Zbroj brojeva 4 i 2 je:" + c);
        //Zadatak2
        //Napišite program koji ce u prvom redu ispisati vase ime i prezime
        //Nakon toga ostavite jedan red prazan i u trecem redu naziv mjesta u kojem zivite.\t- tab \n novi red
        String ime = "Marija";
        String prezime = "Bošnjak";
        String mjesto="Split";
        System.out.println(ime + "\t " + prezime + "\n" + "\n" + mjesto);
        //Zadatak3
        //Napišite program koji ce izracunati duljinu hipotenuze pravokutnog trokuta ako imamo zadane duljine
        // kateta a i b. Hipotenuza se racuna pomocu Pitagorina pouvka c^2=a^2+b^2
        int m=2;
        int n=3;
        double mSqr = Math.pow(m, 2);
        double nSqr = Math.pow(n, 2);
        System.out.println("Kateta m je: " + m + " i njen kvadrat je: " + mSqr);
        System.out.println("Kateta n je: " + n + " i njen kvadrat je: " + nSqr);

        double hipotenuza = Math.sqrt(mSqr + nSqr);


        System.out.println("Duljina hipotenuze pravokutnog trokuta je: " + hipotenuza);




    }
}