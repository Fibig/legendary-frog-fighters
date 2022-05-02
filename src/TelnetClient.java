import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TelnetClient extends Thread {
    Socket client;

    public TelnetClient(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        ) {

            wr.write("\033[33mThis text is in yellow");
            wr.flush();

            while (true)    {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
