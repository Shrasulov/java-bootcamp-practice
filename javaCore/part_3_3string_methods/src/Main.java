import java.util.Scanner;

public class Main {
    public static void main(String[] arges) {
        // Создай строку "Java is fun" и выведи:
        System.out.println("Создай строку \"Java is fun\" и выведи:");
        String str = "Java is fun";
        System.out.println("Длина строки = " + str.length());
        System.out.println("первый и последный символ: " + str.charAt(0) + " " + str.charAt(str.length() - 1));
        System.out.println("проверит вывести подстроку is");
        System.out.println(str.contains("is"));
        System.out.println(str.substring(5, 7));
        System.out.println(" 2. Сравни строки \"Hello\" и \"hello\" без учёта регистра;");
        String a = "Hello", b = "hello";
        System.out.println(a.equalsIgnoreCase(b));
        // 3. Замени в строке "I love Java" слово "Java" на "Python";
        System.out.println(" 3. Замени в строке \"I love Java\" слово \"Java\" на \"Python\";");
        String text = "I love Java";
        System.out.println(text.replace("Java", "Python"));
        // 4. Проверь, содержится ли "code" в строке "Learn to code in Java";
        System.out.println("4. Проверь, содержится ли \"code\" в строке \"Learn to code in Java\";");
        String word = "Learn to code in Java";
        System.out.println(word.contains("code"));

        // 5. Считай с клавиатуры строку и выведи её в верхнем регистре, в нижнем, и без пробелов в начале и конце.
        Scanner sc = new Scanner(System.in);
        String textpr = sc.nextLine();
        System.out.println("в верхнем регистре " + textpr.toUpperCase());
        System.out.println("в нижнем " + textpr.toLowerCase());
        System.out.println("без пробелов " + textpr.trim());
    
        // 💡 Бонус: попробуй написать программу, которая считает, сколько раз буква "a" встречается в строке — это отличная тренировка с for и charAt().
        System.out.println(" 6* количество символа в строке");
        String numA = "mdsakfkaasdkaddkadfkka";
        char target ='a';
        int count = 0;
        for (int i = 0; i < numA.length(); i++) {
            if (target == numA.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("кол. символа а = "+count);
    }
}
