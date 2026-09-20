package io.github.jan.supabase.auth.admin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0005¨\u0006*"}, d2 = {"io/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "newEmail", "<init>", "(Ljava/lang/String;)V", "", "seen0", "email", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrl6;)V", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewEmail", "setNewEmail", "getNewEmail$annotations", "()V", "Companion", "f74", "g74", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class LinkType$EmailChangeCurrent$Config extends LinkType$Config {
    public static final g74 Companion = new Object();
    private String newEmail;

    public /* synthetic */ LinkType$EmailChangeCurrent$Config(int i, String str, String str2, rl6 rl6) {
        super(i, str, rl6);
        if ((i & 2) == 0) {
            this.newEmail = "";
        } else {
            this.newEmail = str2;
        }
    }

    public static /* synthetic */ LinkType$EmailChangeCurrent$Config copy$default(LinkType$EmailChangeCurrent$Config linkType$EmailChangeCurrent$Config, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkType$EmailChangeCurrent$Config.newEmail;
        }
        return linkType$EmailChangeCurrent$Config.copy(str);
    }

    public static final /* synthetic */ void write$Self$auth_kt(LinkType$EmailChangeCurrent$Config linkType$EmailChangeCurrent$Config, hy0 hy0, ll6 ll6) {
        LinkType$Config.write$Self(linkType$EmailChangeCurrent$Config, hy0, ll6);
        if (hy0.f(ll6) || !sg3.e(linkType$EmailChangeCurrent$Config.newEmail, "")) {
            hy0.x(ll6, 1, linkType$EmailChangeCurrent$Config.newEmail);
        }
    }

    public final String component1() {
        return this.newEmail;
    }

    public final LinkType$EmailChangeCurrent$Config copy(String str) {
        str.getClass();
        return new LinkType$EmailChangeCurrent$Config(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LinkType$EmailChangeCurrent$Config) && sg3.e(this.newEmail, ((LinkType$EmailChangeCurrent$Config) obj).newEmail)) {
            return true;
        }
        return false;
    }

    public final String getNewEmail() {
        return this.newEmail;
    }

    public int hashCode() {
        return this.newEmail.hashCode();
    }

    public final void setNewEmail(String str) {
        str.getClass();
        this.newEmail = str;
    }

    public String toString() {
        return hl6.o(new StringBuilder("Config(newEmail="), this.newEmail, ')');
    }

    public LinkType$EmailChangeCurrent$Config() {
        this((String) null, 1, (hl1) null);
    }

    public LinkType$EmailChangeCurrent$Config(String str) {
        str.getClass();
        this.newEmail = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkType$EmailChangeCurrent$Config(String str, int i, hl1 hl1) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ void getNewEmail$annotations() {
    }
}
