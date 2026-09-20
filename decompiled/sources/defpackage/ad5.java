package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ad5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ad5 extends o37 implements Parcelable, sx6, a37, aq4 {
    public static final Parcelable.Creator<ad5> CREATOR = new zc5(0);
    public px6 x;

    public ad5(float f) {
        ix6 j = nx6.j();
        px6 px6 = new px6(f, j.g());
        if (!(j instanceof ew2)) {
            px6.b = new px6(f, 1);
        }
        this.x = px6;
    }

    public final ux6 a() {
        return g22.K;
    }

    public final float d() {
        return ((px6) nx6.t(this.x, this)).c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(float f) {
        ix6 j;
        px6 px6 = (px6) nx6.h(this.x);
        if (px6.c != f) {
            px6 px62 = this.x;
            synchronized (nx6.c) {
                j = nx6.j();
                ((px6) nx6.o(px62, this, j, px6)).c = f;
            }
            nx6.n(j, this);
        }
    }

    public final p37 getFirstStateRecord() {
        return this.x;
    }

    public final Object getValue() {
        return Float.valueOf(d());
    }

    public final p37 mergeRecords(p37 p37, p37 p372, p37 p373) {
        if (((px6) p372).c == ((px6) p373).c) {
            return p372;
        }
        return null;
    }

    public final void prependStateRecord(p37 p37) {
        p37.getClass();
        this.x = (px6) p37;
    }

    public final void setValue(Object obj) {
        e(((Number) obj).floatValue());
    }

    public final String toString() {
        float f = ((px6) nx6.h(this.x)).c;
        int hashCode = hashCode();
        return "MutableFloatState(value=" + f + ")@" + hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(d());
    }
}
