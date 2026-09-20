package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: bc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc7 {
    public static final Logger k;
    public static final bc7 l = new bc7(new br4(new eg8(f21.l(new StringBuilder(), fg8.b, " TaskRunner"), true)));
    public final br4 a;
    public final Logger b;
    public int c = 10000;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ge j = new ge(14, (Object) this);

    static {
        Logger logger = Logger.getLogger(bc7.class.getName());
        logger.getClass();
        k = logger;
    }

    public bc7(br4 br4) {
        Logger logger = k;
        logger.getClass();
        this.a = br4;
        this.b = logger;
    }

    public static final void a(bc7 bc7, vb7 vb7, long j2, boolean z) {
        TimeZone timeZone = fg8.a;
        ac7 ac7 = vb7.c;
        ac7.getClass();
        if (ac7.d == vb7) {
            boolean z2 = ac7.f;
            ac7.f = false;
            ac7.d = null;
            bc7.h.remove(ac7);
            if (j2 != -1 && !z2 && !ac7.c) {
                ac7.e(vb7, j2, true);
            }
            if (!ac7.e.isEmpty()) {
                bc7.i.add(ac7);
                if (!z) {
                    bc7.e();
                    return;
                }
                return;
            }
            return;
        }
        h.s("Check failed.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:39|40|(2:43|41)|64|44|(3:46|(2:48|65)(1:66)|49)|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = defpackage.fg8.a;
        r2 = r9.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        if (-1 < r2) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        ((defpackage.ac7) r9.get(r2)).b();
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r2 = r0.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (-1 < r2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r4 = (defpackage.ac7) r0.get(r2);
        r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
        if (r4.e.isEmpty() != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        r0.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00db, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r1.d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00aa */
    public final vb7 b() {
        boolean z;
        TimeZone timeZone = fg8.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            vb7 vb7 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                vb7 vb72 = (vb7) ((ac7) it.next()).e.get(0);
                long max = Math.max(0, vb72.d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else if (vb7 != null) {
                    z = true;
                    break;
                } else {
                    vb7 = vb72;
                }
            }
            ArrayList arrayList2 = this.h;
            if (vb7 != null) {
                TimeZone timeZone2 = fg8.a;
                vb7.d = -1;
                ac7 ac7 = vb7.c;
                ac7.getClass();
                ac7.e.remove(vb7);
                arrayList.remove(ac7);
                ac7.d = vb7;
                arrayList2.add(ac7);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return vb7;
            } else if (!this.d) {
                this.d = true;
                this.e = nanoTime + j2;
                TimeZone timeZone3 = fg8.a;
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 > 0) {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || i2 > 0) {
                        wait(j3, (int) j4);
                    }
                }
                this.d = false;
            } else if (j2 < this.e - nanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(ac7 ac7) {
        ac7.getClass();
        TimeZone timeZone = fg8.a;
        if (ac7.d == null) {
            boolean isEmpty = ac7.e.isEmpty();
            ArrayList arrayList = this.i;
            if (!isEmpty) {
                byte[] bArr = dg8.a;
                arrayList.getClass();
                if (!arrayList.contains(ac7)) {
                    arrayList.add(ac7);
                }
            } else {
                arrayList.remove(ac7);
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final ac7 d() {
        int i2;
        synchronized (this) {
            i2 = this.c;
            this.c = i2 + 1;
        }
        return new ac7(this, hl6.k(i2, "Q"));
    }

    public final void e() {
        TimeZone timeZone = fg8.a;
        int i2 = this.f;
        if (i2 <= this.g) {
            this.f = i2 + 1;
            ge geVar = this.j;
            geVar.getClass();
            ((ThreadPoolExecutor) this.a.x).execute(geVar);
        }
    }
}
