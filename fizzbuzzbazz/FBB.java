/* Encap on FBB */


public class FBB {

    public static String evaluateFBB(int value) {
        if (value % 3 == 0) return "fizz";
        return Integer.toString(value);
    }

}
