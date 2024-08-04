class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.push('(',')');
        map.push('{','}');
        map.push('[',']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //1. 여는 괄호라면 stack 에 insert
            if (map.containsKey(c)) {
                stack.push(c);

            //2. 닫는괄호라면, stack에 넣은 여는괄호를 key 로 map 에서 꺼낸값과 비교
            } else if (map.get(stack.pop()) != c || stack.isEmpty()) {
                return false;
            }
        }
        return stack.size() == 0;
    }
}