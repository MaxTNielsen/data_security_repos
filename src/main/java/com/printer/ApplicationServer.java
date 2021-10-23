package com.printer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer {
    public static void main(String args[]) throws RemoteException {
        IDB db = new DB();
        Registry registry = LocateRegistry.createRegistry(5099);
        registry.rebind("printer", new PrinterServant(db));
    }
}