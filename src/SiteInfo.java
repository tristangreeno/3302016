import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 * Uses HashMap to store data on websites.
 * Stores the following: month and day the website was made.
 * Month and day the website was first visited by the user.
 * Month and day the website was last visited by the user.
 * Frequency of visits by user to the website, from first day to last day visited.
 */
public class SiteInfo {

    public void hashMapper() {
        HashMap<String, Integer> nameSiteMonth = new HashMap<>();
        try {
            nameSiteMonth = HashPut.hashStringer("/Users/tristangreeno/WorkSpace/txtFiles/sites.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error: File not found");
        }
    }

    public static HashMap<String, Integer> getSiteDate{
        return
    }
}
