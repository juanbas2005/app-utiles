package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: b57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class b57 implements z47 {
    public static final /* synthetic */ int i = 0;
    public final boolean c;
    public final String[] d;
    public final List[] e;
    public final int f;
    public final int[] g;
    public final int[] h;

    public b57(Map map, boolean z) {
        map.getClass();
        this.c = z;
        if (map.isEmpty()) {
            this.f = 0;
            this.d = new String[0];
            this.e = new List[0];
            this.g = new int[0];
            this.h = new int[0];
        } else if (!z) {
            int size = map.size();
            this.f = size;
            this.d = new String[size];
            this.e = new List[size];
            int e2 = n63.e(size);
            int[] iArr = new int[e2];
            for (int i2 = 0; i2 < e2; i2++) {
                iArr[i2] = -1;
            }
            this.g = iArr;
            int i3 = this.f;
            int[] iArr2 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr2[i4] = -1;
            }
            this.h = iArr2;
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                this.d[i5] = str;
                List[] listArr = this.e;
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList.add((String) list.get(i6));
                }
                listArr[i5] = arrayList;
                int a = a(str) & (e2 - 1);
                int[] iArr3 = this.h;
                int[] iArr4 = this.g;
                iArr3[i5] = iArr4[a];
                iArr4[a] = i5;
                i5++;
            }
        } else {
            fm0 k = rg3.k();
            for (Map.Entry entry2 : map.entrySet()) {
                String str2 = (String) entry2.getKey();
                List list2 = (List) entry2.getValue();
                List list3 = (List) k.get(str2);
                if (list3 != null) {
                    k.put(str2, dt0.M0(list3, list2));
                } else {
                    k.put(str2, list2);
                }
            }
            int i7 = k.y;
            this.f = i7;
            this.d = new String[i7];
            this.e = new List[i7];
            int e3 = n63.e(i7);
            int[] iArr5 = new int[e3];
            for (int i8 = 0; i8 < e3; i8++) {
                iArr5[i8] = -1;
            }
            this.g = iArr5;
            int i9 = this.f;
            int[] iArr6 = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr6[i10] = -1;
            }
            this.h = iArr6;
            Iterator it = ((cm0) k.entrySet()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                String str3 = (String) entry3.getKey();
                List list4 = (List) entry3.getValue();
                this.d[i11] = str3;
                List[] listArr2 = this.e;
                int size3 = list4.size();
                ArrayList arrayList2 = new ArrayList(size3);
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList2.add((String) list4.get(i12));
                }
                listArr2[i11] = arrayList2;
                int a2 = a(str3) & (e3 - 1);
                int[] iArr7 = this.h;
                int[] iArr8 = this.g;
                iArr7[i11] = iArr8[a2];
                iArr8[a2] = i11;
                i11++;
            }
        }
    }

    public final int a(String str) {
        if (!this.c) {
            return str.hashCode();
        }
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 31) + Character.toLowerCase(str.charAt(i3));
        }
        return i2;
    }

    public final List b(String str) {
        if (this.f == 0) {
            return null;
        }
        int a = a(str);
        int[] iArr = this.g;
        int i2 = iArr[a & (iArr.length - 1)];
        while (i2 >= 0) {
            if (k57.n0(this.d[i2], str, this.c)) {
                return this.e[i2];
            }
            i2 = this.h[i2];
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r3 = (defpackage.z47) r3;
     */
    public final boolean equals(Object obj) {
        z47 z47;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z47) && this.c == z47.t()) {
            return l().equals(z47.l());
        }
        return false;
    }

    public final int hashCode() {
        return l().hashCode() + (Boolean.hashCode(this.c) * 961);
    }

    public final boolean isEmpty() {
        if (this.f == 0) {
            return true;
        }
        return false;
    }

    public final Set l() {
        int i2 = this.f;
        if (i2 == 0) {
            return g42.w;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < i2; i3++) {
            linkedHashSet.add(new bf4(this.d[i3], this.e[i3]));
        }
        return linkedHashSet;
    }

    public final Set names() {
        int i2 = this.f;
        if (i2 == 0) {
            return g42.w;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < i2; i3++) {
            linkedHashSet.add(this.d[i3]);
        }
        return linkedHashSet;
    }

    public final boolean t() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.c);
        sb.append(") ");
        sb.append(l());
        return sb.toString();
    }

    public final List v(String str) {
        str.getClass();
        return b(str);
    }

    public final void w(gs2 gs2) {
        for (int i2 = 0; i2 < this.f; i2++) {
            gs2.H(this.d[i2], this.e[i2]);
        }
    }

    public final String x(String str) {
        List b = b(str);
        if (b != null) {
            return (String) dt0.y0(b);
        }
        return null;
    }
}
