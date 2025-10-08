import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        
        String filePath = "C:\\Users\\hp\\OneDrive\\Desktop\\test.txt";
        // String textContent = "I like pizza!\nIt's really good!\nBuy me pizza!";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE!
                """;

        // try (FileWriter writer = new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\test.txt")) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");

        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch(IOException e) {
            System.out.println("Could not write file");
        }
    }
}
