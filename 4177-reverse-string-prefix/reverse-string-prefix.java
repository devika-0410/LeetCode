class Solution {
    public String reversePrefix(String s, int k) {
        String a = s.substring(0, k);
        String b = s.substring(k);

        StringBuilder sb = new StringBuilder(a);

        return sb.reverse().toString() + b;

    }
}