package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: e7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e7 implements vr2 {
    public static final e7 A = new e7(3);
    public static final e7 B = new e7(4);
    public static final e7 C = new e7(5);
    public static final e7 D = new e7(6);
    public static final e7 E = new e7(7);
    public static final e7 F = new e7(8);
    public static final e7 G = new e7(9);
    public static final e7 H = new e7(10);
    public static final e7 I = new e7(11);
    public static final e7 J = new e7(12);
    public static final e7 K = new e7(13);
    public static final e7 L = new e7(14);
    public static final e7 M = new e7(15);
    public static final e7 N = new e7(16);
    public static final e7 O = new e7(17);
    public static final e7 P = new e7(18);
    public static final e7 Q = new e7(19);
    public static final e7 R = new e7(20);
    public static final e7 S = new e7(21);
    public static final e7 T = new e7(22);
    public static final e7 U = new e7(23);
    public static final e7 V = new e7(24);
    public static final e7 W = new e7(25);
    public static final e7 X = new e7(26);
    public static final e7 Y = new e7(27);
    public static final e7 Z = new e7(28);
    public static final e7 a0 = new e7(29);
    public static final e7 x = new e7(0);
    public static final e7 y = new e7(1);
    public static final e7 z = new e7(2);
    public final /* synthetic */ int w;

    public /* synthetic */ e7(int i) {
        this.w = i;
    }

    public final Object y(Object obj) {
        String str;
        Class<?> declaringClass;
        int i = this.w;
        a42 a42 = a42.w;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                    str.getClass();
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                    str.getClass();
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                    str.getClass();
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                    str.getClass();
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                    str.getClass();
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                    str.getClass();
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                    str.getClass();
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                    str.getClass();
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                    str.getClass();
                } else {
                    str = value.toString();
                }
                return str2 + '=' + str;
            case 2:
                ri0 ri0 = (ri0) obj;
                int i2 = vd0.l;
                ri0.getClass();
                return Boolean.valueOf(dt0.q0(mz6.f, dh4.h(ri0)));
            case 3:
                ri0 ri02 = (ri0) obj;
                int i3 = vd0.l;
                ri02.getClass();
                if ((ri02 instanceof xs2) && dt0.q0(mz6.f, dh4.h(ri02))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                Class cls = (Class) obj;
                ez0 ez0 = oh0.a;
                cls.getClass();
                return new oq3(cls);
            case 5:
                Class cls2 = (Class) obj;
                ez0 ez02 = oh0.a;
                cls2.getClass();
                return new pr3(cls2);
            case 6:
                Class cls3 = (Class) obj;
                ez0 ez03 = oh0.a;
                cls3.getClass();
                return bb0.d0(oh0.a(cls3), a42, false, a42, (gq3) null);
            case 7:
                Class cls4 = (Class) obj;
                ez0 ez04 = oh0.a;
                cls4.getClass();
                return bb0.d0(oh0.a(cls4), a42, true, a42, (gq3) null);
            case 8:
                ez0 ez05 = oh0.a;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 9:
                gq3 gq3 = (gq3) obj;
                gq3.getClass();
                if (!gq3.p() || (declaringClass = kl8.u(gq3).getDeclaringClass()) == null) {
                    return null;
                }
                return b26.a.b(declaringClass);
            case 10:
                gq3 gq32 = (gq3) obj;
                gq32.getClass();
                return gq32.getTypeParameters();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                du7 du7 = (du7) obj;
                du7.getClass();
                return Boolean.valueOf(du7.L() instanceof jl0);
            case 12:
                ((xs2) obj).getClass();
                return null;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((xs2) obj).getClass();
                return null;
            case 14:
                ((xs2) obj).getClass();
                return null;
            case h75.g /*15*/:
                ri0 ri03 = (ri0) obj;
                ri03.getClass();
                return Boolean.valueOf(h49.D(ri03));
            case 16:
                rm rmVar = (rm) obj;
                rmVar.getClass();
                return new ts(1, rmVar);
            case 17:
                zq3 zq3 = (zq3) obj;
                zq3.getClass();
                return "  - " + zq3 + " (" + wn6.k(zq3) + ')';
            case 18:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object W0 = qs.W0(bounds);
                if (W0 instanceof TypeVariable) {
                    return (TypeVariable) W0;
                }
                return null;
            case 19:
                Class cls5 = (Class) obj;
                cls5.getClass();
                if (!Modifier.isStatic(cls5.getModifiers())) {
                    return cls5.getDeclaringClass();
                }
                return null;
            case 20:
                Class cls6 = (Class) obj;
                cls6.getClass();
                TypeVariable[] typeParameters = cls6.getTypeParameters();
                typeParameters.getClass();
                return qs.E0(typeParameters);
            case 21:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 22:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return qs.p1(actualTypeArguments);
            case 23:
                zq3 zq32 = (zq3) obj;
                zq32.getClass();
                return "  - " + zq32 + " (" + wn6.i(zq32) + ')';
            case 24:
                uu3 uu3 = (uu3) obj;
                uu3.getClass();
                return uu3.e;
            case 25:
                uu3 uu32 = (uu3) obj;
                uu32.getClass();
                return uu32.c;
            case 26:
                return Boolean.valueOf(tf4.E(((Character) obj).charValue()));
            case 27:
                char charValue = ((Character) obj).charValue();
                if (charValue >= 0 && charValue < 256) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 28:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
            default:
                return Boolean.valueOf(tf4.C(((Character) obj).charValue()));
        }
    }
}
