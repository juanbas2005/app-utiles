package defpackage;

/* renamed from: yu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu0 {
    public final Object a;
    public final fk0 b;
    public final hs2 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ yu0(Object obj, fk0 fk0, hs2 hs2, Throwable th, int i) {
        this(obj, fk0, hs2, (Object) null, r7);
        Throwable th2;
        fk0 = (i & 2) != 0 ? null : fk0;
        hs2 = (i & 4) != 0 ? null : hs2;
        if ((i & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
    }

    public static yu0 a(yu0 yu0, fk0 fk0, Throwable th, int i) {
        Object obj = yu0.a;
        if ((i & 2) != 0) {
            fk0 = yu0.b;
        }
        fk0 fk02 = fk0;
        hs2 hs2 = yu0.c;
        Object obj2 = yu0.d;
        if ((i & 16) != 0) {
            th = yu0.e;
        }
        return new yu0(obj, fk02, hs2, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0)) {
            return false;
        }
        yu0 yu0 = (yu0) obj;
        if (sg3.e(this.a, yu0.a) && sg3.e(this.b, yu0.b) && sg3.e(this.c, yu0.c) && sg3.e(this.d, yu0.d) && sg3.e(this.e, yu0.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        Object obj = this.a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i6 = i * 31;
        fk0 fk0 = this.b;
        if (fk0 == null) {
            i2 = 0;
        } else {
            i2 = fk0.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        hs2 hs2 = this.c;
        if (hs2 == null) {
            i3 = 0;
        } else {
            i3 = hs2.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            i4 = 0;
        } else {
            i4 = obj2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i5 = th.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public yu0(Object obj, fk0 fk0, hs2 hs2, Object obj2, Throwable th) {
        this.a = obj;
        this.b = fk0;
        this.c = hs2;
        this.d = obj2;
        this.e = th;
    }
}
