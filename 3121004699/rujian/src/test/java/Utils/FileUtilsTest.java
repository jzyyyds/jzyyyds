package Utils;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/22:30
 * @Description:
 */
public class FileUtilsTest {

    @Test
    public  void testreadFile(){
        String fileName="C:\\Users\\17680\\Desktop\\orig.txt";
        String s = FileUtils.readFile(fileName);
        System.out.println(s);

    }

    @Test
    public  void testreadFileException(){
        String fileName="C:\\Users\\17680\\Desktop\\system.log";
        FileUtils.readFile(fileName);
    }

    @Test
    public  void testwriteFile(){
        String fileName="C:\\Users\\17680\\Desktop\\jzy.txt";
        String date="测试成功！";
        FileUtils.writeFile(fileName,date);
    }

    @Test
    public  void testwriteFileException(){
        String fileName="C:\\Users\\17680\\Desktop\\system.log";
        String date="测试成功！";
        FileUtils.writeFile(fileName,date);
    }
}
