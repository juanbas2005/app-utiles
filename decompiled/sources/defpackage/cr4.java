package defpackage;

import java.util.List;

/* renamed from: cr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cr4 implements mc2 {
    public final vt7 a;
    public final List b;
    public final String c;

    public cr4(vt7 vt7, List list, String str) {
        vt7.getClass();
        this.a = vt7;
        this.b = list;
        this.c = str;
        int size = list.size();
        int i = (vt7.c - vt7.b) + 1;
        if (size != i) {
            StringBuilder sb = new StringBuilder("The number of values (");
            sb.append(list.size());
            sb.append(") in ");
            sb.append(list);
            sb.append(" does not match the range of the field (");
            h.j(f21.j(sb, i, ')'));
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        return new Object();
    }

    public final qd5 b() {
        br4 br4 = new br4(0, (Object) this);
        StringBuilder sb = new StringBuilder("one of ");
        List list = this.b;
        sb.append(list);
        sb.append(" for ");
        sb.append(this.c);
        return new qd5(sg3.D(new v47(list, br4, sb.toString())), a42.w);
    }

    public final /* bridge */ /* synthetic */ g1 c() {
        return this.a;
    }
}
