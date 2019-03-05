public class SubClass3{
/**
This method overrides one of the superclass methods.
@param arg An int.
*/
   @Override 
   public void showValue(int arg)
   {
      System.out.println("SUBCLASS: " +
         "The int argument was " + arg);
   }
 /**
 This method overloads the superclass methods.
 @param arg A double.
 */
 
   public void ShowValue(double arg){
   
      System.out.println("SUBCLASS: " + "The double argument was " + arg);
   }
}