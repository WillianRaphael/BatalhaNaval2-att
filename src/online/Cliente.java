package online;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente extends Thread {


    public void realizarJogada(int linha, int coluna) throws IOException {
        // Conecta-se ao servidor usando o endereço IP e a porta correta
        String enderecoIP = "10.199.11.160";
        int porta = 1234;
        Socket clienteSocket = new Socket(enderecoIP, porta);
        System.out.println("Conexão estabelecida com o servidor.");

        // Fecha os sockets
        clienteSocket.close();
    }
    public void run() {
       /* try {
            // Conecta-se ao servidor usando o endereço IP e a porta correta
            String enderecoIP = "10.199.11.160";
            int porta = 1234;
            Socket clienteSocket = new Socket(enderecoIP, porta);

            System.out.println("Conexão estabelecida com o servidor.");



            // Fecha o socket
            clienteSocket.close();
        } catch (IOException e) {
            e.printStackTrace();*/
        }
    }

