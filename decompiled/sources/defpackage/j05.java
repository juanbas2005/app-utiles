package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: j05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j05 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public int C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j05(int i, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((j05) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((j05) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            default:
                return ((j05) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                j05 j05 = new j05(2, f61);
                j05.B = obj;
                return j05;
            case 1:
                j05 j052 = new j05(this.C, f61, 1);
                j052.B = obj;
                return j052;
            default:
                j05 j053 = new j05(this.C, f61, 2);
                j053.B = obj;
                return j053;
        }
    }

    public final Object s(Object obj) {
        o81 o81;
        switch (this.A) {
            case b85.b:
                int i = this.C;
                if (i == 0) {
                    o85.q(obj);
                    o81 = (o81) this.B;
                } else if (i == 1) {
                    o81 = (o81) this.B;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (r16.X(o81.k())) {
                    tm3 tm3 = new tm3(19);
                    this.B = o81;
                    this.C = 1;
                    e81 e81 = this.x;
                    e81.getClass();
                    Object a = pd8.s(e81).a(tm3, this);
                    p81 p81 = p81.w;
                    if (a == p81) {
                        return p81;
                    }
                }
                return vs7.a;
            case 1:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, z65.p(this.C, -1, 1), false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -65, -1, (Object) null);
            default:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, this.C, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -67108865, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j05(int i, f61 f61) {
        super(i, f61);
        this.A = 0;
    }
}
