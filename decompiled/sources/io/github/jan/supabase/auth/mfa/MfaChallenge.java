package io.github.jan.supabase.auth.mfa;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001b¨\u00060"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "", "", "id", "factorType", "Lqd3;", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqd3;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lqd3;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/mfa/MfaChallenge;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lqd3;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lqd3;)Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFactorType", "getFactorType$annotations", "()V", "Lqd3;", "getExpiresAt", "getExpiresAt$annotations", "Companion", "tk4", "uk4", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class MfaChallenge {
    public static final uk4 Companion = new Object();
    private final qd3 expiresAt;
    private final String factorType;
    private final String id;

    public /* synthetic */ MfaChallenge(int i, String str, String str2, qd3 qd3, rl6 rl6) {
        if (7 == (i & 7)) {
            this.id = str;
            this.factorType = str2;
            this.expiresAt = qd3;
            return;
        }
        wn6.x(i, 7, tk4.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ MfaChallenge copy$default(MfaChallenge mfaChallenge, String str, String str2, qd3 qd3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaChallenge.id;
        }
        if ((i & 2) != 0) {
            str2 = mfaChallenge.factorType;
        }
        if ((i & 4) != 0) {
            qd3 = mfaChallenge.expiresAt;
        }
        return mfaChallenge.copy(str, str2, qd3);
    }

    public static final /* synthetic */ void write$Self$auth_kt(MfaChallenge mfaChallenge, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, mfaChallenge.id);
        hy0.x(ll6, 1, mfaChallenge.factorType);
        hy0.o(ll6, 2, xs7.a, mfaChallenge.expiresAt);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.factorType;
    }

    public final qd3 component3() {
        return this.expiresAt;
    }

    public final MfaChallenge copy(String str, String str2, qd3 qd3) {
        str.getClass();
        str2.getClass();
        qd3.getClass();
        return new MfaChallenge(str, str2, qd3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MfaChallenge)) {
            return false;
        }
        MfaChallenge mfaChallenge = (MfaChallenge) obj;
        if (sg3.e(this.id, mfaChallenge.id) && sg3.e(this.factorType, mfaChallenge.factorType) && sg3.e(this.expiresAt, mfaChallenge.expiresAt)) {
            return true;
        }
        return false;
    }

    public final qd3 getExpiresAt() {
        return this.expiresAt;
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.expiresAt.hashCode() + hl6.h(this.id.hashCode() * 31, 31, this.factorType);
    }

    public String toString() {
        return "MfaChallenge(id=" + this.id + ", factorType=" + this.factorType + ", expiresAt=" + this.expiresAt + ')';
    }

    @Serializable(with = xs7.class)
    public static /* synthetic */ void getExpiresAt$annotations() {
    }

    public static /* synthetic */ void getFactorType$annotations() {
    }

    public MfaChallenge(String str, String str2, qd3 qd3) {
        str.getClass();
        str2.getClass();
        qd3.getClass();
        this.id = str;
        this.factorType = str2;
        this.expiresAt = qd3;
    }
}
