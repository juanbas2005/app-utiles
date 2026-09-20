package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: ay6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ay6 implements n37, Map, er3 {
    public zx6 w;
    public final ox6 x;
    public final ox6 y;
    public final ox6 z;

    public ay6() {
        wf5 wf5 = wf5.y;
        ix6 j = nx6.j();
        zx6 zx6 = new zx6(j.g(), wf5);
        if (!(j instanceof ew2)) {
            zx6.b = new zx6(1, wf5);
        }
        this.w = zx6;
        this.x = new ox6(this, 0);
        this.y = new ox6(this, 1);
        this.z = new ox6(this, 2);
    }

    public static final boolean a(ay6 ay6, zx6 zx6, int i, wf5 wf5) {
        boolean z2;
        synchronized (h03.A0) {
            int i2 = zx6.d;
            if (i2 == i) {
                zx6.c = wf5;
                z2 = true;
                zx6.d = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final zx6 b() {
        zx6 zx6 = this.w;
        zx6.getClass();
        return (zx6) nx6.t(zx6, this);
    }

    public final void clear() {
        ix6 j;
        zx6 zx6 = this.w;
        zx6.getClass();
        wf5 wf5 = wf5.y;
        if (wf5 != ((zx6) nx6.h(zx6)).c) {
            zx6 zx62 = this.w;
            zx62.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                zx6 zx63 = (zx6) nx6.w(zx62, this, j);
                synchronized (h03.A0) {
                    zx63.c = wf5;
                    zx63.d++;
                }
            }
            nx6.n(j, this);
        }
    }

    public final boolean containsKey(Object obj) {
        return b().c.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return b().c.containsValue(obj);
    }

    public final Set entrySet() {
        return this.x;
    }

    public final Object get(Object obj) {
        return b().c.get(obj);
    }

    public final p37 getFirstStateRecord() {
        return this.w;
    }

    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    public final Set keySet() {
        return this.y;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.w = (zx6) p37;
    }

    public final Object put(Object obj, Object obj2) {
        wf5 wf5;
        int i;
        Object put;
        ix6 j;
        boolean a;
        do {
            synchronized (h03.A0) {
                zx6 zx6 = this.w;
                zx6.getClass();
                zx6 zx62 = (zx6) nx6.h(zx6);
                wf5 = zx62.c;
                i = zx62.d;
            }
            wf5.getClass();
            yf5 b = wf5.b();
            put = b.put(obj, obj2);
            wf5 b2 = b.b();
            if (sg3.e(b2, wf5)) {
                break;
            }
            zx6 zx63 = this.w;
            zx63.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                a = a(this, (zx6) nx6.w(zx63, this, j), i, b2);
            }
            nx6.n(j, this);
        } while (!a);
        return put;
    }

    public final void putAll(Map map) {
        wf5 wf5;
        int i;
        ix6 j;
        boolean a;
        do {
            synchronized (h03.A0) {
                zx6 zx6 = this.w;
                zx6.getClass();
                zx6 zx62 = (zx6) nx6.h(zx6);
                wf5 = zx62.c;
                i = zx62.d;
            }
            wf5.getClass();
            yf5 b = wf5.b();
            b.putAll(map);
            wf5 b2 = b.b();
            if (!sg3.e(b2, wf5)) {
                zx6 zx63 = this.w;
                zx63.getClass();
                synchronized (nx6.c) {
                    j = nx6.j();
                    a = a(this, (zx6) nx6.w(zx63, this, j), i, b2);
                }
                nx6.n(j, this);
            } else {
                return;
            }
        } while (!a);
    }

    public final Object remove(Object obj) {
        wf5 wf5;
        int i;
        Object remove;
        ix6 j;
        boolean a;
        do {
            synchronized (h03.A0) {
                zx6 zx6 = this.w;
                zx6.getClass();
                zx6 zx62 = (zx6) nx6.h(zx6);
                wf5 = zx62.c;
                i = zx62.d;
            }
            wf5.getClass();
            yf5 b = wf5.b();
            remove = b.remove(obj);
            wf5 b2 = b.b();
            if (sg3.e(b2, wf5)) {
                break;
            }
            zx6 zx63 = this.w;
            zx63.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                a = a(this, (zx6) nx6.w(zx63, this, j), i, b2);
            }
            nx6.n(j, this);
        } while (!a);
        return remove;
    }

    public final int size() {
        return b().c.size();
    }

    public final String toString() {
        zx6 zx6 = this.w;
        zx6.getClass();
        wf5 wf5 = ((zx6) nx6.h(zx6)).c;
        int hashCode = hashCode();
        return "SnapshotStateMap(value=" + wf5 + ")@" + hashCode;
    }

    public final Collection values() {
        return this.z;
    }
}
