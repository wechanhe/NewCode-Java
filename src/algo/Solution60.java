package algo;

import java.util.HashMap;

/**
 *   数组中只出现一次的数字
 *   思路1：用一个map记录每个元素出现的次数
 *   思路2: 只有两个不重复数字的数字，所有元素的异或结果为两个无重复数字亦或
 *   的结果diff，diff&=-diff得到diff最右侧不为0的位，也就是不存在重复的
 *   两个元素在位级表示上最右侧不同的那一位，利用这一位就可以将两个元素区分开来。
 */
public class Solution60 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = array.length;
        for(int i=0;i<n;i++){
            int key = array[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key, 1);
            }
        }
        boolean isFilled = false;
        for(int key:map.keySet()){
            if(map.get(key) == 1){
                if(!isFilled){
                    num1[0] = key;
                    isFilled = true;
                }
                else num2[0] = key;
            }
        }
    }
}
