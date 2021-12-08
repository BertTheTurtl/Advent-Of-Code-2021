import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day3Part1
{
    public static void main(String[] args) throws IOException
    {
        List<String> file = Files.readAllLines(Path.of("inputDay3.txt"));

        int countOne = 0;
        int countZero = 0;

        for (String s : file)
        {
            int n = Integer.parseInt(s);
            if (n % 100000000000 == 1)
                countOne++;
            else
                countZero++;

        }
    }
}