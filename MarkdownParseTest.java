import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    /*@Test
    public void sub() {
        assertEquals(3, 2 + 1);
    }*/

    @Test
    public void firstFile() throws IOException {
        ArrayList<String> listFile = new ArrayList<String>();
        listFile.add("https://something.com");
        listFile.add("some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        
        assertEquals(listFile, links);
    }
}
