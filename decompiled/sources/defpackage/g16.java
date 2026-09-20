package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: g16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class g16 extends c16 implements ci3, oi3 {
    public final n06 a(up2 up2) {
        up2.getClass();
        Member b = b();
        b.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) b).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return za5.o(declaredAnnotations, up2);
        }
        return null;
    }

    public abstract Member b();

    public final uq4 c() {
        String name = b().getName();
        if (name != null) {
            return uq4.e(name);
        }
        return oz6.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        int i;
        l16 l16;
        boolean z2;
        l16 r06;
        ArrayList arrayList = new ArrayList(typeArr.length);
        ArrayList C = td0.D.C(b());
        if (C != null) {
            i = C.size() - typeArr.length;
        } else {
            i = 0;
        }
        int length = typeArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Class cls = typeArr[i2];
            cls.getClass();
            boolean z3 = cls instanceof Class;
            if (z3) {
                Class cls2 = cls;
                if (cls2.isPrimitive()) {
                    l16 = new j16(cls2);
                    String str = null;
                    if (C != null) {
                        String str2 = (String) dt0.z0(i2 + i, C);
                        if (str2 != null) {
                            str = str2;
                        } else {
                            rf2.e(i2, i, c(), l16, this);
                            return null;
                        }
                    }
                    if (z) {
                        z2 = true;
                        if (i2 == typeArr.length - 1) {
                            arrayList.add(new n16(l16, annotationArr[i2], str, z2));
                        }
                    }
                    z2 = false;
                    arrayList.add(new n16(l16, annotationArr[i2], str, z2));
                }
            }
            if ((cls instanceof GenericArrayType) || (z3 && cls.isArray())) {
                r06 = new r06(cls);
            } else if (cls instanceof WildcardType) {
                r06 = new o16((WildcardType) cls);
            } else {
                r06 = new a16(cls);
            }
            l16 = r06;
            String str3 = null;
            if (C != null) {
            }
            if (z) {
            }
            z2 = false;
            arrayList.add(new n16(l16, annotationArr[i2], str3, z2));
        }
        return arrayList;
    }

    public final h8 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return e78.z;
        }
        if (Modifier.isPrivate(modifiers)) {
            return b78.z;
        }
        if (!Modifier.isProtected(modifiers)) {
            return dk3.z;
        }
        if (Modifier.isStatic(modifiers)) {
            return fk3.z;
        }
        return ek3.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g16) || !sg3.e(b(), ((g16) obj).b())) {
            return false;
        }
        return true;
    }

    public final Collection getAnnotations() {
        Member b = b();
        b.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) b).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return za5.p(declaredAnnotations);
        }
        return a42.w;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
