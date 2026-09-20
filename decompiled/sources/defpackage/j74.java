package defpackage;

/* renamed from: j74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j74 extends jb5 {
    public final gq3 d;
    public final Object e;
    public final jb5 f;

    public j74(gq3 gq3, Object obj, jb5 jb5) {
        obj.getClass();
        jb5.getClass();
        this.d = gq3;
        this.e = obj;
        this.f = jb5;
    }

    public final jb5 C(gq3 gq3, Object obj) {
        gq3 gq32 = this.d;
        boolean equals = gq3.equals(gq32);
        jb5 jb5 = this.f;
        if (!equals) {
            jb5 C = jb5.C(gq3, (Object) null);
            if (C != jb5) {
                this = new j74(gq32, this.e, C);
            }
            jb5 = this;
        }
        if (obj != null) {
            return new j74(gq3, obj, jb5);
        }
        return jb5;
    }

    public final String toString() {
        return dt0.E0(dt0.O0(cl6.V(cl6.S(new tm3(12), this))), (String) null, "{", "}", new tm3(13), 25);
    }
}
