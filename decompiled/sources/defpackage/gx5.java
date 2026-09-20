package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* renamed from: gx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gx5 implements Closeable {
    public final /* synthetic */ int w;
    public final Object x;

    public gx5() {
        this.w = 1;
        this.x = new Inflater(true);
    }

    public final void close() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((pv1) obj).close();
                return;
            default:
                ((Inflater) obj).end();
                return;
        }
    }

    public gx5(pv1 pv1) {
        this.w = 0;
        this.x = pv1;
    }
}
