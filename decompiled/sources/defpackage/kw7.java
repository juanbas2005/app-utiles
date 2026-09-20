package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: kw7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kw7 extends a97 implements gs2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw7(int i, int i2, int i3, String str, String str2, f61 f61) {
        super(2, f61);
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = str;
        this.F = str2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((kw7) o((f61) obj2, (UserDataPreferences) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        kw7 kw7 = new kw7(this.B, this.C, this.D, this.E, this.F, f61);
        kw7.A = obj;
        return kw7;
    }

    public final Object s(Object obj) {
        o85.q(obj);
        int i = this.B;
        int i2 = this.C;
        int i3 = this.D;
        return UserDataPreferences.copy$default((UserDataPreferences) this.A, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, i, i2, i3, this.E, this.F, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -253953, (Object) null);
    }
}
