package RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer {

	public static void main(String[] args /* args[0]: port */) throws RemoteException{
		 
    try {
		
		LocateRegistry.createRegistry(12345);
	    
		HelloImpl hello = new HelloImpl();
	    //UnicastRemoteObject.exportObject( adder, 0 ); wird nur benötigt, wenn die Serverimplementierung nicht schon bereits Unicast erweitert. 
	    
	    RemoteServer.setLog( System.out );
	    Naming.rebind("rmi://localhost:12345/Hello", hello);
	    System.out.println( "Hello angemeldet" );
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
	
}
