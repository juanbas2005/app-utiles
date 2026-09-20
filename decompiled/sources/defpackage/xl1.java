package defpackage;

import io.ktor.http.Url;

/* renamed from: xl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xl1 implements x53 {
    public final iz0 A;
    public final l43 w;
    public final i53 x;
    public final Url y;
    public final gz2 z;

    public xl1(l43 l43, md2 md2) {
        this.w = l43;
        this.x = (i53) md2.c;
        this.y = (Url) md2.b;
        this.z = (gz2) md2.d;
        this.A = (iz0) md2.g;
    }

    public final Url D() {
        return this.y;
    }

    public final l43 V() {
        return this.w;
    }

    public final cz2 a() {
        return this.z;
    }

    public final iz0 getAttributes() {
        return this.A;
    }

    public final i53 getMethod() {
        return this.x;
    }

    public final e81 k() {
        return this.w.k();
    }
}
