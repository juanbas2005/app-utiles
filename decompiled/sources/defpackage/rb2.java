package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: rb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rb2 implements x72 {
    public final Object A;
    public long w;
    public Object x;
    public Object y;
    public Serializable z;

    public /* synthetic */ rb2(q09 q09, long j) {
        boolean z2;
        this.A = q09;
        z65.h("health_monitor");
        if (j > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z65.f(z2);
        this.x = "health_monitor:start";
        this.y = "health_monitor:count";
        this.z = "health_monitor:value";
        this.w = j;
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.z;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            y96 y96 = (y96) it.next();
            y96.cancel();
            y96 a = y96.a();
            if (a != null) {
                ((px5) this.x).p.addLast(a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public x96 b() {
        y96 y96;
        px5 px5 = (px5) this.x;
        if (px5.a((ex5) null)) {
            try {
                y96 = px5.b();
            } catch (Throwable th) {
                y96 = new jb2(th);
            }
            if (y96.c()) {
                return new x96(y96, (Throwable) null, 6);
            }
            if (y96 instanceof jb2) {
                return ((jb2) y96).a;
            }
            ((CopyOnWriteArrayList) this.z).add(y96);
            ((bc7) this.y).d().d(new qb2(fg8.b + " connect " + px5.i.h.g(), y96, this), 0);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (r2 < ((long) java.lang.Math.max(0, ((java.lang.Integer) defpackage.by8.j.a((java.lang.Object) null)).intValue()))) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        if (r2 >= ((long) java.lang.Math.max(0, ((java.lang.Integer) defpackage.by8.j.a((java.lang.Object) null)).intValue()))) goto L_0x00d4;
     */
    public boolean c(long j, h19 h19) {
        if (((ArrayList) this.z) == null) {
            this.z = new ArrayList();
        }
        if (((ArrayList) this.y) == null) {
            this.y = new ArrayList();
        }
        if (((ArrayList) this.z).isEmpty() || ((((h19) ((ArrayList) this.z).get(0)).A() / 1000) / 60) / 60 == ((h19.A() / 1000) / 60) / 60) {
            long m = this.w + ((long) h19.m());
            v89 v89 = (v89) this.A;
            String str = null;
            if (!v89.c0().n1((String) null, by8.Y0)) {
                v89.c0();
            } else if (!((ArrayList) this.z).isEmpty()) {
                v89.c0();
            }
            this.w = m;
            ((ArrayList) this.z).add(h19);
            ((ArrayList) this.y).add(Long.valueOf(j));
            b29 b29 = (b29) this.x;
            if (b29 != null) {
                str = b29.t();
            }
            if (((ArrayList) this.z).size() >= Math.max(1, v89.c0().l1(str, by8.k))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void d() {
        q09 q09 = (q09) this.A;
        q09.b1();
        ((y19) q09.w).G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = q09.g1().edit();
        edit.remove((String) this.y);
        edit.remove((String) this.z);
        edit.putLong((String) this.x, currentTimeMillis);
        edit.apply();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b5 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c8 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0002 A[SYNTHETIC] */
    public ex5 f() {
        long j;
        x96 x96;
        boolean z2;
        Throwable th;
        y96 y96;
        x96 x962;
        IOException iOException = null;
        while (true) {
            if (!((CopyOnWriteArrayList) this.z).isEmpty() || ((px5) this.x).a((ex5) null)) {
                try {
                    if (!((px5) this.x).k.N) {
                        br4 br4 = ((bc7) this.y).a;
                        long nanoTime = System.nanoTime();
                        long j2 = this.w - nanoTime;
                        if (!((CopyOnWriteArrayList) this.z).isEmpty()) {
                            if (j2 > 0) {
                                j = j2;
                                x96 = null;
                                if (x96 == null) {
                                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.z;
                                    if (!copyOnWriteArrayList.isEmpty()) {
                                        x96 x963 = (x96) ((LinkedBlockingDeque) this.A).poll(j, timeUnit);
                                        if (x963 != null) {
                                            copyOnWriteArrayList.remove(x963.a);
                                            x962 = x963;
                                            if (x96 == null) {
                                            }
                                        }
                                    }
                                    x962 = null;
                                    if (x96 == null) {
                                    }
                                }
                                boolean z3 = false;
                                if (x96.b == null && x96.c == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    a();
                                    if (!x96.a.c()) {
                                        x96 = x96.a.g();
                                    }
                                    if (x96.b == null && x96.c == null) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        ex5 b = x96.a.b();
                                        a();
                                        return b;
                                    }
                                }
                                th = x96.c;
                                if (th != null) {
                                    if (!(th instanceof IOException)) {
                                        throw th;
                                    } else if (iOException == null) {
                                        iOException = (IOException) th;
                                    } else {
                                        su0.b(iOException, th);
                                    }
                                }
                                y96 = x96.b;
                                if (y96 == null) {
                                    ((px5) this.x).p.addFirst(y96);
                                }
                            }
                        }
                        x96 = b();
                        j = 250000000;
                        this.w = nanoTime + 250000000;
                        if (x96 == null) {
                        }
                        boolean z32 = false;
                        if (x96.b == null || x96.c == null) {
                        }
                        if (z2) {
                        }
                        th = x96.c;
                        if (th != null) {
                        }
                        y96 = x96.b;
                        if (y96 == null) {
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            } else {
                a();
                iOException.getClass();
                throw iOException;
            }
        }
    }

    public px5 h() {
        return (px5) this.x;
    }

    public /* synthetic */ rb2(v89 v89) {
        this.A = v89;
    }

    public rb2(px5 px5, bc7 bc7) {
        bc7.getClass();
        this.x = px5;
        this.y = bc7;
        this.w = Long.MIN_VALUE;
        this.z = new CopyOnWriteArrayList();
        this.A = new LinkedBlockingDeque();
    }
}
