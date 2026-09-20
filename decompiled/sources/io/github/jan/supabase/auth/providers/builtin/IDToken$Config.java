package io.github.jan.supabase.auth.providers.builtin;

import io.github.jan.supabase.auth.providers.IDTokenProvider;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u0000 I2\u00020\u0001:\u0002JKB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB_\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u00102R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00108R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010/\u0012\u0004\b;\u00104\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u00102R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\t\u0010>\u0012\u0004\bB\u00104\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010AR*\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010C\u0012\u0004\bH\u00104\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006L"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/IDToken$Config", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "", "idToken", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "provider", "accessToken", "nonce", "", "linkIdentity", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "captchaToken", "Lkotlinx/serialization/json/JsonObject;", "data", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/JsonObject;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "()Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "component3", "component4", "component5", "()Z", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "copy", "(Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;Z)Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getIdToken", "setIdToken", "(Ljava/lang/String;)V", "getIdToken$annotations", "()V", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "getProvider", "setProvider", "(Lio/github/jan/supabase/auth/providers/IDTokenProvider;)V", "getAccessToken", "setAccessToken", "getAccessToken$annotations", "getNonce", "setNonce", "Z", "getLinkIdentity", "setLinkIdentity", "(Z)V", "getLinkIdentity$annotations", "Lkotlinx/serialization/json/JsonObject;", "getData", "()Lkotlinx/serialization/json/JsonObject;", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "getData$annotations", "Companion", "k73", "l73", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class IDToken$Config extends DefaultAuthProvider$Config {
    public static final l73 Companion = new Object();
    private String accessToken;
    private JsonObject data;
    private String idToken;
    private boolean linkIdentity;
    private String nonce;
    private IDTokenProvider provider;

    public /* synthetic */ IDToken$Config(int i, String str, String str2, IDTokenProvider iDTokenProvider, String str3, String str4, boolean z, JsonObject jsonObject, rl6 rl6) {
        super(i, str, rl6);
        if ((i & 2) == 0) {
            this.idToken = "";
        } else {
            this.idToken = str2;
        }
        if ((i & 4) == 0) {
            this.provider = null;
        } else {
            this.provider = iDTokenProvider;
        }
        if ((i & 8) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str3;
        }
        if ((i & 16) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str4;
        }
        if ((i & 32) == 0) {
            this.linkIdentity = false;
        } else {
            this.linkIdentity = z;
        }
        if ((i & 64) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static /* synthetic */ IDToken$Config copy$default(IDToken$Config iDToken$Config, String str, IDTokenProvider iDTokenProvider, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iDToken$Config.idToken;
        }
        if ((i & 2) != 0) {
            iDTokenProvider = iDToken$Config.provider;
        }
        if ((i & 4) != 0) {
            str2 = iDToken$Config.accessToken;
        }
        if ((i & 8) != 0) {
            str3 = iDToken$Config.nonce;
        }
        if ((i & 16) != 0) {
            z = iDToken$Config.linkIdentity;
        }
        String str4 = str3;
        boolean z2 = z;
        return iDToken$Config.copy(str, iDTokenProvider, str2, str4, z2);
    }

    public static final /* synthetic */ void write$Self$auth_kt(IDToken$Config iDToken$Config, hy0 hy0, ll6 ll6) {
        DefaultAuthProvider$Config.write$Self(iDToken$Config, hy0, ll6);
        if (hy0.f(ll6) || !sg3.e(iDToken$Config.idToken, "")) {
            hy0.x(ll6, 1, iDToken$Config.idToken);
        }
        if (hy0.f(ll6) || iDToken$Config.provider != null) {
            hy0.A(ll6, 2, IDTokenProvider.Companion, iDToken$Config.provider);
        }
        if (hy0.f(ll6) || iDToken$Config.accessToken != null) {
            hy0.A(ll6, 3, t47.a, iDToken$Config.accessToken);
        }
        if (hy0.f(ll6) || iDToken$Config.nonce != null) {
            hy0.A(ll6, 4, t47.a, iDToken$Config.nonce);
        }
        if (hy0.f(ll6) || iDToken$Config.linkIdentity) {
            hy0.n(ll6, 5, iDToken$Config.linkIdentity);
        }
        if (hy0.f(ll6) || iDToken$Config.data != null) {
            hy0.A(ll6, 6, xm3.a, iDToken$Config.data);
        }
    }

    public final String component1() {
        return this.idToken;
    }

    public final IDTokenProvider component2() {
        return this.provider;
    }

    public final String component3() {
        return this.accessToken;
    }

    public final String component4() {
        return this.nonce;
    }

    public final boolean component5() {
        return this.linkIdentity;
    }

    public final IDToken$Config copy(String str, IDTokenProvider iDTokenProvider, String str2, String str3, boolean z) {
        str.getClass();
        return new IDToken$Config(str, iDTokenProvider, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDToken$Config)) {
            return false;
        }
        IDToken$Config iDToken$Config = (IDToken$Config) obj;
        if (sg3.e(this.idToken, iDToken$Config.idToken) && sg3.e(this.provider, iDToken$Config.provider) && sg3.e(this.accessToken, iDToken$Config.accessToken) && sg3.e(this.nonce, iDToken$Config.nonce) && this.linkIdentity == iDToken$Config.linkIdentity) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final boolean getLinkIdentity() {
        return this.linkIdentity;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final IDTokenProvider getProvider() {
        return this.provider;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.idToken.hashCode() * 31;
        IDTokenProvider iDTokenProvider = this.provider;
        int i3 = 0;
        if (iDTokenProvider == null) {
            i = 0;
        } else {
            i = iDTokenProvider.hashCode();
        }
        int i4 = (hashCode + i) * 31;
        String str = this.accessToken;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.nonce;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Boolean.hashCode(this.linkIdentity) + ((i5 + i3) * 31);
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setIdToken(String str) {
        str.getClass();
        this.idToken = str;
    }

    public final void setLinkIdentity(boolean z) {
        this.linkIdentity = z;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setProvider(IDTokenProvider iDTokenProvider) {
        this.provider = iDTokenProvider;
    }

    public String toString() {
        return "Config(idToken=" + this.idToken + ", provider=" + this.provider + ", accessToken=" + this.accessToken + ", nonce=" + this.nonce + ", linkIdentity=" + this.linkIdentity + ')';
    }

    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @fq1
    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getIdToken$annotations() {
    }

    public static /* synthetic */ void getLinkIdentity$annotations() {
    }

    public IDToken$Config() {
        this((String) null, (IDTokenProvider) null, (String) null, (String) null, false, 31, (hl1) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDToken$Config(String str, IDTokenProvider iDTokenProvider, String str2, String str3, boolean z) {
        super((String) null, 1, (hl1) null);
        str.getClass();
        this.idToken = str;
        this.provider = iDTokenProvider;
        this.accessToken = str2;
        this.nonce = str3;
        this.linkIdentity = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ IDToken$Config(String str, IDTokenProvider iDTokenProvider, String str2, String str3, boolean z, int i, hl1 hl1) {
        this(str, iDTokenProvider, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        str = (i & 1) != 0 ? "" : str;
        iDTokenProvider = (i & 2) != 0 ? null : iDTokenProvider;
    }
}
