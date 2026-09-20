package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: ln4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ln4 extends m55 {
    public static final m55[] c = new m55[0];
    public static final xr7[] d = new xr7[0];
    public final /* synthetic */ int a;
    public final m55[] b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Collection} */
    /* JADX WARNING: Multi-variable type inference failed */
    public ln4(Map map, int i) {
        boolean z;
        this.a = i;
        d50 d50 = d50.L;
        d50 d502 = d50.C;
        d50 d503 = d50.K;
        d50 d504 = d50.D;
        fk1 fk1 = fk1.y;
        Collection collection = null;
        switch (i) {
            case 1:
                collection = map != null ? map.get(fk1) : collection;
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(d504)) {
                        arrayList.add(new g12(0));
                    } else if (collection.contains(d503)) {
                        arrayList.add(new g12(3));
                    }
                    if (collection.contains(d502)) {
                        arrayList.add(new g12(2));
                    }
                    if (collection.contains(d50)) {
                        arrayList.add(new g12(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new g12(0));
                    arrayList.add(new g12(2));
                    arrayList.add(new g12(1));
                }
                this.b = (xr7[]) arrayList.toArray(d);
                return;
            default:
                collection = map != null ? map.get(fk1) : collection;
                if (map == null || map.get(fk1.C) == null) {
                    z = false;
                } else {
                    z = true;
                }
                ArrayList arrayList2 = new ArrayList();
                if (collection != null) {
                    if (collection.contains(d504) || collection.contains(d503) || collection.contains(d502) || collection.contains(d50)) {
                        arrayList2.add(new ln4(map, 1));
                    }
                    if (collection.contains(d50.y)) {
                        arrayList2.add(new qs0(z));
                    }
                    if (collection.contains(d50.z)) {
                        arrayList2.add(new rs0());
                    }
                    if (collection.contains(d50.A)) {
                        arrayList2.add(new Object());
                    }
                    if (collection.contains(d50.E)) {
                        arrayList2.add(new z73());
                    }
                    if (collection.contains(d50.x)) {
                        arrayList2.add(new os0());
                    }
                    if (collection.contains(d50.I)) {
                        arrayList2.add(new rv5());
                    }
                    if (collection.contains(d50.J)) {
                        arrayList2.add(new sv5());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new ln4(map, 1));
                    arrayList2.add(new qs0(false));
                    arrayList2.add(new os0());
                    arrayList2.add(new rs0());
                    arrayList2.add(new Object());
                    arrayList2.add(new z73());
                    arrayList2.add(new rv5());
                    arrayList2.add(new sv5());
                }
                this.b = (m55[]) arrayList2.toArray(c);
                return;
        }
    }

    public final n66 b(int i, i90 i90, Map map) {
        boolean z;
        Collection collection;
        boolean z2;
        int i2 = this.a;
        int i3 = 0;
        m55[] m55Arr = this.b;
        switch (i2) {
            case b85.b:
                while (i3 < m55Arr.length) {
                    try {
                        return m55Arr[i3].b(i, i90, map);
                    } catch (ReaderException unused) {
                        i3++;
                    }
                }
                throw NotFoundException.y;
            default:
                int[] m = xr7.m(i90);
                xr7[] xr7Arr = (xr7[]) m55Arr;
                int length = xr7Arr.length;
                int i4 = 0;
                while (i4 < length) {
                    try {
                        n66 k = xr7Arr[i4].k(i, i90, m, map);
                        if (k.d == d50.D && k.a.charAt(0) == '0') {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (map == null) {
                            collection = null;
                        } else {
                            collection = (Collection) map.get(fk1.y);
                        }
                        d50 d50 = d50.K;
                        if (collection != null) {
                            if (!collection.contains(d50)) {
                                z2 = false;
                                if (!z && z2) {
                                    n66 n66 = new n66(k.a.substring(1), k.b, k.c, d50);
                                    n66.a(k.e);
                                    return n66;
                                }
                            }
                        }
                        z2 = true;
                        return !z ? k : k;
                    } catch (ReaderException unused2) {
                        i4++;
                    }
                }
                throw NotFoundException.y;
        }
    }

    public final void reset() {
        int i = this.a;
        int i2 = 0;
        m55[] m55Arr = this.b;
        switch (i) {
            case b85.b:
                int length = m55Arr.length;
                while (i2 < length) {
                    m55Arr[i2].reset();
                    i2++;
                }
                return;
            default:
                xr7[] xr7Arr = (xr7[]) m55Arr;
                int length2 = xr7Arr.length;
                while (i2 < length2) {
                    xr7Arr[i2].getClass();
                    i2++;
                }
                return;
        }
    }
}
