package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: tt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt8 extends rt8 {
    public final /* synthetic */ ut8 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tt8(ut8 ut8) {
        super(2);
        this.C = ut8;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.C.get(entry.getKey());
            if (obj2 == null || !obj2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return t75.M(this.C.entrySet());
    }

    public final /* synthetic */ Iterator iterator() {
        return v().listIterator(0);
    }

    public final at7 n() {
        return v().listIterator(0);
    }

    public final int size() {
        return this.C.z.size();
    }

    public final mt8 w() {
        return new st8(this);
    }
}
