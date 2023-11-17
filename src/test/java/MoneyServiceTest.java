import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.MoneyService;

public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void calcChillDay1() {
        MoneyService service = new MoneyService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void calcChillDay2() {
        MoneyService service = new MoneyService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}
