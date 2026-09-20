package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Arrays;

/* renamed from: kw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kw extends lw {
    public static final Parcelable.Creator<kw> CREATOR = new g39(9);
    public final l62 w;
    public final String x;
    public final int y;

    public kw(int i, int i2, String str) {
        try {
            this.w = l62.a(i);
            this.x = str;
            this.y = i2;
        } catch (ErrorCode$UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        if (!b35.j(this.w, kwVar.w) || !b35.j(this.x, kwVar.x) || !b35.j(Integer.valueOf(this.y), Integer.valueOf(kwVar.y))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, Integer.valueOf(this.y)});
    }

    public final String toString() {
        fm8 fm8 = new fm8(getClass().getSimpleName());
        String valueOf = String.valueOf(this.w.w);
        fm8 fm82 = new fm8(2);
        ((fm8) fm8.z).y = fm82;
        fm8.z = fm82;
        fm82.z = valueOf;
        fm82.x = "errorCode";
        String str = this.x;
        if (str != null) {
            fm8.f("errorMessage", str);
        }
        return fm8.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        int i2 = this.w.w;
        h75.K(parcel, 2, 4);
        parcel.writeInt(i2);
        h75.F(parcel, 3, this.x);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.y);
        h75.O(parcel, M);
    }
}
