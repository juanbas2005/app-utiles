package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: hg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg5 extends l2 implements Collection, br3 {
    public jv2 A = new jv2(4);
    public Object[] B;
    public Object[] C;
    public int D;
    public o2 w;
    public Object[] x;
    public Object[] y;
    public int z;

    public hg5(o2 o2Var, Object[] objArr, Object[] objArr2, int i) {
        this.w = o2Var;
        this.x = objArr;
        this.y = objArr2;
        this.z = i;
        this.B = objArr;
        this.C = objArr2;
        this.D = o2Var.f();
    }

    public static void l(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.A;
        return objArr;
    }

    public final Object[] B(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            vm5.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int u = t35.u(i, i2);
        Object[] objArr2 = objArr[u];
        objArr2.getClass();
        Object B2 = B(objArr2, i, i2 - 5);
        if (u < 31) {
            int i3 = u + 1;
            if (objArr[i3] != null) {
                if (v(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] z2 = z();
                qs.K0(0, 0, i3, objArr, z2);
                objArr = z2;
            }
        }
        if (B2 == objArr[u]) {
            return objArr;
        }
        Object[] x2 = x(objArr);
        x2[u] = B2;
        return x2;
    }

    public final Object[] C(Object[] objArr, int i, int i2, b5 b5Var) {
        Object[] objArr2;
        int u = t35.u(i2 - 1, i);
        if (i == 5) {
            b5Var.a = objArr[u];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[u];
            objArr3.getClass();
            objArr2 = C(objArr3, i - 5, i2, b5Var);
        }
        if (objArr2 == null && u == 0) {
            return null;
        }
        Object[] x2 = x(objArr);
        x2[u] = objArr2;
        return x2;
    }

    public final void D(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.B = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.C = objArr;
            this.D = i;
            this.z = i2;
            return;
        }
        b5 b5Var = new b5((Object) null);
        objArr.getClass();
        Object[] C2 = C(objArr, i2, i, b5Var);
        C2.getClass();
        Object obj = b5Var.a;
        obj.getClass();
        this.C = (Object[]) obj;
        this.D = i;
        if (C2[1] == null) {
            this.B = (Object[]) C2[0];
            this.z = i2 - 5;
            return;
        }
        this.B = C2;
        this.z = i2;
    }

    public final Object[] E(Object[] objArr, int i, int i2, Iterator it) {
        boolean z2;
        if (!it.hasNext()) {
            vm5.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            vm5.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] x2 = x(objArr);
        int u = t35.u(i, i2);
        int i3 = i2 - 5;
        x2[u] = E((Object[]) x2[u], i, i3, it);
        while (true) {
            u++;
            if (u >= 32 || !it.hasNext()) {
                return x2;
            }
            x2[u] = E((Object[]) x2[u], 0, i3, it);
        }
        return x2;
    }

    public final Object[] F(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArr3;
        e2 e2Var = new e2((Object[]) objArr2);
        int i2 = i >> 5;
        int i3 = this.z;
        if (i2 < (1 << i3)) {
            objArr3 = E(objArr, i, i3, e2Var);
        } else {
            objArr3 = x(objArr);
        }
        while (e2Var.hasNext()) {
            this.z += 5;
            objArr3 = A(objArr3);
            int i4 = this.z;
            E(objArr3, 1 << i4, i4, e2Var);
        }
        return objArr3;
    }

    public final void G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.D;
        int i2 = i >> 5;
        int i3 = this.z;
        if (i2 > (1 << i3)) {
            this.B = H(this.z + 5, A(objArr), objArr2);
            this.C = objArr3;
            this.z += 5;
            this.D++;
        } else if (objArr == null) {
            this.B = objArr2;
            this.C = objArr3;
            this.D = i + 1;
        } else {
            this.B = H(i3, objArr, objArr2);
            this.C = objArr3;
            this.D++;
        }
    }

    public final Object[] H(int i, Object[] objArr, Object[] objArr2) {
        int u = t35.u(f() - 1, i);
        Object[] x2 = x(objArr);
        if (i == 5) {
            x2[u] = objArr2;
            return x2;
        }
        x2[u] = H(i - 5, (Object[]) x2[u], objArr2);
        return x2;
    }

    public final int I(vr2 vr2, Object[] objArr, int i, int i2, b5 b5Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] z2;
        if (v(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = b5Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) vr2.y(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        z2 = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        z2 = z();
                    }
                    objArr3 = z2;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        b5Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int J(vr2 vr2, Object[] objArr, int i, b5 b5Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z2 = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) vr2.y(obj)).booleanValue()) {
                if (!z2) {
                    objArr2 = x(objArr);
                    z2 = true;
                    i2 = i3;
                }
            } else if (z2) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        b5Var.a = objArr2;
        return i2;
    }

    public final int K(vr2 vr2, int i, b5 b5Var) {
        int J = J(vr2, this.C, i, b5Var);
        Object obj = b5Var.a;
        if (J == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, J, i, (Object) null);
        this.C = objArr;
        this.D -= i - J;
        return J;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0 != r8) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (K(r1, r8, r5) != r8) goto L_0x0018;
     */
    public final boolean L(vr2 vr2) {
        int i;
        vr2 vr22 = vr2;
        int R = R();
        Object[] objArr = null;
        b5 b5Var = new b5((Object) null);
        boolean z2 = false;
        if (this.B != null) {
            i2 w2 = w(0);
            int i2 = 32;
            while (i2 == 32 && w2.hasNext()) {
                i2 = J(vr22, (Object[]) w2.next(), 32, b5Var);
            }
            if (i2 == 32) {
                int K = K(vr22, R, b5Var);
                if (K == 0) {
                    D(this.B, this.D, this.z);
                }
            } else {
                int i3 = (w2.w - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (w2.hasNext()) {
                    i4 = I(vr22, (Object[]) w2.next(), 32, i4, b5Var, arrayList2, arrayList);
                    vr22 = vr2;
                }
                int I = I(vr2, this.C, R, i4, b5Var, arrayList2, arrayList);
                Object obj = b5Var.a;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, I, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.B;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = E(objArr3, i3, this.z, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    vm5.a("invalid size");
                }
                if (size == 0) {
                    this.z = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.z;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.z = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = B(objArr3, i5, i);
                }
                this.B = objArr;
                this.C = objArr2;
                this.D = size + I;
            }
        }
        z2 = true;
        if (z2) {
            this.modCount++;
        }
        return z2;
    }

    public final Object[] M(Object[] objArr, int i, int i2, b5 b5Var) {
        int u = t35.u(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[u];
            Object[] x2 = x(objArr);
            qs.K0(u, u + 1, 32, objArr, x2);
            x2[31] = b5Var.a;
            b5Var.a = obj;
            return x2;
        }
        if (objArr[31] == null) {
            i3 = t35.u(O() - 1, i);
        }
        Object[] x3 = x(objArr);
        int i4 = i - 5;
        int i5 = u + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = x3[i3];
                obj2.getClass();
                x3[i3] = M((Object[]) obj2, i4, 0, b5Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = x3[u];
        obj3.getClass();
        x3[u] = M((Object[]) obj3, i4, i2, b5Var);
        return x3;
    }

    public final Object N(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.D - i;
        Object[] objArr2 = this.C;
        if (i4 == 1) {
            Object obj = objArr2[0];
            D(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] x2 = x(objArr2);
        qs.K0(i3, i3 + 1, i4, objArr2, x2);
        x2[i4 - 1] = null;
        this.B = objArr;
        this.C = x2;
        this.D = (i + i4) - 1;
        this.z = i2;
        return obj2;
    }

    public final int O() {
        int i = this.D;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & -32;
    }

    public final Object[] P(Object[] objArr, int i, int i2, Object obj, b5 b5Var) {
        int u = t35.u(i2, i);
        Object[] x2 = x(objArr);
        if (i == 0) {
            if (x2 != objArr) {
                this.modCount++;
            }
            b5Var.a = x2[u];
            x2[u] = obj;
            return x2;
        }
        Object obj2 = x2[u];
        obj2.getClass();
        x2[u] = P((Object[]) obj2, i - 5, i2, obj, b5Var);
        return x2;
    }

    public final void Q(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        if (i3 < 1) {
            vm5.a("requires at least one nullBuffer");
        }
        Object[] x2 = x(objArr);
        objArr2[0] = x2;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            qs.K0(size + 1, i4, i2, x2, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArr4 = x2;
            } else {
                objArr4 = z();
                i3--;
                objArr2[i3] = objArr4;
            }
            int i7 = i2 - i6;
            qs.K0(0, i7, i2, x2, objArr3);
            qs.K0(size + 1, i4, i7, x2, objArr4);
            objArr3 = objArr4;
        }
        Iterator it = collection.iterator();
        l(x2, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] z2 = z();
            l(z2, 0, it);
            objArr2[i8] = z2;
        }
        l(objArr3, 0, it);
    }

    public final int R() {
        int i = this.D;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & -32);
    }

    public final void add(int i, Object obj) {
        bb0.W(i, f());
        if (i == f()) {
            add(obj);
            return;
        }
        this.modCount++;
        int O = O();
        if (i >= O) {
            s(this.B, i - O, obj);
            return;
        }
        b5 b5Var = new b5((Object) null);
        Object[] objArr = this.B;
        objArr.getClass();
        s(p(objArr, this.z, i, obj, b5Var), 0, b5Var.a);
    }

    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        Collection collection2;
        bb0.W(i, this.D);
        if (i == this.D) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.D - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr2 = this.C;
            Object[] x2 = x(objArr2);
            qs.K0(size2 + 1, i3, R(), objArr2, x2);
            l(x2, i3, collection.iterator());
            this.C = x2;
            this.D = collection.size() + this.D;
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int R = R();
        int size3 = collection.size() + this.D;
        if (size3 > 32) {
            size3 -= (size3 - 1) & -32;
        }
        if (i >= O()) {
            objArr = z();
            collection2 = collection;
            int i4 = size;
            Object[][] objArr4 = objArr3;
            Q(collection2, i, this.C, R, objArr4, i4, objArr);
            objArr3 = objArr4;
        } else {
            collection2 = collection;
            Object[] objArr5 = this.C;
            if (size3 > R) {
                int i5 = size3 - R;
                Object[] y2 = y(i5, objArr5);
                Object[][] objArr6 = objArr3;
                o(collection2, i, i5, objArr6, size, y2);
                objArr3 = objArr6;
                objArr = y2;
            } else {
                objArr = z();
                int i6 = R - size3;
                qs.K0(0, i6, R, objArr5, objArr);
                int i7 = 32 - i6;
                Object[] y3 = y(i7, this.C);
                int i8 = size - 1;
                objArr3[i8] = y3;
                Collection collection3 = collection2;
                o(collection3, i, i7, objArr3, i8, y3);
                collection2 = collection3;
            }
        }
        this.B = F(this.B, i2, objArr3);
        this.C = objArr;
        this.D = collection2.size() + this.D;
        return true;
    }

    public final int f() {
        return this.D;
    }

    public final Object g(int i) {
        bb0.V(i, f());
        this.modCount++;
        int O = O();
        if (i >= O) {
            return N(this.B, O, this.z, i - O);
        }
        b5 b5Var = new b5(this.C[0]);
        Object[] objArr = this.B;
        objArr.getClass();
        N(M(objArr, this.z, i, b5Var), O, this.z, 0);
        return b5Var.a;
    }

    public final Object get(int i) {
        Object[] objArr;
        bb0.V(i, f());
        if (O() <= i) {
            objArr = this.C;
        } else {
            Object[] objArr2 = this.B;
            objArr2.getClass();
            for (int i2 = this.z; i2 > 0; i2 -= 5) {
                Object obj = objArr2[t35.u(i, i2)];
                obj.getClass();
                objArr2 = (Object[]) obj;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final o2 k() {
        o2 o2Var;
        Object[] objArr = this.B;
        if (objArr == this.x && this.C == this.y) {
            o2Var = this.w;
        } else {
            this.A = new jv2(4);
            this.x = objArr;
            Object[] objArr2 = this.C;
            this.y = objArr2;
            if (objArr != null) {
                o2Var = new gg5(objArr, objArr2, this.D, this.z);
            } else if (objArr2.length == 0) {
                o2Var = kv6.x;
            } else {
                o2Var = new kv6(Arrays.copyOf(objArr2, this.D));
            }
        }
        this.w = o2Var;
        return o2Var;
    }

    public final ListIterator listIterator(int i) {
        bb0.W(i, this.D);
        return new jg5(this, i);
    }

    public final int n() {
        return this.modCount;
    }

    public final void o(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.B != null) {
            int i4 = i >> 5;
            i2 w2 = w(O() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (w2.w - 1 != i4) {
                Object[] objArr4 = (Object[]) w2.previous();
                qs.K0(0, 32 - i2, 32, objArr4, objArr3);
                objArr3 = y(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) w2.previous();
            int O = i3 - (((O() >> 5) - 1) - i4);
            if (O < i3) {
                objArr2 = objArr[O];
                objArr2.getClass();
            }
            Q(collection, i, objArr5, 32, objArr, O, objArr2);
            return;
        }
        h.s("root is null");
    }

    public final Object[] p(Object[] objArr, int i, int i2, Object obj, b5 b5Var) {
        Object obj2;
        int u = t35.u(i2, i);
        if (i == 0) {
            b5Var.a = objArr[31];
            Object[] x2 = x(objArr);
            qs.K0(u + 1, u, 31, objArr, x2);
            x2[u] = obj;
            return x2;
        }
        Object[] x3 = x(objArr);
        int i3 = i - 5;
        Object obj3 = x3[u];
        obj3.getClass();
        b5 b5Var2 = b5Var;
        x3[u] = p((Object[]) obj3, i3, i2, obj, b5Var2);
        while (true) {
            u++;
            if (u >= 32 || (obj2 = x3[u]) == null) {
                return x3;
            }
            x3[u] = p((Object[]) obj2, i3, 0, b5Var2.a, b5Var2);
        }
        return x3;
    }

    public final boolean removeAll(Collection collection) {
        return L(new n2(1, collection));
    }

    public final void s(Object[] objArr, int i, Object obj) {
        int R = R();
        Object[] x2 = x(this.C);
        Object[] objArr2 = this.C;
        if (R < 32) {
            qs.K0(i + 1, i, R, objArr2, x2);
            x2[i] = obj;
            this.B = objArr;
            this.C = x2;
            this.D++;
            return;
        }
        Object obj2 = objArr2[31];
        qs.K0(i + 1, i, 31, objArr2, x2);
        x2[i] = obj;
        G(objArr, x2, A(obj2));
    }

    public final Object set(int i, Object obj) {
        bb0.V(i, f());
        if (O() <= i) {
            Object[] x2 = x(this.C);
            if (x2 != this.C) {
                this.modCount++;
            }
            int i2 = i & 31;
            Object obj2 = x2[i2];
            x2[i2] = obj;
            this.C = x2;
            return obj2;
        }
        b5 b5Var = new b5((Object) null);
        Object[] objArr = this.B;
        objArr.getClass();
        this.B = P(objArr, this.z, i, obj, b5Var);
        return b5Var.a;
    }

    public final boolean v(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.A) {
            return true;
        }
        return false;
    }

    public final i2 w(int i) {
        Object[] objArr = this.B;
        if (objArr != null) {
            int O = O() >> 5;
            bb0.W(i, O);
            int i2 = this.z;
            if (i2 == 0) {
                return new uc0(i, objArr);
            }
            return new qn7(objArr, i, O, i2 / 5);
        }
        h.s("Invalid root");
        return null;
    }

    public final Object[] x(Object[] objArr) {
        if (objArr == null) {
            return z();
        }
        if (v(objArr)) {
            return objArr;
        }
        Object[] z2 = z();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        qs.N0(0, length, 6, objArr, z2);
        return z2;
    }

    public final Object[] y(int i, Object[] objArr) {
        if (v(objArr)) {
            qs.K0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] z2 = z();
        qs.K0(i, 0, 32 - i, objArr, z2);
        return z2;
    }

    public final Object[] z() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A;
        return objArr;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean add(Object obj) {
        this.modCount++;
        int R = R();
        if (R < 32) {
            Object[] x2 = x(this.C);
            x2[R] = obj;
            this.C = x2;
            this.D = f() + 1;
        } else {
            G(this.B, this.C, A(obj));
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int R = R();
        Iterator it = collection.iterator();
        if (32 - R >= collection.size()) {
            Object[] x2 = x(this.C);
            l(x2, R, it);
            this.C = x2;
            this.D = collection.size() + this.D;
            return true;
        }
        int size = ((collection.size() + R) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] x3 = x(this.C);
        l(x3, R, it);
        objArr[0] = x3;
        for (int i = 1; i < size; i++) {
            Object[] z2 = z();
            l(z2, 0, it);
            objArr[i] = z2;
        }
        this.B = F(this.B, O(), objArr);
        Object[] z3 = z();
        l(z3, 0, it);
        this.C = z3;
        this.D = collection.size() + this.D;
        return true;
    }
}
