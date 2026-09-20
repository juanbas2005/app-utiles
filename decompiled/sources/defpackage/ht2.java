package defpackage;

/* renamed from: ht2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ht2 {
    public final up2 a;
    public final String b;
    public final int c;

    public ht2(up2 up2, String str, int i) {
        up2.getClass();
        this.a = up2;
        this.b = str;
        this.c = i;
    }

    public final uq4 a(int i) {
        return uq4.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return hl6.o(sb, this.b, 'N');
    }
}
