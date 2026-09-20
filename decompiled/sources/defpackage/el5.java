package defpackage;

/* renamed from: el5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class el5 implements ab6 {
    public final ab6 w;
    public final long x = wn6.g();
    public final /* synthetic */ kl5 y;

    public el5(kl5 kl5, ab6 ab6) {
        ab6.getClass();
        this.y = kl5;
        this.w = ab6;
    }

    public final void F(int i, String str) {
        str.getClass();
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.F(i, str);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void K(double d) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.K(d);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final String R(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.R(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void close() {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.close();
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void f(long j, int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.f(j, i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final byte[] getBlob(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.getBlob(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final int getColumnCount() {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.getColumnCount();
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final String getColumnName(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.getColumnName(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final double getDouble(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.getDouble(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final long getLong(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.getLong(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void h(int i, byte[] bArr) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.h(i, bArr);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final boolean i0() {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.i0();
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final boolean isNull(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            return this.w.isNull(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void m(int i) {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.m(i);
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void n() {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.n();
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void reset() {
        if (this.y.e) {
            l55.w(21, "Statement is recycled");
            throw null;
        } else if (this.x == wn6.g()) {
            this.w.reset();
        } else {
            l55.w(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
