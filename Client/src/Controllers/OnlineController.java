package Controllers;

import java.io.*;
import java.net.Socket;

public class OnlineController {
    Socket socket;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public OnlineController(String HOST, int PORT) {
        try {
            this.socket = new Socket(HOST, PORT);
            this.bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
