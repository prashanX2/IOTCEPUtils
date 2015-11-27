package com.iotceputils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class Main {
    static String clientSentence;
    static String capitalizedSentence;
    static ServerSocket serverSocket ;
    //System.out.println("Result Server started on main: " + serverSocket.getInetAddress() + "@" + serverSocket.getLocalPort());
    //final DatagramSocket serverSocket = new DatagramSocket(44444);

    static Socket connectionSocket;
    static BufferedReader inFromClient;
    static DataOutputStream outToClient;

    public static void writetoClient()
    {
        try {
            clientSentence = inFromClient.readLine();
            System.out.println("Received: " + clientSentence);
            capitalizedSentence = clientSentence.toUpperCase() + '\n';

            Scanner in = new Scanner(System.in);

            String a = in.nextLine();

            if (a.equals("y")) {
                outToClient.writeBytes(capitalizedSentence);
            }


            System.out.println("sent to");
        }catch(Exception e){System.out.println(e.toString());}

    }



    public static void main(String[] args) {

        try {

            String clientSentence;
            String capitalizedSentence;
            serverSocket = new ServerSocket(22222);
            System.out.println("Result Server started on main: " + serverSocket.getInetAddress() + "@" + serverSocket.getLocalPort());
            //final DatagramSocket serverSocket = new DatagramSocket(44444);



            while(true)
            {

                connectionSocket = serverSocket.accept();

                inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                outToClient = new DataOutputStream(connectionSocket.getOutputStream());


            }


        }catch(Exception ex)
        {
            System.out.println(ex.toString());

        }

        while(true)
        {
            writetoClient();
        }








/**
        try {

            String clientSentence;
            String capitalizedSentence;
            final ServerSocket serverSocket = new ServerSocket(55555);

            //final DatagramSocket serverSocket = new DatagramSocket(44444);

            System.out.println(System.nanoTime());



             byte[] receiveData = new byte[1024];
             byte[] sendData = new byte[1024];

            while(true)
            {
                System.out.println("Server startedd on main: " + serverSocket.getInetAddress() + "@" + serverSocket.getLocalPort());
                Socket connectionSocket = serverSocket.accept();

                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                //DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                System.out.println("Received: " + clientSentence);
                //capitalizedSentence = clientSentence.toUpperCase() + '\n';
                //outToClient.writeBytes(capitalizedSentence);


               // DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                //serverSocket.receive(receivePacket);
                //String sentence = new String( receivePacket.getData());
                //System.out.println("RECEIVED: " + sentence);

                //InetAddress IPAddress = receivePacket.getAddress();
                //int port = receivePacket.getPort();

                //long s = System.nanoTime();

               // String time =  String.valueOf(s);
                //sendData = time.getBytes();
               // DatagramPacket sendPacket =
                       // new DatagramPacket(sendData, sendData.length, IPAddress, port);
               // serverSocket.send(sendPacket);
                System.out.println("sent");
            }


        }catch(Exception ex)
        {
            System.out.println(ex.toString());

        }




            long h = System.nanoTime();



            long g = System.nanoTime();
            System.out.println(g-h);
*/
        }
    }

