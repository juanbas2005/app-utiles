package defpackage;

import io.ktor.util.date.GMTDate;

/* renamed from: yl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yl1 implements g53, o81 {
    public final GMTDate A;
    public final e81 B;
    public final l43 C;
    public final Object D;
    public final cz2 E;
    public final /* synthetic */ int w = 0;
    public final w63 x;
    public final r53 y;
    public final GMTDate z;

    public yl1(we6 we6, byte[] bArr, yl1 yl1) {
        r53 r53;
        this.C = we6;
        this.D = bArr;
        this.x = yl1.e();
        switch (yl1.w) {
            case b85.b:
                r53 = yl1.y;
                break;
            default:
                r53 = yl1.y;
                break;
        }
        this.y = r53;
        this.z = yl1.c();
        this.A = yl1.d();
        this.E = yl1.a();
        this.B = yl1.k();
    }

    public final l43 V() {
        int i = this.w;
        l43 l43 = this.C;
        switch (i) {
            case b85.b:
                return l43;
            default:
                return (we6) l43;
        }
    }

    public final cz2 a() {
        switch (this.w) {
            case b85.b:
                return (i45) this.E;
            default:
                return this.E;
        }
    }

    public final hf0 b() {
        int i = this.w;
        Object obj = this.D;
        switch (i) {
            case b85.b:
                return (hf0) obj;
            default:
                return h49.c((byte[]) obj);
        }
    }

    public final GMTDate c() {
        switch (this.w) {
            case b85.b:
                return this.z;
            default:
                return this.z;
        }
    }

    public final GMTDate d() {
        switch (this.w) {
            case b85.b:
                return this.A;
            default:
                return this.A;
        }
    }

    public final w63 e() {
        int i = this.w;
        return this.x;
    }

    public final e81 k() {
        switch (this.w) {
            case b85.b:
                return this.B;
            default:
                return this.B;
        }
    }

    public final String toString() {
        return "HttpResponse[" + V().c().D() + ", " + e() + ']';
    }

    public yl1(l43 l43, i63 i63) {
        this.C = l43;
        this.B = i63.f;
        this.x = i63.a;
        this.y = i63.d;
        this.z = i63.b;
        this.A = i63.g;
        Object obj = i63.e;
        Object obj2 = obj instanceof hf0 ? (hf0) obj : null;
        if (obj2 == null) {
            hf0.a.getClass();
            obj2 = gf0.b;
        }
        this.D = obj2;
        this.E = i63.c;
    }
}
