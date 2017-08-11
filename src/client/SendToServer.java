package client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SendToServer {

	public static String send(String message)
	{

		Socket socket=null;
		   //����һ�������  
		DataOutputStream output = null;  
			 //����һ��������  
		DataInputStream input = null; 
		String info="";
		try {
			socket=new Socket("10.63.216.209",1233);
			OutputStream outputStream=socket.getOutputStream();
			PrintWriter printWriter=new PrintWriter(outputStream);
			 printWriter.print(message);
			 printWriter.flush();
			socket.shutdownOutput();
			InputStream inputStream=socket.getInputStream();
			InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
			String temp=null;//��ʱ����
			while((temp=bufferedReader.readLine())!=null){
				info+=temp;
			}
			bufferedReader.close();
			inputStream.close();
			printWriter.close();
			outputStream.close();
//	        socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return info;
		
	}
}
