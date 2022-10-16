public class Main {
    public static void main(String[] args) {

      int number_01 = 20;
      int number_02 = 0;
      try{
          int result = number_01/number_02;
      }catch(ArithmeticException ae){
          System.out.println("Divided by zero can not possible");
      }
    }
}