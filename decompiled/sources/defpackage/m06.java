package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: m06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m06 {
    public static final List a;
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Map d;

    static {
        c26 c26 = b26.a;
        int i = 0;
        List<gq3> E = sg3.E(c26.b(Boolean.TYPE), c26.b(Byte.TYPE), c26.b(Character.TYPE), c26.b(Double.TYPE), c26.b(Float.TYPE), c26.b(Integer.TYPE), c26.b(Long.TYPE), c26.b(Short.TYPE));
        a = E;
        int F = tf4.F(et0.e0(E, 10));
        int i2 = 16;
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        for (gq3 gq3 : E) {
            linkedHashMap.put(kl8.v(gq3), kl8.w(gq3));
        }
        b = linkedHashMap;
        List<gq3> list = a;
        int F2 = tf4.F(et0.e0(list, 10));
        if (F2 >= 16) {
            i2 = F2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
        for (gq3 gq32 : list) {
            linkedHashMap2.put(kl8.w(gq32), kl8.v(gq32));
        }
        c = linkedHashMap2;
        List E2 = sg3.E(sr2.class, vr2.class, gs2.class, hs2.class, is2.class, js2.class, ks2.class, ls2.class, ms2.class, ns2.class, tr2.class, ur2.class, kt2.class, wr2.class, xr2.class, yr2.class, zr2.class, as2.class, bs2.class, cs2.class, es2.class, fs2.class, kt2.class);
        ArrayList arrayList = new ArrayList(et0.e0(E2, 10));
        for (Object next : E2) {
            int i3 = i + 1;
            if (i >= 0) {
                arrayList.add(new yb5((Class) next, Integer.valueOf(i)));
                i = i3;
            } else {
                sg3.Z();
                throw null;
            }
        }
        d = sf4.a0(arrayList);
    }

    public static final gq0 a(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            kj6.o("Can't compute ClassId for primitive type: ", cls);
            return null;
        } else if (cls.isArray()) {
            kj6.o("Can't compute ClassId for array type: ", cls);
            return null;
        } else if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            if (declaringClass != null) {
                return a(declaringClass).d(uq4.e(cls.getSimpleName()));
            }
            up2 up2 = new up2(cls.getName());
            return new gq0(up2.b(), up2.a.g());
        } else {
            up2 up22 = new up2(cls.getName());
            return new gq0(up22.b(), dh4.I(up22.a.g()), true);
        }
    }

    public static final String b(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            kj6.o("Unsupported primitive type: ", cls);
            return null;
        } else if (cls.isArray()) {
            String replace = cls.getName().replace('.', '/');
            replace.getClass();
            return replace;
        } else {
            StringBuilder sb = new StringBuilder("L");
            String replace2 = cls.getName().replace('.', '/');
            replace2.getClass();
            sb.append(replace2);
            sb.append(';');
            return sb.toString();
        }
    }

    public static final List c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return a42.w;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return cl6.V(new xg2(cl6.S(jo3.a0, type), l06.x, gl6.D));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return qs.p1(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
