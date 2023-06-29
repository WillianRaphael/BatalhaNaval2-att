package online;

import java.io.IOException;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        try {
            // Conecta-se ao servidor usando o endereço IP e a porta correta
            String enderecoIP = "127.0.0.1";
            int porta = 1234;
            Socket clienteSocket = new Socket(enderecoIP, porta);

            System.out.println("Conexão estabelecida com o servidor.");

            // Aqui você pode enviar e receber mensagens do servidor, participando do jogo

            // Fecha o socket
            clienteSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
