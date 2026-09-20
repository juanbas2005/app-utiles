package cu.lestebang.utiletecsa.data.repository.profile;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006."}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/profile/ProfileRowDto;", "", "", "userId", "invitationCode", "registeredWithCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/profile/ProfileRowDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/profile/ProfileRowDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getInvitationCode", "getInvitationCode$annotations", "getRegisteredWithCode", "getRegisteredWithCode$annotations", "Companion", "up5", "vp5", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ProfileRowDto {
    public static final vp5 Companion = new Object();
    private final String invitationCode;
    private final String registeredWithCode;
    private final String userId;

    public /* synthetic */ ProfileRowDto(int i, String str, String str2, String str3, rl6 rl6) {
        if (1 == (i & 1)) {
            this.userId = str;
            if ((i & 2) == 0) {
                this.invitationCode = null;
            } else {
                this.invitationCode = str2;
            }
            if ((i & 4) == 0) {
                this.registeredWithCode = null;
            } else {
                this.registeredWithCode = str3;
            }
        } else {
            wn6.x(i, 1, up5.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ProfileRowDto copy$default(ProfileRowDto profileRowDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileRowDto.userId;
        }
        if ((i & 2) != 0) {
            str2 = profileRowDto.invitationCode;
        }
        if ((i & 4) != 0) {
            str3 = profileRowDto.registeredWithCode;
        }
        return profileRowDto.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$data(ProfileRowDto profileRowDto, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, profileRowDto.userId);
        if (hy0.f(ll6) || profileRowDto.invitationCode != null) {
            hy0.A(ll6, 1, t47.a, profileRowDto.invitationCode);
        }
        if (hy0.f(ll6) || profileRowDto.registeredWithCode != null) {
            hy0.A(ll6, 2, t47.a, profileRowDto.registeredWithCode);
        }
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.invitationCode;
    }

    public final String component3() {
        return this.registeredWithCode;
    }

    public final ProfileRowDto copy(String str, String str2, String str3) {
        str.getClass();
        return new ProfileRowDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRowDto)) {
            return false;
        }
        ProfileRowDto profileRowDto = (ProfileRowDto) obj;
        if (sg3.e(this.userId, profileRowDto.userId) && sg3.e(this.invitationCode, profileRowDto.invitationCode) && sg3.e(this.registeredWithCode, profileRowDto.registeredWithCode)) {
            return true;
        }
        return false;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }

    public final String getRegisteredWithCode() {
        return this.registeredWithCode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int hashCode = this.userId.hashCode() * 31;
        String str = this.invitationCode;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.registeredWithCode;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.invitationCode;
        return f21.l(f21.o("ProfileRowDto(userId=", str, ", invitationCode=", str2, ", registeredWithCode="), this.registeredWithCode, ")");
    }

    public static /* synthetic */ void getInvitationCode$annotations() {
    }

    public static /* synthetic */ void getRegisteredWithCode$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public ProfileRowDto(String str, String str2, String str3) {
        str.getClass();
        this.userId = str;
        this.invitationCode = str2;
        this.registeredWithCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileRowDto(String str, String str2, String str3, int i, hl1 hl1) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
