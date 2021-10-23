package com.printer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPrinterServant extends Remote {

    public String echo(String s) throws RemoteException;

    public void print(String filename, String parameter) throws RemoteException;

    public void queue(String printer)throws RemoteException;

    public void topQueue(String printer, int job)throws RemoteException;

    public String start(String password, String username)throws RemoteException;

    public void stop()throws RemoteException;

    public void restart()throws RemoteException;

    public void status(String printer)throws RemoteException;

    public void readConfig(String parameter)throws RemoteException;

    public void setConfig(String parameter, String value)throws RemoteException;
}