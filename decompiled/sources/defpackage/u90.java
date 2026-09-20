package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: u90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u90 extends lt0 {
    public final long b;
    public final int c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public u90(long j, int i) {
        super(r0);
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            nd.h();
            colorFilter = nd.e(uq3.M(j), bb0.A0(i));
        } else {
            colorFilter = new PorterDuffColorFilter(uq3.M(j), bb0.C0(i));
        }
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90 = (u90) obj;
        if (jt0.c(this.b, u90.b) && this.c == u90.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return pb4.m("BlendModeColorFilter(color=", jt0.i(this.b), ", blendMode=", rj1.L(this.c), ")");
    }
}
