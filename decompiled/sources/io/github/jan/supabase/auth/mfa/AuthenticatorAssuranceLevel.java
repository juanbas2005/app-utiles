package io.github.jan.supabase.auth.mfa;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/mfa/AuthenticatorAssuranceLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "iw", "AAL1", "AAL2", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum AuthenticatorAssuranceLevel {
    AAL1,
    AAL2;
    
    /* access modifiers changed from: private */
    public static final nz3 $cachedSerializer$delegate = null;
    public static final iw Companion = null;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, iw] */
    static {
        AuthenticatorAssuranceLevel[] $values;
        $ENTRIES = hj8.t($values);
        Companion = new Object();
        $cachedSerializer$delegate = rg3.y(i44.w, new o(6));
    }

    public static u52 getEntries() {
        return $ENTRIES;
    }
}
