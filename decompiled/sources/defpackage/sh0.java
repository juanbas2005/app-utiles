package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/* renamed from: sh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh0 implements Parcelable {
    public static final Parcelable.Creator<sh0> CREATOR = new ri8(5);
    public final int A;
    public final int B;
    public final int C;
    public final zl4 w;
    public final zl4 x;
    public final bj1 y;
    public final zl4 z;

    public sh0(zl4 zl4, zl4 zl42, bj1 bj1, zl4 zl43, int i) {
        Objects.requireNonNull(zl4, "start cannot be null");
        Objects.requireNonNull(zl42, "end cannot be null");
        Objects.requireNonNull(bj1, "validator cannot be null");
        this.w = zl4;
        this.x = zl42;
        this.z = zl43;
        this.A = i;
        this.y = bj1;
        if (zl43 != null && zl4.w.compareTo(zl43.w) > 0) {
            h.q("start Month cannot be after current Month");
            throw null;
        } else if (zl43 != null && zl43.w.compareTo(zl42.w) > 0) {
            h.q("current Month cannot be after end Month");
            throw null;
        } else if (i < 0 || i > a08.c((Calendar) null).getMaximum(7)) {
            h.q("firstDayOfWeek is not valid");
            throw null;
        } else {
            this.C = zl4.d(zl42) + 1;
            this.B = (zl42.y - zl4.y) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0 = (sh0) obj;
        if (!this.w.equals(sh0.w) || !this.x.equals(sh0.x) || !Objects.equals(this.z, sh0.z) || this.A != sh0.A || !this.y.equals(sh0.y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.z, Integer.valueOf(this.A), this.y});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, 0);
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.z, 0);
        parcel.writeParcelable(this.y, 0);
        parcel.writeInt(this.A);
    }
}
