package cu.lestebang.utiletecsa.data.repository.feedback;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013Jl\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J'\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u0013R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u0013R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010\u0013R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b>\u00100\u001a\u0004\b=\u0010\u0013¨\u0006B"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/feedback/AppReportDto;", "", "", "type", "message", "error", "userId", "userEmail", "appVersion", "androidVersion", "device", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/feedback/AppReportDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/feedback/AppReportDto;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getMessage", "getMessage$annotations", "getError", "getError$annotations", "getUserId", "getUserId$annotations", "getUserEmail", "getUserEmail$annotations", "getAppVersion", "getAppVersion$annotations", "getAndroidVersion", "getAndroidVersion$annotations", "getDevice", "getDevice$annotations", "Companion", "rq", "sq", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AppReportDto {
    public static final sq Companion = new Object();
    private final String androidVersion;
    private final String appVersion;
    private final String device;
    private final String error;
    private final String message;
    private final String type;
    private final String userEmail;
    private final String userId;

    public /* synthetic */ AppReportDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, rl6 rl6) {
        if (3 == (i & 3)) {
            this.type = str;
            this.message = str2;
            if ((i & 4) == 0) {
                this.error = null;
            } else {
                this.error = str3;
            }
            if ((i & 8) == 0) {
                this.userId = null;
            } else {
                this.userId = str4;
            }
            if ((i & 16) == 0) {
                this.userEmail = null;
            } else {
                this.userEmail = str5;
            }
            if ((i & 32) == 0) {
                this.appVersion = null;
            } else {
                this.appVersion = str6;
            }
            if ((i & 64) == 0) {
                this.androidVersion = null;
            } else {
                this.androidVersion = str7;
            }
            if ((i & 128) == 0) {
                this.device = null;
            } else {
                this.device = str8;
            }
        } else {
            wn6.x(i, 3, rq.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ AppReportDto copy$default(AppReportDto appReportDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appReportDto.type;
        }
        if ((i & 2) != 0) {
            str2 = appReportDto.message;
        }
        if ((i & 4) != 0) {
            str3 = appReportDto.error;
        }
        if ((i & 8) != 0) {
            str4 = appReportDto.userId;
        }
        if ((i & 16) != 0) {
            str5 = appReportDto.userEmail;
        }
        if ((i & 32) != 0) {
            str6 = appReportDto.appVersion;
        }
        if ((i & 64) != 0) {
            str7 = appReportDto.androidVersion;
        }
        if ((i & 128) != 0) {
            str8 = appReportDto.device;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str2;
        return appReportDto.copy(str, str14, str3, str13, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$data(AppReportDto appReportDto, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, appReportDto.type);
        hy0.x(ll6, 1, appReportDto.message);
        if (hy0.f(ll6) || appReportDto.error != null) {
            hy0.A(ll6, 2, t47.a, appReportDto.error);
        }
        if (hy0.f(ll6) || appReportDto.userId != null) {
            hy0.A(ll6, 3, t47.a, appReportDto.userId);
        }
        if (hy0.f(ll6) || appReportDto.userEmail != null) {
            hy0.A(ll6, 4, t47.a, appReportDto.userEmail);
        }
        if (hy0.f(ll6) || appReportDto.appVersion != null) {
            hy0.A(ll6, 5, t47.a, appReportDto.appVersion);
        }
        if (hy0.f(ll6) || appReportDto.androidVersion != null) {
            hy0.A(ll6, 6, t47.a, appReportDto.androidVersion);
        }
        if (hy0.f(ll6) || appReportDto.device != null) {
            hy0.A(ll6, 7, t47.a, appReportDto.device);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.error;
    }

    public final String component4() {
        return this.userId;
    }

    public final String component5() {
        return this.userEmail;
    }

    public final String component6() {
        return this.appVersion;
    }

    public final String component7() {
        return this.androidVersion;
    }

    public final String component8() {
        return this.device;
    }

    public final AppReportDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        return new AppReportDto(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppReportDto)) {
            return false;
        }
        AppReportDto appReportDto = (AppReportDto) obj;
        if (sg3.e(this.type, appReportDto.type) && sg3.e(this.message, appReportDto.message) && sg3.e(this.error, appReportDto.error) && sg3.e(this.userId, appReportDto.userId) && sg3.e(this.userEmail, appReportDto.userEmail) && sg3.e(this.appVersion, appReportDto.appVersion) && sg3.e(this.androidVersion, appReportDto.androidVersion) && sg3.e(this.device, appReportDto.device)) {
            return true;
        }
        return false;
    }

    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int h = hl6.h(this.type.hashCode() * 31, 31, this.message);
        String str = this.error;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (h + i) * 31;
        String str2 = this.userId;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.userEmail;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.appVersion;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.androidVersion;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i11 = (i10 + i5) * 31;
        String str6 = this.device;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return i11 + i6;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.message;
        String str3 = this.error;
        String str4 = this.userId;
        String str5 = this.userEmail;
        String str6 = this.appVersion;
        String str7 = this.androidVersion;
        String str8 = this.device;
        StringBuilder o = f21.o("AppReportDto(type=", str, ", message=", str2, ", error=");
        f21.v(o, str3, ", userId=", str4, ", userEmail=");
        f21.v(o, str5, ", appVersion=", str6, ", androidVersion=");
        return pb4.n(o, str7, ", device=", str8, ")");
    }

    public static /* synthetic */ void getAndroidVersion$annotations() {
    }

    public static /* synthetic */ void getAppVersion$annotations() {
    }

    public static /* synthetic */ void getDevice$annotations() {
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getUserEmail$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public AppReportDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.message = str2;
        this.error = str3;
        this.userId = str4;
        this.userEmail = str5;
        this.appVersion = str6;
        this.androidVersion = str7;
        this.device = str8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppReportDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, hl1 hl1) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
