import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String args[]) {
        String file;
        Scanner s = new Scanner(System.in);
        System.out.print("File: ");
        file = s.nextLine();
        File f = new File(file);

        System.out.println("Name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists?: " + f.exists());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writeable: " + f.canWrite());
        System.out.println("Directory?: " + f.isDirectory());
        System.out.println("File?: " + f.isFile());
        System.out.println("Modified at: " + f.lastModified());
        System.out.println("Length: " + f.length());
    }
}
