package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* renamed from: vi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vi3 extends q16 {
    public final yq3 x;
    public final Member y;
    public final Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi3(yq3 yq3, Member member, Object obj, fq3 fq3) {
        super(fq3);
        yq3.getClass();
        fq3.getClass();
        this.x = yq3;
        this.y = member;
        this.z = obj;
    }

    public final yq3 B() {
        return this.x;
    }

    public final Object G() {
        return this.z;
    }

    public final boolean M() {
        int modifiers = this.y.getModifiers();
        up2 up2 = g18.a;
        if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) {
            return false;
        }
        return true;
    }

    public final ls3 f() {
        int modifiers = this.y.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return ls3.w;
        }
        if (Modifier.isPrivate(modifiers)) {
            return ls3.z;
        }
        return null;
    }

    public final List getAnnotations() {
        AnnotatedElement annotatedElement;
        Member b = n().b();
        if (b instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) b;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null) {
            return a42.w;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return g18.t(qs.p1(annotations));
    }

    public final boolean i() {
        return false;
    }

    public el4 o() {
        el4 el4 = this.w.b;
        if (el4 != null) {
            return el4;
        }
        Member member = this.y;
        if (Modifier.isFinal(member.getModifiers()) || ar7.F(member)) {
            return el4.x;
        }
        if (Modifier.isAbstract(member.getModifiers())) {
            return el4.z;
        }
        return el4.y;
    }
}
