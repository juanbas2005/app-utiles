package defpackage;

/* renamed from: sp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sp4 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public sp4(sp4 sp4) {
        this.a = 1;
        this.b = sp4.b;
        this.c = sp4.c;
        this.d = sp4.d;
        this.e = sp4.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        boolean z;
        boolean z2 = false;
        if (this.b >= this.d) {
            z = true;
        } else {
            z = false;
        }
        if (this.c >= this.e) {
            z2 = true;
        }
        return z | z2;
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += intBitsToFloat;
        this.c += intBitsToFloat2;
        this.d += intBitsToFloat;
        this.e += intBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case b85.b:
                String Y = gr8.Y(this.b);
                String Y2 = gr8.Y(this.c);
                return pb4.n(f21.o("MutableRect(", Y, ", ", Y2, ", "), gr8.Y(this.d), ", ", gr8.Y(this.e), ")");
            default:
                return "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]";
        }
    }

    public sp4(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public sp4() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
