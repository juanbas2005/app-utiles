package defpackage;

import android.net.Uri;
import android.provider.Telephony;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import java.util.List;

/* renamed from: qh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ long C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh6(long j, f61 f61, UssdAutoUpdaterService ussdAutoUpdaterService) {
        super(2, f61);
        this.A = 3;
        this.B = ussdAutoUpdaterService;
        this.C = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((qh6) o((f61) obj2, (xh6) obj)).s(vs7);
                return vs7;
            case 1:
                return ((qh6) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 2:
                return ((qh6) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            default:
                ((qh6) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        long j = this.C;
        switch (i) {
            case b85.b:
                qh6 qh6 = new qh6(j, f61, 0);
                qh6.B = obj;
                return qh6;
            case 1:
                qh6 qh62 = new qh6(j, f61, 1);
                qh62.B = obj;
                return qh62;
            case 2:
                qh6 qh63 = new qh6(j, f61, 2);
                qh63.B = obj;
                return qh63;
            default:
                return new qh6(j, f61, (UssdAutoUpdaterService) this.B);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        int i = this.A;
        vs7 vs7 = vs7.a;
        boolean z = true;
        long j = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                zh6 zh6 = ((xh6) this.B).a;
                zh6.d(zh6.k, j, 1);
                return vs7;
            case 1:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, this.C, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -4097, (Object) null);
            case 2:
                o85.q(obj);
                return UserDataPreferences.copy$default((UserDataPreferences) this.B, (String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.C, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -257, (Object) null);
            default:
                o85.q(obj);
                UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) this.B;
                d37 d37 = UssdAutoUpdaterService.T;
                try {
                    ny7 ny7 = new ny7(ussdAutoUpdaterService, new String[]{"_id", "date"}, j);
                    Uri uri = Telephony.Sms.Sent.CONTENT_URI;
                    uri.getClass();
                    if (!((Boolean) ny7.y(uri)).booleanValue()) {
                        Uri uri2 = Telephony.Sms.Outbox.CONTENT_URI;
                        uri2.getClass();
                        if (!((Boolean) ny7.y(uri2)).booleanValue()) {
                            z = false;
                        }
                    }
                    obj2 = Boolean.valueOf(z);
                } catch (Throwable th) {
                    obj2 = new m66(th);
                }
                Object obj3 = Boolean.FALSE;
                if (obj2 instanceof m66) {
                    obj2 = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    ussdAutoUpdaterService.L = System.currentTimeMillis();
                    String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_sms);
                    string.getClass();
                    ussdAutoUpdaterService.i(string, new ha7(21));
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh6(long j, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = j;
    }
}
