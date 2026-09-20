package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: iv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class iv0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ rv0 x;

    public /* synthetic */ iv0(rv0 rv0, int i) {
        this.w = i;
        this.x = rv0;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [zv4, java.lang.Object] */
    public final Object b() {
        Bundle bundle;
        int i = this.w;
        rv0 rv0 = this.x;
        switch (i) {
            case b85.b:
                rv0.reportFullyDrawn();
                return vs7.a;
            case 1:
                return new rr2(rv0.B, new iv0(rv0, 0));
            case 2:
                ? obj = new Object();
                rv0.getNavigationEventDispatcher().b(obj);
                return obj;
            case 3:
                Application application = rv0.getApplication();
                if (rv0.getIntent() != null) {
                    bundle = rv0.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new jf6(application, rv0, bundle);
            default:
                v45 v45 = new v45(new hv0(rv0, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!sg3.e(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new ga(8, (Object) rv0, (Object) v45));
                    } else {
                        rv0.w.x0(new jv0(v45, rv0));
                    }
                }
                return v45;
        }
    }
}
