package defpackage;

/* renamed from: i10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i10 {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final j10 a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
            return new j10(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((this.f & 1) == 0) {
            sb.append(" templateVersion");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
