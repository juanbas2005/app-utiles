package io.github.jan.supabase.auth.mfa;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"io/github/jan/supabase/auth/mfa/FactorType$TOTP$Response", "", "", "secret", "qrCode", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSecret", "getQrCode", "getQrCode$annotations", "()V", "getUri", "Companion", "ab2", "bb2", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FactorType$TOTP$Response {
    public static final bb2 Companion = new Object();
    private final String qrCode;
    private final String secret;
    private final String uri;

    public /* synthetic */ FactorType$TOTP$Response(int i, String str, String str2, String str3, rl6 rl6) {
        if (7 == (i & 7)) {
            this.secret = str;
            this.qrCode = str2;
            this.uri = str3;
            return;
        }
        wn6.x(i, 7, ab2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ FactorType$TOTP$Response copy$default(FactorType$TOTP$Response factorType$TOTP$Response, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = factorType$TOTP$Response.secret;
        }
        if ((i & 2) != 0) {
            str2 = factorType$TOTP$Response.qrCode;
        }
        if ((i & 4) != 0) {
            str3 = factorType$TOTP$Response.uri;
        }
        return factorType$TOTP$Response.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$auth_kt(FactorType$TOTP$Response factorType$TOTP$Response, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, factorType$TOTP$Response.secret);
        hy0.x(ll6, 1, factorType$TOTP$Response.qrCode);
        hy0.x(ll6, 2, factorType$TOTP$Response.uri);
    }

    public final String component1() {
        return this.secret;
    }

    public final String component2() {
        return this.qrCode;
    }

    public final String component3() {
        return this.uri;
    }

    public final FactorType$TOTP$Response copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new FactorType$TOTP$Response(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FactorType$TOTP$Response)) {
            return false;
        }
        FactorType$TOTP$Response factorType$TOTP$Response = (FactorType$TOTP$Response) obj;
        if (sg3.e(this.secret, factorType$TOTP$Response.secret) && sg3.e(this.qrCode, factorType$TOTP$Response.qrCode) && sg3.e(this.uri, factorType$TOTP$Response.uri)) {
            return true;
        }
        return false;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + hl6.h(this.secret.hashCode() * 31, 31, this.qrCode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(secret=");
        sb.append(this.secret);
        sb.append(", qrCode=");
        sb.append(this.qrCode);
        sb.append(", uri=");
        return hl6.o(sb, this.uri, ')');
    }

    public static /* synthetic */ void getQrCode$annotations() {
    }

    public FactorType$TOTP$Response(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.secret = str;
        this.qrCode = str2;
        this.uri = str3;
    }
}
