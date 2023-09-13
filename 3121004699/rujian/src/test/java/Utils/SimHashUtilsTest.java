package Utils;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/22:26
 * @Description:
 */
public class SimHashUtilsTest {
    @Test
    public void testgetSimHash(){
        String s = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig.txt");
        String simHash = SimHashUtils.getSimHash(s);
        System.out.println(simHash);
    }

    @Test
    public void testgetHash(){
        String s = FileUtils.readFile("C:\\Users\\17680\\Desktop\\orig.txt");
        String hash = SimHashUtils.getHash(s);
        System.out.println(hash);
    }
}
