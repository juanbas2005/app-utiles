package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.home.navigation.Vpn;
import io.github.jan.supabase.auth.admin.oauth.OAuthClientTokenEndpointAuthMethod;
import io.github.jan.supabase.auth.admin.oauth.UpdateOAuthClientBuilder;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.storage.vectors.index.VectorIndex;
import java.util.concurrent.TimeUnit;

/* renamed from: wi7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wi7 implements sr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ wi7(int i) {
        this.w = i;
    }

    public final Object b() {
        ie6 ie6;
        WindowLayoutComponent a;
        Object obj;
        switch (this.w) {
            case b85.b:
                return new zi7((jt0) null);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new br7();
            case 3:
                return UpdateOAuthClientBuilder._childSerializers$_anonymous_();
            case 4:
                return UpdateOAuthClientBuilder._childSerializers$_anonymous_$0();
            case 5:
                return UpdateOAuthClientBuilder._childSerializers$_anonymous_$1();
            case 6:
                return OAuthClientTokenEndpointAuthMethod.Companion.serializer();
            case 7:
                return DarkThemeConfigPreferences.Companion.serializer();
            case 8:
                return UserDataPreferences._childSerializers$_anonymous_$0();
            case 9:
                return UserDataPreferences._childSerializers$_anonymous_$1();
            case 10:
                return UserDataPreferences._childSerializers$_anonymous_$2();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return UserDataPreferences._childSerializers$_anonymous_$3();
            case 12:
                return UserDataPreferences._childSerializers$_anonymous_$4();
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return UserInfo._childSerializers$_anonymous_();
            case 14:
                return UserInfo._childSerializers$_anonymous_$0();
            case h75.g:
                d08 d08 = new d08(new ns8(4));
                ar7.h(d08, new vr2[]{new ha7(28)}, new ha7(29));
                return new e08(d08.build());
            case 16:
                d08 d082 = new d08(new ns8(4));
                ar7.h(d082, new vr2[]{new f08(0)}, new f08(1));
                return new e08(d082.build());
            case 17:
                d08 d083 = new d08(new ns8(4));
                si1.m(d083);
                si1.l(d083);
                return new e08(d083.build());
            case 18:
                return h08.g().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 19:
                return h08.g().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 20:
                return h08.g().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 21:
                return VectorIndex._childSerializers$_anonymous_();
            case 22:
                return VectorIndex._childSerializers$_anonymous_$0();
            case 23:
                return Vpn._init_$_anonymous_();
            case 24:
                c45 c45 = new c45();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c45.a(20, timeUnit);
                c45.y = fg8.b(30, timeUnit);
                return new d45(c45);
            case 25:
                try {
                    ClassLoader classLoader = z98.class.getClassLoader();
                    if (classLoader != null) {
                        ie6 = new ie6(classLoader, new ns8(classLoader));
                    } else {
                        ie6 = null;
                    }
                    if (ie6 == null || (a = ie6.a()) == null) {
                        return null;
                    }
                    ns8 ns8 = new ns8(classLoader);
                    int a2 = ma2.a();
                    if (a2 >= 9) {
                        obj = new ha2(a, ns8);
                    } else if (a2 >= 6) {
                        obj = new ha2(a, ns8);
                    } else if (a2 >= 2) {
                        obj = new ha2(a, ns8);
                    } else if (a2 == 1) {
                        obj = new ga2(a, ns8);
                    } else {
                        obj = new Object();
                    }
                    return obj;
                } catch (Throwable unused) {
                    return null;
                }
            case 26:
                return new kw5(0);
            case 27:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 28:
                qf8 qf8 = new qf8(new ns8(4));
                ti1.f(qf8);
                ar7.l(qf8, '-');
                ti1.h(qf8);
                return new ni1(qf8.build(), 1);
            default:
                return sf8.a();
        }
    }

    public /* synthetic */ wi7(int i, Object obj) {
        this.w = i;
    }
}
