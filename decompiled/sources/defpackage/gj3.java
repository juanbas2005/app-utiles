package defpackage;

import java.lang.reflect.Type;

/* renamed from: gj3  reason: default package */
public final class gj3 implements sr2 {
    public final /* synthetic */ int w;
    public final kj3 x;

    public /* synthetic */ gj3(kj3 kj3, int i) {
        this.w = i;
        this.x = kj3;
    }

    public final Object b() {
        int i = this.w;
        a42 a42 = a42.w;
        kj3 kj3 = this.x;
        switch (i) {
            case b85.b:
                rg3.d(kj3);
                return a42;
            case 1:
                if (!r16.Z(kj3)) {
                    return kj3.a();
                }
                rg3.d(kj3);
                return a42;
            case 2:
                Type genericType = kj3.Q().getGenericType();
                genericType.getClass();
                return ar7.Y(genericType, b42.w, (pp7) null, false, false, (gq7) null, 30);
            default:
                return new jj3(kj3);
        }
    }
}
