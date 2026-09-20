package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: de6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class de6 implements Iterable {
    public ae6 w;
    public ae6 x;
    public final WeakHashMap y = new WeakHashMap();
    public int z = 0;

    public final Object d(g35 g35, e94 e94) {
        ae6 ae6 = this.w;
        while (ae6 != null && !ae6.w.equals(g35)) {
            ae6 = ae6.y;
        }
        if (ae6 != null) {
            return ae6.x;
        }
        ae6 ae62 = new ae6(g35, e94);
        this.z++;
        ae6 ae63 = this.x;
        if (ae63 == null) {
            this.w = ae62;
            this.x = ae62;
            return null;
        }
        ae63.y = ae62;
        ae62.z = ae63;
        this.x = ae62;
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((defpackage.zd6) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        return false;
     */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof de6)) {
            return false;
        }
        de6 de6 = (de6) obj;
        if (this.z != de6.z) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = de6.iterator();
        while (true) {
            zd6 zd6 = (zd6) it;
            if (!zd6.hasNext()) {
                break;
            }
            zd6 zd62 = (zd6) it2;
            if (!zd62.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zd6.next();
            Object next = zd62.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            zd6 zd6 = (zd6) it;
            if (!zd6.hasNext()) {
                return i;
            }
            i += ((Map.Entry) zd6.next()).hashCode();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, zd6] */
    public final Iterator iterator() {
        ae6 ae6 = this.w;
        ae6 ae62 = this.x;
        ? obj = new Object();
        obj.w = ae62;
        obj.x = ae6;
        this.y.put(obj, Boolean.FALSE);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            zd6 zd6 = (zd6) it;
            if (zd6.hasNext()) {
                sb.append(((Map.Entry) zd6.next()).toString());
                if (zd6.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
