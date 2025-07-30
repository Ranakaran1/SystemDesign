import Entities.Directory;
import Entities.File;
import Entities.Parent;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Directory directory1 = new Directory();
        Directory directory2 = new Directory();
        Parent file1 = new File();
        Parent file2 = new File();
        directory1.addP(file1);
        directory1.addP(file2);
        directory1.addP(directory2);
        directory2.addP(file2);

        // directory1.operation();

        directory2.operation();


    }
}
