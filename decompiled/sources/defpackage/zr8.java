package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zr8 extends a3 {
    public static final Parcelable.Creator<zr8> CREATOR = new ki8(17);
    public final long A;
    public final String w;
    public final ur8 x;
    public final String y;
    public final long z;

    public zr8(zr8 zr8, long j, long j2) {
        z65.k(zr8);
        this.w = zr8.w;
        this.x = zr8.x;
        this.y = zr8.y;
        this.z = j;
        this.A = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.x);
        String str = this.y;
        int length = String.valueOf(str).length();
        String str2 = this.w;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        f21.v(sb, "origin=", str, ",name=", str2);
        return f21.l(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ki8.a(this, parcel, i);
    }

    public zr8(String str, ur8 ur8, String str2, long j, long j2) {
        this.w = str;
        this.x = ur8;
        this.y = str2;
        this.z = j;
        this.A = j2;
    }
}
