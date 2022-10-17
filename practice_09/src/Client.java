import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{

        Socket s = new Socket("localhost" , 1111);
        DataOutputStream dio = new DataOutputStream(s.getOutputStream());
        dio.writeUTF("Hello server");
        s.close();
    }
}
