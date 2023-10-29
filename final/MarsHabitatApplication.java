/**
 * TODO: Write a comment describing your class here.
 * @author TODO: Fill in your name, university email, and student number here.
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// import Entity.UnknownEntityException;
// import entities.Entity;

/**
 * This class is the entry point of your code. This class controls the flow of control for Mission Mars
 */
public class MarsHabitatApplication{
    public void display(){
        displayMessage();
    }
    public static void main(String[] args) {
        ArrayList<String> mapData = new ArrayList<String>();
        mapData.add(".");
        mapData.add("#");
        mapData.add("Z");
        mapData.add("X");
        mapData.add("H");
        mapData.add("J");
        mapData.add("P");
        mapData.add("T");
        mapData.add("O");
        mapData.add("R");
        mapData.add("L");
        mapData.add("A");
        mapData.add("B");
        mapData.add("E");
        mapData.add("C");
        mapData.add("G");
        mapData.add("S");
        mapData.add("D");
        mapData.add("@");
        mapData.add("*");

        MarsHabitatApplication habitat = new MarsHabitatApplication();
        MarsHabitatApplication.MartianMap martianMap = habitat.new MartianMap();
        //TODO: implement your code here
        // if (args.length == 2 && "--f".equals(args[0])) {
        //     try {
        //         martianMap.loadFromFile(args[1]);
        //         }catch (FileNotFoundException e) {
        //         System.out.println("File Not Found, aborting mission.");
        //         return; // 終止程式
        //     } catch (InvalidFileException e) {
        //         System.out.println("Invalid file content, Aborting mission.");
        //         return; // 終止程式
        //     }catch (UnknownEntityException e){
        //         System.out.println("An unknown item found in Martian land. Aborting mission.");
        //         return;
        //     }
        // } else {
        //     System.out.println("Usage: java MarsHabitatApplication --f [path_to_file]");
        // }
        habitat.display();
        if (args.length == 2 && "--f".equals(args[0])) {
            try {
            String content = new String(Files.readAllBytes(Paths.get(args[1])));
            System.out.println(content);
            for (char entitie: content.toCharArray()){
                if (mapData.contains(entitie)){
                    System.out.println("true");
            }else{
                throw new UnknownEntityException("An unknown item found in Martian land. Aborting mission.");
                }
            }
        }catch (IOException e) {
            System.out.println("File Not Found, aborting mission.");
                return; // 終止程式
            } catch (UnknownEntityException e) {
                System.out.println("An unknown item found in Martian land. Aborting mission.");
                return;
            }catch (InvalidFileException e) {
                System.out.println("Invalid file content, Aborting mission.");
                return; // 終止程式
            }
        }
        
        }
    
    
    /**
    * This method prints the starting welcome message. Do not change this code
    */
    private void displayMessage() {
        System.out.println("         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (_COMP90041\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`");
        System.out.println(
                " /$$      /$$ /$$                    /$$                           /$$      /$$                              \n" +
                "| $$$    /$$$|__/                   |__/                          | $$$    /$$$                              \n" +
                "| $$$$  /$$$$ /$$  /$$$$$$$ /$$$$$$$ /$$  /$$$$$$  /$$$$$$$       | $$$$  /$$$$  /$$$$$$   /$$$$$$   /$$$$$$$\n" +
                "| $$ $$/$$ $$| $$ /$$_____//$$_____/| $$ /$$__  $$| $$__  $$      | $$ $$/$$ $$ |____  $$ /$$__  $$ /$$_____/\n" +
                "| $$  $$$| $$| $$|  $$$$$$|  $$$$$$ | $$| $$  \\ $$| $$  \\ $$      | $$  $$$| $$  /$$$$$$$| $$  \\__/|  $$$$$$ \n" +
                "| $$\\  $ | $$| $$ \\____  $$\\____  $$| $$| $$  | $$| $$  | $$      | $$\\  $ | $$ /$$__  $$| $$       \\____  $$\n" +
                "| $$ \\/  | $$| $$ /$$$$$$$//$$$$$$$/| $$|  $$$$$$/| $$  | $$      | $$ \\/  | $$|  $$$$$$$| $$       /$$$$$$$/\n" +
                "|__/     |__/|__/|_______/|_______/ |__/ \\______/ |__/  |__/      |__/     |__/ \\_______/|__/      |_______/ ");

        System.out.println();
        }


    class MartianMap{
        private String mapData;
        public void loadFromFile(String filePath)throws FileNotFoundException, InvalidFileException, UnknownEntityException {           
            StringBuilder data = new StringBuilder();
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
            }
            scanner.close();

            mapData = data.toString();
        }
    }

    public class MainMenu{
        public void display(){
            System.out.println("Please enter");
            System.out.println("[1] to move Space Robot");
            System.out.println("[2] to move Space Rover");
            System.out.println("[3] to move Martian animals");
            System.out.println("[4] to print the current habitability stats");
            System.out.println("[4] to print the current habitability stats");
            System.out.println("[5] to print the old habitability stats");
            System.out.println("[6] to exit");
            System.out.println(">");
        }

        while(true){
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
            case 1:
                System.out.println("There are 2 Space Robot found. Select ");
                break;
            case 2:
                System.out.println("Space Rover");
                break;
            case 3:
                System.out.println("Martian animals");
                break;
            case 4:
                System.out.println("current habitability stats");
                break;
            case 5:
                System.out.println("old habitability stats");
                break;
            case 6:
                System.out.println("exit");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        }
        
    }
    class InvalidFileException extends Exception {
        public InvalidFileException(String message) {
            super(message);
        }
    }
    
    class UnknownEntityException extends Exception {
        public UnknownEntityException(String message) {
            super(message);
        }
    }
}
