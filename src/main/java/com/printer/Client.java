package com.printer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import com.google.gson.Gson;

public class Client {
    private static Gson gson = new Gson();

    public static void main(String args[]) throws NotBoundException, MalformedURLException, RemoteException {
        IPrinterServant printer = (IPrinterServant) Naming.lookup("rmi://localhost:5099/printer");

        

        Cookie cookie = gson.fromJson(printer.start("hello","user1"), Cookie.class);
        System.out.println(printer.echo("Hello", gson.toJson(cookie)) + printer.getClass().getName());
        System.out.println(cookie.getId()+" "+cookie.getTimestamp());

        // boolean result = 
    }
}
