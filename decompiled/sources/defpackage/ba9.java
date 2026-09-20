package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* renamed from: ba9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ba9 {
    public final int a;
    public final xb7 b = new xb7();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public ba9(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case b85.b:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String ba9 = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", pb4.n(new StringBuilder(ba9.length() + 16 + valueOf.length()), "Finishing ", ba9, " with ", valueOf));
        }
        this.b.b(bundle);
    }

    public final void c(zzt zzt) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String ba9 = toString();
            String obj = zzt.toString();
            Log.d("MessengerIpcClient", pb4.n(new StringBuilder(ba9.length() + 14 + obj.length()), "Failing ", ba9, " with ", obj));
        }
        this.b.a(zzt);
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a2).length() + 1);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
