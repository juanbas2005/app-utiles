package cu.lestebang.utiletecsa.data.repository.spots;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u0018¨\u00063"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/spots/SpotVoteDto;", "", "", "spotId", "deviceId", "", "vote", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/spots/SpotVoteDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/spots/SpotVoteDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSpotId", "getSpotId$annotations", "()V", "getDeviceId", "getDeviceId$annotations", "I", "getVote", "getVote$annotations", "getUserId", "getUserId$annotations", "Companion", "r07", "s07", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class SpotVoteDto {
    public static final s07 Companion = new Object();
    private final String deviceId;
    private final String spotId;
    private final String userId;
    private final int vote;

    public /* synthetic */ SpotVoteDto(int i, String str, String str2, int i2, String str3, rl6 rl6Var) {
        if (7 == (i & 7)) {
            this.spotId = str;
            this.deviceId = str2;
            this.vote = i2;
            if ((i & 8) == 0) {
                this.userId = null;
                return;
            } else {
                this.userId = str3;
                return;
            }
        }
        wn6.x(i, 7, r07.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SpotVoteDto copy$default(SpotVoteDto spotVoteDto, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = spotVoteDto.spotId;
        }
        if ((i2 & 2) != 0) {
            str2 = spotVoteDto.deviceId;
        }
        if ((i2 & 4) != 0) {
            i = spotVoteDto.vote;
        }
        if ((i2 & 8) != 0) {
            str3 = spotVoteDto.userId;
        }
        return spotVoteDto.copy(str, str2, i, str3);
    }

    public static final /* synthetic */ void write$Self$data(SpotVoteDto spotVoteDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, spotVoteDto.spotId);
        hy0Var.x(ll6Var, 1, spotVoteDto.deviceId);
        hy0Var.w(2, spotVoteDto.vote, ll6Var);
        if (hy0Var.f(ll6Var) || spotVoteDto.userId != null) {
            hy0Var.A(ll6Var, 3, t47.a, spotVoteDto.userId);
        }
    }

    public final String component1() {
        return this.spotId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final int component3() {
        return this.vote;
    }

    public final String component4() {
        return this.userId;
    }

    public final SpotVoteDto copy(String str, String str2, int i, String str3) {
        str.getClass();
        str2.getClass();
        return new SpotVoteDto(str, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotVoteDto)) {
            return false;
        }
        SpotVoteDto spotVoteDto = (SpotVoteDto) obj;
        if (sg3.e(this.spotId, spotVoteDto.spotId) && sg3.e(this.deviceId, spotVoteDto.deviceId) && this.vote == spotVoteDto.vote && sg3.e(this.userId, spotVoteDto.userId)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getSpotId() {
        return this.spotId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVote() {
        return this.vote;
    }

    public int hashCode() {
        int hashCode;
        int e = f21.e(this.vote, hl6.h(this.spotId.hashCode() * 31, 31, this.deviceId), 31);
        String str = this.userId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    public String toString() {
        String str = this.spotId;
        String str2 = this.deviceId;
        int i = this.vote;
        String str3 = this.userId;
        StringBuilder o = f21.o("SpotVoteDto(spotId=", str, ", deviceId=", str2, ", vote=");
        o.append(i);
        o.append(", userId=");
        o.append(str3);
        o.append(")");
        return o.toString();
    }

    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static /* synthetic */ void getSpotId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public static /* synthetic */ void getVote$annotations() {
    }

    public SpotVoteDto(String str, String str2, int i, String str3) {
        str.getClass();
        str2.getClass();
        this.spotId = str;
        this.deviceId = str2;
        this.vote = i;
        this.userId = str3;
    }

    public /* synthetic */ SpotVoteDto(String str, String str2, int i, String str3, int i2, hl1 hl1Var) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3);
    }
}
