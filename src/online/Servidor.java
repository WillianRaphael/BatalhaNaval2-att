package online;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        try {
            // Cria um servidor de socket na porta desejada
            int porta = 1234;
            ServerSocket servidorSocket = new ServerSocket(porta);

            System.out.println("Aguardando conexão do cliente...");

            // Aguarda a conexão do cliente
            Socket clienteSocket = servidorSocket.accept();

            System.out.println("Conexão estabelecida com o cliente.");

            // Aqui você pode iniciar o jogo e gerenciar a comunicação com o cliente

            // Fecha os sockets
            clienteSocket.close();
            servidorSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
