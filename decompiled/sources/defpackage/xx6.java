package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xx6 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ xx6(int i) {
        this.a = i;
    }

    public static yx6 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = xx6.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new yx6();
        }
        hg5 n = kv6.x.n();
        for (int i = 0; i < readInt; i++) {
            n.add(parcel.readValue(classLoader));
        }
        return new yx6(n.k());
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case b85.b:
                return a(parcel, (ClassLoader) null);
            case 1:
                return new ya0(parcel, (ClassLoader) null);
            case 2:
                return new b71(parcel, (ClassLoader) null);
            case 3:
                return new fz5(parcel, (ClassLoader) null);
            default:
                return new qf7(parcel, (ClassLoader) null);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new yx6[i];
            case 1:
                return new ya0[i];
            case 2:
                return new b71[i];
            case 3:
                return new fz5[i];
            default:
                return new qf7[i];
        }
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case b85.b:
                return a(parcel, classLoader);
            case 1:
                return new ya0(parcel, classLoader);
            case 2:
                return new b71(parcel, classLoader);
            case 3:
                return new fz5(parcel, classLoader);
            default:
                return new qf7(parcel, classLoader);
        }
    }
}
