class A extends Thread{

    public void run(){

        try {
            for(int i = 1;i <= 10;i++){
                System.out.println("Thread1");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread{

    public void run(){

        try {
            for(int i = 1;i <= 10;i++){
                System.out.println("Thread2");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main{

    public static void main(String[] args){

        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}