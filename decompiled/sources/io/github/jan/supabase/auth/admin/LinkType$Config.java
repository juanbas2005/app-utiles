package io.github.jan.supabase.auth.admin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"io/github/jan/supabase/auth/admin/LinkType$Config", "", "<init>", "()V", "", "seen0", "", "email", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lrl6;)V", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self", "(Lio/github/jan/supabase/auth/admin/LinkType$Config;Lhy0;Lll6;)V", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "Companion", "d74", "e74", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class LinkType$Config {
    public static final e74 Companion = new Object();
    private String email;

    public /* synthetic */ LinkType$Config(int i, String str, rl6 rl6) {
        if ((i & 1) == 0) {
            this.email = "";
        } else {
            this.email = str;
        }
    }

    public static final /* synthetic */ void write$Self(LinkType$Config linkType$Config, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || !sg3.e(linkType$Config.email, "")) {
            hy0.x(ll6, 0, linkType$Config.email);
        }
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        str.getClass();
        this.email = str;
    }

    public LinkType$Config() {
        this.email = "";
    }
}
