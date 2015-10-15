
package is2_practica3;

import com.sun.corba.se.impl.encoding.BufferManagerRead;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Goretti
 */
public class IS2_Practica3 {

   public static void main(String[] args) {
       Histogram<String> histo = new Histogram<>();
       String name = "C:\\Users\\Goretti\\Documents\\NetBeansProjects\\IS2_Practica3\\DATA\\emailsfilev1.txt";
       
       try{
           BufferedReader fileIn = new BufferedReader(new FileReader(name));
           String mail;
           
           while ((mail = fileIn.readLine()) != null){
               if (mail.contains("@")) {
                   histo.increment(mail.split("@")[1]);
                   System.out.println("sadkjf");
               }
           }
           
       } catch (Exception e){
           
       }
       
       HistogramDisplay histo1 = new HistogramDisplay(histo);
       histo1.execute();
   }
    
}
