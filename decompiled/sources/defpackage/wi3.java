package defpackage;

import java.lang.reflect.TypeVariable;

/* renamed from: wi3  reason: default package */
public final class wi3 implements sr2 {
    public final /* synthetic */ int w;
    public final yi3 x;

    public /* synthetic */ wi3(yi3 yi3, int i) {
        this.w = i;
        this.x = yi3;
    }

    public final Object b() {
        int i = this.w;
        yi3 yi3 = this.x;
        switch (i) {
            case b85.b:
                TypeVariable[] typeParameters = yi3.x.b().getTypeParameters();
                TypeVariable[] typeParameters2 = yi3.T().getTypeParameters();
                typeParameters2.getClass();
                return (TypeVariable[]) qs.h1(typeParameters, typeParameters2);
            default:
                if (r16.Z(yi3)) {
                    return new ej0(yi3.T(), r16.F(yi3), 1);
                }
                return new fj0(yi3.T(), 1);
        }
    }
}
