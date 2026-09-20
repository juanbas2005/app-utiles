package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: cl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cl5 {
    public final int a;
    public final sr2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final u11[] f;
    public final tk6 g;
    public final as h;

    /* JADX WARNING: type inference failed for: r2v4, types: [tk6, sk6] */
    public cl5(int i, sr2 sr2) {
        this.a = i;
        this.b = sr2;
        this.f = new u11[i];
        int i2 = uk6.a;
        this.g = new sk6(i);
        this.h = new as(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[Catch:{ all -> 0x007a, all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object a(h61 h61) {
        al5 al5;
        int i;
        tk6 tk6;
        ReentrantLock reentrantLock;
        as asVar = this.h;
        if (h61 instanceof al5) {
            al5 = (al5) h61;
            int i2 = al5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                al5.B = i2 - Integer.MIN_VALUE;
                Object obj = al5.z;
                i = al5.B;
                tk6 = this.g;
                if (i != 0) {
                    o85.q(obj);
                    al5.B = 1;
                    Object b2 = tk6.b(al5);
                    p81 p81 = p81.w;
                    if (b2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                reentrantLock = this.c;
                reentrantLock.lock();
                if (this.e) {
                    if (asVar.isEmpty()) {
                        if (this.d < this.a) {
                            u11 u11 = new u11((ua6) this.b.b());
                            u11[] u11Arr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            u11Arr[i3] = u11;
                            asVar.addLast(u11);
                        }
                    }
                    u11 u112 = (u11) asVar.removeLast();
                    reentrantLock.unlock();
                    return u112;
                }
                l55.w(21, "Connection pool is closed");
                throw null;
            }
        }
        al5 = new al5(this, h61);
        Object obj2 = al5.z;
        i = al5.B;
        tk6 = this.g;
        if (i != 0) {
        }
        try {
            reentrantLock = this.c;
            reentrantLock.lock();
            if (this.e) {
            }
        } catch (Throwable th) {
            tk6.d();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.Object, h06] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=j11, code=sr2, for r10v0, types: [j11] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object b(long j, sr2 sr2, h61 h61) {
        bl5 bl5;
        int i;
        h06 h06;
        bl5 bl52;
        Throwable th;
        Throwable th2;
        h06 h062;
        sr2 sr22;
        ? obj;
        Object C;
        p81 p81;
        if (h61 instanceof bl5) {
            bl5 = (bl5) h61;
            int i2 = bl5.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bl5.E = i2 - Integer.MIN_VALUE;
                Object obj2 = bl5.C;
                i = bl5.E;
                if (i != 0) {
                    o85.q(obj2);
                } else if (i == 1) {
                    j = bl5.z;
                    h062 = bl5.B;
                    sr22 = bl5.A;
                    try {
                        o85.q(obj2);
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    h06 = h062;
                    sr2 = sr22;
                    bl52 = bl5;
                    th = null;
                    try {
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (th != null) {
                                throw th;
                            }
                            Object obj3 = h06.w;
                            if (obj3 != null) {
                                return obj3;
                            }
                            throw th;
                        }
                        sr2.b();
                        bl5 = bl52;
                    } catch (Throwable th4) {
                        u11 u11 = (u11) h06.w;
                        if (u11 != null) {
                            e(u11);
                        }
                        throw th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = new Object();
                ii3 ii3 = new ii3((Object) obj, (Object) this, (f61) null, 11);
                bl5.A = sr2;
                bl5.B = obj;
                bl5.z = j;
                bl5.E = 1;
                C = b35.C(t49.d0(j), ii3, bl5);
                p81 = p81.w;
                if (C != p81) {
                    return p81;
                }
                sr22 = sr2;
                h062 = obj;
                h06 = h062;
                sr2 = sr22;
                bl52 = bl5;
                th = null;
                if (!(th instanceof TimeoutCancellationException)) {
                }
                bl5 = bl52;
                obj = new Object();
                ii3 ii32 = new ii3((Object) obj, (Object) this, (f61) null, 11);
                bl5.A = sr2;
                bl5.B = obj;
                bl5.z = j;
                bl5.E = 1;
                C = b35.C(t49.d0(j), ii32, bl5);
                p81 = p81.w;
                if (C != p81) {
                }
                return p81;
            }
        }
        bl5 = new bl5(this, h61);
        Object obj22 = bl5.C;
        i = bl5.E;
        if (i != 0) {
        }
        obj = new Object();
        try {
        } catch (Throwable th5) {
            Throwable th6 = th5;
            sr22 = sr2;
            h062 = obj;
            th2 = th6;
            Throwable th7 = th2;
            h06 = h062;
            sr2 = sr22;
            bl52 = bl5;
            th = th7;
            if (!(th instanceof TimeoutCancellationException)) {
            }
            bl5 = bl52;
            obj = new Object();
            ii3 ii322 = new ii3((Object) obj, (Object) this, (f61) null, 11);
            bl5.A = sr2;
            bl5.B = obj;
            bl5.z = j;
            bl5.E = 1;
            C = b35.C(t49.d0(j), ii322, bl5);
            p81 = p81.w;
            if (C != p81) {
            }
            return p81;
        }
        ii3 ii3222 = new ii3((Object) obj, (Object) this, (f61) null, 11);
        bl5.A = sr2;
        bl5.B = obj;
        bl5.z = j;
        bl5.E = 1;
        C = b35.C(t49.d0(j), ii3222, bl5);
        p81 = p81.w;
        if (C != p81) {
        }
        return p81;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (u11 u11 : this.f) {
                if (u11 != null) {
                    u11.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        String str;
        as asVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            n74 m = sg3.m();
            int i = asVar.y;
            for (int i2 = 0; i2 < i; i2++) {
                m.add(asVar.get(i2));
            }
            n74 i3 = sg3.i(m);
            sb.append(9 + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            tk6 tk6 = this.g;
            tk6.getClass();
            sb2.append(Math.max(sk6.C.get(tk6), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + i3.f() + ")[" + dt0.E0(i3, (String) null, (String) null, (String) null, (vr2) null, 63) + ']');
            sb.append(")");
            sb.append(10);
            int i4 = 0;
            for (u11 u11 : this.f) {
                i4++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i4);
                sb3.append("] - ");
                if (u11 != null) {
                    str = u11.w.toString();
                } else {
                    str = null;
                }
                sb3.append(str);
                sb.append(sb3.toString());
                sb.append(10);
                if (u11 != null) {
                    u11.l(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(u11 u11) {
        u11.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(u11);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
