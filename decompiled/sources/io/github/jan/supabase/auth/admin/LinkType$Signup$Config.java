package io.github.jan.supabase.auth.admin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010-¨\u00061"}, d2 = {"io/github/jan/supabase/auth/admin/LinkType$Signup$Config", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "password", "Lkotlinx/serialization/json/JsonObject;", "data", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "email", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lrl6;)V", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPassword", "setPassword", "(Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonObject;", "getData", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "Companion", "h74", "i74", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class LinkType$Signup$Config extends LinkType$Config {
    public static final i74 Companion = new Object();
    private JsonObject data;
    private String password;

    public /* synthetic */ LinkType$Signup$Config(int i, String str, String str2, JsonObject jsonObject, rl6 rl6) {
        super(i, str, rl6);
        if ((i & 2) == 0) {
            this.password = "";
        } else {
            this.password = str2;
        }
        if ((i & 4) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static /* synthetic */ LinkType$Signup$Config copy$default(LinkType$Signup$Config linkType$Signup$Config, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkType$Signup$Config.password;
        }
        if ((i & 2) != 0) {
            jsonObject = linkType$Signup$Config.data;
        }
        return linkType$Signup$Config.copy(str, jsonObject);
    }

    public static final /* synthetic */ void write$Self$auth_kt(LinkType$Signup$Config linkType$Signup$Config, hy0 hy0, ll6 ll6) {
        LinkType$Config.write$Self(linkType$Signup$Config, hy0, ll6);
        if (hy0.f(ll6) || !sg3.e(linkType$Signup$Config.password, "")) {
            hy0.x(ll6, 1, linkType$Signup$Config.password);
        }
        if (hy0.f(ll6) || linkType$Signup$Config.data != null) {
            hy0.A(ll6, 2, xm3.a, linkType$Signup$Config.data);
        }
    }

    public final String component1() {
        return this.password;
    }

    public final JsonObject component2() {
        return this.data;
    }

    public final LinkType$Signup$Config copy(String str, JsonObject jsonObject) {
        str.getClass();
        return new LinkType$Signup$Config(str, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkType$Signup$Config)) {
            return false;
        }
        LinkType$Signup$Config linkType$Signup$Config = (LinkType$Signup$Config) obj;
        if (sg3.e(this.password, linkType$Signup$Config.password) && sg3.e(this.data, linkType$Signup$Config.data)) {
            return true;
        }
        return false;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int i;
        int hashCode = this.password.hashCode() * 31;
        JsonObject jsonObject = this.data;
        if (jsonObject == null) {
            i = 0;
        } else {
            i = jsonObject.hashCode();
        }
        return hashCode + i;
    }

    public final void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setPassword(String str) {
        str.getClass();
        this.password = str;
    }

    public String toString() {
        return "Config(password=" + this.password + ", data=" + this.data + ')';
    }

    public LinkType$Signup$Config() {
        this((String) null, (JsonObject) null, 3, (hl1) null);
    }

    public LinkType$Signup$Config(String str, JsonObject jsonObject) {
        str.getClass();
        this.password = str;
        this.data = jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkType$Signup$Config(String str, JsonObject jsonObject, int i, hl1 hl1) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : jsonObject);
    }
}
