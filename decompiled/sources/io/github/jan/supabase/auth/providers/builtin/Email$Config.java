package io.github.jan.supabase.auth.providers.builtin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 22\u00020\u0001:\u000234B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010(\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010+R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101¨\u00065"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/Email$Config", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "", "email", "password", "Lkotlinx/serialization/json/JsonObject;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "captchaToken", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lrl6;)V", "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/providers/builtin/Email$Config;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "Lkotlinx/serialization/json/JsonObject;", "getData", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "Companion", "p22", "q22", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Email$Config extends DefaultAuthProvider$Config {
    public static final q22 Companion = new Object();
    private JsonObject data;
    private String email;
    private String password;

    public /* synthetic */ Email$Config(int i, String str, String str2, String str3, JsonObject jsonObject, rl6 rl6) {
        super(i, str, rl6);
        if ((i & 2) == 0) {
            this.email = "";
        } else {
            this.email = str2;
        }
        if ((i & 4) == 0) {
            this.password = "";
        } else {
            this.password = str3;
        }
        if ((i & 8) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static /* synthetic */ Email$Config copy$default(Email$Config email$Config, String str, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = email$Config.email;
        }
        if ((i & 2) != 0) {
            str2 = email$Config.password;
        }
        if ((i & 4) != 0) {
            jsonObject = email$Config.data;
        }
        return email$Config.copy(str, str2, jsonObject);
    }

    public static final /* synthetic */ void write$Self$auth_kt(Email$Config email$Config, hy0 hy0, ll6 ll6) {
        DefaultAuthProvider$Config.write$Self(email$Config, hy0, ll6);
        if (hy0.f(ll6) || !sg3.e(email$Config.email, "")) {
            hy0.x(ll6, 1, email$Config.email);
        }
        if (hy0.f(ll6) || !sg3.e(email$Config.password, "")) {
            hy0.x(ll6, 2, email$Config.password);
        }
        if (hy0.f(ll6) || email$Config.data != null) {
            hy0.A(ll6, 3, xm3.a, email$Config.data);
        }
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final JsonObject component3() {
        return this.data;
    }

    public final Email$Config copy(String str, String str2, JsonObject jsonObject) {
        str.getClass();
        str2.getClass();
        return new Email$Config(str, str2, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Email$Config)) {
            return false;
        }
        Email$Config email$Config = (Email$Config) obj;
        if (sg3.e(this.email, email$Config.email) && sg3.e(this.password, email$Config.password) && sg3.e(this.data, email$Config.data)) {
            return true;
        }
        return false;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int i;
        int h = hl6.h(this.email.hashCode() * 31, 31, this.password);
        JsonObject jsonObject = this.data;
        if (jsonObject == null) {
            i = 0;
        } else {
            i = jsonObject.hashCode();
        }
        return h + i;
    }

    public final void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setEmail(String str) {
        str.getClass();
        this.email = str;
    }

    public final void setPassword(String str) {
        str.getClass();
        this.password = str;
    }

    public String toString() {
        return "Config(email=" + this.email + ", password=" + this.password + ", data=" + this.data + ')';
    }

    public Email$Config() {
        this((String) null, (String) null, (JsonObject) null, 7, (hl1) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Email$Config(String str, String str2, JsonObject jsonObject) {
        super((String) null, 1, (hl1) null);
        str.getClass();
        str2.getClass();
        this.email = str;
        this.password = str2;
        this.data = jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Email$Config(String str, String str2, JsonObject jsonObject, int i, hl1 hl1) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : jsonObject);
    }
}
