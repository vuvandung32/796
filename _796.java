import java.util.ArrayList;

public class _796 {
    public static void main(String args[]) {
        String s1 = "abcdxyzhgh";
        String goal = "xyzabcd";
        System.out.println(rotateString(s1,goal));
    }


    public static boolean rotateString(String s1, String goal){
        if (s1.length() != goal.length()) {
            return false;
        } else {

            ArrayList<Integer> indexes = new ArrayList<Integer>();


            int Size = s1.length();

            char firstChar = s1.charAt(0);

            for (int i = 0; i < Size; i++) {
                if (goal.charAt(i) == firstChar) {
                    indexes.add(i);
                }
            }

            boolean isRotation = false;


            for (int idx : indexes) {
                isRotation = checkString(s1, goal, idx, Size);

                if (isRotation)
                    break;
            }

            if (isRotation)
                return true ;


        }
        return true;
    }

    static boolean checkString(String s1, String s2, int indexFound, int Size) {
        for (int i = 0; i < Size; i++) {

            if (s1.charAt(i) != s2.charAt((indexFound + i) % Size))
                return false;
        }

        return true;
    }
}
