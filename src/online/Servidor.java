package online;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{
    ServerSocket servidorSocket;
    public void run() {

    }

    public void realizarJogada(int linha, int coluna) throws IOException {
        System.out.println("Aguardando conexão do cliente...");
        // Aguarda a conexão do cliente
        Socket clienteSocket = servidorSocket.accept();
        System.out.println("Conexão estabelecida com o cliente.");
        // Aqui você pode iniciar o jogo e gerenciar a comunicação com o cliente
        // Fecha os sockets
        clienteSocket.close();
    }



    public  void conectar() throws IOException {
            // Cria um servidor de socket na porta desejada
            int porta = 1234;
            servidorSocket = new ServerSocket(porta);

    }
}
