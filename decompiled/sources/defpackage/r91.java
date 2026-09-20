package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: r91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r91 {
    public final cw0 a;

    public r91(cw0 cw0) {
        this.a = cw0;
    }

    public final void a(l10 l10) {
        cw0 cw0 = this.a;
        HashSet<t86> hashSet = l10.a;
        ArrayList arrayList = new ArrayList(et0.e0(hashSet, 10));
        for (t86 t86 : hashSet) {
            String str = ((j10) t86).b;
            j10 j10 = (j10) t86;
            String str2 = j10.d;
            String str3 = j10.e;
            String str4 = j10.c;
            long j = j10.f;
            ji8 ji8 = u86.a;
            if (str3.length() > 256) {
                str3 = str3.substring(0, 256);
            }
            arrayList.add(new k10(str, str2, str3, str4, j));
        }
        synchronized (((v86) cw0.B)) {
            try {
                if (((v86) cw0.B).b(arrayList)) {
                    ((ya1) ((wr0) cw0.x).y).a(new e66(4, cw0, ((v86) cw0.B).a()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", (Throwable) null);
        }
    }
}
