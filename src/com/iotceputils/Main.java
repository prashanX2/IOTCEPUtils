package com.iotceputils;

import java.net.DatagramSocket;

public class Main {

    public static void main(String[] args) {


        try {
            final DatagramSocket serverSocket = new DatagramSocket(44444);

            System.out.println("Server started on main: " + serverSocket.getLocalAddress() + "@" + serverSocket.getLocalPort());

            final byte[] receiveData = new byte[1024];
            final byte[] sendData = new byte[1024];


        }catch(Exception ex)
        {


        }




            long h = System.nanoTime();



            long g = System.nanoTime();
            System.out.println(g-h);

        }
    }

