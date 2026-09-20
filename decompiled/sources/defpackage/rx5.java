package defpackage;

import java.io.EOFException;

/* renamed from: rx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rx5 implements py6 {
    public final ef5 w;
    public boolean x;
    public final tc0 y = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [tc0, java.lang.Object] */
    public rx5(ef5 ef5) {
        this.w = ef5;
    }

    public final tc0 c() {
        return this.y;
    }

    public final void close() {
        if (!this.x) {
            this.x = true;
            this.w.A = true;
            tc0 tc0 = this.y;
            tc0.skip(tc0.y);
        }
    }

    public final boolean j(long j) {
        tc0 tc0;
        if (this.x) {
            h.s("Source is closed.");
            return false;
        } else if (j >= 0) {
            do {
                tc0 = this.y;
                if (tc0.y >= j) {
                    return true;
                }
            } while (this.w.y(tc0, 8192) != -1);
            return false;
        } else {
            h.j(f21.f(j, "byteCount: "));
            return false;
        }
    }

    public final void p(long j) {
        if (!j(j)) {
            throw new EOFException(f21.g(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    public final byte readByte() {
        p(1);
        return this.y.readByte();
    }

    public final String toString() {
        return "buffered(" + this.w + ')';
    }

    public final boolean x() {
        if (!this.x) {
            tc0 tc0 = this.y;
            if (!tc0.x() || this.w.y(tc0, 8192) != -1) {
                return false;
            }
            return true;
        }
        h.s("Source is closed.");
        return false;
    }

    public final long y(tc0 tc0, long j) {
        if (this.x) {
            h.s("Source is closed.");
            return 0;
        } else if (j >= 0) {
            tc0 tc02 = this.y;
            if (tc02.y == 0 && this.w.y(tc02, 8192) == -1) {
                return -1;
            }
            return tc02.y(tc0, Math.min(j, tc02.y));
        } else {
            h.j(f21.f(j, "byteCount: "));
            return 0;
        }
    }
}
