package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: in7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class in7 {
    public static volatile zd1 e;
    public final es0 a;
    public final es0 b;
    public final en1 c;
    public final z00 d;

    public in7(es0 es0, es0 es02, en1 en1, z00 z00, no7 no7) {
        this.a = es0;
        this.b = es02;
        this.c = en1;
        this.d = z00;
        ((Executor) no7.x).execute(new y0(28, no7));
    }

    public static in7 a() {
        zd1 zd1 = e;
        if (zd1 != null) {
            return (in7) zd1.B.get();
        }
        h.s("Not initialized!");
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, er] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (in7.class) {
                try {
                    if (e == null) {
                        ? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final dn7 c(hg0 hg0) {
        Set set;
        byte[] bArr;
        if (hg0 instanceof hg0) {
            set = Collections.unmodifiableSet(hg0.d);
        } else {
            set = Collections.singleton(new m42("proto"));
        }
        wr0 a2 = u10.a();
        hg0.getClass();
        a2.x = "cct";
        String str = hg0.a;
        String str2 = hg0.b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.y = bArr;
        return new dn7(set, a2.o(), this);
    }
}
