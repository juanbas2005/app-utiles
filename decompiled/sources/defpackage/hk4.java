package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: hk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hk4 {
    public final hv2 a;
    public final wr0 b;
    public final HashMap c = new HashMap();

    public hk4(Context context, wr0 wr0) {
        hv2 hv2 = new hv2(context);
        this.a = hv2;
        this.b = wr0;
    }

    public final synchronized bn7 a(String str) {
        if (this.c.containsKey(str)) {
            return (bn7) this.c.get(str);
        }
        CctBackendFactory I0 = this.a.I0(str);
        if (I0 == null) {
            return null;
        }
        wr0 wr0 = this.b;
        bn7 create = I0.create(new m00((Context) wr0.x, (es0) wr0.y, (es0) wr0.z, str));
        this.c.put(str, create);
        return create;
    }
}
