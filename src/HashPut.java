import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Uses a while loop to fill HashMaps for each class, to avoid redundant code.
 */
class HashPut {

    static HashMap<String, Integer> hashStringer(String docname) throws FileNotFoundException {
        HashMap<String, Integer> hashy = new HashMap<>();
        final File file = new File(docname);
        final Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            hashy.put(scanner.nextLine(), scanner.nextInt());
        }
        return hashy;
    }
}
