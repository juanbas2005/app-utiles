package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bd5 extends o37 implements Parcelable, sx6, a37, aq4 {
    public static final Parcelable.Creator<bd5> CREATOR = new zc5(1);
    public qx6 x;

    public bd5(int i) {
        ix6 j = nx6.j();
        qx6 qx6 = new qx6(j.g(), i);
        if (!(j instanceof ew2)) {
            qx6.b = new qx6(1, i);
        }
        this.x = qx6;
    }

    public final ux6 a() {
        return g22.K;
    }

    public final int d() {
        return ((qx6) nx6.t(this.x, this)).c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        ix6 j;
        qx6 qx6 = (qx6) nx6.h(this.x);
        if (qx6.c != i) {
            qx6 qx62 = this.x;
            synchronized (nx6.c) {
                j = nx6.j();
                ((qx6) nx6.o(qx62, this, j, qx6)).c = i;
            }
            nx6.n(j, this);
        }
    }

    public final p37 getFirstStateRecord() {
        return this.x;
    }

    public final Object getValue() {
        return Integer.valueOf(d());
    }

    public final p37 mergeRecords(p37 p37, p37 p372, p37 p373) {
        if (((qx6) p372).c == ((qx6) p373).c) {
            return p372;
        }
        return null;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.x = (qx6) p37;
    }

    public final void setValue(Object obj) {
        e(((Number) obj).intValue());
    }

    public final String toString() {
        return b81.l(((qx6) nx6.h(this.x)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(d());
    }
}
