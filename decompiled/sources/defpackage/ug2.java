package defpackage;

/* renamed from: ug2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ug2 extends vg2 {
    public final mf3[] d;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ug2(int i, mf3[] mf3Arr) {
        super(i, r2, 0, (byte) 0);
        if (mf3Arr != null) {
            int i2 = 1;
            int length = mf3Arr.length - 1;
            if (length != 0) {
                int i3 = 31;
                while (i3 >= 0) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    } else {
                        i3--;
                    }
                }
                rf2.y("Empty enum: ", mf3Arr.getClass());
                throw null;
            }
            this.d = mf3Arr;
            return;
        }
        h.q("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        throw null;
    }

    public final Object e(int i) {
        int i2 = this.b;
        int i3 = (i & (((1 << this.c) - 1) << i2)) >> i2;
        for (mf3 mf3 : this.d) {
            if (mf3.a() == i3) {
                return mf3;
            }
        }
        return null;
    }
}
