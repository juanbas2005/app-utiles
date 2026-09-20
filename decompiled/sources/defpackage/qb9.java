package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qb9 implements jc9 {
    public Thread A;
    public final qb9 w;
    public final UUID x;
    public final String y;
    public final String z;

    public qb9(String str, qb9 qb9, ic9 ic9) {
        this.z = str;
        this.w = qb9;
        this.x = qb9.x;
        this.y = qb9.y;
        this.A = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    public final void close() {
        ic9 c = vb9.c();
        jc9 jc9 = c.b;
        String str = this.z;
        if (jc9 == null) {
            throw new IllegalStateException(f21.m(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        } else if (this == jc9) {
            vb9.b(c, ((qb9) jc9).w);
            this.A = null;
        } else {
            String str2 = ((qb9) jc9).z;
            StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
            f21.v(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        r4 = r4.d;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r4.containsKey(r10) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        ((defpackage.hc9) r1.g).d.put(r10, new defpackage.hc9(r8, 1073741824));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        if (r15 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        r15.c = (defpackage.hc9) r1.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (r15 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e4, code lost:
        r15.c = (defpackage.hc9) r1.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r1.b = r8;
        r1.c++;
        r1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f2, code lost:
        if (r1.h(r13, r14, r15, (r15 + r14) - r13) != false) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0215 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0274  */
    public final String toString() {
        j93 j93;
        d12 d12;
        String str;
        String str2;
        int i;
        int i2;
        Iterator it;
        gc9 gc9;
        int i3;
        AtomicReference atomicReference = vb9.a;
        qb9 qb9 = this;
        int i4 = 0;
        int i5 = 0;
        while (qb9 != null) {
            i4++;
            i5 += qb9.z.length();
            qb9 = qb9.w;
            if (qb9 != null) {
                i5 += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            qb9 qb92 = this;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                strArr[i6] = qb92.z;
                qb92 = qb92.w;
            }
            ig igVar = new ig(4);
            int i7 = 1;
            if (i4 == 0) {
                j93 = o36.F;
            } else if (i4 != 1) {
                j93 = s93.s(i4, (Object[]) strArr.clone());
            } else {
                j93 = new su6(strArr[0]);
            }
            at7 o = j93.iterator();
            int i8 = 0;
            while (o.hasNext()) {
                igVar.k(o.next(), Integer.valueOf(i8));
                i8++;
            }
            n36 c = igVar.c(true);
            int i9 = c.z;
            int i10 = i4 >> 2;
            if (i9 <= i10) {
                int i11 = i4 + 1;
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i4; i12++) {
                    iArr[i12] = ((Integer) c.get(strArr[i12])).intValue();
                }
                iArr[i4] = i9;
                j32 j32 = new j32(iArr, 2);
                int i13 = 0;
                while (true) {
                    int i14 = -1;
                    if (i13 >= i11) {
                        break;
                    }
                    j32.d += i7;
                    int i15 = iArr[i13];
                    while (true) {
                        hc9 hc9 = null;
                        while (true) {
                            if (j32.d <= 0) {
                                i3 = i7;
                                break;
                            }
                            int i16 = j32.c;
                            hc9 hc92 = (hc9) j32.g;
                            i3 = i7;
                            if (i16 == 0) {
                                break;
                            }
                            int i17 = ((hc9) hc92.d.get(Integer.valueOf(iArr[j32.b]))).a;
                            int i18 = j32.c;
                            if (iArr[i17 + i18] == i15) {
                                if (hc9 != null) {
                                    hc9.c = (hc9) j32.g;
                                }
                                j32.c = i18 + 1;
                                j32.c();
                            } else {
                                hc9 hc93 = (hc9) ((hc9) j32.g).d.get(Integer.valueOf(iArr[j32.b]));
                                int i19 = hc93.a;
                                int i20 = i14;
                                hc9 hc94 = new hc9(i19, (j32.c + i19) - 1);
                                ((hc9) j32.g).d.put(Integer.valueOf(iArr[j32.b]), hc94);
                                int i21 = hc94.b + 1;
                                Integer valueOf = Integer.valueOf(iArr[i21]);
                                HashMap hashMap = hc94.d;
                                hashMap.put(valueOf, hc93);
                                hc93.a = i21;
                                if (hc9 != null) {
                                    hc9.c = hc94;
                                }
                                hashMap.put(Integer.valueOf(i15), new hc9(i13, 1073741824));
                                j32.d--;
                                j32.d();
                                hc9 = hc94;
                                i7 = i3;
                                i14 = i20;
                            }
                        }
                        j32.d += i14;
                        j32.d();
                        i7 = i3;
                    }
                    i13++;
                    i7 = i3;
                }
                int i22 = i7;
                ArrayDeque arrayDeque = new ArrayDeque();
                hc9 hc95 = (hc9) j32.f;
                gc9 gc92 = new gc9(hc95, 0, -1, -1);
                arrayDeque.push(gc92);
                while (!arrayDeque.isEmpty()) {
                    gc9 gc93 = (gc9) arrayDeque.pop();
                    Iterator it2 = gc93.d.d.values().iterator();
                    while (it2.hasNext()) {
                        hc9 hc96 = (hc9) it2.next();
                        int i23 = gc93.b;
                        int i24 = gc93.c;
                        int i25 = hc96.a;
                        hc9 hc97 = hc95;
                        int i26 = hc96.b;
                        if (!j32.h(i23, i24, i25, i26)) {
                            if (hc96.d.isEmpty()) {
                                int i27 = hc96.a;
                                it = it2;
                            } else {
                                it = it2;
                            }
                            gc9 = new gc9(hc96, i22, hc96.a, i26);
                            if (gc92.a >= gc9.a) {
                                gc92 = gc9;
                            }
                            arrayDeque.push(gc9);
                            hc95 = hc97;
                            it2 = it;
                            i22 = 1;
                        } else {
                            it = it2;
                        }
                        gc9 = new gc9(hc96, gc93.a + i22, i23, i24);
                        if (gc92.a >= gc9.a) {
                        }
                        arrayDeque.push(gc9);
                        hc95 = hc97;
                        it2 = it;
                        i22 = 1;
                    }
                    i22 = 1;
                }
                hc9 hc98 = hc95;
                int min = Math.min(iArr.length, gc92.c + 1);
                int i28 = 0;
                loop9:
                while (true) {
                    i = gc92.b;
                    i2 = min - i;
                    hc95 = (hc9) hc95.d.get(Integer.valueOf(iArr[(i28 % i2) + i]));
                    if (hc95 != null) {
                        int i29 = hc95.a;
                        while (i29 < hc95.b + 1 && i29 < iArr.length) {
                            if (iArr[(i28 % i2) + i] != iArr[i29]) {
                                break loop9;
                            }
                            i28++;
                            i29++;
                        }
                    } else {
                        break;
                    }
                }
                int i30 = i28 / i2;
                d12 d122 = new d12(i, min, i30);
                if (i2 * i30 >= i10) {
                    d12 = d122;
                    str = "";
                    if (d12 != null) {
                        int i31 = d12.a;
                        if (i31 > 0) {
                            str2 = String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i31))).concat(" -> ");
                        } else {
                            str2 = str;
                        }
                        int i32 = d12.b;
                        int i33 = d12.c;
                        int i34 = ((i32 - i31) * i33) + i31;
                        if (i34 < i4) {
                            str = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i34, i4))));
                        }
                        String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i31, i32));
                        Locale locale = Locale.US;
                        str = str2 + "{" + join + "}x" + i33 + str;
                    }
                    if (!str.isEmpty()) {
                        return str;
                    }
                }
            }
            d12 = null;
            str = "";
            if (d12 != null) {
            }
            if (!str.isEmpty()) {
            }
        }
        char[] cArr = new char[i5];
        qb9 qb93 = this;
        while (qb93 != null) {
            String str3 = qb93.z;
            int length = i5 - str3.length();
            str3.getChars(0, str3.length(), cArr, length);
            qb93 = qb93.w;
            if (qb93 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public qb9(String str, UUID uuid, String str2, ic9 ic9) {
        this.z = str;
        this.w = null;
        this.x = uuid;
        this.y = str2;
        ic9.getClass();
        this.A = Thread.currentThread();
    }
}
