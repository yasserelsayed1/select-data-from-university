<<<<<<< HEAD

package university.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientUniversity {
    
    public static void main(String[] args) throws IOException{
        int num;
        String student_id;
        String stu_name;
        String stu_date;
        String stu_email;
        String stu_major;
        
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1",1123);
        
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                
        System.out.println("Enter any Id num :");
        num = sc.nextInt();
        dos.writeInt(num);
        
        if(num<=6 && num>0){
            student_id = dis.readUTF();
            stu_name   = dis.readUTF();
            stu_date   = dis.readUTF();
            stu_email   = dis.readUTF();
            stu_major   = dis.readUTF();

            System.out.println("student id : " + student_id);
            System.out.println("student name : " + stu_name);
            System.out.println("student date : " + stu_date);
            System.out.println("student email : " + stu_email);
            System.out.println("student major : " + stu_major);
        } else {
            System.out.println("please enter numbers from 1 to 6 ");
        }
        
 
    }
}

=======

package university.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientUniversity {
    
    public static void main(String[] args) throws IOException{
        int num;
        String student_id;
        String stu_name;
        String stu_date;
        String stu_email;
        String stu_major;
        
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1",1123);
        
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                
        System.out.println("Enter any Id num :");
        num = sc.nextInt();
        dos.writeInt(num);
        
        if(num<=6 && num>0){
            student_id = dis.readUTF();
            stu_name   = dis.readUTF();
            stu_date   = dis.readUTF();
            stu_email   = dis.readUTF();
            stu_major   = dis.readUTF();

            System.out.println("student id : " + student_id);
            System.out.println("student name : " + stu_name);
            System.out.println("student date : " + stu_date);
            System.out.println("student email : " + stu_email);
            System.out.println("student major : " + stu_major);
        } else {
            System.out.println("please enter numbers from 1 to 6 ");
        }
        
 
    }
}

>>>>>>> e84a96689b3394445d6131ab8fad0a08c82d18c4
