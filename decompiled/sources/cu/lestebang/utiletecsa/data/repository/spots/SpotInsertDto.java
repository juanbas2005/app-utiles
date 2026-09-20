package cu.lestebang.utiletecsa.data.repository.spots;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0002KLBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J~\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0016R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bE\u00106\u001a\u0004\bD\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\bG\u00106\u001a\u0004\bF\u0010\u0016R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\bI\u00106\u001a\u0004\bH\u0010\u0016¨\u0006M"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;", "", "", "nick", "connectionType", "quality", "address", "province", "note", "", "latitude", "longitude", "userId", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Double;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/spots/SpotInsertDto;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getNick", "getNick$annotations", "()V", "getConnectionType", "getConnectionType$annotations", "getQuality", "getQuality$annotations", "getAddress", "getAddress$annotations", "getProvince", "getProvince$annotations", "getNote", "getNote$annotations", "Ljava/lang/Double;", "getLatitude", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "getUserId", "getUserId$annotations", "getDeviceId", "getDeviceId$annotations", "Companion", "o07", "p07", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class SpotInsertDto {
    public static final p07 Companion = new Object();
    private final String address;
    private final String connectionType;
    private final String deviceId;
    private final Double latitude;
    private final Double longitude;
    private final String nick;
    private final String note;
    private final String province;
    private final String quality;
    private final String userId;

    public /* synthetic */ SpotInsertDto(int i, String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8, rl6 rl6Var) {
        if (527 == (i & 527)) {
            this.nick = str;
            this.connectionType = str2;
            this.quality = str3;
            this.address = str4;
            if ((i & 16) == 0) {
                this.province = null;
            } else {
                this.province = str5;
            }
            if ((i & 32) == 0) {
                this.note = null;
            } else {
                this.note = str6;
            }
            if ((i & 64) == 0) {
                this.latitude = null;
            } else {
                this.latitude = d;
            }
            if ((i & 128) == 0) {
                this.longitude = null;
            } else {
                this.longitude = d2;
            }
            if ((i & 256) == 0) {
                this.userId = null;
            } else {
                this.userId = str7;
            }
            this.deviceId = str8;
            return;
        }
        wn6.x(i, 527, o07.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SpotInsertDto copy$default(SpotInsertDto spotInsertDto, String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotInsertDto.nick;
        }
        if ((i & 2) != 0) {
            str2 = spotInsertDto.connectionType;
        }
        if ((i & 4) != 0) {
            str3 = spotInsertDto.quality;
        }
        if ((i & 8) != 0) {
            str4 = spotInsertDto.address;
        }
        if ((i & 16) != 0) {
            str5 = spotInsertDto.province;
        }
        if ((i & 32) != 0) {
            str6 = spotInsertDto.note;
        }
        if ((i & 64) != 0) {
            d = spotInsertDto.latitude;
        }
        if ((i & 128) != 0) {
            d2 = spotInsertDto.longitude;
        }
        if ((i & 256) != 0) {
            str7 = spotInsertDto.userId;
        }
        if ((i & 512) != 0) {
            str8 = spotInsertDto.deviceId;
        }
        String str9 = str7;
        String str10 = str8;
        Double d3 = d;
        Double d4 = d2;
        String str11 = str5;
        String str12 = str6;
        return spotInsertDto.copy(str, str2, str3, str4, str11, str12, d3, d4, str9, str10);
    }

    public static final /* synthetic */ void write$Self$data(SpotInsertDto spotInsertDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, spotInsertDto.nick);
        hy0Var.x(ll6Var, 1, spotInsertDto.connectionType);
        hy0Var.x(ll6Var, 2, spotInsertDto.quality);
        hy0Var.x(ll6Var, 3, spotInsertDto.address);
        if (hy0Var.f(ll6Var) || spotInsertDto.province != null) {
            hy0Var.A(ll6Var, 4, t47.a, spotInsertDto.province);
        }
        if (hy0Var.f(ll6Var) || spotInsertDto.note != null) {
            hy0Var.A(ll6Var, 5, t47.a, spotInsertDto.note);
        }
        if (hy0Var.f(ll6Var) || spotInsertDto.latitude != null) {
            hy0Var.A(ll6Var, 6, ix1.a, spotInsertDto.latitude);
        }
        if (hy0Var.f(ll6Var) || spotInsertDto.longitude != null) {
            hy0Var.A(ll6Var, 7, ix1.a, spotInsertDto.longitude);
        }
        if (hy0Var.f(ll6Var) || spotInsertDto.userId != null) {
            hy0Var.A(ll6Var, 8, t47.a, spotInsertDto.userId);
        }
        hy0Var.x(ll6Var, 9, spotInsertDto.deviceId);
    }

    public final String component1() {
        return this.nick;
    }

    public final String component10() {
        return this.deviceId;
    }

    public final String component2() {
        return this.connectionType;
    }

    public final String component3() {
        return this.quality;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.province;
    }

    public final String component6() {
        return this.note;
    }

    public final Double component7() {
        return this.latitude;
    }

    public final Double component8() {
        return this.longitude;
    }

    public final String component9() {
        return this.userId;
    }

    public final SpotInsertDto copy(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str8.getClass();
        return new SpotInsertDto(str, str2, str3, str4, str5, str6, d, d2, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotInsertDto)) {
            return false;
        }
        SpotInsertDto spotInsertDto = (SpotInsertDto) obj;
        if (sg3.e(this.nick, spotInsertDto.nick) && sg3.e(this.connectionType, spotInsertDto.connectionType) && sg3.e(this.quality, spotInsertDto.quality) && sg3.e(this.address, spotInsertDto.address) && sg3.e(this.province, spotInsertDto.province) && sg3.e(this.note, spotInsertDto.note) && sg3.e(this.latitude, spotInsertDto.latitude) && sg3.e(this.longitude, spotInsertDto.longitude) && sg3.e(this.userId, spotInsertDto.userId) && sg3.e(this.deviceId, spotInsertDto.deviceId)) {
            return true;
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getNick() {
        return this.nick;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int h = hl6.h(hl6.h(hl6.h(this.nick.hashCode() * 31, 31, this.connectionType), 31, this.quality), 31, this.address);
        String str = this.province;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (h + hashCode) * 31;
        String str2 = this.note;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d = this.latitude;
        if (d == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Double d2 = this.longitude;
        if (d2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str3 = this.userId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.deviceId.hashCode() + ((i5 + i) * 31);
    }

    public String toString() {
        String str = this.nick;
        String str2 = this.connectionType;
        String str3 = this.quality;
        String str4 = this.address;
        String str5 = this.province;
        String str6 = this.note;
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str7 = this.userId;
        String str8 = this.deviceId;
        StringBuilder o = f21.o("SpotInsertDto(nick=", str, ", connectionType=", str2, ", quality=");
        f21.v(o, str3, ", address=", str4, ", province=");
        f21.v(o, str5, ", note=", str6, ", latitude=");
        o.append(d);
        o.append(", longitude=");
        o.append(d2);
        o.append(", userId=");
        return pb4.n(o, str7, ", deviceId=", str8, ")");
    }

    public static /* synthetic */ void getAddress$annotations() {
    }

    public static /* synthetic */ void getConnectionType$annotations() {
    }

    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static /* synthetic */ void getLatitude$annotations() {
    }

    public static /* synthetic */ void getLongitude$annotations() {
    }

    public static /* synthetic */ void getNick$annotations() {
    }

    public static /* synthetic */ void getNote$annotations() {
    }

    public static /* synthetic */ void getProvince$annotations() {
    }

    public static /* synthetic */ void getQuality$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public SpotInsertDto(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8) {
        hl6.t(str, str2, str3, str4, str8);
        this.nick = str;
        this.connectionType = str2;
        this.quality = str3;
        this.address = str4;
        this.province = str5;
        this.note = str6;
        this.latitude = d;
        this.longitude = d2;
        this.userId = str7;
        this.deviceId = str8;
    }

    public /* synthetic */ SpotInsertDto(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, String str7, String str8, int i, hl1 hl1Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : str7, str8);
    }
}
