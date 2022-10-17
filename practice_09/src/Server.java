import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server{

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(1111);
        Socket s = ss.accept();
        DataOutputStream dio = new DataOutputStream(s.getOutputStream());
        dio.writeUTF(new Date().toString());

        ss.close();
    }
}