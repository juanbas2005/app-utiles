package defpackage;

/* renamed from: lg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lg5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public lg5(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.b = f5;
        this.c = f8;
        this.d = f3;
        this.e = f6;
        this.f = f9;
        this.g = f4;
        this.h = f7;
        this.i = f10;
    }

    public static lg5 a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        lg5 b2 = b(f2, f3, f4, f5, f6, f7, f8, f9);
        float f18 = b2.e;
        float f19 = b2.i;
        float f20 = b2.f;
        float f21 = b2.h;
        float f22 = (f18 * f19) - (f20 * f21);
        float f23 = b2.g;
        float f24 = b2.d;
        float f25 = (f20 * f23) - (f24 * f19);
        float f26 = (f24 * f21) - (f18 * f23);
        float f27 = b2.c;
        float f28 = b2.b;
        float f29 = (f27 * f21) - (f28 * f19);
        float f30 = b2.a;
        float f31 = (f19 * f30) - (f27 * f23);
        float f32 = (f23 * f28) - (f21 * f30);
        float f33 = (f28 * f20) - (f27 * f18);
        float f34 = (f27 * f24) - (f20 * f30);
        float f35 = (f30 * f18) - (f28 * f24);
        lg5 b3 = b(f10, f11, f12, f13, f14, f15, f16, f17);
        float f36 = b3.a;
        float f37 = b3.d;
        float f38 = b3.g;
        float f39 = (f38 * f33) + (f37 * f29) + (f36 * f22);
        float f40 = (f38 * f34) + (f37 * f31) + (f36 * f25);
        float f41 = f38 * f35;
        float f42 = f41 + (f37 * f32) + (f36 * f26);
        float f43 = b3.b;
        float f44 = f35;
        float f45 = b3.e;
        float f46 = b3.h;
        float f47 = (f46 * f33) + (f45 * f29) + (f43 * f22);
        float f48 = (f45 * f31) + (f43 * f25);
        float f49 = f46 * f44;
        float f50 = f49 + (f45 * f32) + (f43 * f26);
        float f51 = b3.c;
        float f52 = b3.f;
        float f53 = f29 * f52;
        float f54 = b3.i;
        float f55 = f33 * f54;
        float f56 = f31 * f52;
        float f57 = f34 * f54;
        return new lg5(f39, f40, f42, f47, (f46 * f34) + f48, f50, f55 + f53 + (f22 * f51), f57 + f56 + (f25 * f51), (f54 * f44) + (f52 * f32) + (f51 * f26));
    }

    public static lg5 b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = ((f2 - f4) + f6) - f8;
        float f11 = ((f3 - f5) + f7) - f9;
        if (f10 == 0.0f && f11 == 0.0f) {
            return new lg5(f4 - f2, f6 - f4, f2, f5 - f3, f7 - f5, f3, 0.0f, 0.0f, 1.0f);
        }
        float f12 = f4 - f6;
        float f13 = f8 - f6;
        float f14 = f5 - f7;
        float f15 = f9 - f7;
        float f16 = (f12 * f15) - (f13 * f14);
        float f17 = ((f15 * f10) - (f13 * f11)) / f16;
        float f18 = ((f12 * f11) - (f10 * f14)) / f16;
        return new lg5((f17 * f4) + (f4 - f2), (f18 * f8) + (f8 - f2), f2, (f17 * f5) + (f5 - f3), (f18 * f9) + (f9 - f3), f3, f17, f18, 1.0f);
    }
}
