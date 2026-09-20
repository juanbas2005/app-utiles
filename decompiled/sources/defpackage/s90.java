package defpackage;

/* renamed from: s90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s90 extends vb5 {
    public final hg A;
    public final long B;
    public int C = 1;
    public final long D;
    public float E;
    public lt0 F;

    public s90(hg hgVar, long j) {
        int i;
        this.A = hgVar;
        this.B = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > hgVar.a.getWidth() || i > hgVar.a.getHeight()) {
            h.q("Failed requirement.");
            throw null;
        }
        this.D = j;
        this.E = 1.0f;
    }

    public final void d(float f) {
        this.E = f;
    }

    public final void e(lt0 lt0) {
        this.F = lt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s90)) {
            return false;
        }
        s90 s90 = (s90) obj;
        if (sg3.e(this.A, s90.A) && oe3.a(0, 0) && we3.a(this.B, s90.B) && this.C == s90.C) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.C) + pb4.b(pb4.b(this.A.hashCode() * 31, 31, 0), 31, this.B);
    }

    public final long i() {
        return pv8.O(this.D);
    }

    public final void j(wy3 wy3) {
        tk0 tk0 = wy3.w;
        int round = Math.round(Float.intBitsToFloat((int) (tk0.e() >> 32)));
        float f = this.E;
        lt0 lt0 = this.F;
        int i = this.C;
        wy3 wy32 = wy3;
        hz1.G(wy32, this.A, this.B, (((long) round) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (tk0.e() & 4294967295L)))) & 4294967295L), f, lt0, i, 328);
    }

    public final String toString() {
        String str;
        String d = oe3.d(0);
        String b = we3.b(this.B);
        int i = this.C;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else if (i == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.A);
        sb.append(", srcOffset=");
        sb.append(d);
        sb.append(", srcSize=");
        return pb4.n(sb, b, ", filterQuality=", str, ")");
    }
}
