package io.github.jan.supabase.auth.jwt;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/jwt/AMRMethod;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "s", "Password", "OTP", "OAuth", "TOTP", "MFA_TOTP", "MFA_PHONE", "MFA_WEBAUTHN", "ANONYMOUS", "SSO_SAML", "MAGIC_LINK", "WEB3", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum AMRMethod {
    Password("password"),
    OTP("otp"),
    OAuth("oauth"),
    TOTP("totp"),
    MFA_TOTP("mfa/totp"),
    MFA_PHONE("mfa/phone"),
    MFA_WEBAUTHN("mfa/webauthn"),
    ANONYMOUS("anonymous"),
    SSO_SAML("sso/saml"),
    MAGIC_LINK("magiclink"),
    WEB3("web3");
    
    /* access modifiers changed from: private */
    public static final nz3 $cachedSerializer$delegate = null;
    public static final s Companion = null;
    private final String value;

    /* JADX WARNING: type inference failed for: r0v13, types: [s, java.lang.Object] */
    static {
        AMRMethod[] $values;
        $ENTRIES = hj8.t($values);
        Companion = new Object();
        $cachedSerializer$delegate = rg3.y(i44.w, new o(1));
    }

    private AMRMethod(String str) {
        this.value = str;
    }

    public static u52 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
