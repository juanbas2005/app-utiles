package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dd5 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ dd5(int i) {
        this.a = i;
    }

    public static ed5 a(Parcel parcel, ClassLoader classLoader) {
        ux6 ux6;
        if (classLoader == null) {
            classLoader = dd5.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            ux6 = d63.G;
        } else if (readInt == 1) {
            ux6 = g22.K;
        } else if (readInt == 2) {
            ux6 = pe2.L;
        } else {
            h.s(pb4.i(readInt, "Unsupported MutableState policy ", " was restored"));
            return null;
        }
        return new ed5(readValue, ux6);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case b85.b:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return x.x;
                }
                h.s("superState must be null");
                return null;
            case 2:
                return new ro0(parcel, classLoader);
            case 3:
                return new cg4(parcel, classLoader);
            case 4:
                return new ts6(parcel, classLoader);
            default:
                return new pj7(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new ed5[i];
            case 1:
                return new x[i];
            case 2:
                return new ro0[i];
            case 3:
                return new cg4[i];
            case 4:
                return new ts6[i];
            default:
                return new pj7[i];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case b85.b:
                return a(parcel, (ClassLoader) null);
            case 1:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return x.x;
                }
                h.s("superState must be null");
                return null;
            case 2:
                return new ro0(parcel, (ClassLoader) null);
            case 3:
                return new cg4(parcel, (ClassLoader) null);
            case 4:
                return new ts6(parcel, (ClassLoader) null);
            default:
                return new pj7(parcel, (ClassLoader) null);
        }
    }
}
