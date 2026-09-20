package defpackage;

import android.graphics.Bitmap;

/* renamed from: m28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m28 extends u18 {
    public final sx2 b;
    public String c = "";
    public boolean d = true;
    public final dz1 e = new dz1();
    public sr2 f = vy0.M;
    public final ed5 g = u55.p((Object) null);
    public u90 h;
    public final ed5 i = u55.p(new wu6(0));
    public long j = 9205357640488583168L;
    public float k = 1.0f;
    public float l = 1.0f;
    public final l28 m = new l28(this, 1);

    public m28(sx2 sx2) {
        this.b = sx2;
        sx2.i = new l28(this, 0);
    }

    public final void a(hz1 hz1) {
        e(hz1, 1.0f, (lt0) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r3 != r8) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        if (r9.d == r3) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    public final void e(hz1 hz1, float f2, lt0 lt0) {
        int i2;
        dz1 dz1;
        lt0 lt02;
        lt0 lt03;
        u90 u90;
        long j2;
        boolean z;
        hg hgVar;
        int i3;
        int i4;
        int i5;
        lt0 lt04 = lt0;
        sx2 sx2 = this.b;
        boolean z2 = sx2.d;
        ed5 ed5 = this.g;
        if (z2 && sx2.e != 16) {
            lt0 lt05 = (lt0) ed5.getValue();
            int i6 = e38.a;
            if (!(lt05 instanceof u90) ? lt05 == null : (i5 = ((u90) lt05).c) == 5 || i5 == 3) {
                if (!(lt04 instanceof u90) ? lt04 == null : (i4 = ((u90) lt04).c) == 5 || i4 == 3) {
                    i2 = 1;
                    boolean z3 = this.d;
                    dz1 = this.e;
                    if (!z3 && wu6.a(this.j, hz1.e())) {
                        hgVar = dz1.a;
                        if (hgVar == null) {
                            i3 = hgVar.a();
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i2 == 1) {
                        long j3 = sx2.e;
                        int i7 = e38.a;
                        if (jt0.d(j3) != 1.0f) {
                            j3 = jt0.b(1.0f, j3);
                        }
                        u90 = new u90(j3, 5);
                    } else {
                        u90 = null;
                    }
                    this.h = u90;
                    float intBitsToFloat = Float.intBitsToFloat((int) (hz1.e() >> 32));
                    ed5 ed52 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((wu6) ed52.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (hz1.e() & 4294967295L)) / Float.intBitsToFloat((int) (((wu6) ed52.getValue()).a & 4294967295L));
                    long ceil = (((long) ((int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (hz1.e() >> 32)))))) << 32) | (((long) ((int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (hz1.e() & 4294967295L)))))) & 4294967295L);
                    ey3 layoutDirection = hz1.getLayoutDirection();
                    hg hgVar2 = dz1.a;
                    od odVar = dz1.b;
                    if (hgVar2 == null || odVar == null) {
                        z = true;
                        j2 = 4294967295L;
                    } else {
                        int i8 = (int) (ceil >> 32);
                        Bitmap bitmap = hgVar2.a;
                        z = true;
                        j2 = 4294967295L;
                        if (i8 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    hgVar2 = gl0.G((int) (ceil >> (z ? 1 : 0)), (int) (ceil & j2), i2);
                    odVar = gr8.d(hgVar2);
                    dz1.a = hgVar2;
                    dz1.b = odVar;
                    dz1.d = i2;
                    dz1.c = ceil;
                    tk0 tk0 = dz1.e;
                    long O = pv8.O(ceil);
                    sk0 sk0 = tk0.w;
                    tp1 tp1 = sk0.a;
                    ey3 ey3 = sk0.b;
                    qk0 qk0 = sk0.c;
                    long j4 = sk0.d;
                    sk0.a = hz1;
                    sk0.b = layoutDirection;
                    od odVar2 = odVar;
                    sk0.c = odVar2;
                    sk0.d = O;
                    odVar2.h();
                    hz1.f0(tk0, jt0.b, 0, 0, 0.0f, 62);
                    this.m.y(tk0);
                    odVar2.p();
                    sk0 sk02 = tk0.w;
                    sk02.a = tp1;
                    sk02.b = ey3;
                    sk02.c = qk0;
                    sk02.d = j4;
                    hgVar2.a.prepareToDraw();
                    this.d = false;
                    this.j = hz1.e();
                    if (lt04 != null) {
                        lt02 = lt04;
                    } else {
                        if (((lt0) ed5.getValue()) != null) {
                            lt03 = (lt0) ed5.getValue();
                        } else {
                            lt03 = this.h;
                        }
                        lt02 = lt03;
                    }
                    hg hgVar3 = dz1.a;
                    if (hgVar3 == null) {
                        yb3.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    hz1.G(hz1, hgVar3, dz1.c, 0, f2, lt02, 0, 858);
                    return;
                }
            }
        }
        i2 = 0;
        boolean z32 = this.d;
        dz1 = this.e;
        hgVar = dz1.a;
        if (hgVar == null) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        ed5 ed5 = this.i;
        sb.append(Float.intBitsToFloat((int) (((wu6) ed5.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((wu6) ed5.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
