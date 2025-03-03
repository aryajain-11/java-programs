import java.io.File;
public class FileA {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\jain2\\OneDrive\\Desktop\\javamahat\\Day25\\FileA.java");
        System.out.println("Can file read"+ f1.canWrite());
        System.out.println("is file exist"+f1.exists());
        System.out.println("File Name "+f1.getName());
        System.out.println("Length of file "+f1.length());
    }
    
}
