package malcolm.alasdair.unit;

import malcolm.alasdair.raindrops.Raindrops;
import org.junit.jupiter.api.*;
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
        @ValueSource(strings = {"3", "6", "9", "12", "18"})
        @DisplayName("raindrops returns 'Pling' for multiples of 3")
        void raindropsReturnsPlingForMultipleOfThree(String input) {
            Assertions.assertEquals("Pling", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"5", "10", "20", "25", "40"})
        @DisplayName("raindrops returns 'Plang' for multiples of 5")
        void raindropsReturnsPlangForMultipleOfFive(String input) {
            Assertions.assertEquals("Plang", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"7", "14", "28", "49", "56"})
        @DisplayName("raindrops returns 'Plong' for multiples of 7")
        void raindropsReturnsPlongForMultipleOfSeven(String input) {
            Assertions.assertEquals("Plong", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"15", "30", "45", "60", "75"})
        @DisplayName("raindrops returns 'PlingPlang' for multiples of 3 and 5")
        void raindropsReturnsPlingPlangForMultipleOfThreeAndFive(String input) {
            Assertions.assertEquals("PlingPlang", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"21", "42", "63", "84", "126"})
        @DisplayName("raindrops returns 'PlingPlong' for multiples of 3 and 7")
        void raindropsReturnsPlingPlongForMultipleOfThreeAndSeven(String input) {
            Assertions.assertEquals("PlingPlong", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"35", "70", "140", "175", "245"})
        @DisplayName("raindrops returns 'PlangPlong' for multiples of 5 and 7")
        void raindropsReturnsPlangPlongForMultipleOfFiveAndSeven(String input) {
            Assertions.assertEquals("PlangPlong", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"105", "210", "315", "420", "525"})
        @DisplayName("raindrops returns 'PlingPlangPlong' for multiples of 3, 5 and 7")
        void raindropsReturnsPlingPlangPlongForMultipleOfThreeFiveAndSeven(String input) {
            Assertions.assertEquals("PlingPlangPlong", Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"1", "2", "4", "8", "11", "13"})
        @DisplayName("raindrops return its input, if that input is not a multiple of 3, 5 or 7")
        void raindropsReturnItsInputIfThatInputIsNotAMultipleOfThreeFiveOrSeven(String input) {
            Assertions.assertEquals(input, Raindrops.raindrops(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"0", "-1", "-12", "-25", "-35", "-105"})
        @DisplayName("raindrops return its input, if that input is less than or equal to 0")
        void raindropsReturnItsInputIfThatInputIsLessThanOrEqualToZero(String input) {
            Assertions.assertEquals(input, Raindrops.raindrops(input));
        }
    }
}