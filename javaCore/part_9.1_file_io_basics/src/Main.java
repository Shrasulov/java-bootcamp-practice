import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Java");
            bw.newLine();
            bw.write("is");
            bw.newLine();
            bw.write("awesome");
            bw.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }
}