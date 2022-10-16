class A{

    int age;
    int height;

    A(){
        age = 23;
        height = 67;
    }

    A(A reference){

        age = reference.age;
        height = reference.height;

        System.out.println(age + " "+height);
    }

}
public class Main {

    public static void main(String[] args){

        A r = new A();
        A r2 = new A(r);
    }
}

