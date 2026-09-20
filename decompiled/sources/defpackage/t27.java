package defpackage;

/* renamed from: t27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t27 implements m38 {
    public final m38 w;
    public final long x;

    public t27(m38 m38, long j) {
        this.w = m38;
        this.x = j;
    }

    public final boolean a() {
        return this.w.a();
    }

    public final long d(ol olVar, ol olVar2, ol olVar3) {
        return this.w.d(olVar, olVar2, olVar3) + this.x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t27)) {
            return false;
        }
        t27 t27 = (t27) obj;
        if (t27.x != this.x || !sg3.e(t27.w, this.w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + (this.w.hashCode() * 31);
    }

    public final ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2 = this.x;
        if (j < j2) {
            return olVar3;
        }
        return this.w.j(j - j2, olVar, olVar2, olVar3);
    }

    public final ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2 = this.x;
        if (j < j2) {
            return olVar;
        }
        return this.w.t(j - j2, olVar, olVar2, olVar3);
    }
}
