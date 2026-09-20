package defpackage;

/* renamed from: x96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x96 {
    public final y96 a;
    public final y96 b;
    public final Throwable c;

    public x96(y96 y96, f11 f11, Throwable th) {
        this.a = y96;
        this.b = f11;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x96)) {
            return false;
        }
        x96 x96 = (x96) obj;
        if (sg3.e(this.a, x96.a) && sg3.e(this.b, x96.b) && sg3.e(this.c, x96.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        y96 y96 = this.b;
        if (y96 == null) {
            i = 0;
        } else {
            i = y96.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        Throwable th = this.c;
        if (th != null) {
            i2 = th.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x96(y96 y96, Throwable th, int i) {
        this(y96, (f11) null, (i & 4) != 0 ? null : th);
    }
}
