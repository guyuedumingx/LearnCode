package leetcode.editor.cn;

//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。 
//
// 示例 1: 
//
// 输入: 1
//输出: true
//解释: 20 = 1 
//
// 示例 2: 
//
// 输入: 16
//输出: true
//解释: 24 = 16 
//
// 示例 3: 
//
// 输入: 218
//输出: false 
// Related Topics 位运算 数学 
// 👍 242 👎 0

//2 0
//1
//2 1
//10
//2 2
//100
//011
//2 3
//1000
//0111

public class PowerOfTwo{
    public static void main(String[] args) {
        Solution solution = new PowerOfTwo().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n>0) {
            int i = n & (n - 1);
            return i == 0;
        } else {
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}