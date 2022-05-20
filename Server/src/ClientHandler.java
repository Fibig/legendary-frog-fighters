import java.io.*;
import java.net.Socket;
import java.util.stream.Collectors;

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
                System.out.println("not logged in");
                String message = bufferedReader.readLine();
                messageParser(message);
            }

            System.out.println(Server.userList);

            //MESSAGE PARSER
            while (client.isConnected())    {
                String message = bufferedReader.readLine();
                messageParser(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void messageParser(String message) {
        String[] messageArr = message.split(";");
        switch (messageArr[0])  {
            case "login":
                actionLogin(messageArr);
                break;

            case "test":
                actionLogin(messageArr);
                break;

        }
    }

    public boolean isLoggedIn() {
        return Server.userList.contains(this);
    }

    public void actionLogin(String[] messageArr)   {
        if (!Server.userList.stream().map(x -> x.name).collect(Collectors.toList()).contains(messageArr[1])) {
            Server.userList.add(this);
            sendMessage("success;true");
        } else {
            sendMessage("success;false");
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
}