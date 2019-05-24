<<<<<<< HEAD

package university.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerThreadUni extends Thread{
    
    private static final String USERNAME = "root";
    private static final String password = "";
    private static final String Conn = "jdbc:mysql://localhost:3306/university_db?zeroDateTimeBehavior=convertToNull";
    
    Socket socket;
    
    public ServerThreadUni(Socket socket){
        this.socket = socket;
    }
    
    @Override
    public void run(){
        Connection conn = null; 
       
        String student_id;
        String stu_name;
        String stu_date;
        String stu_email;
        String stu_major;
          
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        
            conn = DriverManager.getConnection(Conn, USERNAME , password );
            
            //create statement
            Statement myStat = conn.createStatement();
          
            //Execute sql query
            int num = dis.readInt();
            ResultSet myRs = myStat.executeQuery("select * from student_info where `stu_id` = " + num);
          
           //result set
            while(myRs.next())
            {
                student_id = myRs.getString("stu_id");
                stu_name   = myRs.getString("stu_name");
                stu_date   = myRs.getString("stu_date");
                stu_email  = myRs.getString("stu_email");
                stu_major  = myRs.getString("stu_major");
                
                dos.writeUTF(student_id);
                dos.writeUTF(stu_name);
                dos.writeUTF(stu_date);
                dos.writeUTF(stu_email);
                dos.writeUTF(stu_major);

                
                System.out.println("student id : " + student_id);
                System.out.println("student name : " + stu_name);
                System.out.println("student date : " + stu_date);
                System.out.println("student email : " + stu_email);
                System.out.println("student major : " + stu_major);
        
            }   
        
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServerThreadUni.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
=======

package university.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerThreadUni extends Thread{
    
    private static final String USERNAME = "root";
    private static final String password = "";
    private static final String Conn = "jdbc:mysql://localhost:3306/university_db?zeroDateTimeBehavior=convertToNull";
    
    Socket socket;
    
    public ServerThreadUni(Socket socket){
        this.socket = socket;
    }
    
    @Override
    public void run(){
        Connection conn = null; 
       
        String student_id;
        String stu_name;
        String stu_date;
        String stu_email;
        String stu_major;
          
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        
            conn = DriverManager.getConnection(Conn, USERNAME , password );
            
            //create statement
            Statement myStat = conn.createStatement();
          
            //Execute sql query
            int num = dis.readInt();
            ResultSet myRs = myStat.executeQuery("select * from student_info where `stu_id` = " + num);
          
           //result set
            while(myRs.next())
            {
                student_id = myRs.getString("stu_id");
                stu_name   = myRs.getString("stu_name");
                stu_date   = myRs.getString("stu_date");
                stu_email  = myRs.getString("stu_email");
                stu_major  = myRs.getString("stu_major");
                
                dos.writeUTF(student_id);
                dos.writeUTF(stu_name);
                dos.writeUTF(stu_date);
                dos.writeUTF(stu_email);
                dos.writeUTF(stu_major);

                
                System.out.println("student id : " + student_id);
                System.out.println("student name : " + stu_name);
                System.out.println("student date : " + stu_date);
                System.out.println("student email : " + stu_email);
                System.out.println("student major : " + stu_major);
        
            }   
        
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServerThreadUni.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
>>>>>>> e84a96689b3394445d6131ab8fad0a08c82d18c4
}