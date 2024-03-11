package other.two;

import java.util.Stack;

public class Main {
    public static String decodeString(String s) {
        // 创建一个栈来辅助解码
        Stack<String> stack = new Stack<>();
        // 用于保存当前正在解码的字符串
        StringBuilder currStr = new StringBuilder();
        // 用于保存当前数字的值
        int num = 0;

        // 遍历输入的字符串
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // 如果当前字符是数字，更新 num
                num = num * 10 + Character.getNumericValue(c);
            } else if (c == '[') {
                // 如果当前字符是左方括号，将当前解码的字符串和数字入栈，并重置 currStr 和 num
                stack.push(currStr.toString());
                stack.push(String.valueOf(num));
                currStr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                // 如果当前字符是右方括号，进行解码操作
                // 首先取出栈顶的重复次数和前一个解码的字符串
                int repeatNum = Integer.parseInt(stack.pop());
                StringBuilder prevStr = new StringBuilder(stack.pop());
                // 将前一个解码的字符串重复指定次数并与当前字符串拼接
                for (int i = 0; i < repeatNum; i++) {
                    prevStr.append(currStr);
                }
                // 更新当前解码的字符串为拼接后的字符串
                currStr = prevStr;
            } else {
                // 如果当前字符是字母，则直接追加到当前解码的字符串上
                currStr.append(c);
            }
        }

        // 返回解码后的结果
        return currStr.toString();
    }

    public static void main(String[] args) {
        // 测试用例：给定一个编码后的字符串
        String encodedString = "4[a]2[bc]";
        // 调用解码方法进行解码
        String decodedString = decodeString(encodedString);
        // 输出解码结果
        System.out.println(decodedString);  // 输出 "aaabcbc"
    }
}
