package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: th8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class th8 extends a3 {
    public static final Parcelable.Creator<th8> CREATOR = new zc5(25);
    public final boolean A;
    public final int w;
    public final IBinder x;
    public final m11 y;
    public final boolean z;

    public th8(int i, IBinder iBinder, m11 m11, boolean z2, boolean z3) {
        this.w = i;
        this.x = iBinder;
        this.y = m11;
        this.z = z2;
        this.A = z3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th8)) {
            return false;
        }
        th8 th8 = (th8) obj;
        if (!this.y.equals(th8.y)) {
            return false;
        }
        Object obj3 = null;
        IBinder iBinder = this.x;
        if (iBinder == null) {
            obj2 = null;
        } else {
            int i = v5.e;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof j73) {
                obj2 = (j73) queryLocalInterface;
            } else {
                obj2 = new gg8(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            }
        }
        IBinder iBinder2 = th8.x;
        if (iBinder2 != null) {
            int i2 = v5.e;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface2 instanceof j73) {
                obj3 = (j73) queryLocalInterface2;
            } else {
                obj3 = new gg8(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            }
        }
        if (b35.j(obj2, obj3)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.C(parcel, 2, this.x);
        h75.E(parcel, 3, this.y, i);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        h75.O(parcel, M);
    }
}
