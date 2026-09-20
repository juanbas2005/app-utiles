package cu.lestebang.utiletecsa.data.repository.account;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001dR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001d¨\u00067"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/account/LicensePricingDto;", "", "", "transferAmount", "saldoAmount", "discountPercent", "", "discountSource", "couponCode", "<init>", "(IIILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IIIILjava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/account/LicensePricingDto;Lhy0;Lll6;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(IIILjava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/account/LicensePricingDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTransferAmount", "getTransferAmount$annotations", "()V", "getSaldoAmount", "getSaldoAmount$annotations", "getDiscountPercent", "getDiscountPercent$annotations", "Ljava/lang/String;", "getDiscountSource", "getDiscountSource$annotations", "getCouponCode", "getCouponCode$annotations", "Companion", "c54", "d54", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class LicensePricingDto {
    public static final d54 Companion = new Object();
    private final String couponCode;
    private final int discountPercent;
    private final String discountSource;
    private final int saldoAmount;
    private final int transferAmount;

    public /* synthetic */ LicensePricingDto(int i, int i2, int i3, int i4, String str, String str2, rl6 rl6Var) {
        this.transferAmount = (i & 1) == 0 ? 200 : i2;
        if ((i & 2) == 0) {
            this.saldoAmount = 100;
        } else {
            this.saldoAmount = i3;
        }
        if ((i & 4) == 0) {
            this.discountPercent = 0;
        } else {
            this.discountPercent = i4;
        }
        if ((i & 8) == 0) {
            this.discountSource = "NONE";
        } else {
            this.discountSource = str;
        }
        if ((i & 16) == 0) {
            this.couponCode = "";
        } else {
            this.couponCode = str2;
        }
    }

    public static /* synthetic */ LicensePricingDto copy$default(LicensePricingDto licensePricingDto, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = licensePricingDto.transferAmount;
        }
        if ((i4 & 2) != 0) {
            i2 = licensePricingDto.saldoAmount;
        }
        if ((i4 & 4) != 0) {
            i3 = licensePricingDto.discountPercent;
        }
        if ((i4 & 8) != 0) {
            str = licensePricingDto.discountSource;
        }
        if ((i4 & 16) != 0) {
            str2 = licensePricingDto.couponCode;
        }
        String str3 = str2;
        int i5 = i3;
        return licensePricingDto.copy(i, i2, i5, str, str3);
    }

    public static final /* synthetic */ void write$Self$data(LicensePricingDto licensePricingDto, hy0 hy0Var, ll6 ll6Var) {
        if (hy0Var.f(ll6Var) || licensePricingDto.transferAmount != 200) {
            hy0Var.w(0, licensePricingDto.transferAmount, ll6Var);
        }
        if (hy0Var.f(ll6Var) || licensePricingDto.saldoAmount != 100) {
            hy0Var.w(1, licensePricingDto.saldoAmount, ll6Var);
        }
        if (hy0Var.f(ll6Var) || licensePricingDto.discountPercent != 0) {
            hy0Var.w(2, licensePricingDto.discountPercent, ll6Var);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(licensePricingDto.discountSource, "NONE")) {
            hy0Var.x(ll6Var, 3, licensePricingDto.discountSource);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(licensePricingDto.couponCode, "")) {
            hy0Var.x(ll6Var, 4, licensePricingDto.couponCode);
        }
    }

    public final int component1() {
        return this.transferAmount;
    }

    public final int component2() {
        return this.saldoAmount;
    }

    public final int component3() {
        return this.discountPercent;
    }

    public final String component4() {
        return this.discountSource;
    }

    public final String component5() {
        return this.couponCode;
    }

    public final LicensePricingDto copy(int i, int i2, int i3, String str, String str2) {
        str.getClass();
        str2.getClass();
        return new LicensePricingDto(i, i2, i3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicensePricingDto)) {
            return false;
        }
        LicensePricingDto licensePricingDto = (LicensePricingDto) obj;
        if (this.transferAmount == licensePricingDto.transferAmount && this.saldoAmount == licensePricingDto.saldoAmount && this.discountPercent == licensePricingDto.discountPercent && sg3.e(this.discountSource, licensePricingDto.discountSource) && sg3.e(this.couponCode, licensePricingDto.couponCode)) {
            return true;
        }
        return false;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final int getDiscountPercent() {
        return this.discountPercent;
    }

    public final String getDiscountSource() {
        return this.discountSource;
    }

    public final int getSaldoAmount() {
        return this.saldoAmount;
    }

    public final int getTransferAmount() {
        return this.transferAmount;
    }

    public int hashCode() {
        return this.couponCode.hashCode() + hl6.h(f21.e(this.discountPercent, f21.e(this.saldoAmount, Integer.hashCode(this.transferAmount) * 31, 31), 31), 31, this.discountSource);
    }

    public String toString() {
        int i = this.transferAmount;
        int i2 = this.saldoAmount;
        int i3 = this.discountPercent;
        String str = this.discountSource;
        String str2 = this.couponCode;
        StringBuilder p = pb4.p("LicensePricingDto(transferAmount=", i, ", saldoAmount=", i2, ", discountPercent=");
        p.append(i3);
        p.append(", discountSource=");
        p.append(str);
        p.append(", couponCode=");
        return f21.l(p, str2, ")");
    }

    public static /* synthetic */ void getCouponCode$annotations() {
    }

    public static /* synthetic */ void getDiscountPercent$annotations() {
    }

    public static /* synthetic */ void getDiscountSource$annotations() {
    }

    public static /* synthetic */ void getSaldoAmount$annotations() {
    }

    public static /* synthetic */ void getTransferAmount$annotations() {
    }

    public LicensePricingDto() {
        this(0, 0, 0, (String) null, (String) null, 31, (hl1) null);
    }

    public LicensePricingDto(int i, int i2, int i3, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.transferAmount = i;
        this.saldoAmount = i2;
        this.discountPercent = i3;
        this.discountSource = str;
        this.couponCode = str2;
    }

    public /* synthetic */ LicensePricingDto(int i, int i2, int i3, String str, String str2, int i4, hl1 hl1Var) {
        this((i4 & 1) != 0 ? 200 : i, (i4 & 2) != 0 ? 100 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "NONE" : str, (i4 & 16) != 0 ? "" : str2);
    }
}
