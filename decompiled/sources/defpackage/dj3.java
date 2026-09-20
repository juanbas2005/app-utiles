package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* renamed from: dj3  reason: default package */
public final class dj3 implements sr2 {
    public final /* synthetic */ int w;
    public final ej3 x;

    public /* synthetic */ dj3(ej3 ej3, int i) {
        this.w = i;
        this.x = ej3;
    }

    public final Object b() {
        int i = this.w;
        ej3 ej3 = this.x;
        switch (i) {
            case b85.b:
                return ej3.T().getTypeParameters();
            case 1:
                Type genericReturnType = ej3.T().getGenericReturnType();
                genericReturnType.getClass();
                return ar7.Y(genericReturnType, b42.w, (pp7) null, ar7.F(ej3.y), false, (gq7) null, 26);
            default:
                if (Modifier.isStatic(ej3.T().getModifiers())) {
                    Method T = ej3.T();
                    if (r16.Z(ej3)) {
                        return new qj0(T, false, r16.F(ej3));
                    }
                    return new rj0(T, false, 6, 2);
                }
                rf2.j("Only static Java methods are supported for now: ", ej3.y);
                return null;
        }
    }
}
