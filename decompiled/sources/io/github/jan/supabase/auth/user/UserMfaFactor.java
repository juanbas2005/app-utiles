package io.github.jan.supabase.auth.user;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 =2\u00020\u0001:\u0002>?BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0013J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0013J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010\u0013R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010\u0013R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\u001fR\u0011\u0010;\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lio/github/jan/supabase/auth/user/UserMfaFactor;", "", "", "id", "Lqd3;", "createdAt", "updatedAt", "status", "friendlyName", "factorType", "lastChallengedAt", "<init>", "(Ljava/lang/String;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lrl6;)V", "component4", "()Ljava/lang/String;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/user/UserMfaFactor;Lhy0;Lll6;)V", "write$Self", "component1", "component2", "()Lqd3;", "component3", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lqd3;Lqd3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;)Lio/github/jan/supabase/auth/user/UserMfaFactor;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lqd3;", "getCreatedAt", "getCreatedAt$annotations", "()V", "getUpdatedAt", "getUpdatedAt$annotations", "getFriendlyName", "getFriendlyName$annotations", "getFactorType", "getFactorType$annotations", "getLastChallengedAt", "getLastChallengedAt$annotations", "isVerified", "()Z", "Companion", "bv7", "cv7", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UserMfaFactor {
    public static final cv7 Companion = new Object();
    private final qd3 createdAt;
    private final String factorType;
    private final String friendlyName;
    private final String id;
    private final qd3 lastChallengedAt;
    private final String status;
    private final qd3 updatedAt;

    public /* synthetic */ UserMfaFactor(int i, String str, qd3 qd3, qd3 qd32, String str2, String str3, String str4, qd3 qd33, rl6 rl6) {
        if (47 == (i & 47)) {
            this.id = str;
            this.createdAt = qd3;
            this.updatedAt = qd32;
            this.status = str2;
            if ((i & 16) == 0) {
                this.friendlyName = null;
            } else {
                this.friendlyName = str3;
            }
            this.factorType = str4;
            if ((i & 64) == 0) {
                this.lastChallengedAt = null;
            } else {
                this.lastChallengedAt = qd33;
            }
        } else {
            wn6.x(i, 47, bv7.a.getDescriptor());
            throw null;
        }
    }

    private final String component4() {
        return this.status;
    }

    public static /* synthetic */ UserMfaFactor copy$default(UserMfaFactor userMfaFactor, String str, qd3 qd3, qd3 qd32, String str2, String str3, String str4, qd3 qd33, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userMfaFactor.id;
        }
        if ((i & 2) != 0) {
            qd3 = userMfaFactor.createdAt;
        }
        if ((i & 4) != 0) {
            qd32 = userMfaFactor.updatedAt;
        }
        if ((i & 8) != 0) {
            str2 = userMfaFactor.status;
        }
        if ((i & 16) != 0) {
            str3 = userMfaFactor.friendlyName;
        }
        if ((i & 32) != 0) {
            str4 = userMfaFactor.factorType;
        }
        if ((i & 64) != 0) {
            qd33 = userMfaFactor.lastChallengedAt;
        }
        String str5 = str4;
        qd3 qd34 = qd33;
        String str6 = str2;
        String str7 = str3;
        return userMfaFactor.copy(str, qd3, qd32, str6, str7, str5, qd34);
    }

    public static final /* synthetic */ void write$Self$auth_kt(UserMfaFactor userMfaFactor, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, userMfaFactor.id);
        wd3 wd3 = wd3.a;
        hy0.o(ll6, 1, wd3, userMfaFactor.createdAt);
        hy0.o(ll6, 2, wd3, userMfaFactor.updatedAt);
        hy0.x(ll6, 3, userMfaFactor.status);
        if (hy0.f(ll6) || userMfaFactor.friendlyName != null) {
            hy0.A(ll6, 4, t47.a, userMfaFactor.friendlyName);
        }
        hy0.x(ll6, 5, userMfaFactor.factorType);
        if (hy0.f(ll6) || userMfaFactor.lastChallengedAt != null) {
            hy0.A(ll6, 6, wd3, userMfaFactor.lastChallengedAt);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final qd3 component2() {
        return this.createdAt;
    }

    public final qd3 component3() {
        return this.updatedAt;
    }

    public final String component5() {
        return this.friendlyName;
    }

    public final String component6() {
        return this.factorType;
    }

    public final qd3 component7() {
        return this.lastChallengedAt;
    }

    public final UserMfaFactor copy(String str, qd3 qd3, qd3 qd32, String str2, String str3, String str4, qd3 qd33) {
        str.getClass();
        qd3.getClass();
        qd32.getClass();
        str2.getClass();
        str4.getClass();
        return new UserMfaFactor(str, qd3, qd32, str2, str3, str4, qd33);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMfaFactor)) {
            return false;
        }
        UserMfaFactor userMfaFactor = (UserMfaFactor) obj;
        if (sg3.e(this.id, userMfaFactor.id) && sg3.e(this.createdAt, userMfaFactor.createdAt) && sg3.e(this.updatedAt, userMfaFactor.updatedAt) && sg3.e(this.status, userMfaFactor.status) && sg3.e(this.friendlyName, userMfaFactor.friendlyName) && sg3.e(this.factorType, userMfaFactor.factorType) && sg3.e(this.lastChallengedAt, userMfaFactor.lastChallengedAt)) {
            return true;
        }
        return false;
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final String getId() {
        return this.id;
    }

    public final qd3 getLastChallengedAt() {
        return this.lastChallengedAt;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i;
        int h = hl6.h((this.updatedAt.hashCode() + ((this.createdAt.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.status);
        String str = this.friendlyName;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int h2 = hl6.h((h + i) * 31, 31, this.factorType);
        qd3 qd3 = this.lastChallengedAt;
        if (qd3 != null) {
            i2 = qd3.hashCode();
        }
        return h2 + i2;
    }

    public final boolean isVerified() {
        return sg3.e(this.status, "verified");
    }

    public String toString() {
        return "UserMfaFactor(id=" + this.id + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", status=" + this.status + ", friendlyName=" + this.friendlyName + ", factorType=" + this.factorType + ", lastChallengedAt=" + this.lastChallengedAt + ')';
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getFactorType$annotations() {
    }

    public static /* synthetic */ void getFriendlyName$annotations() {
    }

    public static /* synthetic */ void getLastChallengedAt$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public UserMfaFactor(String str, qd3 qd3, qd3 qd32, String str2, String str3, String str4, qd3 qd33) {
        str.getClass();
        qd3.getClass();
        qd32.getClass();
        str2.getClass();
        str4.getClass();
        this.id = str;
        this.createdAt = qd3;
        this.updatedAt = qd32;
        this.status = str2;
        this.friendlyName = str3;
        this.factorType = str4;
        this.lastChallengedAt = qd33;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserMfaFactor(String str, qd3 qd3, qd3 qd32, String str2, String str3, String str4, qd3 qd33, int i, hl1 hl1) {
        this(str, qd3, qd32, str2, (i & 16) != 0 ? null : str3, str4, (i & 64) != 0 ? null : qd33);
    }
}
