import java.io.DataInputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost" , 1111);
        DataInputStream di = new DataInputStream(s.getInputStream());
        System.out.println((String) di.readUTF());
        s.close();
    }
}
