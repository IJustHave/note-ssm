import com.junce.ssm.utils.Encrypt;
import org.junit.Test;


/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class EncryptTest extends BaseTest{

    @Test
    public void testMD5(){
      System.out.println(Encrypt.md5("123456"));
    }

}
