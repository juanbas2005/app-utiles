package defpackage;

import android.util.Log;

/* renamed from: ac4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ac4 extends yb4 {
    public final tu0 a = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, tu0] */
    public ac4(kw5 kw5) {
    }

    public final void a(hq6 hq6, String str, String str2, Throwable th) {
        str2.getClass();
        if (th == null) {
            try {
                int ordinal = hq6.ordinal();
                if (ordinal == 0) {
                    Log.v(str2, str);
                } else if (ordinal == 1) {
                    Log.d(str2, str);
                } else if (ordinal == 2) {
                    Log.i(str2, str);
                } else if (ordinal == 3) {
                    Log.w(str2, str);
                } else if (ordinal == 4) {
                    Log.e(str2, str);
                } else if (ordinal == 5) {
                    Log.println(7, str2, str);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception unused) {
                this.a.a(hq6, str, str2, th);
            }
        } else {
            int ordinal2 = hq6.ordinal();
            if (ordinal2 == 0) {
                Log.v(str2, str, th);
            } else if (ordinal2 == 1) {
                Log.d(str2, str, th);
            } else if (ordinal2 == 2) {
                Log.i(str2, str, th);
            } else if (ordinal2 == 3) {
                Log.w(str2, str, th);
            } else if (ordinal2 == 4) {
                Log.e(str2, str, th);
            } else if (ordinal2 == 5) {
                Log.println(7, str2, str + 10 + Log.getStackTraceString(th));
            } else {
                throw new RuntimeException();
            }
        }
    }
}
