package defpackage;

/* renamed from: a00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a00 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final b00 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new b00(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
