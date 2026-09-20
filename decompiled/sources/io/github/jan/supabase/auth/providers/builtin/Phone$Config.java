package io.github.jan.supabase.auth.providers.builtin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 <2\u00020\u0001:\u0002=>B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010/R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010,\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010/R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u00107R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010!\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/Phone$Config", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "", "phone", "password", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "channel", "Lkotlinx/serialization/json/JsonObject;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "captchaToken", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlinx/serialization/json/JsonObject;Lrl6;)V", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "component4", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlinx/serialization/json/JsonObject;)Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "setPhone", "(Ljava/lang/String;)V", "getPhone$annotations", "()V", "getPassword", "setPassword", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "getChannel", "setChannel", "(Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;)V", "Lkotlinx/serialization/json/JsonObject;", "getData", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "Companion", "og5", "pg5", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Phone$Config extends DefaultAuthProvider$Config {
    public static final pg5 Companion = new Object();
    private Phone$Channel channel;
    private JsonObject data;
    private String password;
    private String phone;

    public /* synthetic */ Phone$Config(int i, String str, String str2, String str3, Phone$Channel phone$Channel, JsonObject jsonObject, rl6 rl6) {
        super(i, str, rl6);
        if ((i & 2) == 0) {
            this.phone = "";
        } else {
            this.phone = str2;
        }
        if ((i & 4) == 0) {
            this.password = "";
        } else {
            this.password = str3;
        }
        if ((i & 8) == 0) {
            this.channel = Phone$Channel.SMS;
        } else {
            this.channel = phone$Channel;
        }
        if ((i & 16) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static /* synthetic */ Phone$Config copy$default(Phone$Config phone$Config, String str, String str2, Phone$Channel phone$Channel, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone$Config.phone;
        }
        if ((i & 2) != 0) {
            str2 = phone$Config.password;
        }
        if ((i & 4) != 0) {
            phone$Channel = phone$Config.channel;
        }
        if ((i & 8) != 0) {
            jsonObject = phone$Config.data;
        }
        return phone$Config.copy(str, str2, phone$Channel, jsonObject);
    }

    public static final /* synthetic */ void write$Self$auth_kt(Phone$Config phone$Config, hy0 hy0, ll6 ll6) {
        DefaultAuthProvider$Config.write$Self(phone$Config, hy0, ll6);
        if (hy0.f(ll6) || !sg3.e(phone$Config.phone, "")) {
            hy0.x(ll6, 1, phone$Config.phone);
        }
        if (hy0.f(ll6) || !sg3.e(phone$Config.password, "")) {
            hy0.x(ll6, 2, phone$Config.password);
        }
        if (hy0.f(ll6) || phone$Config.channel != Phone$Channel.SMS) {
            hy0.o(ll6, 3, Phone$Channel.Companion, phone$Config.channel);
        }
        if (hy0.f(ll6) || phone$Config.data != null) {
            hy0.A(ll6, 4, xm3.a, phone$Config.data);
        }
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.password;
    }

    public final Phone$Channel component3() {
        return this.channel;
    }

    public final JsonObject component4() {
        return this.data;
    }

    public final Phone$Config copy(String str, String str2, Phone$Channel phone$Channel, JsonObject jsonObject) {
        str.getClass();
        str2.getClass();
        phone$Channel.getClass();
        return new Phone$Config(str, str2, phone$Channel, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone$Config)) {
            return false;
        }
        Phone$Config phone$Config = (Phone$Config) obj;
        if (sg3.e(this.phone, phone$Config.phone) && sg3.e(this.password, phone$Config.password) && this.channel == phone$Config.channel && sg3.e(this.data, phone$Config.data)) {
            return true;
        }
        return false;
    }

    public final Phone$Channel getChannel() {
        return this.channel;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.channel.hashCode() + hl6.h(this.phone.hashCode() * 31, 31, this.password)) * 31;
        JsonObject jsonObject = this.data;
        if (jsonObject == null) {
            i = 0;
        } else {
            i = jsonObject.hashCode();
        }
        return hashCode + i;
    }

    public final void setChannel(Phone$Channel phone$Channel) {
        phone$Channel.getClass();
        this.channel = phone$Channel;
    }

    public final void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setPassword(String str) {
        str.getClass();
        this.password = str;
    }

    public final void setPhone(String str) {
        str.getClass();
        this.phone = str;
    }

    public String toString() {
        return "Config(phone=" + this.phone + ", password=" + this.password + ", channel=" + this.channel + ", data=" + this.data + ')';
    }

    public static /* synthetic */ void getPhone$annotations() {
    }

    public Phone$Config() {
        this((String) null, (String) null, (Phone$Channel) null, (JsonObject) null, 15, (hl1) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Phone$Config(String str, String str2, Phone$Channel phone$Channel, JsonObject jsonObject) {
        super((String) null, 1, (hl1) null);
        str.getClass();
        str2.getClass();
        phone$Channel.getClass();
        this.phone = str;
        this.password = str2;
        this.channel = phone$Channel;
        this.data = jsonObject;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Phone$Config(String str, String str2, Phone$Channel phone$Channel, JsonObject jsonObject, int i, hl1 hl1) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Phone$Channel.SMS : phone$Channel, (i & 8) != 0 ? null : jsonObject);
    }
}
