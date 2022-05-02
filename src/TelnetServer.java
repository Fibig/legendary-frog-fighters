import java.net.ServerSocket;
import java.net.Socket;

public class TelnetServer {
    public static int PORT = 22333;

    public static void main(String[] args)  {
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                System.out.println("ready to connect");
                Socket client = server.accept();
                new TelnetClient(client).start();
            }
        } catch (Exception e)   {
            e.printStackTrace();
        }
    }
}
