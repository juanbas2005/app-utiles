package io.github.jan.supabase.auth.admin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\b\u0018\u0000 P2\u00020\u0001:\u0002QRBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J|\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u00105R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0006\u00108\u0012\u0004\b<\u0010=\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010;R*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0007\u00108\u0012\u0004\b@\u0010=\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010;R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\t\u0010A\u0012\u0004\bE\u0010=\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010DR*\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\n\u0010A\u0012\u0004\bH\u0010=\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010DR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\bI\u0010\u0016\"\u0004\bJ\u00105R*\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\f\u00102\u0012\u0004\bM\u0010=\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u00105R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u00105¨\u0006S"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "", "", "email", "password", "Lkotlinx/serialization/json/JsonObject;", "appMetadata", "userMetadata", "", "emailConfirm", "phoneConfirm", "phone", "banDuration", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "Lkotlinx/serialization/json/JsonObject;", "getAppMetadata", "setAppMetadata", "(Lkotlinx/serialization/json/JsonObject;)V", "getAppMetadata$annotations", "()V", "getUserMetadata", "setUserMetadata", "getUserMetadata$annotations", "Ljava/lang/Boolean;", "getEmailConfirm", "setEmailConfirm", "(Ljava/lang/Boolean;)V", "getEmailConfirm$annotations", "getPhoneConfirm", "setPhoneConfirm", "getPhoneConfirm$annotations", "getPhone", "setPhone", "getBanDuration", "setBanDuration", "getBanDuration$annotations", "getRole", "setRole", "Companion", "aa", "ba", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AdminUserUpdateBuilder {
    public static final ba Companion = new Object();
    private JsonObject appMetadata;
    private String banDuration;
    private String email;
    private Boolean emailConfirm;
    private String password;
    private String phone;
    private Boolean phoneConfirm;
    private String role;
    private JsonObject userMetadata;

    public /* synthetic */ AdminUserUpdateBuilder(int i, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, Boolean bool, Boolean bool2, String str3, String str4, String str5, rl6 rl6) {
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
            this.appMetadata = null;
        } else {
            this.appMetadata = jsonObject;
        }
        if ((i & 8) == 0) {
            this.userMetadata = null;
        } else {
            this.userMetadata = jsonObject2;
        }
        if ((i & 16) == 0) {
            this.emailConfirm = null;
        } else {
            this.emailConfirm = bool;
        }
        if ((i & 32) == 0) {
            this.phoneConfirm = null;
        } else {
            this.phoneConfirm = bool2;
        }
        if ((i & 64) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i & 128) == 0) {
            this.banDuration = null;
        } else {
            this.banDuration = str4;
        }
        if ((i & 256) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
    }

    public static /* synthetic */ AdminUserUpdateBuilder copy$default(AdminUserUpdateBuilder adminUserUpdateBuilder, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adminUserUpdateBuilder.email;
        }
        if ((i & 2) != 0) {
            str2 = adminUserUpdateBuilder.password;
        }
        if ((i & 4) != 0) {
            jsonObject = adminUserUpdateBuilder.appMetadata;
        }
        if ((i & 8) != 0) {
            jsonObject2 = adminUserUpdateBuilder.userMetadata;
        }
        if ((i & 16) != 0) {
            bool = adminUserUpdateBuilder.emailConfirm;
        }
        if ((i & 32) != 0) {
            bool2 = adminUserUpdateBuilder.phoneConfirm;
        }
        if ((i & 64) != 0) {
            str3 = adminUserUpdateBuilder.phone;
        }
        if ((i & 128) != 0) {
            str4 = adminUserUpdateBuilder.banDuration;
        }
        if ((i & 256) != 0) {
            str5 = adminUserUpdateBuilder.role;
        }
        String str6 = str4;
        String str7 = str5;
        Boolean bool3 = bool2;
        String str8 = str3;
        JsonObject jsonObject3 = jsonObject2;
        Boolean bool4 = bool;
        return adminUserUpdateBuilder.copy(str, str2, jsonObject, jsonObject3, bool4, bool3, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$auth_kt(AdminUserUpdateBuilder adminUserUpdateBuilder, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || adminUserUpdateBuilder.email != null) {
            hy0.A(ll6, 0, t47.a, adminUserUpdateBuilder.email);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.password != null) {
            hy0.A(ll6, 1, t47.a, adminUserUpdateBuilder.password);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.appMetadata != null) {
            hy0.A(ll6, 2, xm3.a, adminUserUpdateBuilder.appMetadata);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.userMetadata != null) {
            hy0.A(ll6, 3, xm3.a, adminUserUpdateBuilder.userMetadata);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.emailConfirm != null) {
            hy0.A(ll6, 4, ja0.a, adminUserUpdateBuilder.emailConfirm);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.phoneConfirm != null) {
            hy0.A(ll6, 5, ja0.a, adminUserUpdateBuilder.phoneConfirm);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.phone != null) {
            hy0.A(ll6, 6, t47.a, adminUserUpdateBuilder.phone);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.banDuration != null) {
            hy0.A(ll6, 7, t47.a, adminUserUpdateBuilder.banDuration);
        }
        if (hy0.f(ll6) || adminUserUpdateBuilder.role != null) {
            hy0.A(ll6, 8, t47.a, adminUserUpdateBuilder.role);
        }
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final JsonObject component3() {
        return this.appMetadata;
    }

    public final JsonObject component4() {
        return this.userMetadata;
    }

    public final Boolean component5() {
        return this.emailConfirm;
    }

    public final Boolean component6() {
        return this.phoneConfirm;
    }

    public final String component7() {
        return this.phone;
    }

    public final String component8() {
        return this.banDuration;
    }

    public final String component9() {
        return this.role;
    }

    public final AdminUserUpdateBuilder copy(String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
        return new AdminUserUpdateBuilder(str, str2, jsonObject, jsonObject2, bool, bool2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdminUserUpdateBuilder)) {
            return false;
        }
        AdminUserUpdateBuilder adminUserUpdateBuilder = (AdminUserUpdateBuilder) obj;
        if (sg3.e(this.email, adminUserUpdateBuilder.email) && sg3.e(this.password, adminUserUpdateBuilder.password) && sg3.e(this.appMetadata, adminUserUpdateBuilder.appMetadata) && sg3.e(this.userMetadata, adminUserUpdateBuilder.userMetadata) && sg3.e(this.emailConfirm, adminUserUpdateBuilder.emailConfirm) && sg3.e(this.phoneConfirm, adminUserUpdateBuilder.phoneConfirm) && sg3.e(this.phone, adminUserUpdateBuilder.phone) && sg3.e(this.banDuration, adminUserUpdateBuilder.banDuration) && sg3.e(this.role, adminUserUpdateBuilder.role)) {
            return true;
        }
        return false;
    }

    public final JsonObject getAppMetadata() {
        return this.appMetadata;
    }

    public final String getBanDuration() {
        return this.banDuration;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getEmailConfirm() {
        return this.emailConfirm;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Boolean getPhoneConfirm() {
        return this.phoneConfirm;
    }

    public final String getRole() {
        return this.role;
    }

    public final JsonObject getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.email;
        int i9 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i10 = i * 31;
        String str2 = this.password;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i11 = (i10 + i2) * 31;
        JsonObject jsonObject = this.appMetadata;
        if (jsonObject == null) {
            i3 = 0;
        } else {
            i3 = jsonObject.hashCode();
        }
        int i12 = (i11 + i3) * 31;
        JsonObject jsonObject2 = this.userMetadata;
        if (jsonObject2 == null) {
            i4 = 0;
        } else {
            i4 = jsonObject2.hashCode();
        }
        int i13 = (i12 + i4) * 31;
        Boolean bool = this.emailConfirm;
        if (bool == null) {
            i5 = 0;
        } else {
            i5 = bool.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        Boolean bool2 = this.phoneConfirm;
        if (bool2 == null) {
            i6 = 0;
        } else {
            i6 = bool2.hashCode();
        }
        int i15 = (i14 + i6) * 31;
        String str3 = this.phone;
        if (str3 == null) {
            i7 = 0;
        } else {
            i7 = str3.hashCode();
        }
        int i16 = (i15 + i7) * 31;
        String str4 = this.banDuration;
        if (str4 == null) {
            i8 = 0;
        } else {
            i8 = str4.hashCode();
        }
        int i17 = (i16 + i8) * 31;
        String str5 = this.role;
        if (str5 != null) {
            i9 = str5.hashCode();
        }
        return i17 + i9;
    }

    public final void setAppMetadata(JsonObject jsonObject) {
        this.appMetadata = jsonObject;
    }

    public final void setBanDuration(String str) {
        this.banDuration = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setEmailConfirm(Boolean bool) {
        this.emailConfirm = bool;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneConfirm(Boolean bool) {
        this.phoneConfirm = bool;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setUserMetadata(JsonObject jsonObject) {
        this.userMetadata = jsonObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdminUserUpdateBuilder(email=");
        sb.append(this.email);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", userMetadata=");
        sb.append(this.userMetadata);
        sb.append(", emailConfirm=");
        sb.append(this.emailConfirm);
        sb.append(", phoneConfirm=");
        sb.append(this.phoneConfirm);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", banDuration=");
        sb.append(this.banDuration);
        sb.append(", role=");
        return hl6.o(sb, this.role, ')');
    }

    public static /* synthetic */ void getAppMetadata$annotations() {
    }

    public static /* synthetic */ void getBanDuration$annotations() {
    }

    public static /* synthetic */ void getEmailConfirm$annotations() {
    }

    public static /* synthetic */ void getPhoneConfirm$annotations() {
    }

    public static /* synthetic */ void getUserMetadata$annotations() {
    }

    public AdminUserUpdateBuilder() {
        this((String) null, (String) null, (JsonObject) null, (JsonObject) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 511, (hl1) null);
    }

    public AdminUserUpdateBuilder(String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
        this.email = str;
        this.password = str2;
        this.appMetadata = jsonObject;
        this.userMetadata = jsonObject2;
        this.emailConfirm = bool;
        this.phoneConfirm = bool2;
        this.phone = str3;
        this.banDuration = str4;
        this.role = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdminUserUpdateBuilder(String str, String str2, JsonObject jsonObject, JsonObject jsonObject2, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonObject2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }
}
