package io.github.jan.supabase.auth.jwt;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 *2\u00020\u0001:\u0003\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lio/github/jan/supabase/auth/jwt/JwtHeader;", "", "Laq3;", "alg", "", "kid", "typ", "<init>", "(Laq3;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILaq3;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/jwt/JwtHeader;Lhy0;Lll6;)V", "write$Self", "component1", "()Laq3;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Laq3;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/jwt/JwtHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laq3;", "getAlg", "Ljava/lang/String;", "getKid", "getTyp", "Companion", "zp3", "bq3", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class JwtHeader {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new q83(15)), null, null};
    public static final bq3 Companion = new Object();
    private final aq3 alg;
    private final String kid;
    private final String typ;

    public /* synthetic */ JwtHeader(int i, aq3 aq3, String str, String str2, rl6 rl6) {
        if (1 == (i & 1)) {
            this.alg = aq3;
            if ((i & 2) == 0) {
                this.kid = null;
            } else {
                this.kid = str;
            }
            if ((i & 4) == 0) {
                this.typ = null;
            } else {
                this.typ = str2;
            }
        } else {
            wn6.x(i, 1, zp3.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        aq3[] values = aq3.values();
        values.getClass();
        return new a62("io.github.jan.supabase.auth.jwt.JwtHeader.Algorithm", (Enum[]) values);
    }

    public static /* synthetic */ JwtHeader copy$default(JwtHeader jwtHeader, aq3 aq3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            aq3 = jwtHeader.alg;
        }
        if ((i & 2) != 0) {
            str = jwtHeader.kid;
        }
        if ((i & 4) != 0) {
            str2 = jwtHeader.typ;
        }
        return jwtHeader.copy(aq3, str, str2);
    }

    public static final /* synthetic */ void write$Self$auth_kt(JwtHeader jwtHeader, hy0 hy0, ll6 ll6) {
        hy0.o(ll6, 0, (zr3) $childSerializers[0].getValue(), jwtHeader.alg);
        if (hy0.f(ll6) || jwtHeader.kid != null) {
            hy0.A(ll6, 1, t47.a, jwtHeader.kid);
        }
        if (hy0.f(ll6) || jwtHeader.typ != null) {
            hy0.A(ll6, 2, t47.a, jwtHeader.typ);
        }
    }

    public final aq3 component1() {
        return this.alg;
    }

    public final String component2() {
        return this.kid;
    }

    public final String component3() {
        return this.typ;
    }

    public final JwtHeader copy(aq3 aq3, String str, String str2) {
        aq3.getClass();
        return new JwtHeader(aq3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JwtHeader)) {
            return false;
        }
        JwtHeader jwtHeader = (JwtHeader) obj;
        if (this.alg == jwtHeader.alg && sg3.e(this.kid, jwtHeader.kid) && sg3.e(this.typ, jwtHeader.typ)) {
            return true;
        }
        return false;
    }

    public final aq3 getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        int i;
        int hashCode = this.alg.hashCode() * 31;
        String str = this.kid;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.typ;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JwtHeader(alg=");
        sb.append(this.alg);
        sb.append(", kid=");
        sb.append(this.kid);
        sb.append(", typ=");
        return hl6.o(sb, this.typ, ')');
    }

    public JwtHeader(aq3 aq3, String str, String str2) {
        aq3.getClass();
        this.alg = aq3;
        this.kid = str;
        this.typ = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JwtHeader(aq3 aq3, String str, String str2, int i, hl1 hl1) {
        this(aq3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
