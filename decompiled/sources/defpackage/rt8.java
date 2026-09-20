package defpackage;

import java.util.Set;

/* renamed from: rt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rt8 extends nk8 implements Set {
    public static final /* synthetic */ int B = 0;
    public transient mt8 A;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof rt8) && (this instanceof ou8) && (((rt8) obj) instanceof ou8) && ((ou8) this).D != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() != set.size() || !containsAll(set)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int hashCode() {
        return t75.M(this);
    }

    public mt8 v() {
        mt8 mt8 = this.A;
        if (mt8 != null) {
            return mt8;
        }
        mt8 w = w();
        this.A = w;
        return w;
    }

    public mt8 w() {
        Object[] array = toArray(nk8.z);
        vs8 vs8 = mt8.A;
        return mt8.x(array.length, array);
    }
}
