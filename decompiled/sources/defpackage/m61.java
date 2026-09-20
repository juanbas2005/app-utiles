package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* renamed from: m61  reason: default package */
public final class m61 implements sr2 {
    public final /* synthetic */ int w;
    public final int x;
    public final Object y;

    public /* synthetic */ m61(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }

    public final Object b() {
        Type type;
        Object obj;
        int i = this.w;
        Object obj2 = this.y;
        int i2 = this.x;
        switch (i) {
            case b85.b:
                c2 c2Var = (c2) ((sr2) obj2).b();
                nz3 y2 = rg3.y(i44.w, new k3(9, c2Var));
                y16 y16 = c2Var.w;
                if (y16 != null) {
                    type = (Type) y16.b();
                } else {
                    type = null;
                }
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        obj = cls.getComponentType();
                    } else {
                        obj = Object.class;
                    }
                    Object obj3 = obj;
                    obj3.getClass();
                    return obj3;
                } else if (type instanceof GenericArrayType) {
                    if (i2 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        genericComponentType.getClass();
                        return genericComponentType;
                    }
                    rf2.x("Array type has been queried for a non-0th argument: ", c2Var);
                    return null;
                } else if (type instanceof ParameterizedType) {
                    Type type2 = (Type) ((List) y2.getValue()).get(i2);
                    if (!(type2 instanceof WildcardType)) {
                        return type2;
                    }
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    lowerBounds.getClass();
                    Type type3 = (Type) qs.X0(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        upperBounds.getClass();
                        type3 = (Type) qs.W0(upperBounds);
                    }
                    Type type4 = type3;
                    type4.getClass();
                    return type4;
                } else {
                    rf2.x("Non-generic type has been queried for arguments: ", c2Var);
                    return null;
                }
            case 1:
                return (pc5) ((List) obj2).get(i2);
            case 2:
                Object obj4 = ((ri0) obj2).S().get(i2);
                obj4.getClass();
                return (pc5) obj4;
            default:
                ((vr2) obj2).y(Integer.valueOf(i2));
                return vs7.a;
        }
    }
}
