package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: gs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gs implements Iterator, Map.Entry {
    public int w;
    public int x = -1;
    public boolean y;
    public final /* synthetic */ js z;

    public gs(js jsVar) {
        this.z = jsVar;
        this.w = jsVar.y - 1;
    }

    public final boolean equals(Object obj) {
        if (this.y) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.x;
                js jsVar = this.z;
                if (!sg3.e(key, jsVar.g(i)) || !sg3.e(entry.getValue(), jsVar.j(this.x))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        h.s("This container does not support retaining Map.Entry objects");
        return false;
    }

    public final Object getKey() {
        if (this.y) {
            return this.z.g(this.x);
        }
        h.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final Object getValue() {
        if (this.y) {
            return this.z.j(this.x);
        }
        h.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final boolean hasNext() {
        if (this.x < this.w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.y) {
            int i3 = this.x;
            js jsVar = this.z;
            Object g = jsVar.g(i3);
            Object j = jsVar.j(this.x);
            if (g == null) {
                i = 0;
            } else {
                i = g.hashCode();
            }
            if (j != null) {
                i2 = j.hashCode();
            }
            return i ^ i2;
        }
        h.s("This container does not support retaining Map.Entry objects");
        return 0;
    }

    public final Object next() {
        if (hasNext()) {
            this.x++;
            this.y = true;
            return this;
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        if (this.y) {
            this.z.h(this.x);
            this.x--;
            this.w--;
            this.y = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.y) {
            return this.z.i(this.x, obj);
        }
        h.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
