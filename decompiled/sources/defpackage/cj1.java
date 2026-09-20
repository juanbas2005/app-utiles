package defpackage;

/* renamed from: cj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj1 implements m78 {
    public final f96 A = new f96(15, (Object) this);
    public final vf1 w;
    public final int x;
    public final int y;
    public final int z;

    public cj1(vf1 vf1) {
        this.w = vf1;
        String str = vf1.a;
        char c = vf1.b;
        this.x = d57.F0(str, c, 0, 6);
        this.y = d57.L0(str, c, 0, 6);
        this.z = vf1.c.length();
    }

    public final tl7 e(vl vlVar) {
        int length = vlVar.x.length();
        String str = vlVar.x;
        int i = 0;
        int i2 = this.z;
        if (length > i2) {
            re3 V = z65.V(0, i2);
            str.getClass();
            V.getClass();
            str = str.substring(V.w, V.x + 1);
        }
        String str2 = "";
        int i3 = 0;
        while (i < str.length()) {
            int i4 = i3 + 1;
            str2 = str2 + str.charAt(i);
            if (i4 == this.x || i3 + 2 == this.y) {
                str2 = str2 + this.w.b;
            }
            i++;
            i3 = i4;
        }
        return new tl7(new vl(str2), this.A);
    }
}
