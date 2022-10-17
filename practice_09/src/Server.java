import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args)throws Exception {

        ServerSocket ss = new ServerSocket(1111);
        Socket s = ss.accept();
        DataInputStream dip = new DataInputStream(s.getInputStream());
        System.out.println((String)dip.readUTF());
        ss.close();
    }
}