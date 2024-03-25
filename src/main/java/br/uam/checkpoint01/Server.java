/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uam.checkpoint01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public void rodarServidor() throws Exception {
        System.out.println("Servidor iniciado!");
        DatagramSocket socket = new DatagramSocket(5252);

        String mensagem = "";

        while(!mensagem.trim().equalsIgnoreCase("fim")) {
            byte[] buffer = new byte[200];

            DatagramPacket datagram = new DatagramPacket(buffer, 200);
            socket.receive(datagram);

            mensagem = new String(datagram.getData());

            System.out.println("Endereço: " + datagram.getSocketAddress());
            System.out.println("Mensagem: " + mensagem);
        }
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
            server.rodarServidor();
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
}
