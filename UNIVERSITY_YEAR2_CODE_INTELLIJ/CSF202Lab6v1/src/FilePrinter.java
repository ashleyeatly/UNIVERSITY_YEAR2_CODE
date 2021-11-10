import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    File myFile;
    BufferedWriter myWriter;
    String fileName;

    private void closeFile() {
        try {
            myWriter.close();
        } catch  (Exception e) {
            System.out.println("Couldnt close");
        }
    }

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(String s) {
        createFile(fileName);
        writeToFile(s);
        // writeToFile("/n/r");
        closeFile();
    }

    private void createFile(String fileName) {
        try {
            myFile = new File(fileName);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter fw = new FileWriter(fileName,true);
            myWriter = new BufferedWriter(fw);



        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private void  writeToFile(String str) {
        try {
            myWriter.write(str);
            myWriter.newLine();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
