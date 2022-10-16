class A{
    public static int x = 78;
}

class B extends A{
    int x = 89;
  public  void  display(){
      System.out.println(A.x);
      System.out.println(x);
    }
}
public class Main {
    public static void main(String[] args) {

        B obj = new B();
        obj.display();
    }
}