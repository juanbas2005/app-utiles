package defpackage;

/* renamed from: uc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uc0 extends i2 {
    public final /* synthetic */ int y = 1;
    public final Object z;

    public uc0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.z = objArr;
    }

    public final Object next() {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case b85.b:
                if (hasNext()) {
                    int i2 = this.w;
                    this.w = i2 + 1;
                    return ((Object[]) obj)[i2];
                }
                rf2.c();
                return null;
            default:
                if (hasNext()) {
                    this.w++;
                    return obj;
                }
                rf2.c();
                return null;
        }
    }

    public final Object previous() {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case b85.b:
                if (hasPrevious()) {
                    int i2 = this.w - 1;
                    this.w = i2;
                    return ((Object[]) obj)[i2];
                }
                rf2.c();
                return null;
            default:
                if (hasPrevious()) {
                    this.w--;
                    return obj;
                }
                rf2.c();
                return null;
        }
    }

    public uc0(int i, Object obj) {
        super(i, 1);
        this.z = obj;
    }
}
