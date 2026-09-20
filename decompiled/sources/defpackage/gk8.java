package defpackage;

import java.io.Closeable;

/* renamed from: gk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gk8 implements Closeable {
    public static final cj x = new cj(4);
    public int w;

    public final void close() {
        int i = this.w;
        if (i > 0) {
            this.w = i - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
