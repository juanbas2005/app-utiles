package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class IconCompatParcelizer {
    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(j48 j48) {
        int i;
        ? obj = new Object();
        obj.a = -1;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        obj.g = null;
        obj.h = IconCompat.k;
        obj.i = null;
        if (!j48.e(1)) {
            i = -1;
        } else {
            i = ((k48) j48).e.readInt();
        }
        obj.a = i;
        byte[] bArr = obj.c;
        if (j48.e(2)) {
            Parcel parcel = ((k48) j48).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        obj.c = bArr;
        obj.d = j48.f(obj.d, 3);
        int i2 = obj.e;
        if (j48.e(4)) {
            i2 = ((k48) j48).e.readInt();
        }
        obj.e = i2;
        int i3 = obj.f;
        if (j48.e(5)) {
            i3 = ((k48) j48).e.readInt();
        }
        obj.f = i3;
        obj.g = (ColorStateList) j48.f(obj.g, 6);
        String str = obj.i;
        if (j48.e(7)) {
            str = ((k48) j48).e.readString();
        }
        obj.i = str;
        String str2 = obj.j;
        if (j48.e(8)) {
            str2 = ((k48) j48).e.readString();
        }
        obj.j = str2;
        obj.h = PorterDuff.Mode.valueOf(obj.i);
        switch (obj.a) {
            case -1:
                Parcelable parcelable = obj.d;
                if (parcelable != null) {
                    obj.b = parcelable;
                    return obj;
                }
                h.q("Invalid icon");
                return null;
            case 1:
            case 5:
                Parcelable parcelable2 = obj.d;
                if (parcelable2 != null) {
                    obj.b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.c;
                obj.b = bArr3;
                obj.a = 3;
                obj.e = 0;
                obj.f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case 6:
                String str3 = new String(obj.c, Charset.forName("UTF-16"));
                obj.b = str3;
                if (obj.a == 2 && obj.j == null) {
                    obj.j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                obj.b = obj.c;
                return obj;
        }
        return obj;
    }

    public static void write(IconCompat iconCompat, j48 j48) {
        j48.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            j48.h(1);
            ((k48) j48).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            j48.h(2);
            Parcel parcel = ((k48) j48).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            j48.h(3);
            ((k48) j48).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            j48.h(4);
            ((k48) j48).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            j48.h(5);
            ((k48) j48).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            j48.h(6);
            ((k48) j48).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            j48.h(7);
            ((k48) j48).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            j48.h(8);
            ((k48) j48).e.writeString(str2);
        }
    }
}
