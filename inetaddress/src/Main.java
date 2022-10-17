import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        InetAddress ip1 = InetAddress.getByName("192.168.0.107");
        System.out.println(ip1.getHostName());

    }
}