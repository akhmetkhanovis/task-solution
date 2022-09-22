import java.util.List;
import java.util.Map;

public class Executor {
    private static final List<Integer> inputNumbers = List.of(1, 26, 27, -45, 0, 150, 18279, 9999);

    public static void main(String[] args) {
        ExcelColumnResolver excelColumnResolver = new ExcelColumnResolver();
        Map<Integer, String> result = excelColumnResolver.resolveToColumnNames(inputNumbers);

        System.out.println(result);
    }
}
