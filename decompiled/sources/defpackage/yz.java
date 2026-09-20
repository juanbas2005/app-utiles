package defpackage;

/* renamed from: yz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yz {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final zz a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new zz(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
