import Utils.FileUtils;
import Utils.SimHashUtils;
import Utils.hammingUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/21:14
 * @Description:
 */
public class CheckMain {
    public static void main(String[] args) {
        //读取参数
        String s = FileUtils.readFile(args[0]);
        String s1 = FileUtils.readFile(args[1]);
        //计算sim
        String simHash = SimHashUtils.getSimHash(s);
        String simHash1 = SimHashUtils.getSimHash(s1);
        //获取相似度
        double similarity = hammingUtils.getSimilarity(simHash, simHash1);
        //保留小数点后两位
        String resultSimilarity = String.format("%.2f", similarity);
        String result = "查重时间：" + DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss").format(LocalDateTime.now()) + "===" + args[0] + "与" + args[1] + "的相似度为：" + resultSimilarity + "\r\n";

        //把相似度写入最后的结果文件中
        FileUtils.writeFile(args[2],result);

        System.out.println("相似度为：" + resultSimilarity + "。 结果已经写入" + args[2] + "中。");

    }


}
