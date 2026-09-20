package defpackage;

/* renamed from: qz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qz {
    public long a;
    public String b;
    public ha1 c;
    public ia1 d;
    public ja1 e;
    public ma1 f;
    public byte g;

    public final rz a() {
        String str;
        ha1 ha1;
        ia1 ia1;
        if (this.g == 1 && (str = this.b) != null && (ha1 = this.c) != null && (ia1 = this.d) != null) {
            return new rz(this.a, str, ha1, ia1, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
