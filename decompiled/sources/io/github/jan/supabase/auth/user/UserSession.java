package io.github.jan.supabase.auth.user;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u0000 J2\u00020\u0001:\u0002KLB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jp\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\u001fR \u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010\"¨\u0006M"}, d2 = {"Lio/github/jan/supabase/auth/user/UserSession;", "", "", "accessToken", "refreshToken", "providerRefreshToken", "providerToken", "", "expiresIn", "tokenType", "Lio/github/jan/supabase/auth/user/UserInfo;", "user", "type", "Lqd3;", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lqd3;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lqd3;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "()Lio/github/jan/supabase/auth/user/UserInfo;", "component8", "component9", "()Lqd3;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lqd3;)Lio/github/jan/supabase/auth/user/UserSession;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/user/UserSession;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "getRefreshToken", "getRefreshToken$annotations", "getProviderRefreshToken", "getProviderRefreshToken$annotations", "getProviderToken", "getProviderToken$annotations", "J", "getExpiresIn", "getExpiresIn$annotations", "getTokenType", "getTokenType$annotations", "Lio/github/jan/supabase/auth/user/UserInfo;", "getUser", "getType", "getType$annotations", "Lqd3;", "getExpiresAt", "Companion", "ey7", "fy7", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UserSession {
    public static final fy7 Companion = new Object();
    private final String accessToken;
    private final qd3 expiresAt;
    private final long expiresIn;
    private final String providerRefreshToken;
    private final String providerToken;
    private final String refreshToken;
    private final String tokenType;
    private final String type;
    private final UserInfo user;

    public UserSession(int i, String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, qd3 qd3, rl6 rl6) {
        if (51 == (i & 51)) {
            this.accessToken = str;
            this.refreshToken = str2;
            if ((i & 4) == 0) {
                this.providerRefreshToken = null;
            } else {
                this.providerRefreshToken = str3;
            }
            if ((i & 8) == 0) {
                this.providerToken = null;
            } else {
                this.providerToken = str4;
            }
            this.expiresIn = j;
            this.tokenType = str5;
            if ((i & 64) == 0) {
                this.user = null;
            } else {
                this.user = userInfo;
            }
            if ((i & 128) == 0) {
                this.type = "";
            } else {
                this.type = str6;
            }
            if ((i & 256) == 0) {
                qd3 c = td3.a.c();
                xb4 xb4 = u02.x;
                this.expiresAt = c.b(gl0.f0(j, y02.SECONDS));
                return;
            }
            this.expiresAt = qd3;
            return;
        }
        wn6.x(i, 51, ey7.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ UserSession copy$default(UserSession userSession, String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, qd3 qd3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSession.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = userSession.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = userSession.providerRefreshToken;
        }
        if ((i & 8) != 0) {
            str4 = userSession.providerToken;
        }
        if ((i & 16) != 0) {
            j = userSession.expiresIn;
        }
        if ((i & 32) != 0) {
            str5 = userSession.tokenType;
        }
        if ((i & 64) != 0) {
            userInfo = userSession.user;
        }
        if ((i & 128) != 0) {
            str6 = userSession.type;
        }
        if ((i & 256) != 0) {
            qd3 = userSession.expiresAt;
        }
        long j2 = j;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        return userSession.copy(str, str9, str7, str8, j2, str5, userInfo, str6, qd3);
    }

    public static final void write$Self$auth_kt(UserSession userSession, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, userSession.accessToken);
        hy0.x(ll6, 1, userSession.refreshToken);
        if (hy0.f(ll6) || userSession.providerRefreshToken != null) {
            hy0.A(ll6, 2, t47.a, userSession.providerRefreshToken);
        }
        if (hy0.f(ll6) || userSession.providerToken != null) {
            hy0.A(ll6, 3, t47.a, userSession.providerToken);
        }
        hy0.j(ll6, 4, userSession.expiresIn);
        hy0.x(ll6, 5, userSession.tokenType);
        if (hy0.f(ll6) || userSession.user != null) {
            hy0.A(ll6, 6, zu7.a, userSession.user);
        }
        if (hy0.f(ll6) || !sg3.e(userSession.type, "")) {
            hy0.x(ll6, 7, userSession.type);
        }
        if (!hy0.f(ll6)) {
            qd3 qd3 = userSession.expiresAt;
            qd3 c = td3.a.c();
            xb4 xb4 = u02.x;
            if (sg3.e(qd3, c.b(gl0.f0(userSession.expiresIn, y02.SECONDS)))) {
                return;
            }
        }
        hy0.o(ll6, 8, wd3.a, userSession.expiresAt);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public final String component3() {
        return this.providerRefreshToken;
    }

    public final String component4() {
        return this.providerToken;
    }

    public final long component5() {
        return this.expiresIn;
    }

    public final String component6() {
        return this.tokenType;
    }

    public final UserInfo component7() {
        return this.user;
    }

    public final String component8() {
        return this.type;
    }

    public final qd3 component9() {
        return this.expiresAt;
    }

    public final UserSession copy(String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, qd3 qd3) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        str6.getClass();
        qd3.getClass();
        return new UserSession(str, str2, str3, str4, j, str5, userInfo, str6, qd3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSession)) {
            return false;
        }
        UserSession userSession = (UserSession) obj;
        if (sg3.e(this.accessToken, userSession.accessToken) && sg3.e(this.refreshToken, userSession.refreshToken) && sg3.e(this.providerRefreshToken, userSession.providerRefreshToken) && sg3.e(this.providerToken, userSession.providerToken) && this.expiresIn == userSession.expiresIn && sg3.e(this.tokenType, userSession.tokenType) && sg3.e(this.user, userSession.user) && sg3.e(this.type, userSession.type) && sg3.e(this.expiresAt, userSession.expiresAt)) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final qd3 getExpiresAt() {
        return this.expiresAt;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getProviderRefreshToken() {
        return this.providerRefreshToken;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getType() {
        return this.type;
    }

    public final UserInfo getUser() {
        return this.user;
    }

    public int hashCode() {
        int i;
        int i2;
        int h = hl6.h(this.accessToken.hashCode() * 31, 31, this.refreshToken);
        String str = this.providerRefreshToken;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (h + i) * 31;
        String str2 = this.providerToken;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int h2 = hl6.h(pb4.b((i4 + i2) * 31, 31, this.expiresIn), 31, this.tokenType);
        UserInfo userInfo = this.user;
        if (userInfo != null) {
            i3 = userInfo.hashCode();
        }
        return this.expiresAt.hashCode() + hl6.h((h2 + i3) * 31, 31, this.type);
    }

    public String toString() {
        return "UserSession(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", providerRefreshToken=" + this.providerRefreshToken + ", providerToken=" + this.providerToken + ", expiresIn=" + this.expiresIn + ", tokenType=" + this.tokenType + ", user=" + this.user + ", type=" + this.type + ", expiresAt=" + this.expiresAt + ')';
    }

    public static /* synthetic */ void getAccessToken$annotations() {
    }

    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    public static /* synthetic */ void getProviderRefreshToken$annotations() {
    }

    public static /* synthetic */ void getProviderToken$annotations() {
    }

    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    public static /* synthetic */ void getTokenType$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public UserSession(String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, qd3 qd3) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        str6.getClass();
        qd3.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.providerRefreshToken = str3;
        this.providerToken = str4;
        this.expiresIn = j;
        this.tokenType = str5;
        this.user = userInfo;
        this.type = str6;
        this.expiresAt = qd3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public UserSession(String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, qd3 qd3, int i, hl1 hl1) {
        this(str, str2, str3, str4, j, str5, userInfo, str6, qd3);
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        userInfo = (i & 64) != 0 ? null : userInfo;
        str6 = (i & 128) != 0 ? "" : str6;
        if ((i & 256) != 0) {
            qd3 c = td3.a.c();
            xb4 xb4 = u02.x;
            qd3 = c.b(gl0.f0(j, y02.SECONDS));
        }
    }
}
