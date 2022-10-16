import javax.xml.namespace.QName;

class Bike{

    String name = "Yamaha";
    String color = "red";
}

class Yamaha extends Bike{


    int wheel = 2;
    public void information(){
        System.out.println("Bike color is: "+color);
        System.out.println("Bike name is: "+name);
    }
}

class Suzuki extends Yamaha{
    public void information(){
        System.out.println("Bike color is: "+color);
        System.out.println("Bike name is: "+name);
        System.out.println("wheel number is: "+wheel);
    }
}


public class Main {
    public static void main(String[] args) {

        Suzuki obj = new Suzuki();
        obj.information();

    }
}