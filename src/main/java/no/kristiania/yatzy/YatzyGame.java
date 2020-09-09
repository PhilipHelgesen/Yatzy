package no.kristiania.yatzy;

public class YatzyGame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        for (int die : dice) {
            if (die == 1 && category == YatzyCategory.ONES) {
                result += die;
            } else if (die == 2 && category == YatzyCategory.TWOS) {
                result += die;
            } else if (die == 3 && category == YatzyCategory.THREE) {
                result += die;
            } else if (die == 4 && category == YatzyCategory.FOUR) {
                result += die;
            } else if (die == 5 && category == YatzyCategory.FIVE) {
                result += die;
            } else if (die == 6 && category == YatzyCategory.SIX) {
                result += die;
            }

            if(category == YatzyCategory.PAIR){
                for (int i = 0; i < dice.length; i++) {
                    for (int j = 0; j < dice.length; j++) {
                        if(i != j && dice[i] == dice[j]){
                            return dice[i]*2;
                        }
                    }
                }
            }
        }

        return result;
    }
}
