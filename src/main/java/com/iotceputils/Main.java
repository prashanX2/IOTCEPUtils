package com.iotceputils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {


        try {
            final DatagramSocket serverSocket = new DatagramSocket(44444);

            System.out.println(System.nanoTime());

            System.out.println("Server startedd on main: " + serverSocket.getLocalAddress() + "@" + serverSocket.getLocalPort());

             byte[] receiveData = new byte[20048];
             byte[] sendData = new byte[1024];

            while(true)
            {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence = new String( receivePacket.getData());
                //System.out.println("RECEIVED: " + sentence);

                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                long s = System.nanoTime();

                String time =  String.valueOf(s);
                sendData = time.getBytes();
                DatagramPacket sendPacket =
                        new DatagramPacket(sendData, sendData.length, IPAddress, port);
                serverSocket.send(sendPacket);
                System.out.println("sent");
            }


        }catch(Exception ex)
        {


        }




            long h = System.nanoTime();



            long g = System.nanoTime();
            System.out.println(g-h);

        }
    }

