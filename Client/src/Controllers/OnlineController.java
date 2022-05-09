package Controllers;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class OnlineController {
    Socket socket;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public OnlineController() {
        try {
            this.socket = new Socket("localhost", 22333);
            this.bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
        }  catch (Exception e) {
            e.printStackTrace();
        }

    }
}
