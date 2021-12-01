import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1Part1
{
    public static void main(String[] args) throws IOException
    {
        List<String> file = Files.readAllLines(Path.of("inputDay1Part1.txt"));
        
        int timesIncreased = 0;
        
        for (int i = 0; i < file.size() - 1; i++)
        {
            int numA = Integer.parseInt(file.get(i));
            int numB = Integer.parseInt(file.get(i + 1));
            
            if (numA < numB)
                timesIncreased++;
        }
        System.out.println(timesIncreased);
    }
}