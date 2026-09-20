package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wm1 implements y25 {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(wm1.class, "top");
    private volatile /* synthetic */ long top;
    public final int w;
    public final int x;
    public final AtomicReferenceArray y;
    public final int[] z;

    public wm1(int i) {
        if (i <= 0) {
            h.j(hl6.k(i, "capacity should be positive but it is "));
            throw null;
        } else if (i <= 536870911) {
            this.top = 0;
            int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
            this.w = highestOneBit;
            this.x = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            int i2 = highestOneBit + 1;
            this.y = new AtomicReferenceArray(i2);
            this.z = new int[i2];
        } else {
            h.j(hl6.k(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
    }

    public final void b() {
        do {
        } while (l() != null);
    }

    public final void e0(Object obj) {
        obj.getClass();
        int identityHashCode = ((System.identityHashCode(obj) * -1640531527) >>> this.x) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.y;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, (Object) null, obj)) {
                wm1 wm1 = this;
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = wm1.w;
                    }
                    i++;
                    this = wm1;
                } else {
                    this = wm1;
                }
            }
            if (identityHashCode > 0) {
                while (true) {
                    long j = this.top;
                    long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) identityHashCode);
                    this.z[identityHashCode] = (int) (4294967295L & j);
                    wm1 wm12 = this;
                    if (!A.compareAndSet(wm12, j, j2)) {
                        this = wm12;
                    } else {
                        return;
                    }
                }
            } else {
                h.q("index should be positive");
                return;
            }
        }
    }

    public abstract Object k();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r6 = 0;
        r1 = r10;
     */
    public final Object l() {
        int i;
        wm1 wm1;
        while (true) {
            long j = this.top;
            if (j == 0) {
                break;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                break;
            }
            wm1 = this;
            if (A.compareAndSet(wm1, j, (j2 << 32) | ((long) this.z[i]))) {
                break;
            }
            this = wm1;
        }
        if (i == 0) {
            return null;
        }
        return wm1.y.getAndSet(i, (Object) null);
    }

    public final Object s() {
        Object l = l();
        if (l != null) {
            return a(l);
        }
        return k();
    }

    public Object a(Object obj) {
        return obj;
    }
}
