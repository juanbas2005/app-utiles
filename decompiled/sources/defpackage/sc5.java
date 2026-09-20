package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: sc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc5 implements ParameterizedType, Type {
    public final Class w;
    public final Type x;
    public final Type[] y;

    public sc5(Class cls, Type type, ArrayList arrayList) {
        this.w = cls;
        this.x = type;
        this.y = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (!this.w.equals(parameterizedType.getRawType()) || !sg3.e(this.x, parameterizedType.getOwnerType()) || !Arrays.equals(this.y, parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return this.y;
    }

    public final Type getOwnerType() {
        return this.x;
    }

    public final Type getRawType() {
        return this.w;
    }

    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.w;
        Type type = this.x;
        if (type != null) {
            sb.append(ar7.f(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(ar7.f(cls));
        }
        Type[] typeArr = this.y;
        if (typeArr.length != 0) {
            qs.d1(typeArr, sb, ", ", "<", ">", "...", rc5.D);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int hashCode = this.w.hashCode();
        Type type = this.x;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.y) ^ (hashCode ^ i);
    }

    public final String toString() {
        return getTypeName();
    }
}
