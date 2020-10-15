package keye.com.rxjavaobserver.addImagethread;

import android.util.Log;

/**
 * Created by Administrator on 2016-10-31.
 */
public class Lamdba {

    public void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("TAG", "jikexueyuan");
            }
        }).start();
    }

    public void testLamdba() {
        new Thread(() -> Log.d("TAG", "jikexueyuan")).start();
    }


}
