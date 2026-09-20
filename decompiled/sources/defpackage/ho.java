package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ho  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Context x;

    public /* synthetic */ ho(Context context, int i) {
        this.w = i;
        this.x = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r2 != null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    public final void run() {
        za4 za4;
        int i = this.w;
        Context context = this.x;
        switch (i) {
            case b85.b:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 < 33) {
                            za4 = ko.y;
                            break;
                        } else {
                            Object b = ko.b();
                            if (b != null) {
                                za4 = new za4(new ab4(jo.a(b)));
                                if (za4.b()) {
                                    String I = rd3.I(context);
                                    Object systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        jo.b(systemService, io.a(I));
                                    }
                                }
                                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                        }
                        za4 = za4.b;
                        if (za4.b()) {
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                ko.B = true;
                return;
            case 1:
                ko.n(context);
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ho(context, 3));
                return;
            default:
                tp5.b(context, new or(1), tp5.a, false);
                return;
        }
    }
}
