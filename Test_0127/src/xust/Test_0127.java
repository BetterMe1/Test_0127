package xust;

import java.util.Arrays;

/*
1. 2的幂
给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

示例 1:
输入: 1
输出: true
解释: 2^0 = 1

示例 2:
输入: 16
输出: true
解释: 2^4 = 16

示例 3:
输入: 218
输出: false
 */
/*
 * 算法思想：
 * 方法一：先判断n是否是不大于0或不等于1的奇数，若是，说明不是2的幂次方，接着判断n是否是1、2,是返回true,
 * 其他情况下，循环判断n=n/2是不是奇数，若是奇数，返回false，直到n==2结束循环，循环结束则说明是2的幂次方。
 * 方法二：先判断n是否是不大于0或不等于1的奇数，若是，说明不是2的幂次方，再判断n & (n-1) 是不是0，
 * 这里说明一下，若n是2的幂次方，如n=4：
 * n & (n-1)=00000000000000000000000000000100 & 00000000000000000000000000000011 =0
 *          若n不是2的幂次方，如n=5：
 *          n & (n-1)=00000000000000000000000000000101 & 00000000000000000000000000000100 =1
 * 也可以直接算二进制位中位1的个数，如果是2的幂次方，二进制位中位1的个数应该为1.
 */
//public class Test_0127 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.isPowerOfTwo1(218));
//	}
//}
//class Solution {
//    public boolean isPowerOfTwo1(int n) {
//        if(n <= 0 ||(n%2!=0 && n!=1)){
//        	return false;
//        }
//        else if(n < 3){
//        	return true;
//        }
//        while(n!=2){
//        	n /= 2;
//        	if(n%2!=0){
//        		return false;
//        	}
//        }
//        return true;
//    }
//    public boolean isPowerOfTwo2(int n) {
//        if(n <= 0 ||(n%2!=0 && n!=1)){
//        	return false;
//        }
//        if((n & (n-1)) == 0){
//        	return true;
//        }
//        return false;
//    }
//}
/*
2. 位1的个数
编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。

示例 1：
输入：00000000000000000000000000001011
输出：3
解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。

示例 2：
输入：00000000000000000000000010000000
输出：1
解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。

示例 3：
输入：11111111111111111111111111111101
输出：31
解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。

提示：
请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
 */
//public class Test_0127 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.hammingWeight(3));
//	}
//}
//class Solution {
//    public int hammingWeight(int n) {
//    	int count=0;
//        for(int i=0; i<32; i++){
//        	if(((n>>i) & 1)==1){
//        		count ++;
//        	}
//        }
//        return count;
//    }
//}
/*
3. 有效的字母异位词
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

示例 1:

输入: s = "anagram", t = "nagaram"
输出: true

示例 2:
输入: s = "rat", t = "car"
输出: false
说明:
你可以假设字符串只包含小写字母。

进阶:
如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
/*
 * 算法思想：将字符串s、t中每一个字符存入字符数组s1、t1中，对s1、t1进行排序，比较排序后的s1、t1是否相等，若相等，说明t 是否是 s 的一个字母异位词，若不相等，说明不是
 */
//public class Test_0127 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String s = "anagram";
//		String t = "nagaram";
//		System.out.println(So.isAnagram( s, t));
//	}
//}
//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//        	return false;
//        }
//        //将s、t中每一个字符存入字符数组s1、t1中
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
//        //字符数组s1、t1排序
//        Arrays.sort(s1);
//        Arrays.sort(t1);
//        //比较排序后的s1、t1是否相等，若相等，说明t 是否是 s 的一个字母异位词，若不相等，说明不是
//        return Arrays.equals(s1, t1);
//    }
//}
/*
4. 丑数
编写一个程序判断给定的数是否为丑数。
丑数就是只包含质因数 2, 3, 5 的正整数。

示例 1:
输入: 6
输出: true
解释: 6 = 2 × 3

示例 2:
输入: 8
输出: true
解释: 8 = 2 × 2 × 2


示例 3:
输入: 14
输出: false 
解释: 14 不是丑数，因为它包含了另外一个质因数 7。
说明：
1 是丑数。
输入不会超过 32 位有符号整数的范围: [−2^31,  2^31 − 1]。
 */
///*
//* 算法思想：对传入的数字进行因式分解，一直分解2，3，5的因数，直到不能分解，最后结果为1说明该数只包含2，3，5因子，为丑数
//*/
//public class Test_0127 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int num = 14;
//		System.out.println(So.isUgly(num));
//	}
//}
//class Solution {
//    public boolean isUgly(int num) {
//    	if(num <1){
//    		return false;
//    	}
//    	while(num % 2 == 0){
//    		num /= 2;
//    	}
//    	while(num % 3 == 0){
//    		num /= 3;
//    	}
//    	while(num % 5 == 0){
//    		num /= 5;
//    	}
//    	if(num == 1){
//    		return true;
//    	}
//    	return false;
//    }
//}

/*
5. 丑数 II
编写一个程序，找出第 n 个丑数。
丑数就是只包含质因数 2, 3, 5 的正整数。

示例:
输入: n = 10
输出: 12
解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
说明:  
1 是丑数。
n 不超过1690。 
 */
/*
 * 算法思想：基数是丑数1，后面的丑数是针对前面的乘以2、3、5，提取出最小的丑数并将当前得出的丑数存入数组作为后面计算的基数，保证每次循环提取出最小的丑数即可。
 */
public class Test_0127 {
	public static void main(String[] args) {
		Solution So = new Solution();
		System.out.println(So.nthUglyNumber(10));
	}
}
class Solution {
    public int nthUglyNumber(int n) {
        if(n<1 || n>1690){
        	return -1;
        }
        int[] num = new int[n];
        num[0] = 1;
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;
        for(int i=1; i<n; i++){
        	num[i] = Math.min(Math.min(num[n2]*2, num[n3]*3),num[n5]*5);
        	if(num[i] == num[n2]*2){
        		n2++;
        	}
        	if(num[i] == num[n3]*3){
        		n3++;
        	}
        	if(num[i] == num[n5]*5){
        		n5++;
        	}
        }
        return num[n-1];
    }
}