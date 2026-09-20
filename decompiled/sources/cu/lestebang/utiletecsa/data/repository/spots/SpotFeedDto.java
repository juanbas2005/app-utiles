package cu.lestebang.utiletecsa.data.repository.spots;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0081\b\u0018\u0000 Y2\u00020\u0001:\u0002Z[B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u009a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010;\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\bB\u0010>\u001a\u0004\bA\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010K\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010K\u0012\u0004\bO\u0010>\u001a\u0004\bN\u0010\"R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\bQ\u0010>\u001a\u0004\bP\u0010\u001aR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\bS\u0010>\u001a\u0004\bR\u0010\u001aR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010T\u0012\u0004\bV\u0010>\u001a\u0004\bU\u0010'R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010T\u0012\u0004\bX\u0010>\u001a\u0004\bW\u0010'¨\u0006\\"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;", "", "", "id", "nick", "connectionType", "quality", "address", "province", "note", "", "latitude", "longitude", "deviceId", "createdAt", "", "likes", "dislikes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JJ)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JJLrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Double;", "component9", "component10", "component11", "component12", "()J", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;JJ)Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getNick", "getNick$annotations", "getConnectionType", "getConnectionType$annotations", "getQuality", "getQuality$annotations", "getAddress", "getAddress$annotations", "getProvince", "getProvince$annotations", "getNote", "getNote$annotations", "Ljava/lang/Double;", "getLatitude", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "getDeviceId", "getDeviceId$annotations", "getCreatedAt", "getCreatedAt$annotations", "J", "getLikes", "getLikes$annotations", "getDislikes", "getDislikes$annotations", "Companion", "m07", "n07", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class SpotFeedDto {
    public static final n07 Companion = new Object();
    private final String address;
    private final String connectionType;
    private final String createdAt;
    private final String deviceId;
    private final long dislikes;
    private final String id;
    private final Double latitude;
    private final long likes;
    private final Double longitude;
    private final String nick;
    private final String note;
    private final String province;
    private final String quality;

    public /* synthetic */ SpotFeedDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, String str8, String str9, long j, long j2, rl6 rl6Var) {
        if (1567 == (i & 1567)) {
            this.id = str;
            this.nick = str2;
            this.connectionType = str3;
            this.quality = str4;
            this.address = str5;
            if ((i & 32) == 0) {
                this.province = null;
            } else {
                this.province = str6;
            }
            if ((i & 64) == 0) {
                this.note = null;
            } else {
                this.note = str7;
            }
            if ((i & 128) == 0) {
                this.latitude = null;
            } else {
                this.latitude = d;
            }
            if ((i & 256) == 0) {
                this.longitude = null;
            } else {
                this.longitude = d2;
            }
            this.deviceId = str8;
            this.createdAt = str9;
            if ((i & 2048) == 0) {
                this.likes = 0L;
            } else {
                this.likes = j;
            }
            if ((i & 4096) == 0) {
                this.dislikes = 0L;
                return;
            } else {
                this.dislikes = j2;
                return;
            }
        }
        wn6.x(i, 1567, m07.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SpotFeedDto copy$default(SpotFeedDto spotFeedDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, String str8, String str9, long j, long j2, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Double d3;
        Double d4;
        String str17;
        String str18;
        long j3;
        long j4;
        String str19;
        SpotFeedDto spotFeedDto2;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Double d5;
        Double d6;
        String str26;
        String str27;
        long j5;
        if ((i & 1) != 0) {
            str10 = spotFeedDto.id;
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            str11 = spotFeedDto.nick;
        } else {
            str11 = str2;
        }
        if ((i & 4) != 0) {
            str12 = spotFeedDto.connectionType;
        } else {
            str12 = str3;
        }
        if ((i & 8) != 0) {
            str13 = spotFeedDto.quality;
        } else {
            str13 = str4;
        }
        if ((i & 16) != 0) {
            str14 = spotFeedDto.address;
        } else {
            str14 = str5;
        }
        if ((i & 32) != 0) {
            str15 = spotFeedDto.province;
        } else {
            str15 = str6;
        }
        if ((i & 64) != 0) {
            str16 = spotFeedDto.note;
        } else {
            str16 = str7;
        }
        if ((i & 128) != 0) {
            d3 = spotFeedDto.latitude;
        } else {
            d3 = d;
        }
        if ((i & 256) != 0) {
            d4 = spotFeedDto.longitude;
        } else {
            d4 = d2;
        }
        if ((i & 512) != 0) {
            str17 = spotFeedDto.deviceId;
        } else {
            str17 = str8;
        }
        if ((i & 1024) != 0) {
            str18 = spotFeedDto.createdAt;
        } else {
            str18 = str9;
        }
        if ((i & 2048) != 0) {
            j3 = spotFeedDto.likes;
        } else {
            j3 = j;
        }
        if ((i & 4096) != 0) {
            str19 = str10;
            j4 = spotFeedDto.dislikes;
            str20 = str11;
            str21 = str12;
            str22 = str13;
            str23 = str14;
            str24 = str15;
            str25 = str16;
            d5 = d3;
            d6 = d4;
            str26 = str17;
            str27 = str18;
            j5 = j3;
            spotFeedDto2 = spotFeedDto;
        } else {
            j4 = j2;
            str19 = str10;
            spotFeedDto2 = spotFeedDto;
            str20 = str11;
            str21 = str12;
            str22 = str13;
            str23 = str14;
            str24 = str15;
            str25 = str16;
            d5 = d3;
            d6 = d4;
            str26 = str17;
            str27 = str18;
            j5 = j3;
        }
        return spotFeedDto2.copy(str19, str20, str21, str22, str23, str24, str25, d5, d6, str26, str27, j5, j4);
    }

    public static final /* synthetic */ void write$Self$data(SpotFeedDto spotFeedDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, spotFeedDto.id);
        hy0Var.x(ll6Var, 1, spotFeedDto.nick);
        hy0Var.x(ll6Var, 2, spotFeedDto.connectionType);
        hy0Var.x(ll6Var, 3, spotFeedDto.quality);
        hy0Var.x(ll6Var, 4, spotFeedDto.address);
        if (hy0Var.f(ll6Var) || spotFeedDto.province != null) {
            hy0Var.A(ll6Var, 5, t47.a, spotFeedDto.province);
        }
        if (hy0Var.f(ll6Var) || spotFeedDto.note != null) {
            hy0Var.A(ll6Var, 6, t47.a, spotFeedDto.note);
        }
        if (hy0Var.f(ll6Var) || spotFeedDto.latitude != null) {
            hy0Var.A(ll6Var, 7, ix1.a, spotFeedDto.latitude);
        }
        if (hy0Var.f(ll6Var) || spotFeedDto.longitude != null) {
            hy0Var.A(ll6Var, 8, ix1.a, spotFeedDto.longitude);
        }
        hy0Var.x(ll6Var, 9, spotFeedDto.deviceId);
        hy0Var.x(ll6Var, 10, spotFeedDto.createdAt);
        if (hy0Var.f(ll6Var) || spotFeedDto.likes != 0) {
            hy0Var.j(ll6Var, 11, spotFeedDto.likes);
        }
        if (hy0Var.f(ll6Var) || spotFeedDto.dislikes != 0) {
            hy0Var.j(ll6Var, 12, spotFeedDto.dislikes);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.deviceId;
    }

    public final String component11() {
        return this.createdAt;
    }

    public final long component12() {
        return this.likes;
    }

    public final long component13() {
        return this.dislikes;
    }

    public final String component2() {
        return this.nick;
    }

    public final String component3() {
        return this.connectionType;
    }

    public final String component4() {
        return this.quality;
    }

    public final String component5() {
        return this.address;
    }

    public final String component6() {
        return this.province;
    }

    public final String component7() {
        return this.note;
    }

    public final Double component8() {
        return this.latitude;
    }

    public final Double component9() {
        return this.longitude;
    }

    public final SpotFeedDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, String str8, String str9, long j, long j2) {
        hl6.t(str, str2, str3, str4, str5);
        str8.getClass();
        str9.getClass();
        return new SpotFeedDto(str, str2, str3, str4, str5, str6, str7, d, d2, str8, str9, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotFeedDto)) {
            return false;
        }
        SpotFeedDto spotFeedDto = (SpotFeedDto) obj;
        if (sg3.e(this.id, spotFeedDto.id) && sg3.e(this.nick, spotFeedDto.nick) && sg3.e(this.connectionType, spotFeedDto.connectionType) && sg3.e(this.quality, spotFeedDto.quality) && sg3.e(this.address, spotFeedDto.address) && sg3.e(this.province, spotFeedDto.province) && sg3.e(this.note, spotFeedDto.note) && sg3.e(this.latitude, spotFeedDto.latitude) && sg3.e(this.longitude, spotFeedDto.longitude) && sg3.e(this.deviceId, spotFeedDto.deviceId) && sg3.e(this.createdAt, spotFeedDto.createdAt) && this.likes == spotFeedDto.likes && this.dislikes == spotFeedDto.dislikes) {
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

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getDislikes() {
        return this.dislikes;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final long getLikes() {
        return this.likes;
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

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int h = hl6.h(hl6.h(hl6.h(hl6.h(this.id.hashCode() * 31, 31, this.nick), 31, this.connectionType), 31, this.quality), 31, this.address);
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
        if (d2 != null) {
            i = d2.hashCode();
        }
        return Long.hashCode(this.dislikes) + pb4.b(hl6.h(hl6.h((i4 + i) * 31, 31, this.deviceId), 31, this.createdAt), 31, this.likes);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.nick;
        String str3 = this.connectionType;
        String str4 = this.quality;
        String str5 = this.address;
        String str6 = this.province;
        String str7 = this.note;
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str8 = this.deviceId;
        String str9 = this.createdAt;
        long j = this.likes;
        long j2 = this.dislikes;
        StringBuilder o = f21.o("SpotFeedDto(id=", str, ", nick=", str2, ", connectionType=");
        f21.v(o, str3, ", quality=", str4, ", address=");
        f21.v(o, str5, ", province=", str6, ", note=");
        o.append(str7);
        o.append(", latitude=");
        o.append(d);
        o.append(", longitude=");
        o.append(d2);
        o.append(", deviceId=");
        o.append(str8);
        o.append(", createdAt=");
        o.append(str9);
        o.append(", likes=");
        o.append(j);
        o.append(", dislikes=");
        o.append(j2);
        o.append(")");
        return o.toString();
    }

    public static /* synthetic */ void getAddress$annotations() {
    }

    public static /* synthetic */ void getConnectionType$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static /* synthetic */ void getDislikes$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getLatitude$annotations() {
    }

    public static /* synthetic */ void getLikes$annotations() {
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

    public SpotFeedDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, String str8, String str9, long j, long j2) {
        hl6.t(str, str2, str3, str4, str5);
        str8.getClass();
        str9.getClass();
        this.id = str;
        this.nick = str2;
        this.connectionType = str3;
        this.quality = str4;
        this.address = str5;
        this.province = str6;
        this.note = str7;
        this.latitude = d;
        this.longitude = d2;
        this.deviceId = str8;
        this.createdAt = str9;
        this.likes = j;
        this.dislikes = j2;
    }

    public /* synthetic */ SpotFeedDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, String str8, String str9, long j, long j2, int i, hl1 hl1Var) {
        long j3;
        SpotFeedDto spotFeedDto;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = (i & 32) != 0 ? null : str6;
        String str18 = (i & 64) != 0 ? null : str7;
        Double d3 = (i & 128) != 0 ? null : d;
        Double d4 = (i & 256) != 0 ? null : d2;
        long j4 = (i & 2048) != 0 ? 0L : j;
        if ((i & 4096) != 0) {
            j3 = 0;
            str10 = str;
            str11 = str2;
            str12 = str3;
            str13 = str4;
            str14 = str5;
            str15 = str8;
            str16 = str9;
            spotFeedDto = this;
        } else {
            j3 = j2;
            spotFeedDto = this;
            str10 = str;
            str11 = str2;
            str12 = str3;
            str13 = str4;
            str14 = str5;
            str15 = str8;
            str16 = str9;
        }
        new SpotFeedDto(str10, str11, str12, str13, str14, str17, str18, d3, d4, str15, str16, j4, j3);
    }
}
