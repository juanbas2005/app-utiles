package defpackage;

import android.util.Log;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: da0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da0(int i, f61 f61, int i2) {
        super(i, f61);
        this.A = i2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((da0) o((f61) obj2, (yl1) obj)).s(vs7);
                return null;
            case 1:
                return ((da0) o((f61) obj2, (y27) obj)).s(vs7);
            case 2:
                return ((da0) o((f61) obj2, (j85) obj)).s(vs7);
            case 3:
                return ((da0) o((f61) obj2, (dy5) obj)).s(vs7);
            case 4:
                ((da0) o((f61) obj2, (String) obj)).s(vs7);
                return vs7;
            case 5:
                return ((da0) o((f61) obj2, (hs6) obj)).s(vs7);
            case 6:
                return ((da0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 7:
                return ((da0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 8:
                return ((da0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 9:
                return ((da0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            default:
                return ((da0) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                da0 da0 = new da0(2, f61, 0);
                da0.B = obj;
                return da0;
            case 1:
                da0 da02 = new da0(2, f61, 1);
                da02.B = obj;
                return da02;
            case 2:
                da0 da03 = new da0(2, f61, 2);
                da03.B = obj;
                return da03;
            case 3:
                da0 da04 = new da0(2, f61, 3);
                da04.B = obj;
                return da04;
            case 4:
                da0 da05 = new da0(2, f61, 4);
                da05.B = obj;
                return da05;
            case 5:
                da0 da06 = new da0(2, f61, 5);
                da06.B = obj;
                return da06;
            case 6:
                da0 da07 = new da0(2, f61, 6);
                da07.B = obj;
                return da07;
            case 7:
                da0 da08 = new da0(2, f61, 7);
                da08.B = obj;
                return da08;
            case 8:
                da0 da09 = new da0(2, f61, 8);
                da09.B = obj;
                return da09;
            case 9:
                da0 da010 = new da0(2, f61, 9);
                da010.B = obj;
                return da010;
            default:
                da0 da011 = new da0(2, f61, 10);
                da011.B = obj;
                return da011;
        }
    }

    public final Object s(Object obj) {
        boolean z = false;
        switch (this.A) {
            case b85.b:
                o85.q(obj);
                if (((yl1) this.B).V().c().getAttributes().d(ea0.b) == null) {
                    return null;
                }
                ku4.a();
                return null;
            case 1:
                o85.q(obj);
                return Boolean.valueOf(!(((y27) this.B) instanceof be2));
            case 2:
                j85 j85 = (j85) this.B;
                o85.q(obj);
                if (j85 != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                o85.q(obj);
                if (((dy5) this.B) == dy5.w) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                o85.q(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.B));
                return vs7.a;
            case 5:
                hs6 hs6 = (hs6) this.B;
                o85.q(obj);
                if (hs6 != hs6.w) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, "", "", "", "", (String) null, (String) null, 0, "NONE", "", 0, 0, 200, 100, 0, "NONE", "", false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, "", -1, 2147226051, (Object) null);
            case 7:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, "", a42.w, "", "", (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, -2, (Object) null);
            case 8:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, true, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -8193, -1, (Object) null);
            case 9:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, true, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -16385, -1, (Object) null);
            default:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, true, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -4097, -1, (Object) null);
        }
    }
}
