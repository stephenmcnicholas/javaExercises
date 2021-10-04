 
import java.util.function.Function;
public class MyApp {

	public static void main(String[] args) {
		System.out.println(process("Hello World!", str -> str.toUpperCase()));

	}

	private static String process(String str, Function<String, String> processor) {
		return processor.apply(str);
	}
	
}
