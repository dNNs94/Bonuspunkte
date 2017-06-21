package RMI;

import java.rmi.*;

public interface HelloInterface extends Remote {
	public String sayHello(String t) throws RemoteException;
}
