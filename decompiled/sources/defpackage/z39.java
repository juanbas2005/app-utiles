package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z39 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ AtomicReference x;
    public final /* synthetic */ v49 y;

    public z39(v49 v49, AtomicReference atomicReference, int i) {
        this.w = i;
        switch (i) {
            case 1:
                this.x = atomicReference;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
            case 2:
                this.x = atomicReference;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
            case 3:
                this.x = atomicReference;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
            case 4:
                this.x = atomicReference;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
            default:
                this.x = atomicReference;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.x;
        synchronized (atomicReference) {
            try {
                y19 y19 = (y19) this.y.w;
                atomicReference.set(Double.valueOf(y19.z.m1(y19.l().i1(), by8.e0)));
                this.x.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        switch (this.w) {
            case b85.b:
                AtomicReference atomicReference = this.x;
                synchronized (atomicReference) {
                    try {
                        y19 y19 = (y19) this.y.w;
                        atomicReference.set(Boolean.valueOf(y19.z.n1(y19.l().i1(), by8.a0)));
                        this.x.notify();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.x;
                synchronized (atomicReference2) {
                    try {
                        y19 y192 = (y19) this.y.w;
                        atomicReference2.set(y192.z.j1(y192.l().i1(), by8.b0));
                        this.x.notify();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.x;
                synchronized (atomicReference3) {
                    try {
                        y19 y193 = (y19) this.y.w;
                        atomicReference3.set(Long.valueOf(y193.z.k1(y193.l().i1(), by8.c0)));
                        this.x.notify();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.x;
                synchronized (atomicReference4) {
                    try {
                        y19 y194 = (y19) this.y.w;
                        atomicReference4.set(Integer.valueOf(y194.z.l1(y194.l().i1(), by8.d0)));
                        this.x.notify();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                v49 v49 = this.y;
                q09 q09 = ((y19) v49.w).A;
                y19.e(q09);
                Bundle e = q09.J.e();
                r69 j = ((y19) v49.w).j();
                AtomicReference atomicReference5 = this.x;
                j.b1();
                j.d1();
                j.q1(new yl0(j, atomicReference5, j.s1(false), e, 10, false));
                return;
            default:
                r69 j2 = ((y19) this.y.w).j();
                c89 f = c89.f(e59.A);
                AtomicReference atomicReference6 = this.x;
                j2.b1();
                j2.d1();
                j2.q1(new yl0(j2, atomicReference6, j2.s1(false), f, 11, false));
                return;
        }
    }

    public /* synthetic */ z39(v49 v49, AtomicReference atomicReference, int i, boolean z) {
        this.w = i;
        this.y = v49;
        this.x = atomicReference;
    }
}
