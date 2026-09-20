package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cd5 extends o37 implements Parcelable, sx6, a37, aq4 {
    public static final Parcelable.Creator<cd5> CREATOR = new zc5(2);
    public rx6 x;

    public cd5(long j) {
        ix6 j2 = nx6.j();
        rx6 rx6 = new rx6(j2.g(), j);
        if (!(j2 instanceof ew2)) {
            rx6.b = new rx6(1, j);
        }
        this.x = rx6;
    }

    public final ux6 a() {
        return g22.K;
    }

    public final long d() {
        return ((rx6) nx6.t(this.x, this)).c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(long j) {
        ix6 j2;
        rx6 rx6 = (rx6) nx6.h(this.x);
        if (rx6.c != j) {
            rx6 rx62 = this.x;
            synchronized (nx6.c) {
                j2 = nx6.j();
                ((rx6) nx6.o(rx62, this, j2, rx6)).c = j;
            }
            nx6.n(j2, this);
        }
    }

    public final p37 getFirstStateRecord() {
        return this.x;
    }

    public final Object getValue() {
        return Long.valueOf(d());
    }

    public final p37 mergeRecords(p37 p37, p37 p372, p37 p373) {
        if (((rx6) p372).c == ((rx6) p373).c) {
            return p372;
        }
        return null;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.x = (rx6) p37;
    }

    public final void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    public final String toString() {
        long j = ((rx6) nx6.h(this.x)).c;
        int hashCode = hashCode();
        return "MutableLongState(value=" + j + ")@" + hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(d());
    }
}
