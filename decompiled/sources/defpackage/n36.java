package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: n36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n36 implements Map, Serializable {
    public static final n36 D = new n36(0, 0, (Object) null, new Object[0]);
    public static final n36 E = new n36(0, 1, (Object) null, new Object[0]);
    public transient AbstractCollection A;
    public transient AbstractCollection B;
    public transient AbstractCollection C;
    public final /* synthetic */ int w;
    public final transient Object x;
    public final transient Object[] y;
    public final transient int z;

    public /* synthetic */ n36(int i, int i2, Object obj, Object[] objArr) {
        this.w = i2;
        this.x = obj;
        this.y = objArr;
        this.z = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static n36 a(int i, Object[] objArr, ig igVar) {
        char c;
        int i2;
        Object obj;
        Object obj2;
        int i3;
        int i4 = i;
        Object[] objArr2 = objArr;
        ig igVar2 = igVar;
        if (i4 == 0) {
            return D;
        }
        Object obj3 = null;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new n36(1, 0, (Object) null, objArr2);
        }
        g75.m(i4, objArr2.length >> 1);
        int p = s93.p(i4);
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i2 = 1;
            c = 2;
        } else {
            int i6 = p - 1;
            char c2 = 65535;
            if (p <= 128) {
                byte[] bArr = new byte[p];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj4 = objArr2[i9];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArr2[i9 ^ i5];
                    Objects.requireNonNull(obj5);
                    int J = rj1.J(obj4.hashCode());
                    while (true) {
                        int i11 = J & i6;
                        i3 = i5;
                        byte b = bArr[i11] & 255;
                        if (b == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArr2[i10] = obj4;
                                objArr2[i10 ^ 1] = obj5;
                            }
                            i8++;
                        } else if (obj4.equals(objArr2[b])) {
                            byte b2 = b ^ 1;
                            Object obj6 = objArr2[b2];
                            Objects.requireNonNull(obj6);
                            obj3 = new r93(obj4, obj5, obj6);
                            objArr2[b2] = obj5;
                            break;
                        } else {
                            J = i11 + 1;
                            i5 = i3;
                        }
                    }
                    i7++;
                    i5 = i3;
                }
                i2 = i5;
                c = 2;
                obj2 = bArr;
                if (i8 != i4) {
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = bArr;
                    objArr3[i2] = Integer.valueOf(i8);
                    objArr3[2] = obj3;
                    obj = objArr3;
                    obj3 = obj;
                }
            } else {
                i2 = 1;
                c = 2;
                if (p <= 32768) {
                    short[] sArr = new short[p];
                    Arrays.fill(sArr, -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i4; i13++) {
                        int i14 = i13 * 2;
                        int i15 = i12 * 2;
                        Object obj7 = objArr2[i14];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArr2[i14 ^ 1];
                        Objects.requireNonNull(obj8);
                        int J2 = rj1.J(obj7.hashCode());
                        while (true) {
                            int i16 = J2 & i6;
                            short s = sArr[i16] & 65535;
                            if (s == 65535) {
                                sArr[i16] = (short) i15;
                                if (i12 < i13) {
                                    objArr2[i15] = obj7;
                                    objArr2[i15 ^ 1] = obj8;
                                }
                                i12++;
                            } else if (obj7.equals(objArr2[s])) {
                                short s2 = s ^ 1;
                                Object obj9 = objArr2[s2];
                                Objects.requireNonNull(obj9);
                                obj3 = new r93(obj7, obj8, obj9);
                                objArr2[s2] = obj8;
                                break;
                            } else {
                                J2 = i16 + 1;
                            }
                        }
                    }
                    obj = sArr;
                    if (i12 != i4) {
                        obj2 = new Object[]{sArr, Integer.valueOf(i12), obj3};
                    }
                    obj3 = obj;
                } else {
                    int[] iArr = new int[p];
                    Arrays.fill(iArr, -1);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i4) {
                        int i19 = i17 * 2;
                        int i20 = i18 * 2;
                        Object obj10 = objArr2[i19];
                        Objects.requireNonNull(obj10);
                        Object obj11 = objArr2[i19 ^ 1];
                        Objects.requireNonNull(obj11);
                        int J3 = rj1.J(obj10.hashCode());
                        while (true) {
                            int i21 = J3 & i6;
                            int i22 = iArr[i21];
                            if (i22 == c2) {
                                iArr[i21] = i20;
                                if (i18 < i17) {
                                    objArr2[i20] = obj10;
                                    objArr2[i20 ^ 1] = obj11;
                                }
                                i18++;
                            } else if (obj10.equals(objArr2[i22])) {
                                char c3 = i22 ^ 1;
                                Object obj12 = objArr2[c3];
                                Objects.requireNonNull(obj12);
                                obj3 = new r93(obj10, obj11, obj12);
                                objArr2[c3] = obj11;
                                break;
                            } else {
                                J3 = i21 + 1;
                                c2 = 65535;
                            }
                        }
                        i17++;
                        c2 = 65535;
                    }
                    obj = iArr;
                    if (i18 != i4) {
                        obj2 = new Object[]{iArr, Integer.valueOf(i18), obj3};
                    }
                    obj3 = obj;
                }
            }
            obj3 = obj2;
        }
        if (obj3 instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj3;
            r93 r93 = (r93) objArr4[c];
            if (igVar2 != null) {
                igVar2.d = r93;
                Object obj13 = objArr4[0];
                int intValue = ((Integer) objArr4[i2]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                obj3 = obj13;
                i4 = intValue;
            } else {
                throw r93.a();
            }
        }
        return new n36(i4, 0, obj3, objArr2);
    }

    public final void clear() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean containsKey(Object obj) {
        switch (this.w) {
            case b85.b:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    public final boolean containsValue(Object obj) {
        switch (this.w) {
            case b85.b:
                m36 m36 = (m36) this.C;
                if (m36 == null) {
                    m36 = new m36(this.y, 1, this.z);
                    this.C = m36;
                }
                return m36.contains(obj);
            default:
                it8 it8 = (it8) this.C;
                if (it8 == null) {
                    it8 = new it8(this.y, 1, this.z);
                    this.C = it8;
                }
                return it8.contains(obj);
        }
    }

    public final Set entrySet() {
        switch (this.w) {
            case b85.b:
                k36 k36 = (k36) this.A;
                if (k36 != null) {
                    return k36;
                }
                k36 k362 = new k36(this, this.y, this.z);
                this.A = k362;
                return k362;
            default:
                ts8 ts8 = (ts8) this.A;
                if (ts8 != null) {
                    return ts8;
                }
                ts8 ts82 = new ts8(this, this.y, this.z);
                this.A = ts82;
                return ts82;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.w) {
            case b85.b:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return ((s93) entrySet()).equals(((Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.w;
        Object obj4 = this.x;
        Object[] objArr = this.y;
        int i2 = this.z;
        switch (i) {
            case b85.b:
                if (obj != null) {
                    if (i2 == 1) {
                        Object obj5 = objArr[0];
                        Objects.requireNonNull(obj5);
                        if (obj5.equals(obj)) {
                            obj2 = objArr[1];
                            Objects.requireNonNull(obj2);
                            if (obj2 != null) {
                                return null;
                            }
                            return obj2;
                        }
                    } else if (obj4 != null) {
                        if (obj4 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj4;
                            int length = bArr.length - 1;
                            int J = rj1.J(obj.hashCode());
                            while (true) {
                                int i3 = J & length;
                                byte b = bArr[i3] & 255;
                                if (b != 255) {
                                    if (obj.equals(objArr[b])) {
                                        obj2 = objArr[b ^ 1];
                                    } else {
                                        J = i3 + 1;
                                    }
                                }
                            }
                        } else if (obj4 instanceof short[]) {
                            short[] sArr = (short[]) obj4;
                            int length2 = sArr.length - 1;
                            int J2 = rj1.J(obj.hashCode());
                            while (true) {
                                int i4 = J2 & length2;
                                short s = sArr[i4] & 65535;
                                if (s != 65535) {
                                    if (obj.equals(objArr[s])) {
                                        obj2 = objArr[s ^ 1];
                                    } else {
                                        J2 = i4 + 1;
                                    }
                                }
                            }
                            if (obj2 != null) {
                            }
                        } else {
                            int[] iArr = (int[]) obj4;
                            int length3 = iArr.length - 1;
                            int J3 = rj1.J(obj.hashCode());
                            while (true) {
                                int i5 = J3 & length3;
                                int i6 = iArr[i5];
                                if (i6 != -1) {
                                    if (obj.equals(objArr[i6])) {
                                        obj2 = objArr[i6 ^ 1];
                                    } else {
                                        J3 = i5 + 1;
                                    }
                                }
                            }
                            if (obj2 != null) {
                            }
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            default:
                if (obj != null) {
                    if (i2 == 1) {
                        Object obj6 = objArr[0];
                        Objects.requireNonNull(obj6);
                        if (obj6.equals(obj)) {
                            obj3 = objArr[1];
                            Objects.requireNonNull(obj3);
                            if (obj3 != null) {
                                return null;
                            }
                            return obj3;
                        }
                    } else if (obj4 != null) {
                        if (obj4 instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj4;
                            int length4 = bArr2.length - 1;
                            int X = z65.X(obj.hashCode());
                            while (true) {
                                int i7 = X & length4;
                                byte b2 = bArr2[i7] & 255;
                                if (b2 != 255) {
                                    if (obj.equals(objArr[b2])) {
                                        obj3 = objArr[b2 ^ 1];
                                    } else {
                                        X = i7 + 1;
                                    }
                                }
                            }
                            if (obj3 != null) {
                            }
                        } else if (obj4 instanceof short[]) {
                            short[] sArr2 = (short[]) obj4;
                            int length5 = sArr2.length - 1;
                            int X2 = z65.X(obj.hashCode());
                            while (true) {
                                int i8 = X2 & length5;
                                char c = (char) sArr2[i8];
                                if (c != 65535) {
                                    if (obj.equals(objArr[c])) {
                                        obj3 = objArr[c ^ 1];
                                    } else {
                                        X2 = i8 + 1;
                                    }
                                }
                            }
                        } else {
                            int[] iArr2 = (int[]) obj4;
                            int length6 = iArr2.length - 1;
                            int X3 = z65.X(obj.hashCode());
                            while (true) {
                                int i9 = X3 & length6;
                                int i10 = iArr2[i9];
                                if (i10 != -1) {
                                    if (obj.equals(objArr[i10])) {
                                        obj3 = objArr[i10 ^ 1];
                                    } else {
                                        X3 = i9 + 1;
                                    }
                                }
                            }
                            if (obj3 != null) {
                            }
                        }
                    }
                }
                obj3 = null;
                if (obj3 != null) {
                }
        }
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.w) {
            case b85.b:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            default:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
        }
    }

    public final int hashCode() {
        int i;
        switch (this.w) {
            case b85.b:
                k36 k36 = (k36) this.A;
                if (k36 == null) {
                    k36 = new k36(this, this.y, this.z);
                    this.A = k36;
                }
                return za5.t(k36);
            default:
                ts8 ts8 = (ts8) this.A;
                if (ts8 == null) {
                    ts8 = new ts8(this, this.y, this.z);
                    this.A = ts8;
                }
                int i2 = 0;
                for (Object next : ts8) {
                    if (next != null) {
                        i = next.hashCode();
                    } else {
                        i = 0;
                    }
                    i2 += i;
                }
                return i2;
        }
    }

    public final boolean isEmpty() {
        switch (this.w) {
            case b85.b:
                if (size() == 0) {
                    return true;
                }
                return false;
            default:
                if (size() == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Set keySet() {
        switch (this.w) {
            case b85.b:
                l36 l36 = (l36) this.B;
                if (l36 != null) {
                    return l36;
                }
                l36 l362 = new l36(this, new m36(this.y, 0, this.z));
                this.B = l362;
                return l362;
            default:
                us8 us8 = (us8) this.B;
                if (us8 != null) {
                    return us8;
                }
                us8 us82 = new us8(this, new it8(this.y, 0, this.z));
                this.B = us82;
                return us82;
        }
    }

    public final Object put(Object obj, Object obj2) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void putAll(Map map) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int size() {
        switch (this.w) {
            case b85.b:
                return this.z;
            default:
                return this.z;
        }
    }

    public final String toString() {
        boolean z2 = true;
        switch (this.w) {
            case b85.b:
                int i = this.z;
                ie1.z(i, "size");
                StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
                sb.append('{');
                at7 o = ((k36) entrySet()).o();
                while (true) {
                    m93 m93 = (m93) o;
                    if (m93.hasNext()) {
                        Map.Entry entry = (Map.Entry) m93.next();
                        if (!z2) {
                            sb.append(", ");
                        }
                        sb.append(entry.getKey());
                        sb.append('=');
                        sb.append(entry.getValue());
                        z2 = false;
                    } else {
                        sb.append('}');
                        return sb.toString();
                    }
                }
            default:
                int i2 = this.z;
                if (i2 >= 0) {
                    StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824));
                    sb2.append('{');
                    Iterator it = ((ts8) entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (!z2) {
                            sb2.append(", ");
                        }
                        sb2.append(entry2.getKey());
                        sb2.append('=');
                        sb2.append(entry2.getValue());
                        z2 = false;
                    }
                    sb2.append('}');
                    return sb2.toString();
                }
                h.q(hl6.p(new StringBuilder(String.valueOf(i2).length() + 33), "size cannot be negative but was: ", i2));
                return null;
        }
    }

    public final Collection values() {
        switch (this.w) {
            case b85.b:
                m36 m36 = (m36) this.C;
                if (m36 != null) {
                    return m36;
                }
                m36 m362 = new m36(this.y, 1, this.z);
                this.C = m362;
                return m362;
            default:
                it8 it8 = (it8) this.C;
                if (it8 != null) {
                    return it8;
                }
                it8 it82 = new it8(this.y, 1, this.z);
                this.C = it82;
                return it82;
        }
    }
}
