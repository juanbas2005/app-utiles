package defpackage;

import java.io.Closeable;

/* renamed from: pv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pv1 implements Closeable {
    public final ov1 w;
    public boolean x;
    public final /* synthetic */ rv1 y;

    public pv1(rv1 rv1, ov1 ov1) {
        this.y = rv1;
        this.w = ov1;
    }

    public final void close() {
        if (!this.x) {
            this.x = true;
            rv1 rv1 = this.y;
            synchronized (rv1) {
                ov1 ov1 = this.w;
                int i = ov1.h - 1;
                ov1.h = i;
                if (i == 0 && ov1.f) {
                    k26 k26 = rv1.M;
                    rv1.G(ov1);
                }
            }
        }
    }
}
