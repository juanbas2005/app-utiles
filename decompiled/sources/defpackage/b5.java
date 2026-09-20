package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: b5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b5 {
    public static b5 b;
    public Object a;

    public b5() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new yx(2, this));
    }

    public /* synthetic */ b5(Object obj) {
        this.a = obj;
    }
}
