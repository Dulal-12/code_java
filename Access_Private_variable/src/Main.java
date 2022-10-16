class Variable{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}




public class Main {
    public static void main(String[] args)
    {
        Variable obj = new Variable();
        obj.setName("Dulal");
        System.out.println(obj.getName());
    }
}