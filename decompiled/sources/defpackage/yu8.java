package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* renamed from: yu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu8 implements k39 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yu8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                k68 k68 = (k68) obj;
                if (((HashSet) k68.x).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    s93 s93 = at8.a;
                    String G = b35.G(str2, r16.Y, r16.T);
                    if (G != null) {
                        str2 = G;
                    }
                    bundle2.putString("events", str2);
                    ((jz0) k68.y).Q(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && !at8.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((jz0) ((br4) obj).x).Q(3, bundle3);
                    return;
                }
                return;
        }
    }
}
