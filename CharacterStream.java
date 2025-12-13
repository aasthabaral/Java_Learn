import java.io.FileWriter;
import java.io.IOException;
public class CharacterStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\baral\\Documents\\java_projects\\Output.txt"; 
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write("Hello World!\n");
            fw.write("This is a sample text written using character stream in Java.\n");
            fw.write("File writing is successful.\n");
            System.out.println("File written successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println("\nName: Prasikshya");
        System.out.println("Symbol: 28391/078");
    }
}


