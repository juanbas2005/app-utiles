package defpackage;

/* renamed from: uo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uo4 extends qc1 {
    public final void g(jk5 jk5, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long i3 = jk5.i(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (i3 >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & i3));
    }
}
