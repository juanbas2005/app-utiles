package defpackage;

import android.content.Context;
import android.widget.Toast;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: fq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fq5 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String C;
    public /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq5(boolean z, Context context, String str, f61 f61) {
        super(2, f61);
        this.B = z;
        this.D = context;
        this.C = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((fq5) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            default:
                return ((fq5) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                String str = this.C;
                return new fq5(this.B, (Context) this.D, str, f61);
            default:
                fq5 fq5 = new fq5(this.B, this.C, f61);
                fq5.D = obj;
                return fq5;
        }
    }

    public final Object s(Object obj) {
        List J0;
        int i = this.A;
        boolean z = this.B;
        String str = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                if (z) {
                    Toast.makeText((Context) this.D, str, 0).show();
                }
                return vs7.a;
            default:
                UserDataPreferences userDataPreferences = (UserDataPreferences) this.D;
                o85.q(obj);
                if (z) {
                    J0 = dt0.b1(dt0.f1(dt0.N0(userDataPreferences.getHomeCollapsedSections(), str)));
                } else {
                    J0 = dt0.J0(userDataPreferences.getHomeCollapsedSections(), str);
                }
                return UserDataPreferences.copy$default(userDataPreferences, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, J0, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -257, -1, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq5(boolean z, String str, f61 f61) {
        super(2, f61);
        this.B = z;
        this.C = str;
    }
}
