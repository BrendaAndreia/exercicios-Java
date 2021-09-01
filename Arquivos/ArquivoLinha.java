// Copia de arquivo: linha por linha

import java.io.*;

public class ArquivoLinha {
    public static void main(String[] args) throws IOException {
        FileReader inputFile = new FileReader("C:\\Users\\Brenda\\Desktop\\arquivo.txt");
        FileWriter outputFile = new FileWriter("C:\\Users\\Brenda\\Desktop\\copiaarquivo.txt");
        BufferedReader entrada = new BufferedReader(inputFile);
        PrintWriter saida = new PrintWriter(outputFile);
        String linha;
        while ((linha = entrada.readLine()) != null) {
            System.out.println(linha);
            saida.println(linha);
            saida.flush();
        }
    entrada.close();
    saida.close();
    }
}
