import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
	
	public static void main(String[] args) throws Throwable
	{
		Scanner oj=new Scanner(System.in);
	     Socket s=new Socket("localhost",12345);
	     String a="";
	     while(!(a.equals("over")))
	     {
	     OutputStreamWriter k=new OutputStreamWriter(s.getOutputStream());
	     PrintWriter obj=new PrintWriter(k);
	     a=oj.nextLine();
	     k.write(a+"\n");
	     k.flush();
	     
	     BufferedReader x=new BufferedReader(new InputStreamReader(s.getInputStream()));
	     String clientmsg=x.readLine();
	     System.out.println(clientmsg);
	     }
	    
	}

}
