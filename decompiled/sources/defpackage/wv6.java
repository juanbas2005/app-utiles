package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: wv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv6 extends m2 {
    public static final /* synthetic */ int y = 0;
    public Object w;
    public int x;

    public wv6(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean add(Object obj) {
        Object[] objArr;
        int i = this.x;
        if (i == 0) {
            this.w = obj;
        } else {
            Object obj2 = this.w;
            if (i == 1) {
                if (sg3.e(obj2, obj)) {
                    return false;
                }
                this.w = new Object[]{this.w, obj};
            } else if (i < 5) {
                obj2.getClass();
                Object[] objArr2 = (Object[]) obj2;
                if (qs.F0(obj, objArr2)) {
                    return false;
                }
                int i2 = this.x;
                if (i2 == 4) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(copyOf.length));
                    qs.k1(copyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    objArr = linkedHashSet;
                } else {
                    Object[] copyOf2 = Arrays.copyOf(objArr2, i2 + 1);
                    copyOf2[copyOf2.length - 1] = obj;
                    objArr = copyOf2;
                }
                this.w = objArr;
            } else {
                obj2.getClass();
                if (!mp7.P(obj2).add(obj)) {
                    return false;
                }
            }
        }
        this.x++;
        return true;
    }

    public final void clear() {
        this.w = null;
        this.x = 0;
    }

    public final boolean contains(Object obj) {
        if (f() == 0) {
            return false;
        }
        if (f() == 1) {
            return sg3.e(this.w, obj);
        }
        int f = f();
        Object obj2 = this.w;
        if (f < 5) {
            obj2.getClass();
            return qs.F0(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    public final int f() {
        return this.x;
    }

    public final Iterator iterator() {
        int i = this.x;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.w;
        if (i == 1) {
            return new el6(1, obj);
        }
        if (i < 5) {
            obj.getClass();
            return new bg5((Object[]) obj);
        }
        obj.getClass();
        return mp7.P(obj).iterator();
    }
}
