import java.net.ServerSocket;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
    public class Server {
        ServerSocket serversocket;
        Socket client;

        BufferedReader input;
        PrintWriter output;

        public void start() throws IOException{
            serversocket = new ServerSocket(9090);
            System.out.println("Connection Starting on port:" + serversocket.getLocalPort() );
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

        public void logInfo() throws Exception{
            //open buffered reader for reading data from client

            input = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String username = input.readLine();
            System.out.println("username" + username);
            String password = input.readLine();
            System.out.println("password" + password);

            //open printwriter for writing data to client
            output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));


            if(username.equals("User") &&password.equals("Password")){
                output.println("Welcome, " + username);
            }else{
                output.println("Login Failed");
            }
            output.flush();
            output.close();

        }

        public static void main(String[] args){
            Server server = new Server();
            try {
                server.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
