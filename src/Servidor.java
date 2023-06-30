import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Servidor {
    private ServerSocket servidorSocket;

    public void conectar() throws IOException {
        int porta = 1234;
        servidorSocket = new ServerSocket(porta);

        while (true) {
            System.out.println("Aguardando conexão do cliente...");
            Socket clienteSocket = servidorSocket.accept();
            System.out.println("Conexão estabelecida com o cliente.");

            Thread clienteThread = new Thread(new ClienteHandler(clienteSocket));
            clienteThread.start();
        }
    }

    public void realizarJogada(int linha, int coluna) throws IOException {

    }

    private static class ClienteHandler implements Runnable {
        private final Socket clienteSocket;

        public ClienteHandler(Socket clienteSocket) {
            this.clienteSocket = clienteSocket;
        }

        @Override
        public void run() {
            try {
                DataInputStream inputStream = new DataInputStream(clienteSocket.getInputStream());
                int linha = inputStream.readInt();
                int coluna = inputStream.readInt();



                inputStream.close();
                clienteSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
