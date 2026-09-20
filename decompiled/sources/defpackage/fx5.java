package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: fx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fx5 extends vb7 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx5(m22 m22, String str) {
        super(str, true);
        this.f = m22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        defpackage.fg8.c(r8.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (((java.util.concurrent.ConcurrentLinkedQueue) r0.z).isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        ((defpackage.ac7) r0.x).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 0;
     */
    public final long a() {
        switch (this.e) {
            case b85.b:
                m22 m22 = (m22) this.f;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - m22.w) + 1;
                Iterator it = ((ConcurrentLinkedQueue) m22.z).iterator();
                it.getClass();
                ex5 ex5 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                ex5 ex52 = null;
                ex5 ex53 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    ex5 ex54 = (ex5) it.next();
                    ex54.getClass();
                    synchronized (ex54) {
                        if (m22.a(ex54, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = ex54.q;
                            if (j3 < j) {
                                j = j3;
                                ex52 = ex54;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                ex53 = ex54;
                            }
                        }
                    }
                }
                if (ex52 != null) {
                    ex5 = ex52;
                } else if (i > 5) {
                    j = j2;
                    ex5 = ex53;
                } else {
                    j = -1;
                }
                if (ex5 != null) {
                    synchronized (ex5) {
                        if (ex5.p.isEmpty()) {
                            if (ex5.q == j) {
                                ex5.j = true;
                                ((ConcurrentLinkedQueue) m22.z).remove(ex5);
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                } else if (ex53 != null) {
                    return (j2 + m22.w) - nanoTime;
                } else {
                    if (i2 > 0) {
                        return m22.w;
                    }
                    return -1;
                }
                break;
            default:
                ((sr2) this.f).b();
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx5(String str, boolean z, sr2 sr2) {
        super(str, z);
        this.f = sr2;
    }
}
