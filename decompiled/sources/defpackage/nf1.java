package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import cu.lestebang.utiletecsa.feature.forum.navigation.Forum;
import cu.lestebang.utiletecsa.feature.home.navigation.Home;
import cu.lestebang.utiletecsa.feature.home.navigation.HomeNavGraph;
import io.github.jan.supabase.auth.GoTrueErrorResponse;
import io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider$Config;
import io.github.jan.supabase.storage.vectors.data.GetVectorOptions;
import io.ktor.util.date.GMTDate;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.datetime.DateTimeUnit;

/* renamed from: nf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nf1 implements sr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ nf1(int i) {
        this.w = i;
    }

    public final Object b() {
        Class<?> returnType;
        int i = this.w;
        Class<DateTimeUnit.MonthBased> cls = DateTimeUnit.MonthBased.class;
        Class<DateTimeUnit.DayBased> cls2 = DateTimeUnit.DayBased.class;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                c26 c26 = b26.a;
                return new ci6("kotlinx.datetime.DateTimeUnit.DateBased", c26.b(DateTimeUnit.DateBased.class), new gq3[]{c26.b(cls2), c26.b(cls)}, new zr3[]{gj1.a, bm4.a});
            case 1:
                return u55.p(new hf7(7, 0, (String) null));
            case 2:
                return u55.p(Boolean.FALSE);
            case 3:
                pa5 pa5 = gi1.a;
                return Float.valueOf(0.0f);
            case 4:
                c26 c262 = b26.a;
                return new ci6("kotlinx.datetime.DateTimeUnit", c262.b(DateTimeUnit.class), new gq3[]{c262.b(cls2), c262.b(cls), c262.b(DateTimeUnit.TimeBased.class)}, new zr3[]{gj1.a, bm4.a, di7.a});
            case 5:
                ll6[] ll6Arr = new ll6[0];
                if (!d57.I0("kotlinx.datetime.DayBased")) {
                    nq0 nq0 = new nq0("kotlinx.datetime.DayBased");
                    ue3 ue3 = ue3.a;
                    nq0.a("days", ue3.b, false);
                    return new nl6("kotlinx.datetime.DayBased", n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
                }
                h.q("Blank serial names are prohibited");
                return null;
            case 6:
                return DefaultAuthProvider$Config._init_$_anonymous_();
            case 7:
                return fc4.b("io.ktor.client.plugins.SaveBody");
            case 8:
                float f = my1.a;
                return vs7;
            case 9:
                float f2 = my1.a;
                return Boolean.TRUE;
            case 10:
                fm0 k = rg3.k();
                k.putAll(tc2.b(dt0.o0((List) xk4.a.getValue())));
                return k;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return tc2.b(new wl7(dt0.o0((List) xk4.a.getValue()), new f81(28)));
            case 12:
                return Forum._init_$_anonymous_();
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 14:
                try {
                    String[] strArr = ir2.x;
                    Method method = (Method) ir2.z.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls3 = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", new Class[]{cls3, SQLiteTransactionListener.class, cls3, CancellationSignal.class});
                } catch (Throwable unused2) {
                    return null;
                }
            case h75.g:
                return GMTDate._childSerializers$_anonymous_();
            case 16:
                return GMTDate._childSerializers$_anonymous_$0();
            case 17:
                return GetVectorOptions._childSerializers$_anonymous_();
            case 18:
                return GoTrueErrorResponse.WeakPassword._childSerializers$_anonymous_();
            case 19:
                return new xw2(0, 7);
            case 20:
                return Home._init_$_anonymous_();
            case 21:
                return HomeNavGraph._init_$_anonymous_();
            case 22:
                return u55.p("");
            case 23:
                List list = t13.a;
                return vs7;
            case 24:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 25:
                return new iz0();
            case 26:
                return new ArrayList();
            case 27:
                return new ArrayList();
            case 28:
                return new LinkedHashMap();
            default:
                return new d45(new c45());
        }
    }
}
