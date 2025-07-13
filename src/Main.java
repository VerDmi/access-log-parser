import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.print("Укажите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean noExists = !file.exists();
            if (noExists) {
                System.out.println("Указанный файл не существует");
                continue;
            }

            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке, а не к файлу");
                continue;
            }
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count);
            count++;
        }
    }
}