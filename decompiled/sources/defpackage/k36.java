package defpackage;

import java.util.Map;

/* renamed from: k36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k36 extends s93 {
    public final transient Object[] A;
    public final transient int B;
    public final transient n36 z;

    public k36(n36 n36, Object[] objArr, int i) {
        this.z = n36;
        this.A = objArr;
        this.B = i;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.z.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int f(Object[] objArr) {
        return d().f(objArr);
    }

    public final boolean n() {
        return true;
    }

    public final at7 o() {
        return d().listIterator(0);
    }

    public final int size() {
        return this.B;
    }

    public final q93 v() {
        return new j36(this);
    }
}
