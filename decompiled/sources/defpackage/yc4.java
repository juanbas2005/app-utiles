package defpackage;

import java.util.Arrays;

/* renamed from: yc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yc4 implements tp1 {
    public boolean w;
    public long x = 9223372034707292159L;
    public long y = 0;
    public final /* synthetic */ dd4 z;

    public yc4(dd4 dd4) {
        this.z = dd4;
    }

    public final float Y() {
        return this.z.Y();
    }

    public final dy3 a() {
        this.w = true;
        dd4 dd4 = this.z;
        dy3 B0 = dd4.B0();
        if (oe3.a(this.x, 9223372034707292159L)) {
            this.x = gr8.V(B0.w(0));
            this.y = B0.k();
        }
        dd4.G0().b0.b();
        return B0;
    }

    public final float b() {
        return this.z.b();
    }

    public final void c(k23 k23, float f) {
        dd4 dd4 = this.z;
        ao aoVar = dd4.M;
        if (aoVar == null) {
            aoVar = new ao();
            dd4.M = aoVar;
        }
        int c1 = qs.c1(k23, (k23[]) aoVar.b);
        if (c1 < 0) {
            int i = aoVar.a;
            k23[] k23Arr = (k23[]) aoVar.b;
            if (i == k23Arr.length) {
                int i2 = i * 2;
                aoVar.b = (k23[]) Arrays.copyOf(k23Arr, i2);
                aoVar.c = Arrays.copyOf((float[]) aoVar.c, i2);
                aoVar.d = Arrays.copyOf((byte[]) aoVar.d, i2);
            }
            ((k23[]) aoVar.b)[i] = k23;
            ((byte[]) aoVar.d)[i] = 3;
            ((float[]) aoVar.c)[i] = f;
            aoVar.a++;
            return;
        }
        float[] fArr = (float[]) aoVar.c;
        if (fArr[c1] == f) {
            byte[] bArr = (byte[]) aoVar.d;
            if (bArr[c1] == 2) {
                bArr[c1] = 0;
                return;
            }
            return;
        }
        fArr[c1] = f;
        ((byte[]) aoVar.d)[c1] = 1;
    }
}
