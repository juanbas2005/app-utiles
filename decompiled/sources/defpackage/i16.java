package defpackage;

import java.util.Collection;

/* renamed from: i16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i16 extends c16 implements ci3 {
    public final up2 a;

    public i16(up2 up2) {
        up2.getClass();
        this.a = up2;
    }

    public final n06 a(up2 up2) {
        up2.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i16)) {
            return false;
        }
        if (sg3.e(this.a, ((i16) obj).a)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return a42.w;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i16.class.getName() + ": " + this.a;
    }
}
