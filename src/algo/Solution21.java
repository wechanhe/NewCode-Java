package algo;

/**
 *  表示数值的字符串
 *  使用正则表达式进行匹配。
 *
 * []  ： 字符集合
 * ()  ： 分组
 * ?   ： 重复 0 ~ 1 次
 * +   ： 重复 1 ~ n 次
 * *   ： 重复 0 ~ n 次
 * .   ： 任意字符
 * \\. ： 转义后的 .
 * \\d ： 数字
 */
public class Solution21 {
    public boolean isNumeric(char[] str){
        if(str == null || str.length == 0){
            return false;
        }
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?")
    }
}
