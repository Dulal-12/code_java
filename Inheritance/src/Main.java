import javax.xml.namespace.QName;

class Bike{

    String name = "Yamaha";
    String color = "red";
}

class Yamaha extends Bike{


    public void information(){
        System.out.println("Bike color is: "+color);
        System.out.println("Bike name is: "+name);
    }
}


public class Main {
    public static void main(String[] args) {

        Yamaha obj = new Yamaha();
        obj.information();

    }
}