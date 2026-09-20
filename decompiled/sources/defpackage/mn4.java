package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: mn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mn4 implements rw5 {
    public static final rw5[] c = new rw5[0];
    public Map a;
    public rw5[] b;

    public final n66 a(qc3 qc3, Map map) {
        c(map);
        return b(qc3);
    }

    public final n66 b(qc3 qc3) {
        rw5[] rw5Arr = this.b;
        if (rw5Arr != null) {
            int length = rw5Arr.length;
            int i = 0;
            while (i < length) {
                try {
                    return rw5Arr[i].a(qc3, this.a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.y;
    }

    public final void c(Map map) {
        boolean z;
        Collection collection;
        boolean z2;
        this.a = map;
        if (map == null || !map.containsKey(fk1.z)) {
            z = false;
        } else {
            z = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(fk1.y);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(d50.K) || collection.contains(d50.L) || collection.contains(d50.D) || collection.contains(d50.C) || collection.contains(d50.x) || collection.contains(d50.y) || collection.contains(d50.z) || collection.contains(d50.A) || collection.contains(d50.E) || collection.contains(d50.I) || collection.contains(d50.J)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new ln4(map, 0));
            }
            if (collection.contains(d50.H)) {
                arrayList.add(new le1(2));
            }
            if (collection.contains(d50.B)) {
                arrayList.add(new le1(0));
            }
            if (collection.contains(d50.w)) {
                arrayList.add(new t95(1));
            }
            if (collection.contains(d50.G)) {
                arrayList.add(new t95(0));
            }
            if (collection.contains(d50.F)) {
                arrayList.add(new le1(1));
            }
            if (z2 && z) {
                arrayList.add(new ln4(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new ln4(map, 0));
            }
            arrayList.add(new le1(2));
            arrayList.add(new le1(0));
            arrayList.add(new t95(1));
            arrayList.add(new t95(0));
            arrayList.add(new le1(1));
            if (z) {
                arrayList.add(new ln4(map, 0));
            }
        }
        this.b = (rw5[]) arrayList.toArray(c);
    }

    public final void reset() {
        rw5[] rw5Arr = this.b;
        if (rw5Arr != null) {
            for (rw5 reset : rw5Arr) {
                reset.reset();
            }
        }
    }
}
