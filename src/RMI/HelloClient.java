package RMI;

import java.rmi.*;

public class HelloClient {

	HelloInterface myClient;
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		try {
			//IP via ipconfig aufl�sen - localhost auf Client-Seite durch IP ersetzen
			HelloInterface obj = (HelloInterface) Naming.lookup("rmi://"+HelloImpl.getClientHost()+"/Hello");
			System.out.println(obj.sayHello("Dennis"));

		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
	

