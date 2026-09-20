package defpackage;

/* renamed from: zs3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs3 {
    public static final zs3 b = new zs3(63, (vr2) null);
    public final vr2 a;

    public zs3(int i, vr2 vr2) {
        this.a = (i & 32) != 0 ? null : vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zs3) && this.a == ((zs3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        vr2 vr2 = this.a;
        if (vr2 != null) {
            return vr2.hashCode();
        }
        return 0;
    }
}
