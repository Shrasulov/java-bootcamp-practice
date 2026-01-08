import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    String sourse,destination;

    public static void main(String[] args) {
        // задача 1.  копирование любогофайла(фотографии)
        try (
                BufferedInputStream in = new BufferedInputStream(
                        new FileInputStream("C:\\Users\\shras\\Pictures\\Screenshots\\Снимок экрана (7).png"));
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream("C:\\Users\\shras\\java-bootcamp-practice\\javaCore\\images/img1.png"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        }

        //2 задача копирование с поможю метода
        // копирование текста
        copyFile("data.txt", "copy.txt");
        // копирование фотографии
        copyFile("javaCore\\images\\img1.png", "javaCore\\images\\copyimg.png");
    }
    
    // универсальный метод
    static void copyFile(String source, String destination) {
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int baytesRead;
            
            while ((baytesRead=in.read(buffer))!=-1) {
                out.write(buffer,0,baytesRead);
            }
        } catch (Exception e) {
            System.out.println("Eror: "+e);
        }
    }
}