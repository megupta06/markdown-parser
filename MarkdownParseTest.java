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

    // @Test
    // public void test_Snippet1() throws IOException{
    //     MarkdownParse mParse = new MarkdownParse();
    //     Path fileName = Path.of("/Users/mehakgupta/Documents/GitHub/markdown-parser/Snippet1.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> Snippet1 = mParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     result.add("`google.com");
    //     assertEquals(result, Snippet1);
    // }

    // @Test
    // public void test_Snippet2() throws IOException{
    //     MarkdownParse mParse = new MarkdownParse();
    //     Path fileName = Path.of("/Users/mehakgupta/Documents/GitHub/markdown-parser/Snippet2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> Snippet2 = mParse.getLinks(content);
    //     ArrayList<String> result = new ArrayList<String>();
    //     result.add("a.com");
    //     result.add("a.com(())");
    //     result.add("example.com");
    //     assertEquals(result, Snippet2);
    // }


    @Test
    public void test_Snippet3() throws IOException{
        MarkdownParse mParse = new MarkdownParse();
        Path fileName = Path.of("/Users/mehakgupta/Documents/GitHub/markdown-parser/Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> Snippet3 = mParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>();
        result.add("https://www.twitter.com");
        result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedu");
        result.add("https://cse.ucsd.edu/");
        assertEquals(result, Snippet3);
    }
   
}
