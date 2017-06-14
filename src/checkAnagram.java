import java.util.HashMap;

public class checkAnagram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean isAnagram = true;
        String s = "cinema";
        String t = "icemani";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char a : s.toCharArray()) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);

            } else {
                map.put(a, 1);
            }

        }

        for (char a : t.toCharArray()) {
            if (map.containsKey(a)) {

                if (map.get(a) == 1) {

                    map.remove(a);

                } else {

                    map.put(a, map.get(a) - 1);
                }

            } else {
                isAnagram = false;
            }
        }

        if (map.size() > 0) {
            isAnagram = false;
        }

        System.out.println(isAnagram);

    }

}
