package defpackage;

import java.util.Arrays;

/* renamed from: a10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a10 extends rb4 {
    public final long a;
    public final Integer b;
    public final cv0 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final iy4 h;
    public final b92 i;

    public a10(long j, Integer num, cv0 cv0, long j2, byte[] bArr, String str, long j3, iy4 iy4, b92 b92) {
        this.a = j;
        this.b = num;
        this.c = cv0;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = iy4;
        this.i = b92;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rb4) {
            rb4 rb4 = (rb4) obj;
            a10 a10 = (a10) rb4;
            if (this.a == a10.a) {
                Integer num = a10.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    cv0 cv0 = a10.c;
                    cv0 cv02 = this.c;
                    if (cv02 != null ? cv02.equals(cv0) : cv0 == null) {
                        if (this.d == a10.d) {
                            if (rb4 instanceof a10) {
                                bArr = ((a10) rb4).e;
                            } else {
                                bArr = a10.e;
                            }
                            if (Arrays.equals(this.e, bArr)) {
                                String str = a10.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == a10.g) {
                                        iy4 iy4 = a10.h;
                                        iy4 iy42 = this.h;
                                        if (iy42 != null ? iy42.equals(iy4) : iy4 == null) {
                                            b92 b92 = a10.i;
                                            b92 b922 = this.i;
                                            if (b922 != null ? !b922.equals(b92) : b92 != null) {
                                                return false;
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.a;
        int i6 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.b;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i6 ^ i2) * 1000003;
        cv0 cv0 = this.c;
        if (cv0 == null) {
            i3 = 0;
        } else {
            i3 = cv0.hashCode();
        }
        long j2 = this.d;
        int hashCode = (((((i8 ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        long j3 = this.g;
        int i9 = (((hashCode ^ i4) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        iy4 iy4 = this.h;
        if (iy4 == null) {
            i5 = 0;
        } else {
            i5 = iy4.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        b92 b92 = this.i;
        if (b92 != null) {
            i7 = b92.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
