import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Path repairsFile = Paths.get("repairs.csv");
            if (Files.exists(repairsFile)) {
                Scanner s = new Scanner(repairsFile);
                while (s.hasNextLine()) {
                    String next = s.nextLine();
                    System.out.println(next);
                }
            } else {
                System.out.println("This file does not exist.");
            }
        } catch (Exception e) {
            System.out.println("Uh oh! Something has gone wrong :(");
        }
    }
}

