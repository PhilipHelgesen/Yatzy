package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnes() {
        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, new YatzyGame().score(YatzyCategory.ONES, new int[]{6, 3, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwo() {
        assertEquals(6, new YatzyGame().score(YatzyCategory.TWOS, new int[]{3, 2, 2, 5, 2}));
        assertEquals(4, new YatzyGame().score(YatzyCategory.TWOS, new int[]{3, 1, 2, 5, 2}));
    }

    @Test
    void shouldScoreThree() {
        assertEquals(3, new YatzyGame().score(YatzyCategory.TWOS, new int[]{3, 2, 2, 5, 2}));
        assertEquals(9, new YatzyGame().score(YatzyCategory.TWOS, new int[]{3, 3, 3, 5, 2}));
    }

}

