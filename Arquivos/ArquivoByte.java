// Copia de arquivo: byte por byte
import java.io.*;
public class ArquivoByte {
    
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\Brenda\\Desktop\\arquivo.txt");
        File outputFile = new File("C:\\Users\\Brenda\\Desktop\\copiaarquivo.txt");
        FileInputStream entrada = new FileInputStream(inputFile);
        FileOutputStream saida = new FileOutputStream(outputFile);
        int c;
        while ((c = entrada.read()) != -1) {
            saida.write(c);
            System.out.println(c);
        }
        entrada.close();
        saida.close();
    }
}
