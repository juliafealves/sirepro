package utils;

import java.io.*;

public class GerenciaArquivo {

    public static void salva(String saida, String arquivo) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter buffer = null;
        PrintWriter writer = null;

        try{
            fileWriter = new FileWriter(new File(arquivo));
            buffer = new BufferedWriter(fileWriter);
            writer = new PrintWriter(buffer);
            writer.println(saida);
        } finally {
            if(writer != null)
                writer.close();
        }
    }

    public static String leitura(String arquivo) throws IOException{
        FileReader fileReader = null;
        BufferedReader buffer = null;
        StringBuilder resultado = new StringBuilder();

        try{
            fileReader = new FileReader(arquivo);
            buffer = new BufferedReader(fileReader);
            String linha;

            while((linha = buffer.readLine()) != null)
                resultado.append(linha).append(System.lineSeparator());

            return String.valueOf(resultado);
        } finally {
            if(buffer != null)
                buffer.close();
        }
    }

    public static void salvaObjeto(Object objeto, String arquivo) throws IOException{
        ObjectOutputStream objectOutputStream = null;

        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(arquivo));
            objectOutputStream.writeObject(objeto);
        } finally {
            if(objectOutputStream != null)
                objectOutputStream.close();
        }
    }

    public static Object leObjeto(String arquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = null;

        try{
            objectInputStream = new ObjectInputStream(new FileInputStream(arquivo));
            return objectInputStream.readObject();
        } finally {
            if(objectInputStream != null)
                objectInputStream.close();
        }
    }
}
