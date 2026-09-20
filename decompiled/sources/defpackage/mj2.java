package defpackage;

/* renamed from: mj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj2 {
    public int a;
    public long b;
    public int c;
    public Object d;

    public mj2(pj2 pj2, long j, int i, int i2) {
        this.d = pj2;
        this.b = j;
        this.a = i;
        this.c = i2;
    }

    public static /* synthetic */ String c(int i, int i2, byte b2, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b2 + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public gw8 a(lj2 lj2, boolean z, int i, int i2, int i3, int i4) {
        if (!lj2.b) {
            return null;
        }
        ((pj2) this.d).getClass();
        return null;
    }

    public lj2 b(boolean z, int i, long j, ie3 ie3, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i;
        ie3 ie32 = ie3;
        int i6 = i2;
        int i7 = i4;
        int i8 = this.a;
        int i9 = this.c;
        long j2 = this.b;
        pj2 pj2 = (pj2) this.d;
        int i10 = i3 + i7;
        if (ie32 == null) {
            return new lj2(true, true);
        }
        long j3 = ie32.a;
        pj2.getClass();
        if (i6 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new lj2(true, true);
        }
        if (i5 == 0 || (i5 < Integer.MAX_VALUE && ((int) (j >> 32)) - ((int) (j3 >> 32)) >= 0)) {
            Math.max(i7, (int) (j3 & 4294967295L));
            return new lj2(false, false);
        } else if (z2) {
            return new lj2(true, true);
        } else {
            long a2 = ie3.a(k31.h(j2), (((int) (j & 4294967295L)) - i9) - i7);
            int i11 = i6 + 1;
            long j4 = a2;
            return new lj2(true, b(z, 0, j4, new ie3(ie3.a(((int) (j3 >> 32)) - i8, (int) (j3 & 4294967295L))), i11, i10, 0, true, false).b);
        }
    }

    public mj2(gl8 gl8) {
        gl8.getClass();
    }
}
