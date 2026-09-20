package defpackage;

/* renamed from: f00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f00 {
    public h00 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final g00 a() {
        h00 h00;
        String str;
        String str2;
        if (this.e == 1 && (h00 = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new g00(h00, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
