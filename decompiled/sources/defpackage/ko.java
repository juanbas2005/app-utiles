package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* renamed from: ko  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ko {
    public static Boolean A = null;
    public static boolean B = false;
    public static final os C = new os(0);
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static final ol6 w = new ol6(new gv1(1));
    public static final int x = -100;
    public static za4 y = null;
    public static za4 z = null;

    public static void a() {
        za4 za4;
        os osVar = C;
        osVar.getClass();
        es esVar = new es(osVar);
        while (esVar.hasNext()) {
            ko koVar = (ko) ((WeakReference) esVar.next()).get();
            if (koVar != null) {
                wo woVar = (wo) koVar;
                Context context = woVar.G;
                if (d(context) && (za4 = y) != null && !za4.equals(z)) {
                    w.execute(new ho(context, 1));
                }
                woVar.o(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        os osVar = C;
        osVar.getClass();
        es esVar = new es(osVar);
        while (esVar.hasNext()) {
            ko koVar = (ko) ((WeakReference) esVar.next()).get();
            if (koVar != null && (context = ((wo) koVar).G) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean d(Context context) {
        if (A == null) {
            try {
                int i = AppLocalesMetadataHolderService.w;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), pq.a() | 128).metaData;
                if (bundle != null) {
                    A = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                A = Boolean.FALSE;
            }
        }
        return A.booleanValue();
    }

    public static void h(wo woVar) {
        synchronized (D) {
            try {
                os osVar = C;
                osVar.getClass();
                es esVar = new es(osVar);
                while (esVar.hasNext()) {
                    ko koVar = (ko) ((WeakReference) esVar.next()).get();
                    if (koVar == woVar || koVar == null) {
                        esVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        return;
     */
    public static void n(Context context) {
        if (d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (E) {
                    try {
                        za4 za4 = y;
                        if (za4 == null) {
                            if (z == null) {
                                z = za4.a(rd3.I(context));
                            }
                            if (!z.b()) {
                                y = z;
                            }
                        } else if (!za4.equals(z)) {
                            za4 za42 = y;
                            z = za42;
                            rd3.D(context, za42.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!B) {
                w.execute(new ho(context, 0));
            }
        }
    }

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean i(int i);

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
