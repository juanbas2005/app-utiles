package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.Iterator;

/* renamed from: n20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n20 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Context x;

    public /* synthetic */ n20(Context context, int i) {
        this.w = i;
        this.x = context;
    }

    public final Object b() {
        Object obj;
        Object obj2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Context context = this.x;
        switch (i) {
            case b85.b:
                b30.q(context, "https://facebook.com/UtilEsSoft");
                return vs7;
            case 1:
                b30.q(context, "https://www.apputiles.com");
                return vs7;
            case 2:
                b30.q(context, "mailto:utilessoft@gmail.com");
                return vs7;
            case 3:
                b30.q(context, "https://t.me/UtilESCuba");
                return vs7;
            case 4:
                b30.q(context, "https://wa.me/5359723665");
                return vs7;
            case 5:
                b30.q(context, "https://x.com/UtilEs_App");
                return vs7;
            case 6:
                return mp7.T(context, "user_preferences.json");
            case 7:
                File T = mp7.T(context, "firebaseSessions/sessionConfigsDataStore.data");
                g22.t(T);
                return T;
            case 8:
                File T2 = mp7.T(context, "firebaseSessions/sessionDataStore.data");
                g22.t(T2);
                return T2;
            case 9:
                Iterator it = sg3.E(new ComponentName("com.android.phone", "com.android.phone.settings.RadioInfo"), new ComponentName("com.android.settings", "com.android.settings.RadioInfo")).iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            context.startActivity(new Intent("android.intent.action.MAIN").setComponent((ComponentName) it.next()));
                            obj2 = vs7;
                        } catch (Throwable th) {
                            obj2 = new m66(th);
                        }
                        if (!(obj2 instanceof m66)) {
                        }
                    } else {
                        try {
                            context.startActivity(new Intent("android.settings.DATA_ROAMING_SETTINGS"));
                            obj = vs7;
                        } catch (Throwable th2) {
                            obj = new m66(th2);
                        }
                        if (o66.a(obj) != null) {
                            try {
                                context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return vs7;
            default:
                return rd3.m(context);
        }
    }
}
