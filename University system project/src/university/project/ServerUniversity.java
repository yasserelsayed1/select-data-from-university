<<<<<<< HEAD

package university.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerUniversity {
    
    public static void main(String[] args){    
        try {
            
            ServerSocket server = new ServerSocket(1123);

            while(true){
                try {
                    Socket socket = server.accept();
                    ServerThreadUni thread = new ServerThreadUni(socket);
                    thread.start();
                  } catch (IOException ex) {     
                    System.out.println("Error" + ex.getMessage());
                  }
            }
            
        } catch (IOException ex) {
            System.out.println("Fetal error : " + ex.getMessage());
        }
    }
    
}
=======

package university.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerUniversity {
    
    public static void main(String[] args){    
        try {
            
            ServerSocket server = new ServerSocket(1123);

            while(true){
                try {
                    Socket socket = server.accept();
                    ServerThreadUni thread = new ServerThreadUni(socket);
                    thread.start();
                  } catch (IOException ex) {     
                    System.out.println("Error" + ex.getMessage());
                  }
            }
            
        } catch (IOException ex) {
            System.out.println("Fetal error : " + ex.getMessage());
        }
    }
    
}
>>>>>>> e84a96689b3394445d6131ab8fad0a08c82d18c4
