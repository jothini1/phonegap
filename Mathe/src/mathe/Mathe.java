
package mathe;

public class Mathe {
    /**
     *Rundet positive Zahlen perfekt.
     * @param z Kommazahl, die gerundet werden soll.
     * @param a Anzahl der Nachkommastellen.
     * @return Die gerundete Zahl.
     */
    public static double runde(double z,int a){
        double HWert=z;
        for(int i=0;i<a;i++){
            HWert=HWert*10;
        }
        double rg=(int)(HWert+0.5);
        for(int i=0;i<a;i++){
            rg=rg/10;
        }
        return rg;
    }
}
