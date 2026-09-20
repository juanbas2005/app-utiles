package io.github.jan.supabase.auth.mfa;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0005¨\u0006&"}, d2 = {"io/github/jan/supabase/auth/mfa/FactorType$Phone$Config", "", "", "phone", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lrl6;)V", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "setPhone", "Companion", "ua2", "va2", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FactorType$Phone$Config {
    public static final va2 Companion = new Object();
    private String phone;

    public /* synthetic */ FactorType$Phone$Config(int i, String str, rl6 rl6) {
        if ((i & 1) == 0) {
            this.phone = null;
        } else {
            this.phone = str;
        }
    }

    public static /* synthetic */ FactorType$Phone$Config copy$default(FactorType$Phone$Config factorType$Phone$Config, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = factorType$Phone$Config.phone;
        }
        return factorType$Phone$Config.copy(str);
    }

    public static final /* synthetic */ void write$Self$auth_kt(FactorType$Phone$Config factorType$Phone$Config, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || factorType$Phone$Config.phone != null) {
            hy0.A(ll6, 0, t47.a, factorType$Phone$Config.phone);
        }
    }

    public final String component1() {
        return this.phone;
    }

    public final FactorType$Phone$Config copy(String str) {
        return new FactorType$Phone$Config(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FactorType$Phone$Config) && sg3.e(this.phone, ((FactorType$Phone$Config) obj).phone)) {
            return true;
        }
        return false;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.phone;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public String toString() {
        return hl6.o(new StringBuilder("Config(phone="), this.phone, ')');
    }

    public FactorType$Phone$Config() {
        this((String) null, 1, (hl1) null);
    }

    public FactorType$Phone$Config(String str) {
        this.phone = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FactorType$Phone$Config(String str, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str);
    }
}
