package leetcode.editor.cn;

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1234 👎 0

public class PalindromeNumber{
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        try {
            String str = String.valueOf(x);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return Integer.valueOf(sb.toString()) == x ? true : false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}