package cu.lestebang.utiletecsa.data.repository.account;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00066"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/account/LicenseRequestDto;", "", "", "userId", "transferId", "status", "activatedAt", "imagePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/account/LicenseRequestDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/account/LicenseRequestDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getTransferId", "getTransferId$annotations", "getStatus", "getStatus$annotations", "getActivatedAt", "getActivatedAt$annotations", "getImagePath", "getImagePath$annotations", "Companion", "e54", "f54", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class LicenseRequestDto {
    public static final f54 Companion = new Object();
    private final String activatedAt;
    private final String imagePath;
    private final String status;
    private final String transferId;
    private final String userId;

    public /* synthetic */ LicenseRequestDto(int i, String str, String str2, String str3, String str4, String str5, rl6 rl6Var) {
        if (7 == (i & 7)) {
            this.userId = str;
            this.transferId = str2;
            this.status = str3;
            if ((i & 8) == 0) {
                this.activatedAt = null;
            } else {
                this.activatedAt = str4;
            }
            if ((i & 16) == 0) {
                this.imagePath = null;
                return;
            } else {
                this.imagePath = str5;
                return;
            }
        }
        wn6.x(i, 7, e54.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ LicenseRequestDto copy$default(LicenseRequestDto licenseRequestDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = licenseRequestDto.userId;
        }
        if ((i & 2) != 0) {
            str2 = licenseRequestDto.transferId;
        }
        if ((i & 4) != 0) {
            str3 = licenseRequestDto.status;
        }
        if ((i & 8) != 0) {
            str4 = licenseRequestDto.activatedAt;
        }
        if ((i & 16) != 0) {
            str5 = licenseRequestDto.imagePath;
        }
        String str6 = str5;
        String str7 = str3;
        return licenseRequestDto.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$data(LicenseRequestDto licenseRequestDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, licenseRequestDto.userId);
        hy0Var.x(ll6Var, 1, licenseRequestDto.transferId);
        hy0Var.x(ll6Var, 2, licenseRequestDto.status);
        if (hy0Var.f(ll6Var) || licenseRequestDto.activatedAt != null) {
            hy0Var.A(ll6Var, 3, t47.a, licenseRequestDto.activatedAt);
        }
        if (hy0Var.f(ll6Var) || licenseRequestDto.imagePath != null) {
            hy0Var.A(ll6Var, 4, t47.a, licenseRequestDto.imagePath);
        }
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.transferId;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.activatedAt;
    }

    public final String component5() {
        return this.imagePath;
    }

    public final LicenseRequestDto copy(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new LicenseRequestDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicenseRequestDto)) {
            return false;
        }
        LicenseRequestDto licenseRequestDto = (LicenseRequestDto) obj;
        if (sg3.e(this.userId, licenseRequestDto.userId) && sg3.e(this.transferId, licenseRequestDto.transferId) && sg3.e(this.status, licenseRequestDto.status) && sg3.e(this.activatedAt, licenseRequestDto.activatedAt) && sg3.e(this.imagePath, licenseRequestDto.imagePath)) {
            return true;
        }
        return false;
    }

    public final String getActivatedAt() {
        return this.activatedAt;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int h = hl6.h(hl6.h(this.userId.hashCode() * 31, 31, this.transferId), 31, this.status);
        String str = this.activatedAt;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (h + hashCode) * 31;
        String str2 = this.imagePath;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.transferId;
        String str3 = this.status;
        String str4 = this.activatedAt;
        String str5 = this.imagePath;
        StringBuilder o = f21.o("LicenseRequestDto(userId=", str, ", transferId=", str2, ", status=");
        f21.v(o, str3, ", activatedAt=", str4, ", imagePath=");
        return f21.l(o, str5, ")");
    }

    public static /* synthetic */ void getActivatedAt$annotations() {
    }

    public static /* synthetic */ void getImagePath$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getTransferId$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public LicenseRequestDto(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.userId = str;
        this.transferId = str2;
        this.status = str3;
        this.activatedAt = str4;
        this.imagePath = str5;
    }

    public /* synthetic */ LicenseRequestDto(String str, String str2, String str3, String str4, String str5, int i, hl1 hl1Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
