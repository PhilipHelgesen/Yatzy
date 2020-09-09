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
        assertEquals(3, new YatzyGame().score(YatzyCategory.THREE, new int[]{3, 2, 2, 5, 2}));
        assertEquals(9, new YatzyGame().score(YatzyCategory.THREE, new int[]{3, 3, 3, 5, 2}));
    }

    @Test
    void shouldScoreFour() {
        assertEquals(4, new YatzyGame().score(YatzyCategory.FOUR, new int[]{4, 2, 2, 5, 2}));
        assertEquals(12, new YatzyGame().score(YatzyCategory.FOUR, new int[]{4, 4, 4, 5, 2}));
    }

    @Test
    void shouldScoreFive() {
        assertEquals(5, new YatzyGame().score(YatzyCategory.FIVE, new int[]{5, 2, 2, 3, 2}));
        assertEquals(15, new YatzyGame().score(YatzyCategory.FIVE, new int[]{5, 5, 4, 5, 2}));
    }

    @Test
    void shouldScoreSix() {
        assertEquals(6, new YatzyGame().score(YatzyCategory.SIX, new int[]{5, 2, 6, 3, 2}));
        assertEquals(18, new YatzyGame().score(YatzyCategory.SIX, new int[]{6, 6, 4, 6, 2}));
    }
    @Test
    void shouldScoreHighestPair() {
        assertEquals(10,new YatzyGame().score(YatzyCategory.PAIR, new int[]{5, 2, 3, 5, 2}));
        assertEquals(12,new YatzyGame().score(YatzyCategory.PAIR, new int[]{5, 6, 6, 5, 2}));
    }

}

