package defpackage;

/* renamed from: n  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n extends m {
    public abstract void u(int i, StringBuilder sb);

    public abstract int v(int i);

    public final void w(StringBuilder sb, int i, int i2) {
        int C = wr0.C(i, i2, (i90) ((wr0) this.b).x);
        u(C, sb);
        int v = v(C);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (v / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(v);
    }
}
