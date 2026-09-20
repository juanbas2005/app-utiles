package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: fm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fm0 implements Map, er3 {
    public static final String[] E = new String[0];
    public static final Object[] F = new Object[0];
    public static final int[] G = new int[0];
    public int A;
    public cm0 B;
    public cm0 C;
    public em0 D;
    public String[] w;
    public Object[] x;
    public int y;
    public int[] z;

    public final int a(String str) {
        if (this.y == 0) {
            return -1;
        }
        int i = me6.i(str);
        int length = this.w.length;
        while (true) {
            int i2 = i & (length - 1);
            String str2 = this.w[i2];
            if (str2 == null) {
                return -1;
            }
            if (str2.equalsIgnoreCase(str)) {
                return i2;
            }
            i = i2 + 1;
            length = this.w.length;
        }
    }

    /* renamed from: b */
    public final Object put(String str, Object obj) {
        int i;
        int[] iArr;
        String str2;
        str.getClass();
        obj.getClass();
        int i2 = 0;
        if (this.w == E) {
            this.w = new String[8];
            this.x = new Object[8];
            int[] iArr2 = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                iArr2[i3] = -1;
            }
            this.z = iArr2;
        }
        int i4 = me6.i(str);
        int length = (this.w.length - 1) & i4;
        while (true) {
            String str3 = this.w[length];
            if (str3 == null) {
                int i5 = this.y * 4;
                String[] strArr = this.w;
                if (i5 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.x;
                    int[] iArr3 = this.z;
                    int i6 = this.A;
                    this.w = new String[length2];
                    this.x = new Object[length2];
                    int[] iArr4 = new int[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        iArr4[i7] = -1;
                    }
                    this.z = iArr4;
                    this.y = 0;
                    this.A = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        int i9 = iArr3[i8];
                        if (i9 >= 0 && (str2 = strArr[i9]) != null) {
                            Object obj2 = objArr[i9];
                            obj2.getClass();
                            put(str2, obj2);
                        }
                    }
                }
                int length3 = this.w.length;
                while (true) {
                    i = i4 & (length3 - 1);
                    String[] strArr2 = this.w;
                    if (strArr2[i] == null) {
                        break;
                    }
                    i4 = i + 1;
                    length3 = strArr2.length;
                }
                int i10 = this.A;
                if (i10 == this.z.length && i10 != 0) {
                    int i11 = 0;
                    while (true) {
                        iArr = this.z;
                        if (i2 >= i10) {
                            break;
                        }
                        int i12 = iArr[i2];
                        if (i12 >= 0 && this.w[i12] != null) {
                            iArr[i11] = i12;
                            i11++;
                        }
                        i2++;
                    }
                    int length4 = iArr.length;
                    for (int i13 = i11; i13 < length4; i13++) {
                        this.z[i13] = -1;
                    }
                    this.A = i11;
                }
                this.w[i] = str;
                this.x[i] = obj;
                int[] iArr5 = this.z;
                int i14 = this.A;
                this.A = i14 + 1;
                iArr5[i14] = i;
                this.y++;
                return null;
            } else if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.x;
                Object obj3 = objArr2[length];
                objArr2[length] = obj;
                return obj3;
            } else {
                length = (length + 1) & (this.w.length - 1);
            }
        }
    }

    public final void clear() {
        if (this.y > 0) {
            qs.S0(0, this.w.length, (Object) null, this.w);
            qs.S0(0, this.x.length, (Object) null, this.x);
            int[] iArr = this.z;
            int length = iArr.length;
            iArr.getClass();
            Arrays.fill(iArr, 0, length, -1);
            this.y = 0;
            this.A = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        if ((obj instanceof String) && a((String) obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj == null || this.y == 0) {
            return false;
        }
        int length = this.x.length;
        for (int i = 0; i < length; i++) {
            if (this.w[i] != null && sg3.e(this.x[i], obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        cm0 cm0 = this.C;
        if (cm0 != null) {
            return cm0;
        }
        cm0 cm02 = new cm0(this, 0);
        this.C = cm02;
        return cm02;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm0)) {
            return false;
        }
        fm0 fm0 = (fm0) obj;
        if (fm0.y != this.y) {
            return false;
        }
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            String str = this.w[i];
            if (str != null) {
                if (!sg3.e(fm0.get(str), this.x[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object get(Object obj) {
        int a;
        if ((obj instanceof String) && (a = a((String) obj)) >= 0) {
            return this.x[a];
        }
        return null;
    }

    public final int hashCode() {
        int i;
        int length = this.w.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = this.w[i3];
            if (str != null) {
                int i4 = me6.i(str);
                Object obj = this.x[i3];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += i4 ^ i;
            }
        }
        return i2;
    }

    public final boolean isEmpty() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        cm0 cm0 = this.B;
        if (cm0 != null) {
            return cm0;
        }
        cm0 cm02 = new cm0(this, 1);
        this.B = cm02;
        return cm02;
    }

    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        int a;
        int i;
        if (!(obj instanceof String) || (a = a((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.x[a];
        int i2 = this.A;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.z;
            if (iArr[i3] == a) {
                iArr[i3] = -1;
                break;
            }
            i3++;
        }
        String[] strArr = this.w;
        strArr[a] = null;
        this.x[a] = null;
        this.y--;
        int i4 = a + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.w;
            String str = strArr2[i5];
            if (str == null) {
                return obj2;
            }
            Object[] objArr = this.x;
            Object obj3 = objArr[i5];
            strArr2[i5] = null;
            objArr[i5] = null;
            this.y--;
            obj3.getClass();
            int i6 = me6.i(str);
            int length2 = this.w.length;
            while (true) {
                i = i6 & (length2 - 1);
                String[] strArr3 = this.w;
                String str2 = strArr3[i];
                if (str2 == null) {
                    strArr3[i] = str;
                    this.x[i] = obj3;
                    this.y++;
                    break;
                } else if (str2.equalsIgnoreCase(str)) {
                    this.x[i] = obj3;
                    break;
                } else {
                    i6 = i + 1;
                    length2 = this.w.length;
                }
            }
            int i7 = this.A;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                int[] iArr2 = this.z;
                if (iArr2[i8] == i5) {
                    iArr2[i8] = i;
                    break;
                }
                i8++;
            }
            i4 = i5 + 1;
            length = this.w.length;
        }
    }

    public final int size() {
        return this.y;
    }

    public final Collection values() {
        em0 em0 = this.D;
        if (em0 != null) {
            return em0;
        }
        em0 em02 = new em0(this);
        this.D = em02;
        return em02;
    }
}
