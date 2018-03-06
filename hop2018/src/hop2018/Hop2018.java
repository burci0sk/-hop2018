
package hop2018;

import java.math.BigDecimal;

public class Hop2018 
{


    public static void main(String[] args) 
    {
       Produkt chleb = new Produkt("chleb",new BigDecimal("2.2"));
       Produkt maslo = new Produkt("maslo",new BigDecimal ("6.15"));
       Produkt mleko = new Produkt("mleko",new BigDecimal("1.9"));
       Produkt jogurt = new Produkt("jogurt",new BigDecimal("0.95"));
       
       Koszyk koszyk = new Koszyk();
       koszyk.dodaj(chleb);
       koszyk.dodaj(maslo);
       koszyk.dodaj(mleko);
       koszyk.dodaj(jogurt);
       
       System.out.println(koszyk.doZaplaty());
       System.out.println(koszyk);
    }
    
}
