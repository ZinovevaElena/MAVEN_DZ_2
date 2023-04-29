import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalcService;

public class CalcServiceTest {

    @Test
    public void TestCountRest1() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calcService(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestCountRest2() {
        CalcService service = new CalcService();
        int expected = 2;
        int actual = service.calcService(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest_calc.csv")
    public void TestCountRestParametr(int income, int expense, int threshold, int expected) {
        CalcService service = new CalcService();
        int actual = service.calcService(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

