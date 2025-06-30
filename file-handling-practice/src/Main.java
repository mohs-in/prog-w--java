import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of file: ");
        String fileName = keyboard.nextLine();

        File myFile = new File(fileName + ".txt");

        try {
            boolean isFileCreated = myFile.createNewFile();
            if(isFileCreated) {
                System.out.println("File \\" + fileName + ".txt\\" + " created successfully!");
            }
        } catch(IOException ioException) {
            System.out.println("IO Exception occurred.");
            System.err.println(ioException.getMessage());
        }

        System.out.println("Enter something to write to file: ");
        String data = keyboard.next();
        keyboard.close();

        try(FileOutputStream outputStream = new FileOutputStream(myFile)) {
            byte[] content = data.getBytes();
            outputStream.write(content);
            System.out.println("Data written successfully!!")
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        } catch(IOException ioException) {
            System.out.println("IO Exception Occurred!");
            System.err.println(ioException.getMessage());
        }
    }
}