package defpackage;

import android.graphics.LightingColorFilter;

/* renamed from: c64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c64 extends lt0 {
    public final long b;
    public final long c;

    public c64(long j, long j2) {
        super(new LightingColorFilter(uq3.M(j), uq3.M(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c64)) {
            return false;
        }
        c64 c64 = (c64) obj;
        if (jt0.c(this.b, c64.b) && jt0.c(this.c, c64.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return pb4.m("LightingColorFilter(multiply=", jt0.i(this.b), ", add=", jt0.i(this.c), ")");
    }
}
