package defpackage;

import com.google.android.gms.internal.measurement.zzvr;
import java.util.function.Consumer;

/* renamed from: zp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zp8 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ zp8(int i) {
        this.a = i;
    }

    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case b85.b:
                if (obj == null) {
                    int i = cq8.x;
                    throw null;
                }
                throw new ClassCastException();
            case 1:
                if (obj == null) {
                    zzvr zzvr = zb9.C;
                    throw null;
                }
                throw new ClassCastException();
            default:
                throw b81.j(obj);
        }
    }
}
