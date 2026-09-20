package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: x80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x80 implements Runnable {
    public final /* synthetic */ int w;
    public final WeakReference x;

    public x80(f90 f90, int i) {
        this.w = i;
        switch (i) {
            case 2:
                this.x = new WeakReference(f90);
                return;
            default:
                this.x = new WeakReference(f90);
                return;
        }
    }

    public final void run() {
        int i = this.w;
        WeakReference weakReference = this.x;
        switch (i) {
            case b85.b:
                if (weakReference.get() != null) {
                    ((y80) weakReference.get()).Z();
                    return;
                }
                return;
            case 1:
                if (weakReference.get() != null) {
                    ((f90) weakReference.get()).m = false;
                    return;
                }
                return;
            default:
                if (weakReference.get() != null) {
                    ((f90) weakReference.get()).n = false;
                    return;
                }
                return;
        }
    }

    public x80(y80 y80) {
        this.w = 0;
        this.x = new WeakReference(y80);
    }
}
