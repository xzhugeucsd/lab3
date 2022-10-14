import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Banana");
        input.add("Orange");
        StringChecker SC = new StrChecker();
        input = ListExamples.filter(input,SC);
        List<String> output = new ArrayList<String>();
        output.add("Banana");
        output.add("Orange");
        assertEquals(output, input);
    }

    // @Test
    // public void 
}

