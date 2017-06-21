package RMI;

import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HelloImpl() throws RemoteException {
		// TODO Automatisch generierter Konstruktorstub
	}
	public String sayHello(String t) throws RemoteException{
		System.out.println("Hallo <" + t + ">");
		return t;
		}
	}

