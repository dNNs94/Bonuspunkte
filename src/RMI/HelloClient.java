package RMI;

import java.rmi.*;

public class HelloClient {

	HelloInterface myClient;
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		try {
			//IP via ipconfig auflösen - localhost auf Client-Seite durch IP ersetzen
			HelloInterface obj = (HelloInterface) Naming.lookup("rmi://172.22.5.21:12345/Hello");
			System.out.println(obj.sayHello("Dennis"));

		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
	

