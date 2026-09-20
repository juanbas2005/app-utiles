package defpackage;

/* renamed from: j71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j71 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ u44 x;

    public /* synthetic */ j71(u44 u44, int i) {
        this.w = i;
        this.x = u44;
    }

    public final Object y(Object obj) {
        String str;
        int i = this.w;
        vs7 vs7 = vs7.a;
        u44 u44 = this.x;
        switch (i) {
            case b85.b:
                dy3 dy3 = (dy3) obj;
                cg7 d = u44.d();
                if (d != null) {
                    d.c = dy3;
                }
                return vs7;
            case 1:
                ed5 ed5 = u44.t;
                hf7 hf7 = (hf7) obj;
                String str2 = hf7.a.x;
                vl vlVar = u44.j;
                if (vlVar != null) {
                    str = vlVar.x;
                } else {
                    str = null;
                }
                if (!sg3.e(str2, str)) {
                    u44.k.setValue(ey2.w);
                    if (((Boolean) ed5.getValue()).booleanValue()) {
                        ed5.setValue(Boolean.FALSE);
                    } else {
                        u44.s.setValue(Boolean.FALSE);
                    }
                }
                long j = lg7.b;
                u44.f(j);
                u44.e(j);
                u44.u.y(hf7);
                yx5 yx5 = u44.b;
                zx5 zx5 = yx5.a;
                if (zx5 != null) {
                    zx5.p(yx5, (Object) null);
                }
                return vs7;
            case 2:
                u44.r.b(((b93) obj).a);
                return vs7;
            case 3:
                return Boolean.valueOf(u44.r.b(((b93) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                u44.q.setValue(bool);
                return vs7;
        }
    }
}
