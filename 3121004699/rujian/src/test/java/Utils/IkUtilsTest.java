package Utils;

import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/17:41
 * @Description:
 */
public class IkUtilsTest {
    @Test
    public void testIk(){
        String data="我喜欢大海啊";
        List<String> string = IkUtils.getString(data, false);
        System.out.println(string.toString());
    }
}
