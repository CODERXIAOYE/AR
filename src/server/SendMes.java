package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class SendMes{ 

	public void send(String message, Socket socket) {
		System.out.println("send message:"+message);
		  PrintWriter printWriter=null;
		  OutputStream outputStream=null;
		 try {
			outputStream = socket.getOutputStream();// ��ȡһ��������������˷�����Ϣ
			  printWriter =new PrintWriter(outputStream);//���������װ�ɴ�ӡ��
			  printWriter.print(message);
			  printWriter.flush();
			  socket.shutdownOutput();//�ر������
			  //�ر����Ӧ����Դ
		} 
		 catch (Exception e) {
			 e.printStackTrace();
			}
		 finally{
			 try {
				 System.out.println("client end");
					Thread.currentThread().stop(); 
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 }
	}

}
