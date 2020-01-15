package algo;

/**
 *  输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 *  比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 *
 *  求解：n非常大的情况下，long也不能存。需要用char数组存储，通过回溯法求解。
 */
public class Solution17 {
    public void print1ToMaxOfNDigits(int n){
        if(n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit){
        if(digit == number.length){
            printNumber(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[digit] = (char)(i + '0');
            print1ToMaxOfNDigits(number, digit+1);
        }
    }

    private void printNumber(char[] number){
        int index = 0;
        while(index < number.length && number[index] == '0')
            index++;
        while(index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }
}
