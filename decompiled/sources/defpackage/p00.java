package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p00 {
    public final String a;
    public final Integer b;
    public final i42 c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public p00(String str, Integer num, i42 i42, long j2, long j3, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = i42;
        this.d = j2;
        this.e = j3;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final o00 c() {
        o00 o00 = new o00();
        String str = this.a;
        if (str != null) {
            o00.b = str;
            o00.d = this.b;
            o00.e = this.g;
            o00.c = this.h;
            o00.j = this.i;
            o00.k = this.j;
            i42 i42 = this.c;
            if (i42 != null) {
                o00.f = i42;
                o00.g = Long.valueOf(this.d);
                o00.h = Long.valueOf(this.e);
                o00.i = new HashMap(this.f);
                return o00;
            }
            ku4.j("Null encodedPayload");
            return null;
        }
        ku4.j("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p00) {
            p00 p00 = (p00) obj;
            if (this.a.equals(p00.a)) {
                Integer num = p00.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(p00.c) && this.d == p00.d && this.e == p00.e && this.f.equals(p00.f)) {
                        Integer num3 = p00.g;
                        Integer num4 = this.g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = p00.h;
                            String str2 = this.h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (!Arrays.equals(this.i, p00.i) || !Arrays.equals(this.j, p00.j)) {
                                    return false;
                                }
                                return true;
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
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        Integer num = this.b;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        long j2 = this.d;
        long j3 = this.e;
        int hashCode2 = (((((((((hashCode ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        if (num2 == null) {
            i3 = 0;
        } else {
            i3 = num2.hashCode();
        }
        int i5 = (hashCode2 ^ i3) * 1000003;
        String str = this.h;
        if (str != null) {
            i4 = str.hashCode();
        }
        return Arrays.hashCode(this.j) ^ ((((i5 ^ i4) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
