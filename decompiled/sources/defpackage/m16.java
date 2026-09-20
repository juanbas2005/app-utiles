package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: m16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m16 extends c16 implements ci3, gi3 {
    public final TypeVariable a;

    public m16(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    public final n06 a(up2 up2) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        up2.getClass();
        TypeVariable typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return za5.o(declaredAnnotations, up2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m16)) {
            return false;
        }
        if (sg3.e(this.a, ((m16) obj).a)) {
            return true;
        }
        return false;
    }

    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return a42.w;
        }
        return za5.p(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m16.class.getName() + ": " + this.a;
    }
}
