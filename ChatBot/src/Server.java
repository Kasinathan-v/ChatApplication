import java.util.*;
import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args) throws Exception {
	       Scanner oj=new Scanner(System.in);
	        ServerSocket a=new ServerSocket(12345); 
	       System.out.println("server is waiting for client request");
	       Socket p=a.accept();
	       System.out.println("connected");
	      String w="";
	       while(!(w.equals("over")))        
	       {
	       BufferedReader obj=new BufferedReader(new InputStreamReader(p.getInputStream()));
	       String sollu=obj.readLine();
	       System.out.println(sollu);
	       
	        
	           
	       OutputStreamWriter k=new OutputStreamWriter(p.getOutputStream());
	     PrintWriter ob=new PrintWriter(k);
	     w=oj.nextLine();
	     k.write(w+"\n");
	     k.flush();
	       }
	     //System.out.println("data is sent to clent");
	        // TODO code application logic here
	    }

}
