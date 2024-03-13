package other.there;
/**
 * 921. 使括号有效的最少添加
 * 只有满足下面几点之一，括号字符串才是有效的：
 *
 * 它是一个空字符串，或者
 * 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
 * 它可以被写作 (A)，其中 A 是有效字符串。
 * 给定一个括号字符串 s ，在每一次操作中，你都可以在字符串的任何位置插入一个括号
 *
 * 例如，如果 s = "()))" ，你可以插入一个开始括号为 "(()))" 或结束括号为 "())))" 。
 * 返回 为使结果字符串 s 有效而必须添加的最少括号数。
 *
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println( minAddToMakeValid("())"));
    }

    static int minAddToMakeValid(String s) {
        int leftCount = 0; // 记录左括号后面没有与之匹配的右括号的数量
        int rightCount = 0; // 记录右括号前面没有与之匹配的左括号的数量
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftCount++; // 左括号数量加一
            } else if (c == ')') {
                rightCount++; // 如果没有左括号与之匹配，则右括号数量加一
            }
        }
        return Math.abs(leftCount - rightCount); // 返回需要添加的括号数量
    }

}

