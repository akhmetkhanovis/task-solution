import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelColumnResolver {
    private final Map<Integer, Character> columnNames = ExcelUtils.createMap();

    public Map<Integer, String> resolveToColumnNames(final List<Integer> input) {
        Map<Integer, String> result = new LinkedHashMap<>();

        for (Integer number : input) {
            if (number <= 0) continue;

            int inputOriginal = number;
            StringBuilder columnName = new StringBuilder();
            while (number > ExcelUtils.ALPHABET) {
                int remainder = number % ExcelUtils.ALPHABET;
                columnName.append(columnNames.get(remainder));
                number = number / ExcelUtils.ALPHABET;
            }
            columnName.append(columnNames.get(number));
            result.put(inputOriginal, columnName.reverse().toString());
        }

        return result;
    }
}
