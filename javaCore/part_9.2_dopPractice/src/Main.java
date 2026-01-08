import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Подсчёт слов
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                System.out.println(line);
                count += words.length;
            }
            System.out.println(count);
            
        } catch (IOException e) {
            System.out.println(e);
        }



        //Копирование файла
        try (
                BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))            
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        //🧩 Мини-проект (подготовка к пункту 9)
        try (
                BufferedReader rd = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter wr = new BufferedWriter(new FileWriter("result.txt"))
        ) {
            String line;
            int countstr = 0;
            int countword = 0;
            while ((line = rd.readLine()) != null) {
                String[] words = line.split("\\s+");
                countstr++;
                countword += words.length;
                wr.write("Lines: " + countstr);
                wr.newLine();
                wr.write("Words: " + countword);

            }
            System.out.println("количество строк: "+countstr+"\nколичество слов: "+countword);
        } catch (Exception e) {
            System.out.println("Eror: "+ e.getMessage());
        }
    }
}