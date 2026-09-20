package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ts8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts8 extends os8 {
    public final transient n36 B;
    public final transient Object[] C;
    public final transient int D;

    public ts8(n36 n36, Object[] objArr, int i) {
        super(1);
        this.B = n36;
        this.C = objArr;
        this.D = i;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.B.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return x().listIterator(0);
    }

    public final int o(Object[] objArr) {
        return x().o(objArr);
    }

    public final int size() {
        return this.D;
    }

    public final at7 v() {
        return x().listIterator(0);
    }

    public final hs8 y() {
        return new ss8(this);
    }
}
