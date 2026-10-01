class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')

        for (char in s) {
            when (char) {
                 '(', '{', '[' -> stack.add(char)
                 ')', '}', ']' -> {
                    if (stack.isEmpty() || stack.last() != map[char]) {
                        return false
                    }
                    stack.removeAt(stack.size - 1)
                 }
            }
        }
        return stack.isEmpty()
    }
}