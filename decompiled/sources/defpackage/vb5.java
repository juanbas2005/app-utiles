package defpackage;

/* renamed from: vb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vb5 {
    public kb9 w;
    public lt0 x;
    public float y = 1.0f;
    public ey3 z = ey3.w;

    public abstract void d(float f);

    public abstract void e(lt0 lt0);

    public final void g(wy3 wy3, long j, float f, lt0 lt0) {
        tk0 tk0 = wy3.w;
        if (this.y != f) {
            d(f);
            this.y = f;
        }
        if (!sg3.e(this.x, lt0)) {
            e(lt0);
            this.x = lt0;
        }
        ey3 layoutDirection = wy3.getLayoutDirection();
        if (this.z != layoutDirection) {
            f(layoutDirection);
            this.z = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (tk0.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (tk0.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((ji8) tk0.x.x).y(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    j(wy3);
                }
            } catch (Throwable th) {
                ((ji8) tk0.x.x).y(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th;
            }
        }
        ((ji8) tk0.x.x).y(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(wy3 wy3);

    public void f(ey3 ey3) {
    }
}
