class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n = S.length();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int currentNumber = 1;

        for (int i = 0; i <= n; i++) {
            stack.push(currentNumber++);

            if (i == n || S.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }
}
