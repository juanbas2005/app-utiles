package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z89 extends a3 {
    public static final Parcelable.Creator<z89> CREATOR = new g39(15);
    public final String A;
    public final String B;
    public final Double C;
    public final int w;
    public final String x;
    public final long y;
    public final Long z;

    public z89(long j, Object obj, String str, String str2) {
        z65.h(str);
        this.w = 2;
        this.x = str;
        this.y = j;
        this.B = str2;
        if (obj == null) {
            this.z = null;
            this.C = null;
            this.A = null;
        } else if (obj instanceof Long) {
            this.z = (Long) obj;
            this.C = null;
            this.A = null;
        } else if (obj instanceof String) {
            this.z = null;
            this.C = null;
            this.A = (String) obj;
        } else if (obj instanceof Double) {
            this.z = null;
            this.C = (Double) obj;
            this.A = null;
        } else {
            h.q("User attribute given of un-supported type");
            throw null;
        }
    }

    public final Object f() {
        Long l = this.z;
        if (l != null) {
            return l;
        }
        Double d = this.C;
        if (d != null) {
            return d;
        }
        String str = this.A;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        g39.b(this, parcel);
    }

    public z89(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.w = i;
        this.x = str;
        this.y = j;
        this.z = l;
        this.C = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.A = str2;
        this.B = str3;
    }

    public z89(b99 b99) {
        this(b99.d, b99.e, b99.c, b99.b);
    }
}
