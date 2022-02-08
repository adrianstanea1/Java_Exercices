public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if(isTeen(a)) return true;
        if(isTeen(b)) return true;
        if(isTeen(c)) return true;
        return false;
    }

    public static boolean isTeen(int num) {
        return num>=13 && num <=19;
    }
}
