package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: j98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j98 implements WildcardType, Type {
    public static final j98 y = new j98((Type) null, (Type) null);
    public final Type w;
    public final Type x;

    public j98(Type type, Type type2) {
        this.w = type;
        this.x = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (!Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) || !Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
            return false;
        }
        return true;
    }

    public final Type[] getLowerBounds() {
        Type type = this.x;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public final String getTypeName() {
        Type type = this.x;
        if (type != null) {
            return "? super " + ar7.f(type);
        }
        Type type2 = this.w;
        if (type2 == null || sg3.e(type2, Object.class)) {
            return "?";
        }
        return "? extends " + ar7.f(type2);
    }

    public final Type[] getUpperBounds() {
        Type type = this.w;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
