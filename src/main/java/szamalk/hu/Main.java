package szamalk.hu;

import szamalk.hu.modell.Nev;

public class Main {
    public static void main(String[] args) {
        Nev nev=new Nev("#");
        nev.kirajzol();
        System.out.println("jelek száma a 2. sorban: "+nev.jelekSzamaSorban(1));
        System.out.println("jelek száma a 4. oszlopban: "+nev.jelekSzamaOszlopban(3));
        System.out.println("Tele van a 2. sor: "+nev.sorTeleVanE(1));
        System.out.println("Tele van a 2. oszlop: "+nev.oszlopTeleVanE(1));
        System.out.println("Teli sorok száma: "+nev.teliSorokSzama());
        System.out.println("Teli oszlop száma: "+nev.teliOszlopokSzama());
    }
}