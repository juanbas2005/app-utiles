package defpackage;

import android.os.Build;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.data.repository.feedback.AppReportDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: fc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fc2 extends a97 implements gs2 {
    public gc2 A;
    public b56 B;
    public String C;
    public Throwable D;
    public UserInfo E;
    public int F;
    public final /* synthetic */ gc2 G;
    public final /* synthetic */ b56 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Throwable J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fc2(gc2 gc2, b56 b56, String str, Throwable th, f61 f61) {
        super(2, f61);
        this.G = gc2;
        this.H = b56;
        this.I = str;
        this.J = th;
    }

    public final Object H(Object obj, Object obj2) {
        return ((fc2) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new fc2(this.G, this.H, this.I, this.J, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a6, code lost:
        if (r1.a(r12, r4, r2, r0) != r6) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0158 A[Catch:{ CancellationException -> 0x01b9, Exception -> 0x01ac }, LOOP:0: B:35:0x0152->B:37:0x0158, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017a A[Catch:{ CancellationException -> 0x01b9, Exception -> 0x01ac }] */
    public final Object s(Object obj) {
        Object obj2;
        gc2 gc2;
        b56 b56;
        String str;
        Throwable th;
        Object obj3;
        UserInfo userInfo;
        String str2;
        String str3;
        String accountEmail;
        List b1;
        int i = this.F;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            gc2 gc22 = this.G;
            b56 b562 = this.H;
            String str4 = this.I;
            Throwable th2 = this.J;
            UserInfo j = rg3.t(gc22.a).j();
            di2 d = ((dy7) gc22.b).d();
            this.A = gc22;
            this.B = b562;
            this.C = str4;
            this.D = th2;
            this.E = j;
            this.F = 1;
            obj3 = gr8.H(d, this);
            if (obj3 == p81) {
                return p81;
            }
            String str5 = str4;
            th = th2;
            userInfo = j;
            gc2 = gc22;
            b56 = b562;
            str = str5;
        } else if (i == 1) {
            userInfo = this.E;
            Throwable th3 = this.D;
            String str6 = this.C;
            b56 b563 = this.B;
            gc2 gc23 = this.A;
            o85.q(obj);
            gc2 = gc23;
            b56 = b563;
            str = str6;
            th = th3;
            obj3 = obj;
        } else if (i == 2) {
            fc2 fc2 = (fc2) this.E;
            hm5 hm5 = (hm5) this.D;
            UserDataPreferences userDataPreferences = (UserDataPreferences) this.C;
            UserInfo userInfo2 = (UserInfo) this.B;
            f61 f61 = (f61) this.A;
            try {
                o85.q(obj);
                obj2 = vs7.a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
            return new o66(obj2);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        UserDataPreferences userDataPreferences2 = (UserDataPreferences) obj3;
        hm5 i2 = f55.i(gc2.a, "app_reports");
        gm5 gm5 = i2.a;
        String name = b56.name();
        String obj4 = d57.k1(str).toString();
        if (th != null) {
            str2 = d57.i1(6000, su0.O(th));
        } else {
            str2 = null;
        }
        if (userInfo != null) {
            str3 = userInfo.getId();
        } else {
            str3 = null;
        }
        if (userInfo != null) {
            accountEmail = userInfo.getEmail();
            if (accountEmail == null) {
            }
            String str7 = accountEmail;
            List D2 = sg3.D(new AppReportDto(name, obj4, str2, str3, str7, gc2.a(gc2), "Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")", Build.MANUFACTURER + " " + Build.MODEL));
            t77 t77 = gm5.d;
            ol3 ol3 = pl3.d;
            gs3 gs3 = gs3.c;
            String t = ((f96) t77).t(b26.c(List.class, x91.C(b26.b(AppReportDto.class))), D2);
            ol3.getClass();
            JsonArray<JsonElement> d2 = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
            yc3 yc3 = new yc3(i2.c, gm5.c.v);
            yc3.e = d2;
            ArrayList arrayList = new ArrayList();
            for (JsonElement e3 : d2) {
                it0.h0(arrayList, em3.e(e3).keySet());
            }
            b1 = dt0.b1(dt0.f1(arrayList));
            if (!b1.isEmpty()) {
                yc3.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
            }
            h66 h66 = h66.a;
            String str8 = i2.b;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = 2;
        }
        accountEmail = userDataPreferences2.getAccountEmail();
        if (accountEmail.length() == 0) {
            accountEmail = null;
        }
        String str72 = accountEmail;
        List D22 = sg3.D(new AppReportDto(name, obj4, str2, str3, str72, gc2.a(gc2), "Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")", Build.MANUFACTURER + " " + Build.MODEL));
        t77 t772 = gm5.d;
        ol3 ol32 = pl3.d;
        gs3 gs32 = gs3.c;
        String t2 = ((f96) t772).t(b26.c(List.class, x91.C(b26.b(AppReportDto.class))), D22);
        ol32.getClass();
        JsonArray<JsonElement> d22 = em3.d((JsonElement) ol32.b(JsonElement.Companion.serializer(), t2));
        yc3 yc32 = new yc3(i2.c, gm5.c.v);
        yc32.e = d22;
        ArrayList arrayList2 = new ArrayList();
        while (r1.hasNext()) {
        }
        b1 = dt0.b1(dt0.f1(arrayList2));
        if (!b1.isEmpty()) {
        }
        h66 h662 = h66.a;
        String str82 = i2.b;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = 2;
    }
}
