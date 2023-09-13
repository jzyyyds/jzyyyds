package Utils;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/22:10
 * @Description:
 */
public class hammingUtilsTest {
    @Test
    public void testgetSimilarity(){
        String s = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig.txt");
        String s1 = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig_0.8_add.txt");
        String simHash = SimHashUtils.getSimHash(s);
        String simHash1 = SimHashUtils.getSimHash(s1);
        double similarity = hammingUtils.getSimilarity(simHash, simHash1);
        System.out.println(similarity);
    }

    @Test
    public void testgetHammingDis(){
        String s = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig.txt");
        String s1 = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig_0.8_add.txt");
        String simHash = SimHashUtils.getSimHash(s);
        String simHash1 = SimHashUtils.getSimHash(s1);
        int hammingDis = hammingUtils.getHammingDis(simHash, simHash1);
        System.out.println(hammingDis);
    }
}
