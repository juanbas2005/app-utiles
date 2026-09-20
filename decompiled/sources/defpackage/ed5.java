package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ed5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed5 extends o37 implements Parcelable, sx6 {
    public static final Parcelable.Creator<ed5> CREATOR = new dd5(0);
    public final ux6 x;
    public tx6 y;

    public ed5(Object obj, ux6 ux6) {
        this.x = ux6;
        ix6 j = nx6.j();
        tx6 tx6 = new tx6(j.g(), obj);
        if (!(j instanceof ew2)) {
            tx6.b = new tx6(1, obj);
        }
        this.y = tx6;
    }

    public final ux6 a() {
        return this.x;
    }

    public final int describeContents() {
        return 0;
    }

    public final p37 getFirstStateRecord() {
        return this.y;
    }

    public final Object getValue() {
        return ((tx6) nx6.t(this.y, this)).c;
    }

    public final p37 mergeRecords(p37 p37, p37 p372, p37 p373) {
        tx6 tx6 = (tx6) p37;
        if (this.x.i(((tx6) p372).c, ((tx6) p373).c)) {
            return p372;
        }
        return null;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.y = (tx6) p37;
    }

    public final void setValue(Object obj) {
        ix6 j;
        tx6 tx6 = (tx6) nx6.h(this.y);
        if (!this.x.i(tx6.c, obj)) {
            tx6 tx62 = this.y;
            synchronized (nx6.c) {
                j = nx6.j();
                ((tx6) nx6.o(tx62, this, j, tx6)).c = obj;
            }
            nx6.n(j, this);
        }
    }

    public final String toString() {
        Object obj = ((tx6) nx6.h(this.y)).c;
        int hashCode = hashCode();
        return "MutableState(value=" + obj + ")@" + hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        d63 d63 = d63.G;
        ux6 ux6 = this.x;
        if (sg3.e(ux6, d63)) {
            i2 = 0;
        } else if (sg3.e(ux6, g22.K)) {
            i2 = 1;
        } else if (sg3.e(ux6, pe2.L)) {
            i2 = 2;
        } else {
            h.s("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}
