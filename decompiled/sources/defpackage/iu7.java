package defpackage;

/* renamed from: iu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iu7 implements c81 {
    public final iu7 w;
    public final jf1 x;

    public iu7(iu7 iu7, jf1 jf1) {
        this.w = iu7;
        this.x = jf1;
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public final /* bridge */ e81 L(d81 d81) {
        return rc9.A0(this, d81);
    }

    public final /* bridge */ e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    public final void a(jf1 jf1) {
        if (this.x != jf1) {
            iu7 iu7 = this.w;
            if (iu7 != null) {
                iu7.a(jf1);
                return;
            }
            return;
        }
        h.s("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    public final /* bridge */ c81 a0(d81 d81) {
        return rc9.J(this, d81);
    }

    public final d81 getKey() {
        return kw5.N;
    }
}
