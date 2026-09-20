package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

/* renamed from: sb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sb1 {
    public static final Set a = qs.r1(new Integer[]{7, 20});
    public static final int b = 1;

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", b);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(65536);
    }
}
