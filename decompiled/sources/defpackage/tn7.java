package defpackage;

/* renamed from: tn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tn7 extends sn7 {
    public final /* synthetic */ int z;

    public /* synthetic */ tn7(int i) {
        this.z = i;
    }

    public final Object next() {
        switch (this.z) {
            case b85.b:
                int i = this.y;
                this.y = i + 2;
                Object[] objArr = this.w;
                return new bf4(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.y;
                this.y = i2 + 2;
                return this.w[i2];
            default:
                int i3 = this.y;
                this.y = i3 + 2;
                return this.w[i3 + 1];
        }
    }
}
