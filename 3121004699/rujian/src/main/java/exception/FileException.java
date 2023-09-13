package exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: jzy
 * @Date: 2023/09/11/21:55
 * @Description:
 */
public class FileException extends RuntimeException{
    private String errMessage;
    public FileException(){
        super();
    }
    public FileException(String errMessage){
        super(errMessage);
        this.errMessage=errMessage;
    }
    public String getErrMessage(){
        return errMessage;
    }
    public static void handle(){
        throw new FileException("仅支持读取txt类型文件");
    }

}
