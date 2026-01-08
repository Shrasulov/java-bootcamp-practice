import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Прочитать файл целиком построчно
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения файла: "+e);
        }


        // Записать несколько строк в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("первая строка");
            writer.newLine();
            writer.write("вторая строка");
        } catch (IOException e) {
            System.out.println("ошибка записи " + e);
        }

        //Прочитать → обработать → записать
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }   
    }
}