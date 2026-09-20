package defpackage;

import android.database.SQLException;

/* renamed from: kl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kl5 implements kl7, cw5 {
    public final g22 a;
    public final u11 b;
    public final boolean c;
    public final as d = new as();
    public volatile boolean e;

    public kl5(g22 g22, u11 u11, boolean z) {
        g22.getClass();
        this.a = g22;
        this.b = u11;
        this.c = z;
    }

    public final Object a(jl7 jl7, gs2 gs2, a97 a97) {
        if (!this.e) {
            e81 e81 = a97.x;
            e81.getClass();
            g11 g11 = (g11) e81.a0(this.a);
            if (g11 != null && g11.x == this) {
                return g(jl7, gs2, a97);
            }
            l55.w(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        l55.w(21, "Connection is recycled");
        throw null;
    }

    public final Boolean b(f61 f61) {
        boolean z;
        if (!this.e) {
            e81 e81 = ((h61) f61).x;
            e81.getClass();
            g11 g11 = (g11) e81.a0(this.a);
            if (g11 == null || g11.x != this) {
                l55.w(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            if (!this.d.isEmpty() || this.b.w.Z()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        l55.w(21, "Connection is recycled");
        throw null;
    }

    public final ua6 c() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        defpackage.dh4.f(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        throw r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object d(String str, vr2 vr2, h61 h61) {
        jl5 jl5;
        int i;
        u11 u11;
        if (h61 instanceof jl5) {
            jl5 = (jl5) h61;
            int i2 = jl5.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jl5.E = i2 - Integer.MIN_VALUE;
                Object obj = jl5.C;
                p81 p81 = p81.w;
                i = jl5.E;
                if (i != 0) {
                    o85.q(obj);
                    if (!this.e) {
                        e81 e81 = jl5.x;
                        e81.getClass();
                        g11 g11 = (g11) e81.a0(this.a);
                        if (g11 == null || g11.x != this) {
                            l55.w(21, "Attempted to use connection on a different coroutine");
                            throw null;
                        }
                        u11 = this.b;
                        jl5.z = str;
                        jl5.A = vr2;
                        jl5.B = u11;
                        jl5.E = 1;
                        if (u11.x.a(jl5) == p81) {
                            return p81;
                        }
                    } else {
                        l55.w(21, "Connection is recycled");
                        throw null;
                    }
                } else if (i == 1) {
                    u11 u112 = jl5.B;
                    vr2 = jl5.A;
                    String str2 = jl5.z;
                    o85.q(obj);
                    u11 = u112;
                    str = str2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                el5 el5 = new el5(this, this.b.k0(str));
                Object y = vr2.y(el5);
                dh4.f(el5, (Throwable) null);
                return y;
            }
        }
        jl5 = new jl5(this, h61);
        Object obj2 = jl5.C;
        p81 p812 = p81.w;
        i = jl5.E;
        if (i != 0) {
        }
        try {
            el5 el52 = new el5(this, this.b.k0(str));
            Object y2 = vr2.y(el52);
            dh4.f(el52, (Throwable) null);
            return y2;
        } finally {
            u11.k((Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public final Object e(jl7 jl7, h61 h61) {
        gl5 gl5;
        int i;
        u11 u11;
        as asVar = this.d;
        if (h61 instanceof gl5) {
            gl5 = (gl5) h61;
            int i2 = gl5.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gl5.D = i2 - Integer.MIN_VALUE;
                Object obj = gl5.B;
                i = gl5.D;
                u11 u112 = this.b;
                if (i != 0) {
                    o85.q(obj);
                    gl5.z = jl7;
                    gl5.A = u112;
                    gl5.D = 1;
                    Object a2 = u112.x.a(gl5);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    u11 = u112;
                } else if (i == 1) {
                    u11 u113 = gl5.A;
                    jl7 jl72 = gl5.z;
                    o85.q(obj);
                    u11 = u113;
                    jl7 = jl72;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = asVar.y;
                if (!asVar.isEmpty()) {
                    int ordinal = jl7.ordinal();
                    if (ordinal == 0) {
                        l55.m(u112, "BEGIN DEFERRED TRANSACTION");
                    } else if (ordinal == 1) {
                        l55.m(u112, "BEGIN IMMEDIATE TRANSACTION");
                    } else if (ordinal == 2) {
                        l55.m(u112, "BEGIN EXCLUSIVE TRANSACTION");
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    l55.m(u112, "SAVEPOINT '" + i3 + '\'');
                }
                asVar.addLast(new fl5(i3));
                vs7 vs7 = vs7.a;
                u11.k((Object) null);
                return vs7;
            }
        }
        gl5 = new gl5(this, h61);
        Object obj2 = gl5.B;
        i = gl5.D;
        u11 u1122 = this.b;
        if (i != 0) {
        }
        try {
            int i32 = asVar.y;
            if (!asVar.isEmpty()) {
            }
            asVar.addLast(new fl5(i32));
            vs7 vs72 = vs7.a;
            u11.k((Object) null);
            return vs72;
        } catch (Throwable th) {
            u11.k((Object) null);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[SYNTHETIC, Splitter:B:34:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public final Object f(boolean z, h61 h61) {
        hl5 hl5;
        int i;
        u11 u11;
        as asVar = this.d;
        if (h61 instanceof hl5) {
            hl5 = (hl5) h61;
            int i2 = hl5.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hl5.D = i2 - Integer.MIN_VALUE;
                Object obj = hl5.B;
                i = hl5.D;
                u11 u112 = this.b;
                if (i != 0) {
                    o85.q(obj);
                    hl5.A = u112;
                    hl5.z = z;
                    hl5.D = 1;
                    Object a2 = u112.x.a(hl5);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    u11 = u112;
                } else if (i == 1) {
                    z = hl5.z;
                    u11 = hl5.A;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (asVar.isEmpty()) {
                    fl5 fl5 = (fl5) it0.k0(asVar);
                    if (z) {
                        fl5.getClass();
                        if (asVar.isEmpty()) {
                            l55.m(u112, "END TRANSACTION");
                        } else {
                            l55.m(u112, "RELEASE SAVEPOINT '" + fl5.a + '\'');
                        }
                    } else if (asVar.isEmpty()) {
                        l55.m(u112, "ROLLBACK TRANSACTION");
                    } else {
                        l55.m(u112, "ROLLBACK TRANSACTION TO SAVEPOINT '" + fl5.a + '\'');
                    }
                    vs7 vs7 = vs7.a;
                    u11.k((Object) null);
                    return vs7;
                }
                throw new IllegalStateException("Not in a transaction");
            }
        }
        hl5 = new hl5(this, h61);
        Object obj2 = hl5.B;
        i = hl5.D;
        u11 u1122 = this.b;
        if (i != 0) {
        }
        try {
            if (asVar.isEmpty()) {
            }
        } catch (Throwable th) {
            u11.k((Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: gs2} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (e(r11, r0) == r8) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.z = r11;
        r0.A = r12;
        r0.E = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        if (f(false, r0) != r8) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        r9 = r12;
        r12 = r10;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if (r11 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        defpackage.su0.b(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        throw r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public final Object g(jl7 jl7, gs2 gs2, h61 h61) {
        il5 il5;
        Object obj;
        int i;
        Object obj2;
        int i2;
        if (h61 instanceof il5) {
            il5 = (il5) h61;
            int i3 = il5.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                il5.E = i3 - Integer.MIN_VALUE;
                obj = il5.C;
                i = il5.E;
                boolean z = false;
                obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (jl7 == null) {
                        jl7 = jl7.w;
                    }
                    il5.z = gs2;
                    il5.E = 1;
                } else if (i == 1) {
                    gs2 = il5.z;
                    o85.q(obj);
                } else if (i == 2) {
                    i2 = il5.B;
                    o85.q(obj);
                    if (i2 != 0) {
                        z = true;
                    }
                    il5.z = obj;
                    il5.E = 3;
                    if (f(z, il5) != obj2) {
                        return obj2;
                    }
                    return obj;
                } else if (i == 3 || i == 4) {
                    Object obj3 = il5.z;
                    o85.q(obj);
                    return obj3;
                } else if (i != 5) {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    Throwable th = il5.A;
                    r11 = (Throwable) il5.z;
                    try {
                        o85.q(obj);
                    } catch (SQLException e2) {
                        SQLException e3 = e2;
                    }
                    throw th;
                }
                rd5 rd5 = new rd5(1, this);
                il5.z = null;
                il5.B = 1;
                il5.E = 2;
                obj = gs2.H(rd5, il5);
                if (obj != obj2) {
                    i2 = 1;
                    if (i2 != 0) {
                    }
                    il5.z = obj;
                    il5.E = 3;
                    if (f(z, il5) != obj2) {
                    }
                }
                return obj2;
            }
        }
        il5 = new il5(this, h61);
        obj = il5.C;
        i = il5.E;
        boolean z2 = false;
        obj2 = p81.w;
        if (i != 0) {
        }
        rd5 rd52 = new rd5(1, this);
        il5.z = null;
        il5.B = 1;
        il5.E = 2;
        obj = gs2.H(rd52, il5);
        if (obj != obj2) {
        }
        return obj2;
    }
}
