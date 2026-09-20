package defpackage;

import com.google.firebase.sessions.SessionData;
import cu.lestebang.utiletecsa.feature.auth.navigation.SignIn;
import cu.lestebang.utiletecsa.feature.auth.navigation.SignUp;
import cu.lestebang.utiletecsa.feature.profile.navigation.Profile;
import cu.lestebang.utiletecsa.feature.red.navigation.Red;
import cu.lestebang.utiletecsa.feature.registro.navigation.Registro;
import cu.lestebang.utiletecsa.feature.registro.navigation.RegistroNavGraph;
import cu.lestebang.utiletecsa.feature.servicios.navigation.Servicios;
import cu.lestebang.utiletecsa.feature.sms.navigation.Sms;
import dev.whyoleg.cryptography.serialization.asn1.modules.SubjectPublicKeyInfo;
import io.github.jan.supabase.storage.vectors.data.QueryVectorsResponse;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: pp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pp5 implements sr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ pp5(int i) {
        this.w = i;
    }

    public final Object b() {
        switch (this.w) {
            case b85.b:
                return Profile._init_$_anonymous_();
            case 1:
                c45 c45 = new c45();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c45.a(15, timeUnit);
                c45.y = fg8.b(30, timeUnit);
                c45.i = true;
                return new d45(c45);
            case 2:
                return QueryVectorsResponse._childSerializers$_anonymous_();
            case 3:
                return QueryVectorsResponse._childSerializers$_anonymous_$0();
            case 4:
                return Red._init_$_anonymous_();
            case 5:
                return Registro._init_$_anonymous_();
            case 6:
                return RegistroNavGraph._init_$_anonymous_();
            case 7:
                return new LinkedHashSet();
            case 8:
                yy0 yy0 = d86.a;
                return pv8.r;
            case 9:
                return new pe6(new LinkedHashMap());
            case 10:
                t37 t37 = te6.a;
                return null;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new HashSet();
            case 12:
                return new gh6(0);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                yy0 yy02 = yj6.a;
                return null;
            case 14:
                return Servicios._init_$_anonymous_();
            case h75.g:
                return SessionData._childSerializers$_anonymous_();
            case 16:
                return new gr6();
            case 17:
                yy0 yy03 = lr6.a;
                return null;
            case 18:
                return SignIn._init_$_anonymous_();
            case 19:
                return SignUp._init_$_anonymous_();
            case 20:
                return Sms._init_$_anonymous_();
            case 21:
                return SubjectPublicKeyInfo._childSerializers$_anonymous_();
            case 22:
                return new lx1(0.0f);
            case 23:
                yy0 yy04 = kd7.a;
                return null;
            case 24:
                return u55.p(Boolean.FALSE);
            case 25:
                return er7.a;
            case 26:
                return new oe3(0);
            case 27:
                return new oe3(0);
            case 28:
                return ao1.a;
            default:
                ll6[] ll6Arr = new ll6[0];
                if (!d57.I0("kotlinx.datetime.TimeBased")) {
                    nq0 nq0 = new nq0("kotlinx.datetime.TimeBased");
                    tc4 tc4 = tc4.a;
                    nq0.a("nanoseconds", tc4.b, false);
                    return new nl6("kotlinx.datetime.TimeBased", n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
                }
                h.q("Blank serial names are prohibited");
                return null;
        }
    }
}
