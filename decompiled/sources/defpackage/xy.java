package defpackage;

/* renamed from: xy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xy {
    public final int a;
    public final long b;

    public xy(long j, int i) {
        if (i != 0) {
            this.a = i;
            this.b = j;
            return;
        }
        ku4.j("Null status");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xy)) {
            return false;
        }
        xy xyVar = (xy) obj;
        if (!b81.c(this.a, xyVar.a) || this.b != xyVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((b81.B(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(b81.C(this.a));
        sb.append(", nextRequestWaitMillis=");
        return f21.k(sb, this.b, "}");
    }
}
