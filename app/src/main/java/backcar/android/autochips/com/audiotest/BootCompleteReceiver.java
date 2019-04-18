package backcar.android.autochips.com.audiotest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("FlyaudioSystemUI","收到了开机广播，当前时间是 = "+System.currentTimeMillis());
        Intent in = new Intent();
        in.setClassName("backcar.android.autochips.com.audiotest","backcar.android.autochips.com.audiotest.MainActivity");
        in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);
    }
}
