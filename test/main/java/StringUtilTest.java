import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: kokamoto
 * Date: 2013/05/06
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */

public class StringUtilTest {
    @Test
    public void 配列変更のテスト(){
        StringUtil sut = new StringUtil();
        String[] sutAllay = new String[]{
                "fuga","hoge","piyo"
        };

        String[] allay = sut.getAllay(sutAllay,1);
//        assertEquals(allay[0],"piyo");
        assertThat(allay[0], is("hoge"));
    }

}
