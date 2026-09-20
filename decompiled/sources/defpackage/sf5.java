package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: sf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sf5 implements Parcelable {
    public static final Parcelable.Creator<sf5> CREATOR = new zc5(5);
    public final String w;
    public final ui7 x;
    public boolean y = false;

    public sf5(Parcel parcel) {
        boolean z = false;
        this.w = parcel.readString();
        this.y = parcel.readByte() != 0 ? true : z;
        this.x = (ui7) parcel.readParcelable(ui7.class.getClassLoader());
    }

    public static rf5[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        rf5[] rf5Arr = new rf5[list.size()];
        rf5 a = ((sf5) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            rf5 a2 = ((sf5) list.get(i)).a();
            if (z || !((sf5) list.get(i)).y) {
                rf5Arr[i] = a2;
            } else {
                rf5Arr[0] = a2;
                rf5Arr[i] = a;
                z = true;
            }
        }
        if (!z) {
            rf5Arr[0] = a;
        }
        return rf5Arr;
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [x01, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (defpackage.b01.o(r5) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    public static sf5 c(String str) {
        boolean z;
        x01 x01;
        double d;
        sf5 sf5 = new sf5(str.replace("-", ""), new g22(23));
        b01 e = b01.e();
        if (e.n()) {
            double random = Math.random();
            synchronized (x01.class) {
                try {
                    if (x01.G == null) {
                        x01.G = new Object();
                    }
                    x01 = x01.G;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            n75 h = e.h(x01);
            if (h.b()) {
                d = ((Double) h.a()).doubleValue() / 100.0d;
            }
            n75 n75 = e.a.getDouble("fpr_vc_session_sampling_rate");
            if (!n75.b() || !b01.o(((Double) n75.a()).doubleValue())) {
                n75 b = e.b(x01);
                if (!b.b() || !b01.o(((Double) b.a()).doubleValue())) {
                    if (e.a.isLastFetchFailed()) {
                        d = 1.0E-5d;
                    } else {
                        d = 0.01d;
                    }
                    if (random < d) {
                        z = true;
                        sf5.y = z;
                        return sf5;
                    }
                } else {
                    d = ((Double) b.a()).doubleValue();
                    if (random < d) {
                    }
                }
            } else {
                e.c.e("com.google.firebase.perf.SessionSamplingRate", ((Double) n75.a()).doubleValue());
                d = ((Double) n75.a()).doubleValue();
                if (random < d) {
                }
            }
        }
        z = false;
        sf5.y = z;
        return sf5;
    }

    public final rf5 a() {
        qf5 w2 = rf5.w();
        w2.h();
        rf5.s((rf5) w2.x, this.w);
        if (this.y) {
            w2.h();
            rf5.t((rf5) w2.x);
        }
        return (rf5) w2.g();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [u01, java.lang.Object] */
    public final boolean d() {
        u01 u01;
        long j;
        long b = this.x.b() / 60000000;
        b01 e = b01.e();
        e.getClass();
        synchronized (u01.class) {
            try {
                if (u01.G == null) {
                    u01.G = new Object();
                }
                u01 = u01.G;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        n75 i = e.i(u01);
        if (!i.b() || ((Long) i.a()).longValue() <= 0) {
            n75 n75 = e.a.getLong("fpr_session_max_duration_min");
            if (!n75.b() || ((Long) n75.a()).longValue() <= 0) {
                n75 c = e.c(u01);
                if (!c.b() || ((Long) c.a()).longValue() <= 0) {
                    j = 240;
                } else {
                    j = ((Long) c.a()).longValue();
                }
            } else {
                e.c.d(((Long) n75.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                j = ((Long) n75.a()).longValue();
            }
        } else {
            j = ((Long) i.a()).longValue();
        }
        if (b > j) {
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeByte(this.y ? (byte) 1 : 0);
        parcel.writeParcelable(this.x, 0);
    }

    public sf5(String str, g22 g22) {
        this.w = str;
        this.x = new ui7();
    }
}
