package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: yf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class yf5 extends AbstractMap implements Map, er3 {
    public int A;
    public int B;
    public wf5 w;
    public jv2 x = new jv2(4);
    public rn7 y;
    public Object z;

    public yf5(wf5 wf5) {
        this.w = wf5;
        this.y = wf5.w;
        this.B = wf5.x;
    }

    public wf5 a() {
        rn7 rn7 = this.y;
        wf5 wf5 = this.w;
        if (rn7 != wf5.w) {
            this.x = new jv2(4);
            wf5 = new wf5(this.y, c());
        }
        this.w = wf5;
        return wf5;
    }

    public /* bridge */ wf5 b() {
        return a();
    }

    public final int c() {
        return this.B;
    }

    public final void clear() {
        this.y = rn7.e;
        e(0);
    }

    public boolean containsKey(Object obj) {
        int i;
        rn7 rn7 = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return rn7.d(i, 0, obj);
    }

    public final void e(int i) {
        this.B = i;
        this.A++;
    }

    public final Set entrySet() {
        return new ag5(0, this);
    }

    public Object get(Object obj) {
        int i;
        rn7 rn7 = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return rn7.g(i, 0, obj);
    }

    public final Set keySet() {
        return new ag5(1, this);
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        this.z = null;
        rn7 rn7 = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.y = rn7.l(i, obj, obj2, 0, this);
        return this.z;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [sp1, java.lang.Object] */
    public final void putAll(Map map) {
        wf5 wf5;
        yf5 yf5;
        wf5 wf52 = null;
        if (map instanceof wf5) {
            wf5 = (wf5) map;
        } else {
            wf5 = null;
        }
        if (wf5 == null) {
            if (map instanceof yf5) {
                yf5 = (yf5) map;
            } else {
                yf5 = null;
            }
            if (yf5 != null) {
                wf52 = yf5.a();
            }
        } else {
            wf52 = wf5;
        }
        if (wf52 != null) {
            ? obj = new Object();
            obj.a = 0;
            int i = this.B;
            rn7 rn7 = this.y;
            rn7 rn72 = wf52.w;
            rn72.getClass();
            this.y = rn7.m(rn72, 0, obj, this);
            int i2 = (wf52.x + i) - obj.a;
            if (i != i2) {
                e(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public final boolean remove(Object obj, Object obj2) {
        int i;
        int c = c();
        rn7 rn7 = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        rn7 o = rn7.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = rn7.e;
        }
        this.y = o;
        if (c != c()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final Collection values() {
        return new em0(2, this);
    }

    public Object remove(Object obj) {
        this.z = null;
        rn7 n = this.y.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = rn7.e;
        }
        this.y = n;
        return this.z;
    }
}
