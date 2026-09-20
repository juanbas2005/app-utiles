package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* renamed from: j31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j31 {
    public static final j31 j = new j31();
    public final yy4 a;
    public final ny4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public j31(j31 j31) {
        j31.getClass();
        this.c = j31.c;
        this.d = j31.d;
        this.b = j31.b;
        this.a = j31.a;
        this.e = j31.e;
        this.f = j31.f;
        this.i = j31.i;
        this.g = j31.g;
        this.h = j31.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j31.class.equals(obj.getClass())) {
            return false;
        }
        j31 j31 = (j31) obj;
        if (this.c == j31.c && this.d == j31.d && this.e == j31.e && this.f == j31.f && this.g == j31.g && this.h == j31.h && sg3.e(a(), j31.a()) && this.a == j31.a) {
            return sg3.e(this.i, j31.i);
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j2 = this.g;
        long j3 = this.h;
        int hashCode = (this.i.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a2 = a();
        if (a2 != null) {
            i2 = a2.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public j31(ny4 ny4, yy4 yy4, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = ny4;
        this.a = yy4;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public j31() {
        this.b = new ny4((NetworkRequest) null);
        this.a = yy4.w;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = -1;
        this.i = g42.w;
    }
}
