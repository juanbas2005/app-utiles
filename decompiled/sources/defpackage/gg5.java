package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: gg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg5 extends o2 {
    public final Object[] w;
    public final Object[] x;
    public final int y;
    public final int z;

    public gg5(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z2;
        this.w = objArr;
        this.x = objArr2;
        this.y = i;
        this.z = i2;
        if (f() > 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int f = f();
            vm5.a("Trie-based persistent vector should have at least 33 elements, got " + f);
        }
        int length = objArr2.length;
    }

    public static Object[] D(int i, int i2, Object obj, Object[] objArr) {
        int u = t35.u(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[u] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[u];
        obj2.getClass();
        copyOf[u] = D(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    public static Object[] v(Object[] objArr, int i, int i2, Object obj, b5 b5Var) {
        Object[] objArr2;
        int u = t35.u(i2, i);
        if (i == 0) {
            if (u == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
            }
            qs.K0(u + 1, u, 31, objArr, objArr2);
            b5Var.a = objArr[31];
            objArr2[u] = obj;
            return objArr2;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object[] objArr3 = objArr[u];
        objArr3.getClass();
        copyOf[u] = v(objArr3, i3, i2, obj, b5Var);
        while (true) {
            u++;
            if (u >= 32 || copyOf[u] == null) {
                return copyOf;
            }
            Object[] objArr4 = objArr[u];
            objArr4.getClass();
            copyOf[u] = v(objArr4, i3, 0, b5Var.a, b5Var);
        }
        return copyOf;
    }

    public static Object[] x(Object[] objArr, int i, int i2, b5 b5Var) {
        Object[] objArr2;
        int u = t35.u(i2, i);
        if (i == 5) {
            b5Var.a = objArr[u];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[u];
            objArr3.getClass();
            objArr2 = x(objArr3, i - 5, i2, b5Var);
        }
        if (objArr2 == null && u == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[u] = objArr2;
        return copyOf;
    }

    public final Object[] A(Object[] objArr, int i, int i2, b5 b5Var) {
        Object[] objArr2;
        int u = t35.u(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (u == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
            }
            qs.K0(u, u + 1, 32, objArr, objArr2);
            objArr2[31] = b5Var.a;
            b5Var.a = objArr[u];
            return objArr2;
        }
        if (objArr[31] == null) {
            i3 = t35.u(C() - 1, i);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = u + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf[i3];
                obj.getClass();
                copyOf[i3] = A((Object[]) obj, i4, 0, b5Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf[u];
        obj2.getClass();
        copyOf[u] = A((Object[]) obj2, i4, i2, b5Var);
        return copyOf;
    }

    public final o2 B(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.y - i;
        if (i4 != 1) {
            Object[] objArr2 = this.x;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                qs.K0(i3, i3 + 1, i4, objArr2, copyOf);
            }
            copyOf[i5] = null;
            return new gg5(objArr, copyOf, (i + i4) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new kv6(objArr);
        } else {
            b5 b5Var = new b5((Object) null);
            Object[] x2 = x(objArr, i2, i - 1, b5Var);
            x2.getClass();
            Object obj = b5Var.a;
            obj.getClass();
            Object[] objArr3 = (Object[]) obj;
            if (x2[1] != null) {
                return new gg5(x2, objArr3, i, i2);
            }
            Object obj2 = x2[0];
            obj2.getClass();
            return new gg5((Object[]) obj2, objArr3, i, i2 - 5);
        }
    }

    public final int C() {
        return (this.y - 1) & -32;
    }

    public final int f() {
        return this.y;
    }

    public final o2 g(int i, Object obj) {
        int i2 = this.y;
        bb0.W(i, i2);
        if (i == i2) {
            return k(obj);
        }
        int C = C();
        Object[] objArr = this.w;
        if (i >= C) {
            return w(objArr, i - C, obj);
        }
        b5 b5Var = new b5((Object) null);
        return w(v(objArr, this.z, i, obj, b5Var), 0, b5Var.a);
    }

    public final Object get(int i) {
        Object[] objArr;
        bb0.V(i, f());
        if (C() <= i) {
            objArr = this.x;
        } else {
            Object[] objArr2 = this.w;
            for (int i2 = this.z; i2 > 0; i2 -= 5) {
                Object obj = objArr2[t35.u(i, i2)];
                obj.getClass();
                objArr2 = (Object[]) obj;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final o2 k(Object obj) {
        int C = C();
        int i = this.y;
        int i2 = i - C;
        Object[] objArr = this.w;
        Object[] objArr2 = this.x;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new gg5(objArr, copyOf, i + 1, this.z);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return y(objArr, objArr2, objArr3);
    }

    public final ListIterator listIterator(int i) {
        bb0.W(i, this.y);
        return new ig5(i, this.y, (this.z / 5) + 1, this.w, this.x);
    }

    public final hg5 n() {
        return new hg5(this, this.w, this.x, this.z);
    }

    public final o2 o(n2 n2Var) {
        hg5 hg5 = new hg5(this, this.w, this.x, this.z);
        hg5.L(n2Var);
        return hg5.k();
    }

    public final o2 p(int i) {
        bb0.V(i, f());
        int C = C();
        int i2 = this.z;
        Object[] objArr = this.w;
        if (i >= C) {
            return B(objArr, C, i2, i - C);
        }
        return B(A(objArr, i2, i, new b5(this.x[0])), C, i2, 0);
    }

    public final o2 s(int i, Object obj) {
        int i2 = this.y;
        bb0.V(i, i2);
        int C = C();
        Object[] objArr = this.w;
        Object[] objArr2 = this.x;
        int i3 = this.z;
        if (C > i) {
            return new gg5(D(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new gg5(objArr, copyOf, i2, i3);
    }

    public final gg5 w(Object[] objArr, int i, Object obj) {
        int C = C();
        int i2 = this.y;
        int i3 = i2 - C;
        Object[] objArr2 = this.x;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            qs.K0(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new gg5(objArr, copyOf, i2 + 1, this.z);
        }
        Object obj2 = objArr2[31];
        qs.K0(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return y(objArr, copyOf, objArr3);
    }

    public final gg5 y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.y;
        int i2 = i >> 5;
        int i3 = this.z;
        if (i2 <= (1 << i3)) {
            return new gg5(z(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new gg5(z(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int u = t35.u(f() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[u] = objArr2;
            return objArr3;
        }
        objArr3[u] = z(i - 5, (Object[]) objArr3[u], objArr2);
        return objArr3;
    }
}
