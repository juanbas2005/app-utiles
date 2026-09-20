package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                tp5.b(context, new or(1), new rg4(2, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        rg4 rg4 = new rg4(2, (Object) this);
                        try {
                            tp5.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            rg4.e(10, (Object) null);
                        } catch (PackageManager.NameNotFoundException e) {
                            rg4.e(7, e);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                rg4 rg42 = new rg4(2, (Object) this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        file = context.createDeviceProtectedStorageContext().getCacheDir();
                    } else {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    }
                    if (su0.l(file)) {
                        rg42.e(14, (Object) null);
                    } else {
                        rg42.e(15, (Object) null);
                    }
                } else {
                    rg42.e(16, (Object) null);
                }
            }
        }
    }
}
