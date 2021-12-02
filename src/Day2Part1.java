import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day2Part1
{
    public static void main(String[] args) throws IOException
    {
        List<String> file = Files.readAllLines(Path.of("inputDay2.txt"));
        
        int horizontalPos = 0;
        int depth = 0;
    
        for (String s : file)
        {
            if (s.charAt(0) == 'f')
            {
                horizontalPos += Integer.parseInt(s.substring(8));
            } else if (s.charAt(0) == 'd')
            {
                depth += Integer.parseInt(s.substring(5));
            } else if (s.charAt(0) == 'u')
            {
                depth -= Integer.parseInt(s.substring(3));
            }
        }
        
        System.out.println(horizontalPos * depth);
    }
}