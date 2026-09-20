package defpackage;

import android.view.Choreographer;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: bj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bj extends a97 implements gs2 {
    public final /* synthetic */ int A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(int i, f61 f61, int i2) {
        super(i, f61);
        this.A = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((bj) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                ((bj) o((f61) obj2, (di2) obj)).s(vs7);
                return vs7;
            case 2:
                ((bj) o((f61) obj2, (eh6) obj)).s(vs7);
                return vs7;
            case 3:
                ((bj) o((f61) obj2, (fi2) obj)).s(vs7);
                return vs7;
            default:
                return ((bj) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                return new bj(2, f61, 0);
            case 1:
                return new bj(2, f61, 1);
            case 2:
                return new bj(2, f61, 2);
            case 3:
                return new bj(2, f61, 3);
            default:
                return new bj(2, f61, 4);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                o85.q(obj);
                return Choreographer.getInstance();
            case 1:
                o85.q(obj);
                return vs7;
            case 2:
                o85.q(obj);
                return vs7;
            case 3:
                o85.q(obj);
                return vs7;
            default:
                o85.q(obj);
                return new UserDataPreferences((String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, (hl1) null);
        }
    }
}
