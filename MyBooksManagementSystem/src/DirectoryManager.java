import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryManager {

    public static void listFilesAndDirectories(String directoryPath) {
        File file = new File(directoryPath);

        File [] files = file.listFiles();

        if (files == null || files.length == 0) {
            // If it is empty or null, print an appropriate message indicating the same
            System.out.println("Current Directory is empty or does not exist");
        }
        else {
            // If not, loop through the array and print each file's name
            System.out.println("List of books available in " + file.getName());
            for(int i = 0; i < files.length; i++) {
                System.out.println("Title: " + files[i]);
            }
        }
    }

    public static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            // If the directory does not exist, create the directory using the mkdirs() method from the File class
            directory.mkdirs();
            // Print a message indicating that the directory was created
            System.out.println("Directory created at " + directoryPath);
        }
        else {
            // If the directory already exists, print a message indicating the same
            System.out.println("Directory already exists!");
        }
    }

    public static void renameDirectory(String currentDirectory, String newDirectory) {
        File oldDir = new File(currentDirectory);
        File newDir = new File(newDirectory);

        if (newDir.exists()) {
            System.out.println("Directory " + newDir.getName() + " already exists!");
        }

        if (!oldDir.renameTo(newDir)) {
            // If the rename fails, print an error message
            System.out.println("Unable to rename " + oldDir.getName() + " to " + newDir.getName());
        }
        else {
            // If the rename is successful, print a success message
            System.out.println("Successfully renamed " + oldDir.getName() + " to " + newDir.getName());
        }
    }

    public static void copyFiles(String sourceDir, String destDir) {
        Path sourcePath = Paths.get(sourceDir);
        Path destPath = Paths.get(destDir);

        try {
            if (!Files.exists(destPath)) {
                // If the destination directory does not exist, create the directory using the createDirectories() method from the Files class
                Files.createDirectories(destPath);
            }

            File sourceDirectory = new File(sourceDir);
            File[] files = sourceDirectory.listFiles();
            // For each file, create a Path object using the file's name and the destDir
            for (File file : files) {
                Path pathObj = Paths.get(destDir, file.getName());
                // Use the copy() method from the Files class to copy the file to the destination directory
                Files.copy(file.toPath(), pathObj, StandardCopyOption.REPLACE_EXISTING);
                // Print a message indicating that the file was copied
                System.out.println("Copy Successful!");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            // If the file is deleted successfully, print a message indicating the same
            System.out.println(fileName + " has been deleted.");
        } else {
            // If the file deletion fails, print an error message
            System.out.println("Failed to delete " + fileName);
        }
    }

}

