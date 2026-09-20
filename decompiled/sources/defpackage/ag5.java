package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ag5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ag5 extends m2 {
    public final /* synthetic */ int w;
    public final yf5 x;

    public /* synthetic */ ag5(int i, yf5 yf5) {
        this.w = i;
        this.x = yf5;
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b /*0*/:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.w) {
            case b85.b /*0*/:
                this.x.clear();
                return;
            default:
                this.x.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.w) {
            case b85.b /*0*/:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                yf5 yf5 = this.x;
                Object obj2 = yf5.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !yf5.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.x.containsKey(obj);
        }
    }

    public final int f() {
        switch (this.w) {
            case b85.b /*0*/:
                return this.x.c();
            default:
                return this.x.c();
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b /*0*/:
                return new bg5(this.x);
            default:
                sn7[] sn7Arr = new sn7[8];
                for (int i = 0; i < 8; i++) {
                    sn7Arr[i] = new tn7(1);
                }
                return new zf5(this.x, sn7Arr);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.w) {
            case b85.b /*0*/:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.x.remove(entry.getKey(), entry.getValue());
            default:
                yf5 yf5 = this.x;
                if (!yf5.containsKey(obj)) {
                    return false;
                }
                yf5.remove(obj);
                return true;
        }
    }
}
