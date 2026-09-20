package defpackage;

import io.ktor.http.Url;

/* renamed from: f43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f43 implements x53 {
    public final i53 w;
    public final Url x;
    public final iz0 y;
    public final gz2 z;

    public f43(y53 y53) {
        this.w = y53.b;
        this.x = y53.a.b();
        this.y = y53.f;
        this.z = y53.c.d1();
    }

    public final Url D() {
        return this.x;
    }

    public final l43 V() {
        throw new IllegalStateException("Call is not initialized");
    }

    public final cz2 a() {
        return this.z;
    }

    public final iz0 getAttributes() {
        return this.y;
    }

    public final i53 getMethod() {
        return this.w;
    }
}
