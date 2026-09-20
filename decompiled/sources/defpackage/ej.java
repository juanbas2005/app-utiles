package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: ej  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ej extends h81 {
    public static final z97 I = new z97(xe.H);
    public static final cj J = new cj(0);
    public final Object A = new Object();
    public final as B = new as();
    public ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public boolean E;
    public boolean F;
    public final dj G = new dj(this);
    public final gj H;
    public final Choreographer y;
    public final Handler z;

    public ej(Choreographer choreographer, Handler handler) {
        this.y = choreographer;
        this.z = handler;
        this.H = new gj(choreographer, this);
    }

    public static final void o0(ej ejVar) {
        Object obj;
        Runnable runnable;
        boolean z2;
        Object obj2;
        do {
            synchronized (ejVar.A) {
                as asVar = ejVar.B;
                if (asVar.isEmpty()) {
                    obj = null;
                } else {
                    obj = asVar.removeFirst();
                }
                runnable = (Runnable) obj;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (ejVar.A) {
                    as asVar2 = ejVar.B;
                    if (asVar2.isEmpty()) {
                        obj2 = null;
                    } else {
                        obj2 = asVar2.removeFirst();
                    }
                    runnable = (Runnable) obj2;
                }
            }
            synchronized (ejVar.A) {
                if (ejVar.B.isEmpty()) {
                    z2 = false;
                    ejVar.E = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    public final void D(e81 e81, Runnable runnable) {
        synchronized (this.A) {
            this.B.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.z.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.y.postFrameCallback(this.G);
                }
            }
        }
    }
}
