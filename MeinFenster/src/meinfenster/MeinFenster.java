
package meinfenster;

import mathe.*;

public class MeinFenster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text="Hallo";
        System.out.println("Das Wort ist "+text);
        System.out.println("Die Länge des Wortes ist "+text.length());
        System.out.println(text.toUpperCase());
        String textNeu="";
        for(int i=text.length()-1;i>=0;i--){
            
            textNeu+=text.charAt(i);
        }
        System.out.println("Auf spanisch: "+textNeu.toLowerCase());
        System.out.println(textNeu);
        
        double z1=3.534534;
        System.out.println(Mathe.runde(z1,3));
        
    }
}
