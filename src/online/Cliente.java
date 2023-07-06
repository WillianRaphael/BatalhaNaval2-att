package online;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    private Socket socket;
    private DataOutputStream outputStream;

    public void conectar() throws IOException {
        // Estabelece a conexão com o servidor
        socket = new Socket("192.168.15.170", 1234);

        // Cria o stream de saída para enviar dados ao servidor
        outputStream = new DataOutputStream(socket.getOutputStream());
    }

    public void enviarJogada(int linha, int coluna) {
        try {
            // Envia as coordenadas da jogada ao servidor
            outputStream.writeInt(linha);
            outputStream.writeInt(coluna);
        } catch (IOException e) {
            System.out.println("Erro ao enviar jogada para o servidor: " + e.getMessage());
        }
    }

    // Outros métodos da classe online.Cliente
}

