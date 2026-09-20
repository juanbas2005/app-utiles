package io.github.jan.supabase.auth.user;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 B2\u00020\u0001:\u0002CDBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014Jh\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b=\u00102\u001a\u0004\b<\u0010\u0014R \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010\u0014R \u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010\u0014¨\u0006E"}, d2 = {"Lio/github/jan/supabase/auth/user/Identity;", "", "", "id", "Lkotlinx/serialization/json/JsonObject;", "identityData", "identityId", "lastSignInAt", "updatedAt", "createdAt", "provider", "userId", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/user/Identity;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/user/Identity;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lkotlinx/serialization/json/JsonObject;", "getIdentityData", "getIdentityData$annotations", "getIdentityId", "getIdentityId$annotations", "getLastSignInAt", "getLastSignInAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getProvider", "getProvider$annotations", "getUserId", "getUserId$annotations", "Companion", "g83", "h83", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Identity {
    public static final h83 Companion = new Object();
    private final String createdAt;
    private final String id;
    private final JsonObject identityData;
    private final String identityId;
    private final String lastSignInAt;
    private final String provider;
    private final String updatedAt;
    private final String userId;

    public /* synthetic */ Identity(int i, String str, JsonObject jsonObject, String str2, String str3, String str4, String str5, String str6, String str7, rl6 rl6) {
        if (195 == (i & 195)) {
            this.id = str;
            this.identityData = jsonObject;
            if ((i & 4) == 0) {
                this.identityId = null;
            } else {
                this.identityId = str2;
            }
            if ((i & 8) == 0) {
                this.lastSignInAt = null;
            } else {
                this.lastSignInAt = str3;
            }
            if ((i & 16) == 0) {
                this.updatedAt = null;
            } else {
                this.updatedAt = str4;
            }
            if ((i & 32) == 0) {
                this.createdAt = null;
            } else {
                this.createdAt = str5;
            }
            this.provider = str6;
            this.userId = str7;
            return;
        }
        wn6.x(i, 195, g83.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ Identity copy$default(Identity identity, String str, JsonObject jsonObject, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identity.id;
        }
        if ((i & 2) != 0) {
            jsonObject = identity.identityData;
        }
        if ((i & 4) != 0) {
            str2 = identity.identityId;
        }
        if ((i & 8) != 0) {
            str3 = identity.lastSignInAt;
        }
        if ((i & 16) != 0) {
            str4 = identity.updatedAt;
        }
        if ((i & 32) != 0) {
            str5 = identity.createdAt;
        }
        if ((i & 64) != 0) {
            str6 = identity.provider;
        }
        if ((i & 128) != 0) {
            str7 = identity.userId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        JsonObject jsonObject2 = jsonObject;
        return identity.copy(str, jsonObject2, str2, str12, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$auth_kt(Identity identity, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, identity.id);
        hy0.o(ll6, 1, xm3.a, identity.identityData);
        if (hy0.f(ll6) || identity.identityId != null) {
            hy0.A(ll6, 2, t47.a, identity.identityId);
        }
        if (hy0.f(ll6) || identity.lastSignInAt != null) {
            hy0.A(ll6, 3, t47.a, identity.lastSignInAt);
        }
        if (hy0.f(ll6) || identity.updatedAt != null) {
            hy0.A(ll6, 4, t47.a, identity.updatedAt);
        }
        if (hy0.f(ll6) || identity.createdAt != null) {
            hy0.A(ll6, 5, t47.a, identity.createdAt);
        }
        hy0.x(ll6, 6, identity.provider);
        hy0.x(ll6, 7, identity.userId);
    }

    public final String component1() {
        return this.id;
    }

    public final JsonObject component2() {
        return this.identityData;
    }

    public final String component3() {
        return this.identityId;
    }

    public final String component4() {
        return this.lastSignInAt;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final String component7() {
        return this.provider;
    }

    public final String component8() {
        return this.userId;
    }

    public final Identity copy(String str, JsonObject jsonObject, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        jsonObject.getClass();
        str6.getClass();
        str7.getClass();
        return new Identity(str, jsonObject, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Identity)) {
            return false;
        }
        Identity identity = (Identity) obj;
        if (sg3.e(this.id, identity.id) && sg3.e(this.identityData, identity.identityData) && sg3.e(this.identityId, identity.identityId) && sg3.e(this.lastSignInAt, identity.lastSignInAt) && sg3.e(this.updatedAt, identity.updatedAt) && sg3.e(this.createdAt, identity.createdAt) && sg3.e(this.provider, identity.provider) && sg3.e(this.userId, identity.userId)) {
            return true;
        }
        return false;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final JsonObject getIdentityData() {
        return this.identityData;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public final String getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.identityData.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.identityId;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (hashCode + i) * 31;
        String str2 = this.lastSignInAt;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.updatedAt;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.createdAt;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return this.userId.hashCode() + hl6.h((i7 + i4) * 31, 31, this.provider);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Identity(id=");
        sb.append(this.id);
        sb.append(", identityData=");
        sb.append(this.identityData);
        sb.append(", identityId=");
        sb.append(this.identityId);
        sb.append(", lastSignInAt=");
        sb.append(this.lastSignInAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", userId=");
        return hl6.o(sb, this.userId, ')');
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getIdentityData$annotations() {
    }

    public static /* synthetic */ void getIdentityId$annotations() {
    }

    public static /* synthetic */ void getLastSignInAt$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public Identity(String str, JsonObject jsonObject, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        jsonObject.getClass();
        str6.getClass();
        str7.getClass();
        this.id = str;
        this.identityData = jsonObject;
        this.identityId = str2;
        this.lastSignInAt = str3;
        this.updatedAt = str4;
        this.createdAt = str5;
        this.provider = str6;
        this.userId = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Identity(String str, JsonObject jsonObject, String str2, String str3, String str4, String str5, String str6, String str7, int i, hl1 hl1) {
        this(str, jsonObject, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, str6, str7);
    }
}
