import java.util.Scanner;

/**
 * 简单的32位的整数反转
 */
class Solution {

    public static void main(String[] args) {

        //获取用户输入
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        //测试
        Solution solution = new Solution();
        System.out.println(solution.reverse(value));
    }

    public int reverse(int x) {

        //用long类型，保证运算时不会溢出
        long result = 0;

        
        for (int copy_x = x; 0 != copy_x; copy_x /= 10) {

            result = result*10+copy_x%10;
        }

        //检查是否会溢出，如果发生溢出，则返回0
        if (result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){

            return 0;
        }

        return (int) result;
    }
}