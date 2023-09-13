package Utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/21:06
 * @Description:
 */

/**
 * 获取海明距离
 */
public class hammingUtils {
    public static int getHammingDis(String simHash1,String simHash2){
        int result=0;
        if(simHash1.length()!=simHash2.length()){
            result=-1;
        }else {
            for (int i = 0; i < simHash1.length(); i++) {
                //每一位进行比较
                if (simHash1.charAt(i) != simHash2.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    public static double getSimilarity(String simHash1, String simHash2) {
        //通过 simHash1 和 simHash2 获得它们的海明距离
        int distance = getHammingDis(simHash1, simHash2);
        //通过海明距离计算出相似度，并返回
        return 0.01 * (100 - distance * 100 / 128);
    }

}
