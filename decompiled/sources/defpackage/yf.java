package defpackage;

import android.content.Context;

/* renamed from: yf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yf {
    public final Context a;
    public final tp1 b;
    public final long c;
    public final la5 d;

    public yf(Context context, tp1 tp1, long j, la5 la5) {
        this.a = context;
        this.b = tp1;
        this.c = j;
        this.d = la5;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!yf.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        yf yfVar = (yf) obj;
        if (sg3.e(this.a, yfVar.a) && sg3.e(this.b, yfVar.b) && jt0.c(this.c, yfVar.c) && sg3.e(this.d, yfVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = jt0.h;
        return this.d.hashCode() + pb4.b((hashCode + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
