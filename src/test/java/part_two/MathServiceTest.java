package part_two;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class MathServiceTest {

    MathService mathService = new MathService();

    @ParameterizedTest
    @CsvSource({
            "1, -3, 2, 2.0, 1.0",
            "1, -5, 6, 3.0, 2.0",
            "1, -1, -6, 3.0, -2.0"
    })
    public void shouldReturnTwoDifferentRootsForPositiveDiscriminant(int a, int b, int c, double expectedFirst, double expectedSecond) throws NotFoundAnswerException {
        Pair result = mathService.getAnswer(a, b, c);
        assertThat(result).isNotNull();
        assertThat(result.first).isCloseTo(expectedFirst, within(0.0001));
        assertThat(result.second).isCloseTo(expectedSecond, within(0.0001));
    }

    @ParameterizedTest
    @CsvSource({
            "1, -2, 1, 1.0, 1.0",
            "2, -8, 6, 3.0, 1.0",
            "1, -4, 4, 2.0, 2.0"
    })
    public void shouldReturnOneRootForZeroDiscriminant(int a, int b, int c, double expectedFirst, double expectedSecond) throws NotFoundAnswerException {
        Pair result = mathService.getAnswer(a, b, c);
        assertThat(result).isNotNull();
        assertThat(result.first).isEqualTo(expectedFirst, within(0.0001));
        assertThat(result.second).isEqualTo(expectedSecond, within(0.0001));
    }

    @Test
    public void shouldThrowExceptionForNegativeDiscriminant() {
        assertThatThrownBy(() -> mathService.getAnswer(1, 2, 3))
                .isInstanceOf(NotFoundAnswerException.class)
                .hasMessage("Корни не могут быть найдены");
    }

    @ParameterizedTest
    @CsvSource({
            "1, -3, 2, 1",
            "1, -5, 6, 1",
            "1, 2, 1, 0",
            "2, -8, 6, 16",
            "3, -12, 9, 36"
    })
    public void shouldCalculateDiscriminantCorrectly(int a, int b, int c, int expectedDiscriminant) {
        int discriminant = mathService.getD(a, b, c);
        assertThat(discriminant).isEqualTo(expectedDiscriminant);
    }

    @Test
    public void shouldReturnCorrectRootsForZeroCoefficient() throws NotFoundAnswerException {
        Pair result = mathService.getAnswer(0, 4, 2);
        assertThat(result).isNotNull();
    }
}
