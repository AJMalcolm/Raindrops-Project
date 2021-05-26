package malcolm.alasdair.unit;

import malcolm.alasdair.raindrops.Raindrops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaindropsUnitTests {

    //TODO: Unit Tests to be implemented here

    @Nested
    @DisplayName("raindrops method tests")
    class RaindropsMethodTests{
        @Test
        @DisplayName("raindrops returns a string")
        void raindropsReturnsAString() {
            Assertions.assertEquals(String.class, Raindrops.raindrops("1").getClass());
        }

        @ParameterizedTest
        @ValueSource(strings = {"3", "6", "9", "12", "15"})
        @DisplayName("raindrops returns 'Pling' for multiples of 3")
        void raindropsReturnsPlingForMultipleOfThree(String input) {
            Assertions.assertEquals("Pling", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"5", "10", "15", "20", "25"})
        @DisplayName("raindrops returns 'Plang' for multiples of 5")
        void raindropsReturnsPlangForMultipleOfFive(String input) {
            Assertions.assertEquals("Plang", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"7", "14", "21", "28", "35"})
        @DisplayName("raindrops returns 'Plong' for multiples of 7")
        void raindropsReturnsPlongForMultipleOfSeven(String input) {
            Assertions.assertEquals("Plong", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"1", "2", "4", "8", "11", "13"})
        @DisplayName("raindrops return its input, if that input is not a multiple of 3, 5 or 7")
        void raindropsReturnItsInputIfThatInputIsNotAMultipleOfThreeFiveOrSeven(String input) {
            Assertions.assertEquals(input, Raindrops.raindrops(input));
        }
    }
}