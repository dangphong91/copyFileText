import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        FileWriter output = null;

        try {
            input = new FileReader("D:\\bai tap\\createFile.txt");
            output = new FileWriter("D:\\bai tap\\copyFile.txt");
            int c;
            int count = 0;
            while ((c = input.read()) != -1) {
                output.write(c);
                count++;
            }
            System.out.println("Success. Copy " + count + " char.");
        }
        finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
