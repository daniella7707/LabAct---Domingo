import javax.sound.sampled.SourceDataLine;

public class App {

    public static int computeSum(int num1, int num2) {
        return num1 + num2;
    }
    
    public static double computeSum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the method in such a way that te Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum 
     * of the three numbers.
     */


     /**
      * Create methods that returns the greater integer value
      */

      private static int greaterValue(int x, int y){
          if (x > y){
              return x;
          }else{
              return y;
        }
    }

    /**
     * Create method that returns the greater double value
     */

     public static double greaterValue(double x, double y){
         if (x > y){
             return x;
         }else{
             return y;
        }
    }
    /**
     * Create Methid calls that takes in 2 parameters and 3 parameters
     * respectively and computes their sum.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        System.out.println("The sum of the two parameters are " +computeSum(7,5));
        System.out.println("The sum of the three parameters are " +computeSum(12.3,5.7, 4.12));


    /**
     * Call the greaterValue method with integer parameters
     */
     
     System.out.print("The greater value between 45 and 100 is " + greaterValue(45,100));
     
     /**
      * Call the greaterValue method with double parameters
      */
     System.out.print("\nThe greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
 
    }  
}
