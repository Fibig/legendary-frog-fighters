import java.io.*;
import java.net.Socket;

public class ClientHandler extends Thread {
    Socket client;
    String name;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public ClientHandler(Socket client) {
        try {
            this.client = client;
            this.bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            //LOGIN
            while (!isLoggedIn())   {
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isLoggedIn() {
        return Server.userList.contains(this);
    }
}