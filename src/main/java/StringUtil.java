/**
 * Created with IntelliJ IDEA.
 * User: kokamoto
 * Date: 2013/05/06
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
public class StringUtil {

    public String[] getAllay(String[] allay, int index) {
        String[] resultAllay = new String[allay.length - index];

        int i = 0;
        for (int j = index; j < allay.length - 1; j++) {
            resultAllay[i] = allay[j];
            i++;
        }
        return resultAllay;
    }
}
