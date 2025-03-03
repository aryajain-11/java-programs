import java.io.File;
public class FileCexits {
   public FileCexits() {
   }

   public static void main(String[] var0) {
      File var1 = new File("C:\\Users\\jain2\\OneDrive\\Desktop\\javamahat\\Day25\\FileC.java");
      if (var1.exists()) {
         System.out.println("File exists");
         System.out.println("File name: " + var1.getName());
         System.out.println("path: " + var1.getAbsolutePath());
         System.out.println("file Can Write " + var1.canWrite());
         System.out.println("file Can Read " + var1.canRead());
         System.out.println("size : " + var1.length());
      } else {
         System.out.println("File not exist");
      }

   }
}


