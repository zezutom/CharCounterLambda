import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CharCounterTest {
	
	private CharCounter counter = new CharCounter();
    
	@Test 
    public void countedCharsAreLowerCaseAndUnique() {
       List<CharCounter.Count> count = counter.count("Hello World!");
       assertThat(count.toString(), 
    		   equalTo("[' ': 1, "
    		   		+ "'!': 1, "
    		   		+ "'d': 1, "
    		   		+ "'e': 1, "
    		   		+ "'h': 1, "
    		   		+ "'l': 3, "
    		   		+ "'o': 2, "
    		   		+ "'r': 1, "
    		   		+ "'w': 1]"));
    }
}
