package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: do7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class do7 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final a96 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final o0 e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final String[] g;
    public final e35 h;
    public final br4 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public sr2 k = new wi7(1);

    public do7(a96 a96, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, o0 o0Var) {
        String str;
        this.a = a96;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = o0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.b.get(strArr[i2]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, sf4.U(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new e35(this.g.length);
        this.i = new br4(this.g.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r4 == r3) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object a(do7 do7, dl5 dl5, h61 h61) {
        vn7 vn7;
        int i2;
        Set set;
        if (h61 instanceof vn7) {
            vn7 = (vn7) h61;
            int i3 = vn7.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vn7.C = i3 - Integer.MIN_VALUE;
                Object obj = vn7.A;
                i2 = vn7.C;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    ha7 ha7 = new ha7(16);
                    vn7.z = dl5;
                    vn7.C = 1;
                    obj = dl5.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ha7, vn7);
                } else if (i2 == 1) {
                    dl5 = (dl5) vn7.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    Set set2 = (Set) vn7.z;
                    o85.q(obj);
                    return set2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    vn7.z = set;
                    vn7.C = 2;
                    if (l55.l(dl5, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", vn7) == p81) {
                        return p81;
                    }
                }
                return set;
            }
        }
        vn7 = new vn7(do7, h61);
        Object obj2 = vn7.A;
        i2 = vn7.C;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object b(do7 do7, h61 h61) {
        xn7 xn7;
        int i2;
        qc3 qc3;
        Set set;
        Object value;
        int[] iArr;
        int i3;
        a96 a96 = do7.a;
        if (h61 instanceof xn7) {
            xn7 = (xn7) h61;
            int i4 = xn7.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xn7.C = i4 - Integer.MIN_VALUE;
                Object obj = xn7.A;
                i2 = xn7.C;
                if (i2 != 0) {
                    o85.q(obj);
                    qc3 qc32 = a96.g;
                    boolean r = qc32.r();
                    g42 g42 = g42.w;
                    if (!r) {
                        return g42;
                    }
                    try {
                        if (!do7.j.compareAndSet(true, false)) {
                            qc32.N();
                            return g42;
                        } else if (!((Boolean) do7.k.b()).booleanValue()) {
                            qc32.N();
                            return g42;
                        } else {
                            yn7 yn7 = new yn7(do7, (f61) null, 1);
                            xn7.z = qc32;
                            xn7.C = 1;
                            Object q = a96.q(false, yn7, xn7);
                            p81 p81 = p81.w;
                            if (q == p81) {
                                return p81;
                            }
                            Object obj2 = q;
                            qc3 = qc32;
                            obj = obj2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        qc3 = qc32;
                        qc3.N();
                        throw th;
                    }
                } else if (i2 == 1) {
                    qc3 = xn7.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    br4 br4 = do7.i;
                    br4.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        d37 d37 = (d37) br4.x;
                        do {
                            value = d37.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i5 = 0; i5 < length; i5++) {
                                if (set.contains(Integer.valueOf(i5))) {
                                    i3 = iArr2[i5] + 1;
                                } else {
                                    i3 = iArr2[i5];
                                }
                                iArr[i5] = i3;
                            }
                        } while (!d37.i(value, iArr));
                    }
                    do7.e.y(set);
                }
                qc3.N();
                return set;
            }
        }
        xn7 = new xn7(do7, h61);
        Object obj3 = xn7.A;
        i2 = xn7.C;
        if (i2 != 0) {
        }
        set = (Set) obj3;
        if (!set.isEmpty()) {
        }
        qc3.N();
        return set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (defpackage.l55.l(r1, r3, r4) == r8) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
        if (defpackage.l55.l(r11, r3, r4) == r8) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public static final Object c(do7 do7, kl7 kl7, int i2, h61 h61) {
        zn7 zn7;
        int i3;
        dl5 dl5;
        String str;
        String[] strArr;
        int i4;
        int i5;
        int i6;
        String str2;
        do7 do72 = do7;
        dl5 dl52 = kl7;
        int i7 = i2;
        h61 h612 = h61;
        do72.getClass();
        if (h612 instanceof zn7) {
            zn7 = (zn7) h612;
            int i8 = zn7.H;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zn7.H = i8 - Integer.MIN_VALUE;
                Object obj = zn7.F;
                i3 = zn7.H;
                boolean z = true;
                p81 p81 = p81.w;
                if (i3 != 0) {
                    o85.q(obj);
                    String str3 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)";
                    zn7.z = dl52;
                    zn7.C = i7;
                    zn7.H = 1;
                } else if (i3 == 1) {
                    int i9 = zn7.C;
                    dl5 dl53 = zn7.z;
                    o85.q(obj);
                    dl5 dl54 = dl53;
                    i7 = i9;
                    dl52 = dl54;
                } else if (i3 == 2) {
                    i6 = zn7.E;
                    i5 = zn7.D;
                    i4 = zn7.C;
                    strArr = zn7.B;
                    str = zn7.A;
                    dl5 = zn7.z;
                    o85.q(obj);
                    boolean z2 = true;
                    i5++;
                    z = z2;
                    if (i5 < i6) {
                        String str4 = strArr[i5];
                        if (do72.d) {
                            str2 = "TEMP";
                        } else {
                            str2 = "";
                        }
                        z2 = z;
                        StringBuilder o = f21.o("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str4, "` AFTER ");
                        f21.v(o, str4, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                        String n = hl6.n(o, i4, " AND invalidated = 0; END");
                        zn7.z = dl5;
                        zn7.A = str;
                        zn7.B = strArr;
                        zn7.C = i4;
                        zn7.D = i5;
                        zn7.E = i6;
                        zn7.H = 2;
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str5 = do72.g[i7];
                i4 = i7;
                i5 = 0;
                strArr = l;
                dl5 = dl52;
                i6 = 3;
                str = str5;
                if (i5 < i6) {
                }
                return vs7.a;
            }
        }
        zn7 = new zn7(do72, h612);
        Object obj2 = zn7.F;
        i3 = zn7.H;
        boolean z3 = true;
        p81 p812 = p81.w;
        if (i3 != 0) {
        }
        String str52 = do72.g[i7];
        i4 = i7;
        i5 = 0;
        strArr = l;
        dl5 = dl52;
        i6 = 3;
        str = str52;
        if (i5 < i6) {
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object d(do7 do7, kl7 kl7, int i2, h61 h61) {
        ao7 ao7;
        int i3;
        String[] strArr;
        dl5 dl5;
        int i4;
        int i5;
        String str;
        do7.getClass();
        if (h61 instanceof ao7) {
            ao7 = (ao7) h61;
            int i6 = ao7.G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ao7.G = i6 - Integer.MIN_VALUE;
                Object obj = ao7.E;
                i3 = ao7.G;
                if (i3 != 0) {
                    o85.q(obj);
                    str = do7.g[i2];
                    i5 = 3;
                    dl5 = kl7;
                    i4 = 0;
                    strArr = l;
                } else if (i3 == 1) {
                    i5 = ao7.D;
                    i4 = ao7.C;
                    String[] strArr2 = ao7.B;
                    str = ao7.A;
                    dl5 dl52 = ao7.z;
                    o85.q(obj);
                    strArr = strArr2;
                    dl5 = dl52;
                    i4++;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (i4 < i5) {
                    String h2 = pb4.h('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                    ao7.z = dl5;
                    ao7.A = str;
                    ao7.B = strArr;
                    ao7.C = i4;
                    ao7.D = i5;
                    ao7.G = 1;
                    Object l2 = l55.l(dl5, h2, ao7);
                    p81 p81 = p81.w;
                    if (l2 == p81) {
                        return p81;
                    }
                    i4++;
                    if (i4 < i5) {
                    }
                }
                return vs7.a;
            }
        }
        ao7 = new ao7(do7, h61);
        Object obj2 = ao7.E;
        i3 = ao7.G;
        if (i3 != 0) {
        }
        if (i4 < i5) {
        }
        return vs7.a;
    }

    public final void e(sr2 sr2, sr2 sr22) {
        sr2.getClass();
        sr22.getClass();
        if (this.j.compareAndSet(false, true)) {
            sr2.b();
            ig0 ig0 = this.a.a;
            if (ig0 != null) {
                ar7.H(ig0, new k81("Room Invalidation Tracker Refresh"), (r81) null, new k05(this, sr22, (f61) null, 28), 2);
            } else {
                sg3.a0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(h61 h61) {
        bo7 bo7;
        int i2;
        qc3 qc3;
        if (h61 instanceof bo7) {
            bo7 = (bo7) h61;
            int i3 = bo7.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bo7.C = i3 - Integer.MIN_VALUE;
                Object obj = bo7.A;
                i2 = bo7.C;
                if (i2 != 0) {
                    o85.q(obj);
                    a96 a96 = this.a;
                    qc3 qc32 = a96.g;
                    if (qc32.r()) {
                        try {
                            pd7 pd7 = new pd7((Object) this, (f61) null, 2);
                            bo7.z = qc32;
                            bo7.C = 1;
                            Object q = a96.q(false, pd7, bo7);
                            p81 p81 = p81.w;
                            if (q == p81) {
                                return p81;
                            }
                            qc3 = qc32;
                        } catch (Throwable th) {
                            th = th;
                            qc3 = qc32;
                            qc3.N();
                            throw th;
                        }
                    }
                    return vs7.a;
                } else if (i2 == 1) {
                    qc3 = bo7.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qc3.N();
                return vs7.a;
            }
        }
        bo7 = new bo7(this, h61);
        Object obj2 = bo7.A;
        i2 = bo7.C;
        if (i2 != 0) {
        }
        qc3.N();
        return vs7.a;
    }
}
