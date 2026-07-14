class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        char[] arr = s.toCharArray();
        long sum = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;

            arr[i] = (char) ((arr[i] - 'a' + sum) % 26 + 'a');
        }

        return new String(arr);
    }
}