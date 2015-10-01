import java.util.List;
import java.util.stream.Collectors;

public class CharCounter {
	 
	static class Count implements Comparable<Count> {
		char key;
		long count;
		
		Count(char key, long count) {
			this.key = key;
			this.count = count;
		}
		
		@Override
		public String toString() {
			return String.format("'%s': %d", key, count);
		}

		@Override
		public int compareTo(Count o) {
			return this.key - o.key;
		}
	}
	
	public List<Count> count(String text) {
		
		return text
				.toLowerCase()
				.chars()
				.distinct()
				.mapToObj(i -> new Count((char) i, 
								  text
								  	.toLowerCase()
								  	.chars()
								  	.filter(j -> j == i)
								  	.count()))
				.sorted()
				.collect(Collectors.toList());
	
	}
	public static void main(String[] args) {
		System.out.println(new CharCounter().count("Hello World!"));		
	}
}
