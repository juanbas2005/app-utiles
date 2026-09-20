package defpackage;

/* renamed from: vm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vm8 {
    public final pk8 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public vm8(pk8 pk8, String str, Object[] objArr) {
        this.a = pk8;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public final int a() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
