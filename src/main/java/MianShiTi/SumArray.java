package MianShiTi;

import java.util.ArrayList;
public class SumArray {

    public static Integer[] getOrder(int[] nums, int target){
        ArrayList<Integer> orderlist = new ArrayList<>();
            for(int i = 0; i <= nums.length-1; i++) {
              //
                for(int j = 0; j <= nums.length-1; j++) {
                  //
                    if(nums[i]+nums[j]==target){
                        orderlist.add(i+1);
                        break;
                    }
                }
            }

            Integer[] orderArray = new Integer[orderlist.size()];
            return orderlist.toArray(orderArray);

//        for (int i = 0; i < orderArray.length; i++) {
//            orderArray[i] = orderArray[i].intValue();
//            System.out.print(orderArray[i] + " ");
//        }


    }

    public static void getOrderv(int[] nums, int target){
        //声明一个ArryaList用来存放结果，长度不定所以ArrayList而不是Array
        ArrayList<Integer> orderlist = new ArrayList<Integer>();
        for(int i = 0; i <= nums.length-1; i++) {
            //
            for(int j = 0; j <= nums.length-1; j++) {
                //
                if(nums[i]+nums[j]==target){
                    orderlist.add(i+1);
                    break;
                    //只要第一次nums[i]+nums[j]==target就结束本次外层循环，记录I，
                    // 不管以后是否还有可以与nums[i]相加等于target的数，因为之后的循环可以获得
                }
            }
        }
//        直接打印ArrayList
        System.out.println("ArrayList:"+orderlist);


//        Integer[] orderArray = new Integer[orderlist.size()];
//        orderlist.toArray(orderArray);
//
//        for (int i = 0; i < orderArray.length; i++) {
//            orderArray[i] = orderArray[i].intValue();
//            System.out.print(orderArray[i] + " ");
//        }
//
//        System.out.println(orderArray);

    }
    public static void main(String[] args) {
        int[] nums = {2,7,4,7,11,5,7,7,9,77};
        SumArray.getOrderv(nums,9);
//        System.out.println("返回值："+SumArray.getOrder(nums,9));

    }
}
