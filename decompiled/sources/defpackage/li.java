package defpackage;

/* renamed from: li  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class li {
    public pq6 a;
    public long b;
    public ey3 c;
    public float d;

    public li(pq6 pq6, long j, ey3 ey3, float f, kq6 kq6) {
        this.a = pq6;
        this.b = j;
        this.c = ey3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        if (sg3.e(this.a, liVar.a) && wu6.a(this.b, liVar.b) && this.c == liVar.c && Float.compare(this.d, liVar.d) == 0 && sg3.e((Object) null, (Object) null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = pb4.b(this.a.hashCode() * 31, 31, this.b);
        return f21.d(this.d, (this.c.hashCode() + b2) * 31, 31);
    }

    public final String toString() {
        pq6 pq6 = this.a;
        String f = wu6.f(this.b);
        ey3 ey3 = this.c;
        float f2 = this.d;
        return "ShadowKey(shape=" + pq6 + ", size=" + f + ", layoutDirection=" + ey3 + ", density=" + f2 + ", shadow=" + null + ")";
    }
}
