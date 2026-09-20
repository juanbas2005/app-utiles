package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import com.google.firebase.sessions.settings.SessionConfigs;
import cu.lestebang.utiletecsa.data.repository.profile.ProfileDto;
import cu.lestebang.utiletecsa.data.repository.spots.AdminDto;
import cu.lestebang.utiletecsa.sync.worker.SyncWorker;
import cu.lestebang.utiletecsa.widget.ResumenWidgetProvider;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k05 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k05(d37 d37, f61 f61, fq6 fq6) {
        super(2, f61);
        this.A = 16;
        this.C = d37;
        this.D = fq6;
    }

    private final Object v(Object obj) {
        Object obj2;
        int i = this.B;
        if (i == 0) {
            o85.q(obj);
            j77 j77 = ((s77) this.C).a;
            String str = (String) this.D;
            UserInfo j = rg3.t(j77).j();
            if (j != null) {
                hm5 i2 = f55.i(j77, "profiles");
                gm5 gm5 = i2.a;
                List D2 = sg3.D(new ProfileDto(j.getId(), str, (String) null, 4, (hl1) null));
                t77 t77 = gm5.d;
                ol3 ol3 = pl3.d;
                gs3 gs3 = gs3.c;
                String t = ((f96) t77).t(b26.c(List.class, x91.C(b26.b(ProfileDto.class))), D2);
                ol3.getClass();
                JsonArray<JsonElement> d = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
                yc3 yc3 = new yc3(i2.c, gm5.c.v);
                yc3.e(i53.c);
                yc3.e = d;
                ArrayList arrayList = new ArrayList();
                for (JsonElement e : d) {
                    it0.h0(arrayList, em3.e(e).keySet());
                }
                List b1 = dt0.b1(dt0.f1(arrayList));
                if (!b1.isEmpty()) {
                    yc3.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
                }
                h66 h66 = h66.a;
                String str2 = i2.b;
                this.B = 1;
                Object a = h66.a(gm5, str2, yc3, this);
                p81 p81 = p81.w;
                if (a == p81) {
                    return p81;
                }
            } else {
                throw new IllegalStateException("No active Supabase session to associate the FCM token with.");
            }
        } else if (i == 1) {
            try {
                o85.q(obj);
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                obj2 = new m66(e3);
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = vs7.a;
        return new o66(obj2);
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((k05) o((f61) obj2, (ff8) obj)).s(vs7);
            case 2:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((k05) o((f61) obj2, (JSONObject) obj)).s(vs7);
            case 9:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 10:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 12:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 14:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case h75.g:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 17:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 18:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 19:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 20:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 21:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 23:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 24:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 25:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 26:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 27:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            case 28:
                return ((k05) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((k05) o((f61) obj2, obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                k05 k05 = new k05((Object) (en0) obj2, f61, 0);
                k05.C = obj;
                return k05;
            case 1:
                k05 k052 = new k05((Object) (j85) obj2, f61, 1);
                k052.C = obj;
                return k052;
            case 2:
                return new k05((gs2) this.C, (vd5) obj2, f61, 2);
            case 3:
                return new k05((vp6) this.C, (dj5) obj2, f61, 3);
            case 4:
                return new k05((vr2) this.C, (dj5) obj2, f61, 4);
            case 5:
                return new k05((TextClassifier) this.C, (gs2) obj2, f61, 5);
            case 6:
                return new k05((jx5) this.C, (s83) obj2, f61, 6);
            case 7:
                return new k05((ob5) this.C, (aq4) obj2, f61, 7);
            case 8:
                k05 k053 = new k05((Object) (f46) obj2, f61, 8);
                k053.C = obj;
                return k053;
            case 9:
                return new k05((ResumenWidgetProvider) this.C, (Context) obj2, f61, 9);
            case 10:
                return new k05((ai) this.C, (hl) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                k05 k054 = new k05((Object) (ai) obj2, f61, 11);
                k054.C = obj;
                return k054;
            case 12:
                k05 k055 = new k05((Object) (vr2) obj2, f61, 12);
                k055.C = obj;
                return k055;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new k05((dy1) this.C, (th6) obj2, f61, 13);
            case 14:
                return new k05((ef3) this.C, (bd5) obj2, f61, 14);
            case h75.g:
                return new k05((vp6) this.C, (gm6) obj2, f61, 15);
            case 16:
                return new k05((d37) this.C, f61, (fq6) obj2);
            case 17:
                return new k05((es6) this.C, (SessionData) obj2, f61, 17);
            case 18:
                return new k05((Object) (am6) obj2, f61, 18);
            case 19:
                return new k05((vp6) this.C, (hw6) obj2, f61, 19);
            case 20:
                return new k05((nw6) this.C, (p4) obj2, f61, 20);
            case 21:
                k05 k056 = new k05((Object) (d17) obj2, f61, 21);
                k056.C = obj;
                return k056;
            case 22:
                return new k05((is2) this.C, (Throwable) obj2, f61, 22);
            case 23:
                return new k05((kg5) this.C, (q57) obj2, f61, 23);
            case 24:
                return new k05((y57) this.C, (ef3) obj2, f61, 24);
            case 25:
                return new k05((s77) this.C, (String) obj2, f61, 25);
            case 26:
                return new k05((Object) (SyncWorker) obj2, f61, 26);
            case 27:
                return new k05((el3) this.C, (co5) obj2, f61, 27);
            case 28:
                return new k05((do7) this.C, (sr2) obj2, f61, 28);
            default:
                k05 k057 = new k05((Object) (fi2) obj2, f61, 29);
                k057.C = obj;
                return k057;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: el3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: di2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: di2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v114, resolved type: hm2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: hm2} */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e0, code lost:
        if (r1 == r0) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0390, code lost:
        if (r3.isTouchExplorationEnabled() != false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0434, code lost:
        if (r3 == r1) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x043f, code lost:
        if (r2.H(r3, r5) == r1) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0490, code lost:
        if (r0.a(r3, r5) == r2) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04e5, code lost:
        if (defpackage.es6.a(r1, r0, r3, r5) == r2) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06d7, code lost:
        if (defpackage.t49.G(90000, r5) == r0) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06e8, code lost:
        if (cu.lestebang.utiletecsa.widget.ResumenWidgetProvider.a((cu.lestebang.utiletecsa.widget.ResumenWidgetProvider) r5.C, (android.content.Context) r5.D, r5) == r0) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (((defpackage.el3) r5.C).j0(r5) == r0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (((defpackage.co5) r5.D).d(r5) == r0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0127, code lost:
        if (r2.a(r3, r5) == r1) goto L_0x0129;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x079d  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x07c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111 A[Catch:{ Exception -> 0x0131 }] */
    public final Object s(Object obj) {
        Object obj2;
        el3 el3;
        Object obj3;
        Integer num;
        Double d;
        Boolean bool;
        eo6 eo6;
        int i;
        SessionConfigs sessionConfigs;
        Boolean bool2;
        Double d2;
        Integer num2;
        Object obj4;
        Object value;
        Object value2;
        Object value3;
        Object obj5;
        n0 n0Var;
        long j;
        Object obj6;
        Object obj7;
        Object p84;
        Object obj8;
        SyncWorker syncWorker;
        Object obj9;
        Object obj10;
        int i2 = 7;
        float f = 1.0f;
        boolean z = false;
        Integer num3 = null;
        switch (this.A) {
            case b85.b:
                Object obj11 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    el3 = ar7.H((o81) this.C, (e81) null, (r81) null, new j05(2, (f61) null), 3);
                    this.C = el3;
                    this.B = 1;
                    obj2 = ((en0) this.D).q(this);
                    if (obj2 == obj11) {
                        return obj11;
                    }
                } else if (i3 == 1) {
                    el3 = this.C;
                    try {
                        o85.q(obj);
                        obj2 = obj;
                    } catch (Throwable th) {
                        el3.o((CancellationException) null);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                el3.o((CancellationException) null);
                return obj2;
            case 1:
                Object obj12 = vs7.a;
                ff8 ff8 = (ff8) this.C;
                Object obj13 = p81.w;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    fg0 fg0 = ff8.w;
                    this.C = null;
                    this.B = 1;
                    Object H = ((tn0) ((j85) this.D)).a.H(fg0, this);
                    if (H != obj13) {
                        H = obj12;
                    }
                    if (H == obj13) {
                        return obj13;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj12;
            case 2:
                Object obj14 = p81.w;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object H2 = ((gs2) this.C).H((vd5) this.D, this);
                    if (H2 == obj14) {
                        return obj14;
                    }
                    return H2;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 3:
                p81 p81 = p81.w;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    c6 a = ((vp6) this.C).a();
                    zi5 zi5 = new zi5((dj5) this.D, 0);
                    this.B = 1;
                    if (a.a(zi5, this) == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 4:
                dj5 dj5 = (dj5) this.D;
                Context context = dj5.d;
                vs7 vs7 = vs7.a;
                Object obj15 = p81.w;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj3 = ((vr2) this.C).y(this);
                    if (obj3 == obj15) {
                        return obj15;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj16 = ((o66) obj3).w;
                if (!(obj16 instanceof m66)) {
                    num3 = obj16;
                }
                String str = (String) num3;
                if (str != null) {
                    boolean A2 = sg3.A(context, "android.permission.CALL_PHONE");
                    rg5 rg5 = dj5.c;
                    if (A2) {
                        int i8 = dj5.g;
                        rg5.getClass();
                        rg5.b(context, str, i8);
                    } else {
                        rg5.getClass();
                        rg5.e(context, str);
                    }
                }
                return vs7;
            case 5:
                p81 p812 = p81.w;
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    TextClassifier textClassifier = (TextClassifier) this.C;
                    if (textClassifier == null) {
                        return null;
                    }
                    this.B = 1;
                    Object H3 = ((gs2) this.D).H(textClassifier, this);
                    if (H3 == p812) {
                        return p812;
                    }
                    return H3;
                } else if (i9 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 6:
                Object obj17 = p81.w;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a2 = jx5.a((jx5) this.C, (s83) this.D, 1, this);
                    if (a2 == obj17) {
                        return obj17;
                    }
                    return a2;
                } else if (i10 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 7:
                p81 p813 = p81.w;
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    ze1 w = u55.w(new m24((ob5) this.C, 5));
                    lg lgVar = new lg(10, (aq4) this.D);
                    this.B = 1;
                    if (w.a(lgVar, this) == p813) {
                        return p813;
                    }
                } else if (i11 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 8:
                f46 f46 = (f46) this.D;
                p81 p814 = p81.w;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    JSONObject jSONObject = (JSONObject) this.C;
                    Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                    if (jSONObject.has("app_quality")) {
                        Object obj18 = jSONObject.get("app_quality");
                        obj18.getClass();
                        JSONObject jSONObject2 = (JSONObject) obj18;
                        try {
                            if (jSONObject2.has("sessions_enabled")) {
                                bool2 = (Boolean) jSONObject2.get("sessions_enabled");
                            } else {
                                bool2 = null;
                            }
                            try {
                                if (jSONObject2.has("sampling_rate")) {
                                    d2 = (Double) jSONObject2.get("sampling_rate");
                                } else {
                                    d2 = null;
                                }
                            } catch (JSONException e) {
                                e = e;
                                num2 = null;
                                d2 = null;
                                new Integer(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                num = num2;
                                d = d2;
                                bool = bool2;
                                eo6 = f46.e;
                                if (num3 != null) {
                                }
                                f46.a.getClass();
                                sessionConfigs = new SessionConfigs(bool, d, num, new Integer(i), new Long(mi7.a().getSeconds()));
                                this.B = 1;
                                if (eo6.c(sessionConfigs, this) == p814) {
                                }
                                return vs7.a;
                            }
                            try {
                                if (jSONObject2.has("session_timeout_seconds")) {
                                    num2 = (Integer) jSONObject2.get("session_timeout_seconds");
                                } else {
                                    num2 = null;
                                }
                                try {
                                    if (jSONObject2.has("cache_duration")) {
                                        num3 = (Integer) jSONObject2.get("cache_duration");
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    new Integer(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d = d2;
                                    bool = bool2;
                                    eo6 = f46.e;
                                    if (num3 != null) {
                                    }
                                    f46.a.getClass();
                                    sessionConfigs = new SessionConfigs(bool, d, num, new Integer(i), new Long(mi7.a().getSeconds()));
                                    this.B = 1;
                                    if (eo6.c(sessionConfigs, this) == p814) {
                                    }
                                    return vs7.a;
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                num2 = null;
                                new Integer(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                num = num2;
                                d = d2;
                                bool = bool2;
                                eo6 = f46.e;
                                if (num3 != null) {
                                }
                                f46.a.getClass();
                                sessionConfigs = new SessionConfigs(bool, d, num, new Integer(i), new Long(mi7.a().getSeconds()));
                                this.B = 1;
                                if (eo6.c(sessionConfigs, this) == p814) {
                                }
                                return vs7.a;
                            }
                        } catch (JSONException e4) {
                            e = e4;
                            num2 = null;
                            d2 = null;
                            bool2 = null;
                            new Integer(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d = d2;
                            bool = bool2;
                            eo6 = f46.e;
                            if (num3 != null) {
                            }
                            f46.a.getClass();
                            sessionConfigs = new SessionConfigs(bool, d, num, new Integer(i), new Long(mi7.a().getSeconds()));
                            this.B = 1;
                            if (eo6.c(sessionConfigs, this) == p814) {
                            }
                            return vs7.a;
                        }
                        num = num2;
                        d = d2;
                        bool = bool2;
                    } else {
                        bool = null;
                        d = null;
                        num = null;
                    }
                    eo6 = f46.e;
                    if (num3 != null) {
                        i = num3.intValue();
                    } else {
                        i = f46.g;
                    }
                    f46.a.getClass();
                    sessionConfigs = new SessionConfigs(bool, d, num, new Integer(i), new Long(mi7.a().getSeconds()));
                    this.B = 1;
                    if (eo6.c(sessionConfigs, this) == p814) {
                        return p814;
                    }
                } else if (i12 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 9:
                Object obj19 = p81.w;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    break;
                } else if (i13 == 1) {
                    o85.q(obj);
                } else if (i13 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
            case 10:
                p81 p815 = p81.w;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (uj.c(((ai) this.C).T, new Float(0.0f), (hl) this.D, (Float) null, (vr2) null, this, 12) == p815) {
                        return p815;
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ai aiVar = (ai) this.D;
                p81 p816 = p81.w;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    di2 a3 = aiVar.K.a();
                    n40 n40 = new n40(7, aiVar, (o81) this.C);
                    this.B = 1;
                    if (a3.a(n40, this) == p816) {
                        return p816;
                    }
                } else if (i15 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 12:
                p81 p817 = p81.w;
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    if (((o81) this.C).k().a0(il7.x) != null) {
                        this.B = 1;
                        Object y = ((vr2) this.D).y(this);
                        if (y == p817) {
                            return p817;
                        }
                        return y;
                    }
                    h.s("Expected a TransactionElement in the CoroutineContext but none was found.");
                    return null;
                } else if (i16 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                p81 p818 = p81.w;
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    dy1 dy1 = (dy1) this.C;
                    if (dy1.b) {
                        f = -1.0f;
                    }
                    zh6 zh6 = ((th6) this.D).j0;
                    long f2 = x38.f(f, dy1.a);
                    this.B = 1;
                    if (zh6.c(f2, false, this) == p818) {
                        return p818;
                    }
                } else if (i17 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 14:
                p81 p819 = p81.w;
                int i18 = this.B;
                if (i18 == 0) {
                    o85.q(obj);
                    di2 a4 = ((ef3) this.C).a();
                    lg lgVar2 = new lg(11, (bd5) this.D);
                    this.B = 1;
                    if (a4.a(lgVar2, this) == p819) {
                        return p819;
                    }
                } else if (i18 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case h75.g:
                p81 p8110 = p81.w;
                int i19 = this.B;
                if (i19 == 0) {
                    o85.q(obj);
                    c6 a5 = ((vp6) this.C).a();
                    fm6 fm6 = new fm6((gm6) this.D, 0);
                    this.B = 1;
                    if (a5.a(fm6, this) == p8110) {
                        return p8110;
                    }
                } else if (i19 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 16:
                d37 d37 = (d37) this.C;
                Object obj20 = p81.w;
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, b81.h((Object) null, (is7) value3, (Object) null, true, 1)));
                    zn6 zn6 = (zn6) ((is7) d37.getValue()).a;
                    vp6 vp6 = ((fq6) this.D).b;
                    this.B = 1;
                    obj4 = vp6.C(this);
                    if (obj4 == obj20) {
                        return obj20;
                    }
                } else if (i20 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    do {
                        value2 = d37.getValue();
                    } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, (hv2) null, 5)));
                } else {
                    do {
                        value = d37.getValue();
                    } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj4)), 1)));
                }
                return vs7.a;
            case 17:
                SessionData sessionData = (SessionData) this.D;
                es6 es6 = (es6) this.C;
                Object obj21 = p81.w;
                int i21 = this.B;
                if (i21 != 0) {
                    if (i21 == 1) {
                        try {
                            o85.q(obj);
                        } catch (Exception e5) {
                            Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e5.getMessage());
                            if (es6.e(sessionData)) {
                                SessionDetails a6 = es6.b.a(sessionData.getSessionDetails());
                                SessionData copy$default = SessionData.copy$default(sessionData, a6, (Time) null, (Map) null, 4, (Object) null);
                                copy$default.getClass();
                                es6.h = copy$default;
                                vm6 vm6 = es6.c;
                                ar7.H(gl0.E(vm6.e), (e81) null, (r81) null, new tm6(vm6, a6, (f61) null), 3);
                                String sessionId = a6.getSessionId();
                                bs6 bs6 = bs6.x;
                                this.B = 2;
                                break;
                            }
                        }
                    } else if (i21 == 2) {
                        o85.q(obj);
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    qe1 qe1 = es6.e;
                    cs6 cs6 = new cs6(es6, (f61) null, 1);
                    this.B = 1;
                    break;
                }
                return vs7.a;
            case 18:
                am6 am6 = (am6) this.D;
                Object obj22 = p81.w;
                int i22 = this.B;
                if (i22 != 0) {
                    if (i22 == 1) {
                        n0Var = (n0) this.C;
                        o85.q(obj);
                        obj5 = obj;
                        this.C = null;
                        this.B = 2;
                        break;
                    } else if (i22 == 2) {
                        o85.q(obj);
                        if (((AtomicInteger) ((wv2) am6.A).x).decrementAndGet() == 0) {
                            return vs7.a;
                        }
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    if (((AtomicInteger) ((wv2) am6.A).x).get() <= 0) {
                        h.s("Check failed.");
                        return null;
                    }
                }
                r16.x(((o81) am6.x).k());
                n0Var = (n0) am6.y;
                ad0 ad0 = (ad0) am6.z;
                this.C = n0Var;
                this.B = 1;
                ad0.getClass();
                obj5 = ad0.J(ad0, this);
                break;
            case 19:
                p81 p8111 = p81.w;
                int i23 = this.B;
                if (i23 == 0) {
                    o85.q(obj);
                    c6 a7 = ((vp6) this.C).a();
                    fw6 fw6 = new fw6((hw6) this.D, 0);
                    this.B = 1;
                    if (a7.a(fw6, this) == p8111) {
                        return p8111;
                    }
                } else if (i23 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 20:
                nw6 nw6 = (nw6) this.C;
                p81 p8112 = p81.w;
                int i24 = this.B;
                if (i24 == 0) {
                    o85.q(obj);
                    if (nw6 != null) {
                        ow6 ow6 = nw6.a;
                        kw6 kw6 = ow6.c;
                        if (ow6.b != null) {
                            z = true;
                        }
                        p4 p4Var = (p4) this.D;
                        int ordinal = kw6.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (ordinal == 0) {
                            j = 4000;
                        } else if (ordinal == 1) {
                            j = 10000;
                        } else if (ordinal == 2) {
                            j = Long.MAX_VALUE;
                        } else {
                            h.c();
                            return null;
                        }
                        if (p4Var != null) {
                            AccessibilityManager accessibilityManager = ((hd) p4Var).a;
                            if (j < 2147483647L) {
                                if (!z) {
                                    i2 = 3;
                                }
                                if (Build.VERSION.SDK_INT < 29) {
                                    if (z) {
                                        break;
                                    }
                                } else {
                                    int c = dn.c(accessibilityManager, (int) j, i2);
                                    if (c != Integer.MAX_VALUE) {
                                        j2 = (long) c;
                                    }
                                }
                                this.B = 1;
                                if (t49.G(j2, this) == p8112) {
                                    return p8112;
                                }
                            }
                        }
                        j2 = j;
                        this.B = 1;
                        if (t49.G(j2, this) == p8112) {
                        }
                    }
                    return vs7.a;
                } else if (i24 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kk0 kk0 = nw6.b;
                if (kk0.u() instanceof o05) {
                    kk0.f(vw6.w);
                }
                return vs7.a;
            case 21:
                o81 o81 = (o81) this.C;
                Object obj23 = p81.w;
                int i25 = this.B;
                if (i25 == 0) {
                    o85.q(obj);
                    j77 j77 = ((d17) this.D).a;
                    UserInfo j3 = rg3.t(j77).j();
                    if (j3 != null) {
                        String id = j3.getId();
                        if (id != null) {
                            hm5 i26 = f55.i(j77, "app_admins");
                            gm5 gm5 = i26.a;
                            String str2 = i26.c;
                            ku4 ku4 = gm5.c.v;
                            im5 im5 = new im5(str2, ku4);
                            new zc9(ku4, im5.f, 4).a("user_id", xd2.EQ, id);
                            im5.d("*");
                            h66 h66 = h66.a;
                            String str3 = i26.b;
                            this.C = null;
                            this.B = 1;
                            obj6 = h66.a(gm5, str3, im5, this);
                            break;
                        }
                    }
                    obj23 = Boolean.valueOf(z);
                    Boolean bool3 = Boolean.FALSE;
                    if (obj23 instanceof m66) {
                    }
                } else if (i25 == 1) {
                    try {
                        o85.q(obj);
                        obj6 = obj;
                        jm5 jm5 = (jm5) obj6;
                        t77 t77 = jm5.b.d;
                        String str4 = jm5.a;
                        gs3 gs3 = gs3.c;
                        z = !((List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(AdminDto.class))), str4)).isEmpty();
                        obj23 = Boolean.valueOf(z);
                    } catch (Throwable th2) {
                        obj23 = new m66(th2);
                    }
                    Boolean bool32 = Boolean.FALSE;
                    if (obj23 instanceof m66) {
                        return bool32;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj23;
            case 22:
                Throwable th3 = (Throwable) this.D;
                p81 p8113 = p81.w;
                int i27 = this.B;
                if (i27 == 0) {
                    o85.q(obj);
                    String valueOf = String.valueOf(th3.getMessage());
                    jw6 jw6 = jw6.y;
                    this.B = 1;
                    if (((is2) this.C).C(valueOf, jw6, th3, this) == p8113) {
                        return p8113;
                    }
                } else if (i27 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            case 23:
                Object obj24 = p81.w;
                int i28 = this.B;
                if (i28 == 0) {
                    o85.q(obj);
                    Object obj25 = ((kg5) this.C).x;
                    q57 q57 = (q57) this.D;
                    synchronized (obj25) {
                        if (q57.c == r57.A) {
                            q57.c = r57.x;
                        }
                    }
                    uj ujVar = ((q57) this.D).b;
                    float floatValue = ((Number) ujVar.a.b.y(ujVar.c.y)).floatValue();
                    ((q57) this.D).b = ed1.a(0.0f);
                    uj ujVar2 = ((q57) this.D).b;
                    Float f3 = new Float(1.0f);
                    uj ujVar3 = ujVar2;
                    hl hlVar = ((q57) this.D).a;
                    Float f4 = new Float(floatValue);
                    this.B = 1;
                    obj7 = uj.c(ujVar3, f3, hlVar, f4, (vr2) null, this, 8);
                    if (obj7 == obj24) {
                        return obj24;
                    }
                } else if (i28 == 1) {
                    try {
                        o85.q(obj);
                        obj7 = obj;
                    } catch (Throwable th4) {
                        kg5.e((kg5) this.C);
                        throw th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl flVar = (fl) obj7;
                kg5.e((kg5) this.C);
                return vs7.a;
            case 24:
                vs7 vs72 = vs7.a;
                Object obj26 = p81.w;
                int i29 = this.B;
                if (i29 == 0) {
                    o85.q(obj);
                    cq4 cq4 = ((y57) this.C).U;
                    this.B = 1;
                    ji8 ji8 = new ji8(26, false);
                    ji8 ji82 = new ji8(26, false);
                    ji8 ji83 = new ji8(26, false);
                    cq4.c(false);
                    cq4.b(false);
                    cq4.a(false);
                    Object a8 = ((ef3) this.D).a().a(new nn0(ji8, cq4, ji82, ji83, 4), this);
                    if (a8 != obj26) {
                        a8 = vs72;
                    }
                    if (a8 == obj26) {
                        return obj26;
                    }
                } else if (i29 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs72;
            case 25:
                return v(obj);
            case 26:
                SyncWorker syncWorker2 = (SyncWorker) this.D;
                Object obj27 = p81.w;
                int i30 = this.B;
                if (i30 == 0) {
                    o85.q(obj);
                    this.C = syncWorker2;
                    this.B = 1;
                    obj9 = syncWorker2.f(0, 0);
                    if (obj9 == obj27) {
                        return obj27;
                    }
                    syncWorker = syncWorker2;
                } else if (i30 == 1) {
                    SyncWorker syncWorker3 = (SyncWorker) this.C;
                    o85.q(obj);
                    syncWorker = syncWorker3;
                    obj9 = obj;
                } else if (i30 != 2) {
                    if (i30 == 3) {
                        o85.q(obj);
                        obj8 = obj;
                        di2 L = gr8.L((di2) obj8, syncWorker2.h);
                        lg lgVar3 = new lg(15, syncWorker2);
                        this.B = 4;
                        break;
                    } else if (i30 == 4) {
                        try {
                            o85.q(obj);
                            return new r84();
                        } catch (Exception unused) {
                            if (syncWorker2.b.c < 3) {
                                yh7.a.getClass();
                                hr2.n(new Object[0]);
                                p84 = new Object();
                            } else {
                                yh7.a.getClass();
                                hr2.p(new Object[0]);
                                p84 = new p84();
                            }
                            return p84;
                        }
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    o85.q(obj);
                    i03 i03 = syncWorker2.i;
                    this.B = 3;
                    n03 n03 = (n03) i03;
                    n03.getClass();
                    obj8 = new ze1(3, new m03(n03, (f61) null));
                    if (obj8 == obj27) {
                        return obj27;
                    }
                    di2 L2 = gr8.L((di2) obj8, syncWorker2.h);
                    lg lgVar32 = new lg(15, syncWorker2);
                    this.B = 4;
                }
                this.C = null;
                this.B = 2;
                if (syncWorker.e((hm2) obj9, this) == obj27) {
                    return obj27;
                }
                i03 i032 = syncWorker2.i;
                this.B = 3;
                n03 n032 = (n03) i032;
                n032.getClass();
                obj8 = new ze1(3, new m03(n032, (f61) null));
                if (obj8 == obj27) {
                }
                di2 L22 = gr8.L((di2) obj8, syncWorker2.h);
                lg lgVar322 = new lg(15, syncWorker2);
                this.B = 4;
            case 27:
                Object obj28 = p81.w;
                int i31 = this.B;
                if (i31 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    break;
                } else if (i31 == 1) {
                    o85.q(obj);
                } else if (i31 == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
            case 28:
                sr2 sr2 = (sr2) this.D;
                Object obj29 = p81.w;
                int i32 = this.B;
                if (i32 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj10 = do7.b((do7) this.C, this);
                    if (obj10 == obj29) {
                        return obj29;
                    }
                } else if (i32 == 1) {
                    try {
                        o85.q(obj);
                        obj10 = obj;
                    } catch (Throwable th5) {
                        sr2.b();
                        throw th5;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Set set = (Set) obj10;
                sr2.b();
                return vs7.a;
            default:
                Object obj30 = this.C;
                p81 p8114 = p81.w;
                int i33 = this.B;
                if (i33 == 0) {
                    o85.q(obj);
                    this.C = null;
                    this.B = 1;
                    if (((fi2) this.D).k(obj30, this) == p8114) {
                        return p8114;
                    }
                } else if (i33 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k05(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k05(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }
}
