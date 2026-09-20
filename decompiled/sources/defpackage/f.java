package defpackage;

import java.util.ArrayList;

/* renamed from: f  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f {
    public static final dg0 a = td0.u("/");
    public static final dg0 b = td0.u("\\");
    public static final dg0 c = td0.u("/\\");
    public static final dg0 d = td0.u(".");
    public static final dg0 e = td0.u("..");

    static {
        dg0 dg0 = dg0.z;
    }

    public static final int a(ae5 ae5) {
        dg0 dg0 = ae5.w;
        if (dg0.d() != 0) {
            if (dg0.i(0) != 47) {
                if (dg0.i(0) == 92) {
                    if (dg0.d() > 2 && dg0.i(1) == 92) {
                        dg0 dg02 = b;
                        dg02.getClass();
                        int f = dg0.f(2, dg02.h());
                        if (f == -1) {
                            return dg0.d();
                        }
                        return f;
                    }
                } else if (dg0.d() > 2 && dg0.i(1) == 58 && dg0.i(2) == 92) {
                    char i = (char) dg0.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' > i || i >= '[') {
                        return -1;
                    }
                    return 3;
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [sc0, java.lang.Object] */
    public static final ae5 b(ae5 ae5, ae5 ae52, boolean z) {
        ae52.getClass();
        if (a(ae52) != -1 || ae52.e() != null) {
            return ae52;
        }
        dg0 c2 = c(ae5);
        if (c2 == null && (c2 = c(ae52)) == null) {
            c2 = f(ae5.x);
        }
        ? obj = new Object();
        obj.X(ae5.w);
        if (obj.x > 0) {
            obj.X(c2);
        }
        obj.X(ae52.w);
        return d(obj, z);
    }

    public static final dg0 c(ae5 ae5) {
        dg0 dg0 = ae5.w;
        dg0 dg02 = a;
        if (dg0.g(dg0, dg02) != -1) {
            return dg02;
        }
        dg0 dg03 = ae5.w;
        dg0 dg04 = b;
        if (dg0.g(dg03, dg04) != -1) {
            return dg04;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [sc0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0110 A[EDGE_INSN: B:91:0x0110->B:73:0x0110 ?: BREAK  , SYNTHETIC] */
    public static final ae5 d(sc0 sc0, boolean z) {
        dg0 dg0;
        boolean z2;
        long j;
        boolean z3;
        boolean x;
        dg0 dg02;
        int size;
        int i;
        dg0 dg03;
        char u;
        sc0 sc02 = sc0;
        ? obj = new Object();
        dg0 dg04 = null;
        int i2 = 0;
        while (true) {
            if (!sc02.c0(0, a)) {
                dg0 = b;
                if (!sc02.c0(0, dg0)) {
                    break;
                }
            }
            byte readByte = sc02.readByte();
            if (dg04 == null) {
                dg04 = e(readByte);
            }
            i2++;
        }
        if (i2 < 2 || !sg3.e(dg04, dg0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        dg0 dg05 = c;
        if (z2) {
            dg04.getClass();
            obj.X(dg04);
            obj.X(dg04);
        } else if (i2 > 0) {
            dg04.getClass();
            obj.X(dg04);
        } else {
            long v = sc02.v(dg05);
            if (dg04 == null) {
                if (v == -1) {
                    dg04 = f(ae5.x);
                } else {
                    dg04 = e(sc02.u(v));
                }
            }
            if (sg3.e(dg04, dg0) && sc02.x >= 2) {
                j = -1;
                if (sc02.u(1) == 58 && (('a' <= (u = (char) sc02.u(0)) && u < '{') || ('A' <= u && u < '['))) {
                    if (v == 2) {
                        obj.g0(3, sc02);
                    } else {
                        obj.g0(2, sc02);
                    }
                }
                if (obj.x <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ArrayList arrayList = new ArrayList();
                while (true) {
                    x = sc02.x();
                    dg02 = d;
                    if (!x) {
                        break;
                    }
                    long v2 = sc02.v(dg05);
                    if (v2 == j) {
                        dg03 = sc02.q(sc02.x);
                    } else {
                        dg03 = sc02.q(v2);
                        sc02.readByte();
                    }
                    dg0 dg06 = e;
                    if (sg3.e(dg03, dg06)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || sg3.e(dt0.G0(arrayList), dg06)))) {
                                arrayList.add(dg03);
                            } else if (!z2 || arrayList.size() != 1) {
                                it0.l0(arrayList);
                            }
                        }
                    } else if (!sg3.e(dg03, dg02) && !sg3.e(dg03, dg0.z)) {
                        arrayList.add(dg03);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        obj.X(dg04);
                    }
                    obj.X((dg0) arrayList.get(i));
                }
                if (obj.x == 0) {
                    obj.X(dg02);
                }
                return new ae5(obj.q(obj.x));
            }
        }
        j = -1;
        if (obj.x <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            x = sc02.x();
            dg02 = d;
            if (!x) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (obj.x == 0) {
        }
        return new ae5(obj.q(obj.x));
    }

    public static final dg0 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        h.q(hl6.k(b2, "not a directory separator: "));
        return null;
    }

    public static final dg0 f(String str) {
        if (sg3.e(str, "/")) {
            return a;
        }
        if (sg3.e(str, "\\")) {
            return b;
        }
        h.q(b81.y("not a directory separator: ", str));
        return null;
    }
}
