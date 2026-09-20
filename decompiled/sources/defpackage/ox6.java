package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ox6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox6 implements Set, lr3 {
    public final ay6 w;
    public final /* synthetic */ int x;

    public ox6(ay6 ay6, int i) {
        this.x = i;
        this.w = ay6;
    }

    private final boolean f(Collection collection) {
        wf5 wf5;
        int i;
        ix6 j;
        boolean a;
        Set g1 = dt0.g1(collection);
        ay6 ay6 = this.w;
        boolean z = false;
        do {
            synchronized (h03.A0) {
                zx6 zx6 = ay6.w;
                zx6.getClass();
                zx6 zx62 = (zx6) nx6.h(zx6);
                wf5 = zx62.c;
                i = zx62.d;
            }
            wf5.getClass();
            yf5 b = wf5.b();
            Iterator it = ay6.x.iterator();
            while (((z1) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((m37) it).next();
                if (!g1.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            wf5 b2 = b.b();
            if (sg3.e(b2, wf5)) {
                break;
            }
            zx6 zx63 = ay6.w;
            zx63.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                a = ay6.a(ay6, (zx6) nx6.w(zx63, ay6, j), i, b2);
            }
            nx6.n(j, ay6);
        } while (!a);
        return z;
    }

    public final boolean add(Object obj) {
        switch (this.x) {
            case b85.b:
                Map.Entry entry = (Map.Entry) obj;
                h03.w();
                throw null;
            case 1:
                h03.w();
                throw null;
            default:
                h03.w();
                throw null;
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.x) {
            case b85.b:
                h03.w();
                throw null;
            case 1:
                h03.w();
                throw null;
            default:
                h03.w();
                throw null;
        }
    }

    public final void clear() {
        this.w.clear();
    }

    public final boolean contains(Object obj) {
        int i = this.x;
        ay6 ay6 = this.w;
        switch (i) {
            case b85.b:
                if (!mp7.b0(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return sg3.e(ay6.get(entry.getKey()), entry.getValue());
            case 1:
                return ay6.containsKey(obj);
            default:
                return ay6.containsValue(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        int i = this.x;
        ay6 ay6 = this.w;
        switch (i) {
            case b85.b:
                Iterable<Map.Entry> iterable = collection;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Map.Entry contains : iterable) {
                        if (!contains(contains)) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Iterable<Object> iterable2 = collection;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    for (Object containsKey : iterable2) {
                        if (!ay6.containsKey(containsKey)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Iterable<Object> iterable3 = collection;
                if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                    for (Object containsValue : iterable3) {
                        if (!ay6.containsValue(containsValue)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    public final Iterator iterator() {
        int i = this.x;
        ay6 ay6 = this.w;
        switch (i) {
            case b85.b:
                return new m37(ay6, ((t93) ay6.b().c.entrySet()).iterator(), 0);
            case 1:
                return new m37(ay6, ((t93) ay6.b().c.entrySet()).iterator(), 1);
            default:
                return new m37(ay6, ((t93) ay6.b().c.entrySet()).iterator(), 2);
        }
    }

    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.x;
        ay6 ay6 = this.w;
        switch (i) {
            case b85.b:
                if (mp7.b0(obj) && ay6.remove(((Map.Entry) obj).getKey()) != null) {
                    return true;
                }
                return false;
            case 1:
                if (ay6.remove(obj) != null) {
                    return true;
                }
                return false;
            default:
                Iterator it = ay6.x.iterator();
                while (true) {
                    if (((z1) it).hasNext()) {
                        obj2 = ((m37) it).next();
                        if (sg3.e(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                ay6.remove(entry.getKey());
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        wf5 wf5;
        int i;
        ix6 j;
        boolean a;
        boolean z = false;
        switch (this.x) {
            case b85.b:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            return z2;
                        }
                        if (this.w.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            return z3;
                        }
                        if (this.w.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                }
                break;
            default:
                Set g1 = dt0.g1(collection);
                ay6 ay6 = this.w;
                do {
                    synchronized (h03.A0) {
                        zx6 zx6 = ay6.w;
                        zx6.getClass();
                        zx6 zx62 = (zx6) nx6.h(zx6);
                        wf5 = zx62.c;
                        i = zx62.d;
                    }
                    wf5.getClass();
                    yf5 b = wf5.b();
                    Iterator it3 = ay6.x.iterator();
                    while (((z1) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((m37) it3).next();
                        if (g1.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    wf5 b2 = b.b();
                    if (!sg3.e(b2, wf5)) {
                        zx6 zx63 = ay6.w;
                        zx63.getClass();
                        synchronized (nx6.c) {
                            j = nx6.j();
                            a = ay6.a(ay6, (zx6) nx6.w(zx63, ay6, j), i, b2);
                        }
                        nx6.n(j, ay6);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    public final boolean retainAll(Collection collection) {
        wf5 wf5;
        int i;
        ix6 j;
        boolean a;
        wf5 wf52;
        int i2;
        ix6 j2;
        boolean a2;
        boolean z = false;
        switch (this.x) {
            case b85.b:
                Iterable<Map.Entry> iterable = collection;
                int F = tf4.F(et0.e0(iterable, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (Map.Entry entry : iterable) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                ay6 ay6 = this.w;
                do {
                    synchronized (h03.A0) {
                        zx6 zx6 = ay6.w;
                        zx6.getClass();
                        zx6 zx62 = (zx6) nx6.h(zx6);
                        wf5 = zx62.c;
                        i = zx62.d;
                    }
                    wf5.getClass();
                    yf5 b = wf5.b();
                    Iterator it = ay6.x.iterator();
                    while (((z1) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((m37) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !sg3.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    wf5 b2 = b.b();
                    if (!sg3.e(b2, wf5)) {
                        zx6 zx63 = ay6.w;
                        zx63.getClass();
                        synchronized (nx6.c) {
                            j = nx6.j();
                            a = ay6.a(ay6, (zx6) nx6.w(zx63, ay6, j), i, b2);
                        }
                        nx6.n(j, ay6);
                    }
                    return z;
                } while (!a);
                return z;
            case 1:
                return f(collection);
            default:
                Set g1 = dt0.g1(collection);
                ay6 ay62 = this.w;
                do {
                    synchronized (h03.A0) {
                        zx6 zx64 = ay62.w;
                        zx64.getClass();
                        zx6 zx65 = (zx6) nx6.h(zx64);
                        wf52 = zx65.c;
                        i2 = zx65.d;
                    }
                    wf52.getClass();
                    yf5 b3 = wf52.b();
                    Iterator it2 = ay62.x.iterator();
                    while (((z1) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((m37) it2).next();
                        if (!g1.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    wf5 b4 = b3.b();
                    if (!sg3.e(b4, wf52)) {
                        zx6 zx66 = ay62.w;
                        zx66.getClass();
                        synchronized (nx6.c) {
                            j2 = nx6.j();
                            a2 = ay6.a(ay62, (zx6) nx6.w(zx66, ay62, j2), i2, b4);
                        }
                        nx6.n(j2, ay62);
                    }
                    return z;
                } while (!a2);
                return z;
        }
    }

    public final int size() {
        return this.w.size();
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }
}
