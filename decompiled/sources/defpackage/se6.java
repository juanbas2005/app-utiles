package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: se6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class se6 implements re6 {
    public final vr2 w;
    public final tp4 x;
    public tp4 y;

    public se6(Map map, vr2 vr2) {
        tp4 tp4;
        this.w = vr2;
        if (map == null || map.isEmpty()) {
            tp4 = null;
        } else {
            tp4 = new tp4(map.size());
            for (Map.Entry entry : map.entrySet()) {
                tp4.m(entry.getKey(), entry.getValue());
            }
        }
        this.x = tp4;
    }

    public final cf4 a(sr2 sr2, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!rd3.C(str.charAt(i))) {
                tp4 tp4 = this.y;
                if (tp4 == null) {
                    long[] jArr = bg6.a;
                    tp4 = new tp4();
                    this.y = tp4;
                }
                Object g = tp4.g(str);
                if (g == null) {
                    g = new ArrayList();
                    tp4.m(str, g);
                }
                ((List) g).add(sr2);
                return new cf4(tp4, str, sr2, 14);
            }
        }
        h.q("Registered key is empty or blank");
        return null;
    }

    public final boolean c(Object obj) {
        return ((Boolean) this.w.y(obj)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    public final Map d() {
        int i;
        int i2;
        long j;
        char c;
        long j2;
        long j3;
        tp4 tp4;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i4;
        long j4;
        char c2;
        tp4 tp42 = this.x;
        if (tp42 == null && this.y == null) {
            return b42.w;
        }
        int i5 = 0;
        if (tp42 != null) {
            i = tp42.e;
        } else {
            i = 0;
        }
        tp4 tp43 = this.y;
        if (tp43 != null) {
            i2 = tp43.e;
        } else {
            i2 = 0;
        }
        HashMap hashMap = new HashMap(i + i2);
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i6 = 8;
        if (tp42 != null) {
            Object[] objArr = tp42.b;
            Object[] objArr2 = tp42.c;
            long[] jArr3 = tp42.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j3 = 128;
                while (true) {
                    long j6 = jArr3[i7];
                    j2 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j6 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i10], (List) objArr2[i10]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i9++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    c3 = c;
                    j5 = j;
                }
                tp4 = this.y;
                if (tp4 != null) {
                    Object[] objArr3 = tp4.b;
                    Object[] objArr4 = tp4.c;
                    long[] jArr4 = tp4.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j7 = jArr4[i11];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                int i13 = i5;
                                while (i13 < i12) {
                                    if ((j7 & j2) < j3) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr3[i14];
                                        List list = (List) objArr4[i14];
                                        String str = (String) obj;
                                        i4 = i6;
                                        if (list.size() == 1) {
                                            Object b = ((sr2) list.get(i5)).b();
                                            if (b != null) {
                                                if (c(b)) {
                                                    hashMap.put(str, sg3.f(b));
                                                } else {
                                                    ku4.g(u55.l(b));
                                                    return null;
                                                }
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i5 < size) {
                                                long[] jArr5 = jArr4;
                                                Object b2 = ((sr2) list.get(i5)).b();
                                                if (b2 == null || c(b2)) {
                                                    arrayList.add(b2);
                                                    i5++;
                                                    jArr4 = jArr5;
                                                } else {
                                                    ku4.g(u55.l(b2));
                                                    return null;
                                                }
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i4 = i6;
                                    }
                                    j7 >>= i4;
                                    i13++;
                                    i6 = i4;
                                    jArr4 = jArr2;
                                    i5 = 0;
                                }
                                jArr = jArr4;
                                i3 = i6;
                                if (i12 != i3) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i3 = i6;
                            }
                            if (i11 == length2) {
                                break;
                            }
                            i11++;
                            i6 = i3;
                            jArr4 = jArr;
                            i5 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j3 = 128;
        j2 = 255;
        tp4 = this.y;
        if (tp4 != null) {
        }
        return hashMap;
    }

    public final Object e(String str) {
        List list;
        tp4 tp4 = this.x;
        if (tp4 != null) {
            list = (List) tp4.k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && tp4 != null) {
            List subList = list.subList(1, list.size());
            int f = tp4.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = tp4.c;
            Object obj = objArr[f];
            tp4.b[f] = str;
            objArr[f] = subList;
            List list2 = (List) obj;
        }
        return list.get(0);
    }
}
