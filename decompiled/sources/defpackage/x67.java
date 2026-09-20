package defpackage;

/* renamed from: x67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x67 extends pr6 implements b37 {
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.D;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.E + ((long) ((int) ((p() + ((long) this.G)) - this.E)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.D;
            objArr.getClass();
            r(Integer.valueOf(((Number) objArr[((int) ((this.E + ((long) ((int) ((p() + ((long) this.G)) - this.E)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
