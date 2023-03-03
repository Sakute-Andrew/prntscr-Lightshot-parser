import com.sakute.FolderCreate;
import com.sakute.ImageScraper;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    FolderCreate.createFolder();
    // Запитуємо в користувача, скільки йому потрібно фотографій
    // Asking user for amount of photos, he wants to obtain
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num = in.nextInt();
    ImageScraper run = new ImageScraper();
    // Виводимо фотографії / displaying photos
    for (int i = 1; i <= num; i++){
      run.scrap(i);
    }
  }
}