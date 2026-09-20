package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

/* renamed from: kv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kv6 extends o2 {
    public static final kv6 x = new kv6(new Object[0]);
    public final Object[] w;

    public kv6(Object[] objArr) {
        this.w = objArr;
    }

    public final int f() {
        return this.w.length;
    }

    public final o2 g(int i, Object obj) {
        Object[] objArr = this.w;
        bb0.W(i, objArr.length);
        if (i == objArr.length) {
            return k(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[(objArr.length + 1)];
            qs.N0(0, i, 6, objArr, objArr2);
            qs.K0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new kv6(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        qs.K0(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new gg5(copyOf, objArr3, objArr.length + 1, 0);
    }

    public final Object get(int i) {
        Object[] objArr = this.w;
        bb0.V(i, objArr.length);
        return objArr[i];
    }

    public final int indexOf(Object obj) {
        return qs.c1(obj, this.w);
    }

    public final o2 k(Object obj) {
        Object[] objArr = this.w;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new kv6(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new gg5(objArr, objArr2, objArr.length + 1, 0);
    }

    public final o2 l(Collection collection) {
        Object[] objArr = this.w;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new kv6(copyOf);
        }
        hg5 n = n();
        n.addAll(collection);
        return n.k();
    }

    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.w;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        Object[] objArr = this.w;
        bb0.W(i, objArr.length);
        return new uc0(objArr, i, objArr.length);
    }

    public final hg5 n() {
        return new hg5(this, (Object[]) null, this.w, 0);
    }

    public final o2 o(n2 n2Var) {
        Object[] objArr = this.w;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) n2Var.y(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return x;
        }
        return new kv6(qs.Q0(objArr2, 0, length));
    }

    public final o2 p(int i) {
        Object[] objArr = this.w;
        bb0.V(i, objArr.length);
        if (objArr.length == 1) {
            return x;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        qs.K0(i, i + 1, objArr.length, objArr, copyOf);
        return new kv6(copyOf);
    }

    public final o2 s(int i, Object obj) {
        Object[] objArr = this.w;
        bb0.V(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new kv6(copyOf);
    }
}
