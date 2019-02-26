package Algorithm;

/*
* 在字符串中找出第一个只出现一次的字符的位置，如输入“abbaccdeff”，则输出“6”。
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class FirstRepeatChar {
    public int FirstNotRepeatingChar(String str) {
        if(str==null||"".equals(str))
            return -1;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Set<Character> keys = map.keySet();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(keys.contains(c)){
                int value = map.get(c).intValue();
                value++;
                map.put(c, value);
            }else{
                map.put(c,1);
            }
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c).intValue()==1)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        FirstRepeatChar firstRepeatChar = new FirstRepeatChar();

        int a = firstRepeatChar.FirstNotRepeatingChar("abbaccdeff");
        System.out.println(a);
    }

}
