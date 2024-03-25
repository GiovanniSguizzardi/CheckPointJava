/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.uam.checkpoint01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public void comunicarServidor() throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        int port = 5252;

        String id = "";
        Scanner entrada = new Scanner(System.in);

        while (!id.trim().equalsIgnoreCase("fim")) {
            System.out.print("[>>] Digite o ID do produto: ");
            id = entrada.nextLine();
            byte saida[];
            saida = id.getBytes();
            
            DatagramPacket datagram = new DatagramPacket(saida, saida.length, address, port);

            // Método connect()
            socket.connect(address, port);

            // Método send()
            socket.send(datagram);
            System.out.println("[>>] Pacote enviado...");
        }
    }

    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.comunicarServidor();
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
}
