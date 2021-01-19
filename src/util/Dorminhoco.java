package util;

/**
 * @author dibpereira@rd.com.br @created on 19/01/2021
 */
public class Dorminhoco {

    public static void durma(Long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
