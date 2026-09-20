package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: iw7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iw7 extends a97 implements gs2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ long D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iw7(String str, String str2, long j, f61 f61) {
        super(2, f61);
        this.B = str;
        this.C = str2;
        this.D = j;
    }

    public final Object H(Object obj, Object obj2) {
        return ((iw7) o((f61) obj2, (UserDataPreferences) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        iw7 iw7 = new iw7(this.B, this.C, this.D, f61);
        iw7.A = obj;
        return iw7;
    }

    public final Object s(Object obj) {
        o85.q(obj);
        return UserDataPreferences.copy$default((UserDataPreferences) this.A, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, this.B, this.C, this.D, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -3585, (Object) null);
    }
}
