package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ti6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ti6 {
    public static final qi6 a = new qi6(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(qi6 qi6) {
        int i;
        qi6.getClass();
        if (qi6.f != null || qi6.g != null) {
            h.q("Failed requirement.");
        } else if (!qi6.d) {
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
            qi6 qi62 = a;
            qi6 qi63 = (qi6) atomicReference.getAndSet(qi62);
            if (qi63 != qi62) {
                if (qi63 != null) {
                    i = qi63.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(qi63);
                    return;
                }
                qi6.f = qi63;
                qi6.b = 0;
                qi6.c = i + 8192;
                atomicReference.set(qi6);
            }
        }
    }

    public static final qi6 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        qi6 qi6 = a;
        qi6 qi62 = (qi6) atomicReference.getAndSet(qi6);
        if (qi62 == qi6) {
            return new qi6();
        }
        if (qi62 == null) {
            atomicReference.set((Object) null);
            return new qi6();
        }
        atomicReference.set(qi62.f);
        qi62.f = null;
        qi62.c = 0;
        return qi62;
    }
}
