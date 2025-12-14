import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] arges) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(10);
        info(num);
        print(num);
        num.add(1, 15);
        print(num);
        num.remove(0);
        print(num);
    }
    
    public static void info(List<Integer> num) {
        System.out.println(num.size());
    }

    public static void print(List<Integer> num) {
        System.out.println("\nOutput");
        for (int n : num) {
            System.out.println(n);
        }
    }
}