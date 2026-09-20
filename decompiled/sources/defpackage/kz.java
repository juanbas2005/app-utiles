package defpackage;

import java.util.List;

/* renamed from: kz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kz {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public y91 g;
    public pa1 h;
    public oa1 i;
    public z91 j;
    public List k;
    public int l;
    public byte m;

    public final lz a() {
        String str;
        String str2;
        y91 y91;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (y91 = this.g) != null) {
            return new lz(str, str2, this.c, this.d, this.e, this.f, y91, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        h.s(f21.i("Missing required properties:", sb));
        return null;
    }
}
