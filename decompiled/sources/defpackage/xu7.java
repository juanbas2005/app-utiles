package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;

/* renamed from: xu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xu7 extends a97 implements gs2 {
    public final /* synthetic */ ls7 A;
    public final /* synthetic */ UserDataPreferences B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xu7(ls7 ls7, UserDataPreferences userDataPreferences, f61 f61) {
        super(2, f61);
        this.A = ls7;
        this.B = userDataPreferences;
    }

    public final Object H(Object obj, Object obj2) {
        vs7 vs7 = vs7.a;
        ((xu7) o((f61) obj2, (o81) obj)).s(vs7);
        return vs7;
    }

    public final f61 o(f61 f61, Object obj) {
        return new xu7(this.A, this.B, f61);
    }

    public final Object s(Object obj) {
        o85.q(obj);
        this.A.w.write(k57.l0(yu7.x.d(UserDataPreferences.Companion.serializer(), this.B)));
        return vs7.a;
    }
}
