package tcpconnect;
import java.net.*;
import java.io.*;

public class tcpserver {
    public static void main(String[] arg){
     try {
         ServerSocket server = new ServerSocket(4700);
         Socket socket = server.accept();
         InputStreamReader Sysin = new InputStreamReader(System.in);
         BufferedReader SysBuf = new BufferedReader(Sysin);

         InputStreamReader Socin = new InputStreamReader(socket.getInputStream());
         BufferedReader SocBuf = new BufferedReader(Socin);

         PrintWriter Socout = new PrintWriter(socket.getOutputStream());
         //通信
         System.out.println("Client:"+SocBuf.readLine());
         String readline = SysBuf.readLine();
         while(!readline.equals("bye")){
             Socout.println(readline);
             Socout.flush();
             System.out.println("Server:"+readline);

             String rl = SocBuf.readLine();
             if(!rl.equals("ok"))
                 System.out.println("Client:"+rl);
             else
                 break;

             readline = SysBuf.readLine();
         }
         Socout.close();
         Socin.close();
         server.close();


     }catch (Exception e){
    System.out.println("Error"+e);
     }
    }
}
