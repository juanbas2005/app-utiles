package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import cu.lestebang.utiletecsa.MainActivity;
import java.util.Map;

/* renamed from: td4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class td4 implements i07, r8 {
    public final /* synthetic */ MainActivity w;

    public /* synthetic */ td4(MainActivity mainActivity) {
        this.w = mainActivity;
    }

    public boolean a() {
        int i = MainActivity.g0;
        return ((is7) this.w.v().e.w.getValue()).b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r4.startActivity(new android.content.Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0043 */
    public void b(Object obj) {
        int i = MainActivity.g0;
        ((Map) obj).getClass();
        MainActivity mainActivity = this.w;
        Object systemService = mainActivity.getSystemService("power");
        systemService.getClass();
        if (!((PowerManager) systemService).isIgnoringBatteryOptimizations(mainActivity.getPackageName())) {
            String packageName = mainActivity.getPackageName();
            Uri parse = Uri.parse("package:" + packageName);
            parse.getClass();
            mainActivity.startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", parse));
        }
    }
}
