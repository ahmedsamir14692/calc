
package calc;
import javax.swing.JOptionPane; 
 import java.util.ArrayList;
public class Calc {
public static void main(String[] args) {
        double output;
         double x;
        ArrayList<JOptionPane> list = new ArrayList<JOptionPane> ();
        int idex =0 ;
        while(true) {try{
           list.add(idex, new JOptionPane () );
        x = Double.parseDouble(list.get(idex).showInputDialog("  دخل الرقم الاول يا اسطا"));
       break;
       }
      catch( RuntimeException s)
      {
         System.out.println("يعني  دا رقم انا عاوز زمتك");
      System.out.println("دخل رقم يا اسطا رقم هاه");
      }}
       boolean yes;
       yes= false;
      //multy therad
      while(true){   
    while(true)  {try{
     output= operations.add(x);
     if((int)output== output)
     { System.out.println((int)output);
    x=output;
     }
     else
     { System.out.println  (output); 
    x=output;
     }
    break; }
    catch( RuntimeException t)
    { System.out.println("يعني الرقم التاني دا رقم انا عاوز زمتك");
          System.out.println("دخل رقم يا اسطا رقم هاه"); }}
      System.out.println("do yo want to add the output to anthher num true for yes or false for no ");
      yes= Boolean.parseBoolean(JOptionPane.showInputDialog("+ or -"));
      /*
      if true act like we hit button + 
      ذايد او ناقص او اي حاجة
      
      */
      if(yes== false)
          break;}}}
