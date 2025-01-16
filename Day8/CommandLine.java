
public class CommandLine  {
        public static void main(String[] args) {
            // Check if the correct number of arguments is provided
            if (args.length != 3) {
                return;
            }
    
            // Get command-line arguments
            String name = args[0];
            String age = args[1];
            String city = args[2];
    
            // Display the information
            System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
        }
    }
    

