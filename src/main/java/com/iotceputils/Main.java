package com.iotceputils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class Main {
/*

    public static ServerSocket serverSocket;
    public static Socket connectionSocket;
    public static BufferedReader inFromClient;
    public static DataOutputStream outToClient;
    public static String clientaddress;

    public static  void start()
    {
        try {


            serverSocket = new ServerSocket(22222);
            System.out.println("Result Server started on main: " + serverSocket.getInetAddress() + "@" + serverSocket.getLocalPort());



            while(true)
            {

                connectionSocket = serverSocket.accept();


                clientaddress = connectionSocket.getInetAddress().toString();

                clientaddress = clientaddress.replace("/", "");


                System.out.println("accepted client : "+clientaddress);


                inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                outToClient = new DataOutputStream(connectionSocket.getOutputStream());

                System.out.println(inFromClient.readLine());

               break;

            }


        }catch(Exception ex)
        {
            System.out.println(ex.toString());

        }

    }


    public static  void send(String toSend)
    {
        try
        {
            DataOutputStream xoutToClient = new DataOutputStream(connectionSocket.getOutputStream());
            //outToServer = new DataOutputStream(gatewayclientSocket.getOutputStream());
            //outToServer.writeBytes(toSend);
            xoutToClient.writeBytes(toSend + "\n");
            xoutToClient.flush();
           //xoutToClient.close();

            //Socket clientSocket = new Socket(clientaddress, 22221);

            //DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            //BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //String sentence = toSend;
            //outToServer.writeBytes(toSend);

            //modifiedSentence = inFromServer.readLine();
            System.out.println("Sent top server " + toSend);
            //clientSocket.close();
        }catch(Exception e){System.out.println(e.toString());}


    }




    public  void writetoClient()
    {
        try {

            //clientSentence = inFromClient.readLine();
            //System.out.println("Received: " + clientSentence);
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';

            Scanner in = new Scanner(System.in);

            System.out.println("type: ");
            String a = in.nextLine();

            if (a.equals("y")) {
                outToClient.writeBytes("from server");
            }


            System.out.println("sent to : "+clientaddress);

        }catch(Exception e){System.out.println(e.toString());}

    }

*/

    public static void main(String[] args) {

        /**
       Main.start();

        Scanner ni = new Scanner(System.in);
        while(true) {
            System.out.println("input: ");
            String input = ni.nextLine();
            Main.send(input);

        }

*/





        try {

            String clientSentence;
            String capitalizedSentence;
            final ServerSocket serverSocket = new ServerSocket(44444);

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

        }
    }

