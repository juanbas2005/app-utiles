package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: js  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class js extends zt6 implements Map {
    public fs A;
    public hs B;
    public ds z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public js(zt6 zt6) {
        super(0);
        int i = zt6.y;
        b(this.y + i);
        if (this.y != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(zt6.g(i2), zt6.j(i2));
            }
        } else if (i > 0) {
            qs.J0(0, 0, i, zt6.w, this.w);
            qs.K0(0, 0, i << 1, zt6.x, this.x);
            this.y = i;
        }
    }

    public final Set entrySet() {
        ds dsVar = this.z;
        if (dsVar != null) {
            return dsVar;
        }
        ds dsVar2 = new ds(0, this);
        this.z = dsVar2;
        return dsVar2;
    }

    public final boolean k(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final Set keySet() {
        fs fsVar = this.A;
        if (fsVar != null) {
            return fsVar;
        }
        fs fsVar2 = new fs(this);
        this.A = fsVar2;
        return fsVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.y;
        for (Object remove : collection) {
            super.remove(remove);
        }
        if (i != this.y) {
            return true;
        }
        return false;
    }

    public final void putAll(Map map) {
        b(map.size() + this.y);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        hs hsVar = this.B;
        if (hsVar != null) {
            return hsVar;
        }
        hs hsVar2 = new hs(this);
        this.B = hsVar2;
        return hsVar2;
    }

    public js() {
        super(0);
    }
}
