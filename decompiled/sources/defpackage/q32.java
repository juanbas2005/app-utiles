package defpackage;

/* renamed from: q32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q32 implements aa3 {
    public final boolean w;

    public q32(boolean z) {
        this.w = z;
    }

    public final boolean l() {
        return this.w;
    }

    public final zz4 m() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.w) {
            str = "Active";
        } else {
            str = "New";
        }
        return hl6.o(sb, str, '}');
    }
}
