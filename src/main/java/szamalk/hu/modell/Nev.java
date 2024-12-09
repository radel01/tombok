package szamalk.hu.modell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;

public class Nev {
    private String jel;
    String[][] rajz=new String[3][8];

    public Nev(String jel) {
        this.jel = jel;
    }
    public void kirajzol(){
        rajz= new String[][]{
                {" ", " ", " ", " ", jel, " ", " ", " ", " ",},
                {" ", " ", " ", jel, " ", jel, " ", " ", " ",},
                {" ", " ", jel, jel, jel, jel, jel, " ", " ",},
                {" ", jel, " ", " ", " ", " ", " ", jel, " ",}
        };


        for( int i = 0; i < rajz.length; i++ )
        {
            for( int j = 0; j < rajz[i].length; j++ )
            {
                // egymás mellé írom ki egy sor elemeit
                System.out.print(rajz[i][j]+" ");
            }
                // ha végeztem egy sor kiírásával, akkor új sort kezdek
            System.out.println();
        }
    }

    public int jelekSzamaSorban(int sor){
        int db=0;
        for( int j = 0; j < rajz[sor].length; j++ )
        {
            if(rajz[sor][j]==jel){
                db++;
            }
        }

        return db;
    }
    public int jelekSzamaOszlopban(int oszlop){
        int db=0;
        for( int j = 0; j < rajz.length; j++ )
        {
            if(rajz[j][oszlop]==jel){
                db++;
            }
        }
        return db;
    }

    public boolean sorTeleVanE(int sor){
        boolean teliE=true;
        for( int j = 0; j < rajz[sor].length; j++ )
        {
            if(rajz[sor][j]!=jel){
                teliE=false;
            }
        }

        return teliE;
    }
    public boolean oszlopTeleVanE(int oszlop){
        boolean teliE=true;
        for( int j = 0; j < rajz.length; j++ )
        {
            if(rajz[j][oszlop]!=jel){
                teliE=false;
            }
        }

        return teliE;
    }

    public int teliSorokSzama(){
        int ossz=0;
        for( int j = 0; j < rajz.length; j++ )
        {
            if(sorTeleVanE(j)){
                ossz++;
            };
        }
        return ossz;
    }

    public int teliOszlopokSzama(){
        int ossz=0;
        for( int j = 0; j < rajz[0].length; j++ )
        {
            if(oszlopTeleVanE(j)){
                ossz++;
            };
        }
        return ossz;
    }

    public void fajlbaIr() {
        for (int i = 0; i < 100; i++) {

        }
    }

    @Override
    public String toString() {
        return "Nev{" +
                "jel='" + jel + '\'' +
                ", rajz=" + Arrays.toString(rajz) +
                '}';
    }
}
