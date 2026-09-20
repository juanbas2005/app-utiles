package io.github.jan.supabase.auth.user;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u0000 M2\u00020\u0001:\u0002NOBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J$\u0010\b\u001a\u00020\u0014\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00028\u0000H\b¢\u0006\u0004\b\b\u0010\u0015J'\u0010\b\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010$\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\"\u0010#Jb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00105\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u00109R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u00109R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0005\u00106\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u00109R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u00109R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010 \"\u0004\bD\u0010ER$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u00109R(\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010H\u0012\u0004\bL\u0010?\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010K\u0002\u0007\n\u0005\b20\u0001¨\u0006P"}, d2 = {"Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "", "", "email", "password", "phone", "nonce", "Lkotlinx/serialization/json/JsonObject;", "data", "currentPassword", "Lt77;", "serializer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lt77;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lrl6;)V", "T", "Lvs7;", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lvm3;", "builder", "(Lvr2;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lkotlinx/serialization/json/JsonObject;", "component6", "component7$auth_kt", "()Lt77;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lt77;)Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/user/UserUpdateBuilder;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getPhone", "setPhone", "getPhone$annotations", "()V", "getNonce", "setNonce", "Lkotlinx/serialization/json/JsonObject;", "getData", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "getCurrentPassword", "setCurrentPassword", "Lt77;", "getSerializer", "setSerializer", "(Lt77;)V", "getSerializer$annotations", "Companion", "gy7", "hy7", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UserUpdateBuilder {
    public static final hy7 Companion = new Object();
    private String currentPassword;
    private JsonObject data;
    private String email;
    private String nonce;
    private String password;
    private String phone;
    private t77 serializer;

    public /* synthetic */ UserUpdateBuilder(int i, String str, String str2, String str3, String str4, JsonObject jsonObject, String str5, rl6 rl6) {
        if ((i & 1) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i & 2) == 0) {
            this.password = null;
        } else {
            this.password = str2;
        }
        if ((i & 4) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i & 8) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str4;
        }
        if ((i & 16) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
        if ((i & 32) == 0) {
            this.currentPassword = null;
        } else {
            this.currentPassword = str5;
        }
        this.serializer = new f96(26);
    }

    public static /* synthetic */ UserUpdateBuilder copy$default(UserUpdateBuilder userUpdateBuilder, String str, String str2, String str3, String str4, JsonObject jsonObject, String str5, t77 t77, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userUpdateBuilder.email;
        }
        if ((i & 2) != 0) {
            str2 = userUpdateBuilder.password;
        }
        if ((i & 4) != 0) {
            str3 = userUpdateBuilder.phone;
        }
        if ((i & 8) != 0) {
            str4 = userUpdateBuilder.nonce;
        }
        if ((i & 16) != 0) {
            jsonObject = userUpdateBuilder.data;
        }
        if ((i & 32) != 0) {
            str5 = userUpdateBuilder.currentPassword;
        }
        if ((i & 64) != 0) {
            t77 = userUpdateBuilder.serializer;
        }
        String str6 = str5;
        t77 t772 = t77;
        String str7 = str4;
        JsonObject jsonObject2 = jsonObject;
        return userUpdateBuilder.copy(str, str2, str3, str7, jsonObject2, str6, t772);
    }

    public static final /* synthetic */ void write$Self$auth_kt(UserUpdateBuilder userUpdateBuilder, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || userUpdateBuilder.email != null) {
            hy0.A(ll6, 0, t47.a, userUpdateBuilder.email);
        }
        if (hy0.f(ll6) || userUpdateBuilder.password != null) {
            hy0.A(ll6, 1, t47.a, userUpdateBuilder.password);
        }
        if (hy0.f(ll6) || userUpdateBuilder.phone != null) {
            hy0.A(ll6, 2, t47.a, userUpdateBuilder.phone);
        }
        if (hy0.f(ll6) || userUpdateBuilder.nonce != null) {
            hy0.A(ll6, 3, t47.a, userUpdateBuilder.nonce);
        }
        if (hy0.f(ll6) || userUpdateBuilder.data != null) {
            hy0.A(ll6, 4, xm3.a, userUpdateBuilder.data);
        }
        if (hy0.f(ll6) || userUpdateBuilder.currentPassword != null) {
            hy0.A(ll6, 5, t47.a, userUpdateBuilder.currentPassword);
        }
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.nonce;
    }

    public final JsonObject component5() {
        return this.data;
    }

    public final String component6() {
        return this.currentPassword;
    }

    public final t77 component7$auth_kt() {
        return this.serializer;
    }

    public final UserUpdateBuilder copy(String str, String str2, String str3, String str4, JsonObject jsonObject, String str5, t77 t77) {
        t77.getClass();
        return new UserUpdateBuilder(str, str2, str3, str4, jsonObject, str5, t77);
    }

    public final void data(vr2 vr2) {
        vr2.getClass();
        vm3 vm3 = new vm3();
        vr2.y(vm3);
        setData(vm3.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserUpdateBuilder)) {
            return false;
        }
        UserUpdateBuilder userUpdateBuilder = (UserUpdateBuilder) obj;
        if (sg3.e(this.email, userUpdateBuilder.email) && sg3.e(this.password, userUpdateBuilder.password) && sg3.e(this.phone, userUpdateBuilder.phone) && sg3.e(this.nonce, userUpdateBuilder.nonce) && sg3.e(this.data, userUpdateBuilder.data) && sg3.e(this.currentPassword, userUpdateBuilder.currentPassword) && sg3.e(this.serializer, userUpdateBuilder.serializer)) {
            return true;
        }
        return false;
    }

    public final String getCurrentPassword() {
        return this.currentPassword;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final t77 getSerializer() {
        return this.serializer;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.email;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = i * 31;
        String str2 = this.password;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.phone;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.nonce;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        JsonObject jsonObject = this.data;
        if (jsonObject == null) {
            i5 = 0;
        } else {
            i5 = jsonObject.hashCode();
        }
        int i11 = (i10 + i5) * 31;
        String str5 = this.currentPassword;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return this.serializer.hashCode() + ((i11 + i6) * 31);
    }

    public final void setCurrentPassword(String str) {
        this.currentPassword = str;
    }

    public final void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setSerializer(t77 t77) {
        t77.getClass();
        this.serializer = t77;
    }

    public String toString() {
        return "UserUpdateBuilder(email=" + this.email + ", password=" + this.password + ", phone=" + this.phone + ", nonce=" + this.nonce + ", data=" + this.data + ", currentPassword=" + this.currentPassword + ", serializer=" + this.serializer + ')';
    }

    public final <T> void data(T t) {
        t.getClass();
        getSerializer();
        ol3 ol3 = pl3.d;
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static /* synthetic */ void getPhone$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public UserUpdateBuilder() {
        this((String) null, (String) null, (String) null, (String) null, (JsonObject) null, (String) null, (t77) null, 127, (hl1) null);
    }

    public UserUpdateBuilder(String str, String str2, String str3, String str4, JsonObject jsonObject, String str5, t77 t77) {
        t77.getClass();
        this.email = str;
        this.password = str2;
        this.phone = str3;
        this.nonce = str4;
        this.data = jsonObject;
        this.currentPassword = str5;
        this.serializer = t77;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserUpdateBuilder(String str, String str2, String str3, String str4, JsonObject jsonObject, String str5, t77 t77, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : jsonObject, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? new f96(26) : t77);
    }
}
