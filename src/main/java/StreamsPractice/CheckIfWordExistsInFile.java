package StreamsPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class CheckIfWordExistsInFile {
    public static void main(String[] args) {

        try {
            Stream<String> readFile = Files
                    .lines(Path.of("starwars.txt"))
                    .flatMap(line -> Stream.of(line.split("  ")))
                    .distinct();

            Optional<String> boba = readFile.map(word -> word.toLowerCase())
                    .filter(word -> word.contains("boba"))
                    .findFirst();

            if (boba.isEmpty()) {
                System.out.println("Nie ma takiego słowa w tekście");

            } else {
                System.out.println(boba.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
