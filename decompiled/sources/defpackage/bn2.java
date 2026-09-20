package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;

/* renamed from: bn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bn2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ String C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn2(int i, f61 f61, String str) {
        super(2, f61);
        this.A = i;
        this.C = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((bn2) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 2:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 3:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 4:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 5:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 6:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            default:
                return ((bn2) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                bn2 bn2 = new bn2(0, f61, this.C);
                bn2.B = obj;
                return bn2;
            case 1:
                bn2 bn22 = new bn2(1, f61, this.C);
                bn22.B = obj;
                return bn22;
            case 2:
                bn2 bn23 = new bn2(2, f61, this.C);
                bn23.B = obj;
                return bn23;
            case 3:
                bn2 bn24 = new bn2(3, f61, this.C);
                bn24.B = obj;
                return bn24;
            case 4:
                bn2 bn25 = new bn2(4, f61, this.C);
                bn25.B = obj;
                return bn25;
            case 5:
                bn2 bn26 = new bn2(5, f61, this.C);
                bn26.B = obj;
                return bn26;
            case 6:
                bn2 bn27 = new bn2(6, f61, this.C);
                bn27.B = obj;
                return bn27;
            default:
                bn2 bn28 = new bn2(7, f61, this.C);
                bn28.B = obj;
                return bn28;
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        switch (this.A) {
            case b85.b:
                o81 o81 = (o81) this.B;
                o85.q(obj);
                try {
                    byte[] decode = Base64.decode(this.C, 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (decodeByteArray != null) {
                        obj2 = new hg(decodeByteArray);
                    } else {
                        obj2 = null;
                    }
                } catch (Throwable th) {
                    obj2 = new m66(th);
                }
                if (obj2 instanceof m66) {
                    return null;
                }
                return obj2;
            case 1:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, this.C, -1, Integer.MAX_VALUE, (Object) null);
            case 2:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, this.C, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -8388609, -1, (Object) null);
            case 3:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, this.C, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -513, -1, (Object) null);
            case 4:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.C, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -129, (Object) null);
            case 5:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, this.C, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -65, (Object) null);
            case 6:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, this.C, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -134217729, -1, (Object) null);
            default:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, this.C, (String) null, -1, -1073741825, (Object) null);
        }
    }
}
