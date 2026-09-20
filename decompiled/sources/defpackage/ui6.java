package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ui6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ui6 {
    public static final pi6 a = new pi6(new byte[0], 0, 0, (i06) null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        String str;
        int intValue;
        int i = 0;
        int i2 = 1;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        int i3 = highestOneBit / 2;
        if (i3 >= 1) {
            i2 = i3;
        }
        c = i2;
        if (sg3.e(System.getProperty("java.vm.name"), "Dalvik")) {
            str = "0";
        } else {
            str = "4194304";
        }
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        property.getClass();
        Integer v0 = k57.v0(property);
        if (v0 != null && (intValue = v0.intValue()) >= 0) {
            i = intValue;
        }
        d = i;
        int i4 = i / i2;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(highestOneBit);
        g = new AtomicReferenceArray(i2);
    }

    public static final void a(pi6 pi6) {
        int i;
        int i2;
        pi6 pi62 = a;
        pi6.getClass();
        if (pi6.f == null && pi6.g == null) {
            i06 i06 = pi6.d;
            if (!(i06 == null || i06.a == 0)) {
                int decrementAndGet = i06.b.decrementAndGet(i06);
                if (decrementAndGet < 0) {
                    if (decrementAndGet == -1) {
                        i06.a = 0;
                    } else {
                        ku4.q(decrementAndGet + 1, "Shared copies count is negative: ");
                        return;
                    }
                } else {
                    return;
                }
            }
            AtomicReferenceArray atomicReferenceArray = f;
            int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
            pi6.b = 0;
            pi6.e = true;
            while (true) {
                pi6 pi63 = (pi6) atomicReferenceArray.get(id);
                if (pi63 != pi62) {
                    if (pi63 != null) {
                        i = pi63.c;
                    } else {
                        i = 0;
                    }
                    if (i < 65536) {
                        pi6.f = pi63;
                        pi6.c = i + 8192;
                        while (!atomicReferenceArray.compareAndSet(id, pi63, pi6)) {
                            if (atomicReferenceArray.get(id) != pi63) {
                            }
                        }
                        return;
                    } else if (d > 0) {
                        pi6.b = 0;
                        pi6.e = true;
                        int id2 = (int) ((((long) c) - 1) & Thread.currentThread().getId());
                        AtomicReferenceArray atomicReferenceArray2 = g;
                        int i3 = 0;
                        while (true) {
                            pi6 pi64 = (pi6) atomicReferenceArray2.get(id2);
                            if (pi64 != pi62) {
                                if (pi64 != null) {
                                    i2 = pi64.c;
                                } else {
                                    i2 = 0;
                                }
                                int i4 = i2 + 8192;
                                if (i4 > e) {
                                    int i5 = c;
                                    if (i3 < i5) {
                                        i3++;
                                        id2 = (id2 + 1) & (i5 - 1);
                                    } else {
                                        return;
                                    }
                                } else {
                                    pi6.f = pi64;
                                    pi6.c = i4;
                                    while (!atomicReferenceArray2.compareAndSet(id2, pi64, pi6)) {
                                        if (atomicReferenceArray2.get(id2) != pi64) {
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            h.q("Failed requirement.");
        }
    }

    public static final pi6 b() {
        AtomicReferenceArray atomicReferenceArray;
        pi6 pi6;
        pi6 pi62;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            pi6 = a;
            pi62 = (pi6) atomicReferenceArray.getAndSet(id, pi6);
        } while (sg3.e(pi62, pi6));
        if (pi62 == null) {
            atomicReferenceArray.set(id, (Object) null);
            if (d <= 0) {
                return new pi6();
            }
            int i = c;
            int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
            int i2 = 0;
            while (true) {
                AtomicReferenceArray atomicReferenceArray2 = g;
                pi6 pi63 = (pi6) atomicReferenceArray2.getAndSet(id2, pi6);
                if (!sg3.e(pi63, pi6)) {
                    if (pi63 == null) {
                        atomicReferenceArray2.set(id2, (Object) null);
                        if (i2 >= i) {
                            return new pi6();
                        }
                        id2 = (id2 + 1) & (i - 1);
                        i2++;
                    } else {
                        atomicReferenceArray2.set(id2, pi63.f);
                        pi63.f = null;
                        pi63.c = 0;
                        return pi63;
                    }
                }
            }
        } else {
            atomicReferenceArray.set(id, pi62.f);
            pi62.f = null;
            pi62.c = 0;
            return pi62;
        }
    }
}
