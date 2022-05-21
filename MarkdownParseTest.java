import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        assertEquals(6, 2+4);
        assertEquals(8, 7+1);
    }

    @Test
    public void test_Snippet1() throws IOException{
        MarkdownParse mParse = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> Snippet1 = mParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>();
        result.add("`google.com");
        assertEquals(result, Snippet1);
    }

    @Test
    public void getLinksTest() throws IOException {
        assertEquals(List.of("`google.com"), 
        MarkdownParse.getLinks(Files.readString(Path.of("Snippet1.md"))));
    }
   
}
