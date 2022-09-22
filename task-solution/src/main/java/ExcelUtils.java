import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ExcelUtils {
    public static final Integer ALPHABET = 26;
    private static final Integer CHAR_SHIFT = 64;

    public static Map<Integer, Character> createMap() {
        Map<Integer, Character> map = new HashMap<>();
        IntStream.rangeClosed(1, ALPHABET).forEach(i -> map.put(i, (char) (i + CHAR_SHIFT)));
        return map;
    }

}
