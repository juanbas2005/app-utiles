package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: j36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j36 extends q93 {
    public final /* synthetic */ k36 y;

    public j36(k36 k36) {
        this.y = k36;
    }

    public final Object get(int i) {
        k36 k36 = this.y;
        g75.j(i, k36.B);
        Object[] objArr = k36.A;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.y.B;
    }
}
