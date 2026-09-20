package defpackage;

/* renamed from: m23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m23 implements pq6 {
    public static final m23 b = new m23(0);
    public static final m23 c = new m23(1);
    public final /* synthetic */ int a;

    public /* synthetic */ m23(int i) {
        this.a = i;
    }

    public final n85 a(long j, ey3 ey3, tp1 tp1) {
        switch (this.a) {
            case b85.b:
                float r0 = (float) tp1.r0(30.0f);
                return new l85(new ly5(0.0f, -r0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + r0));
            case 1:
                float r02 = (float) tp1.r0(30.0f);
                return new l85(new ly5(-r02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + r02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new l85(z85.c(0, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
