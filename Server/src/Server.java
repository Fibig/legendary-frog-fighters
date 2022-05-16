import java.net.ServerSocket;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static int PORT = 22333;
    public static List<ClientHandler> userList = new ArrayList<>();

    public static ServerSocket serversocket;
    static Socket client;

    BufferedReader bufferedReader;
    PrintWriter printWriter;

    public static void main(String[] args) {
        try {
            serversocket = new ServerSocket(PORT);
            System.out.println("ready to connect");

            while (true)    {
                client = serversocket.accept();
                System.out.println("connection made to " + client);

                new ClientHandler(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public void start() throws IOException {
        serversocket = new ServerSocket(9090);
        System.out.println("Connection Starting on port:" + serversocket.getLocalPort());
        //make connection to client on port specified


        //accept connection from client
        client = serversocket.accept();

        System.out.println("Waiting for connection from client");

        try {
            logInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void logInfo() throws Exception {
        //open buffered reader for reading data from client

        input = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String username = input.readLine();
        System.out.println("username" + username);
        String password = input.readLine();
        System.out.println("password" + password);

        //open printwriter for writing data to client
        output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));


        if (username.equals("User") && password.equals("Password")) {
            output.println("Welcome, " + username);
        } else {
            output.println("Login Failed");
        }
        output.flush();
        output.close();

    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}

