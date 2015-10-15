
package is2_practica3;

/**
 *
 * @author Goretti
 */
public class IS2_Practica3 {

   public static void main(String[] args) {
       Histogram<String> histo = new Histogram<>();
       
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       histo.increment("ulpgc.com");
       
       histo.increment("hotmail.com");
       histo.increment("hotmail.com");
       histo.increment("hotmail.com");
       histo.increment("hotmail.com");
       histo.increment("hotmail.com");
       
       
       HistogramDisplay histo1 = new HistogramDisplay(histo);
       histo1.execute();
   }
    
}
