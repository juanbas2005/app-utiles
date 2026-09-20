package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/* renamed from: bc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Serializable E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc0(Long l, vh0 vh0, vf1 vf1, Locale locale, aq4 aq4, f61 f61) {
        super(2, f61);
        this.A = 1;
        this.B = l;
        this.C = vh0;
        this.D = vf1;
        this.E = locale;
        this.F = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((bc0) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                ((bc0) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 2:
                return ((bc0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            default:
                return ((bc0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.F;
        Serializable serializable = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i) {
            case b85.b:
                bc0 bc0 = new bc0((Object) (cc0) obj4, (Object) (xz4) obj3, (Serializable) (ae) serializable, (Object) (g20) obj2, f61, 0);
                bc0.B = obj;
                return bc0;
            case 1:
                return new bc0((Long) this.B, (vh0) obj4, (vf1) obj3, (Locale) serializable, (aq4) obj2, f61);
            case 2:
                bc0 bc02 = new bc0((Object) (String) obj4, (Object) (String) obj3, (Serializable) (String) serializable, (Object) (String) obj2, f61, 2);
                bc02.B = obj;
                return bc02;
            default:
                bc0 bc03 = new bc0((Object) (String) obj4, (Object) (List) obj3, (Serializable) (String) serializable, (Object) (String) obj2, f61, 3);
                bc03.B = obj;
                return bc03;
        }
    }

    public final Object s(Object obj) {
        long j;
        int i = this.A;
        Object obj2 = this.F;
        Serializable serializable = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                o81 o81 = (o81) this.B;
                cc0 cc0 = (cc0) obj4;
                ar7.H(o81, (e81) null, (r81) null, new p0(cc0, (xz4) obj3, (ae) serializable, (f61) null, 12), 3);
                return ar7.H(o81, (e81) null, (r81) null, new n0(cc0, (g20) obj2, (f61) null, 12), 3);
            case 1:
                o85.q(obj);
                Long l = (Long) this.B;
                if (l != null) {
                    aq4 aq4 = (aq4) obj2;
                    String a = ((vh0) obj4).a(l.longValue(), ((vf1) obj3).c, (Locale) serializable);
                    if (a.length() == 0) {
                        j = lg7.b;
                    } else {
                        j = i95.a(a.length(), a.length());
                    }
                    hf7 hf7 = new hf7(4, j, a);
                    pa5 pa5 = cg1.a;
                    aq4.setValue(hf7);
                }
                return vs7.a;
            case 2:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) obj4, (String) obj3, (String) serializable, (String) obj2, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -61, (Object) null);
            default:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) obj4, (List) obj3, (String) serializable, (String) obj2, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, -2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc0(Object obj, Object obj2, Serializable serializable, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = serializable;
        this.F = obj3;
    }
}
