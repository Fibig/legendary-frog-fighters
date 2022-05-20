package Controllers;

import java.io.*;
import java.net.Socket;

public class OnlineController extends Thread {
    Socket socket;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public OnlineController(String HOST, int PORT) {
        try {
            this.socket = new Socket(HOST, PORT);
            this.bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message)   {
        try {
            this.bufferedWriter.write(message + "\n\r");
            this.bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (socket.isConnected()) {
            try {
                while (this.bufferedReader.ready()) {
                    System.out.println(this.bufferedReader.readLine());
                }
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }

    }
}
