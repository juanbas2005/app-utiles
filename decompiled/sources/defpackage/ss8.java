package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: ss8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ss8 extends hs8 {
    public final /* synthetic */ ts8 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss8(ts8 ts8) {
        super(1);
        this.B = ts8;
    }

    public final /* synthetic */ Object get(int i) {
        ts8 ts8 = this.B;
        l55.B(i, ts8.D);
        Object[] objArr = ts8.C;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.B.D;
    }
}
