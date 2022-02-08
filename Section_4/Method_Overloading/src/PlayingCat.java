public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperBound = summer? 35: 45;
        return temperature>25 && temperature<upperBound;
    }

}
