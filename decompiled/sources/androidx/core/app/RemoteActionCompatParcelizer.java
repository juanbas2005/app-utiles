package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RemoteActionCompatParcelizer {
    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(j48 j48) {
        ? obj = new Object();
        Object obj2 = obj.a;
        boolean z = true;
        if (j48.e(1)) {
            obj2 = j48.g();
        }
        obj.a = (IconCompat) obj2;
        CharSequence charSequence = obj.b;
        if (j48.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k48) j48).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (j48.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k48) j48).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) j48.f(obj.d, 4);
        boolean z2 = obj.e;
        if (j48.e(5)) {
            if (((k48) j48).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!j48.e(6)) {
            z = z3;
        } else if (((k48) j48).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, j48 j48) {
        j48.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        j48.h(1);
        j48.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        j48.h(2);
        Parcel parcel = ((k48) j48).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        j48.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        j48.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        j48.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        j48.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
