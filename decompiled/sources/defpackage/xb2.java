package defpackage;

import java.io.IOException;

/* renamed from: xb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xb2 extends rp2 {
    public final gg0 x;
    public boolean y;

    public xb2(tu6 tu6, gg0 gg0) {
        super(tu6);
        this.x = gg0;
    }

    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.y = true;
            this.x.y(e);
        }
    }

    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.y = true;
            this.x.y(e);
        }
    }

    public final void g0(long j, sc0 sc0) {
        if (this.y) {
            sc0.skip(j);
            return;
        }
        try {
            this.w.g0(j, sc0);
        } catch (IOException e) {
            this.y = true;
            this.x.y(e);
        }
    }
}
