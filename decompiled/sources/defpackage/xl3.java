package defpackage;

import java.util.Map;

/* renamed from: xl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xl3 implements q25 {
    public final /* synthetic */ int a;

    public /* synthetic */ xl3(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case b85.b:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                r25 r25 = (r25) obj2;
                r25.a(eu5.g, entry.getKey());
                r25.a(eu5.h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
