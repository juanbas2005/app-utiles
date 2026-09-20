package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import java.util.LinkedHashSet;

/* renamed from: hi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hi3 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ji3 x;

    public /* synthetic */ hi3(ji3 ji3, int i) {
        this.w = i;
        this.x = ji3;
    }

    public final Object y(Object obj) {
        int i = this.w;
        ji3 ji3 = this.x;
        switch (i) {
            case b85.b:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                String A = b26.a.b(ji3.class).A();
                Log.w(A, "CorruptionException in " + ji3.a + " DataStore running in process " + Process.myPid(), corruptionException);
                return new pp4(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = ji3.a;
                LinkedHashSet linkedHashSet = xr6.a;
                linkedHashSet.getClass();
                return sg3.D(new wr6(context, str, yr6.a, new tc1(linkedHashSet, (f61) null, 17), new ym1(3, (f61) null)));
        }
    }
}
