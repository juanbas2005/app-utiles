package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: sj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sj0 implements dj0 {
    public final /* synthetic */ int a = 0;
    public final List b;
    public final Member c;
    public final Type d;

    public sj0(Method method, List list) {
        this.c = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.d = returnType;
    }

    public final List a() {
        int i = this.a;
        return this.b;
    }

    public final Member b() {
        switch (this.a) {
            case b85.b:
                return this.c;
            default:
                return null;
        }
    }

    public final /* bridge */ boolean c() {
        switch (this.a) {
            case b85.b:
                return false;
            default:
                return false;
        }
    }

    public final void e(int i) {
        switch (this.a) {
            case b85.b:
                if (a().size() != i) {
                    h.f(a().size(), i);
                    return;
                }
                return;
            default:
                List list = this.b;
                if (list.size() != i) {
                    h.f(list.size(), i);
                    return;
                }
                return;
        }
    }

    public void f(Object[] objArr) {
        e(objArr.length);
    }

    public void g(Object obj) {
        if (obj == null || !this.c.getDeclaringClass().isInstance(obj)) {
            h.q("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Type k() {
        int i = this.a;
        Type type = this.d;
        switch (i) {
            case b85.b:
                return type;
            default:
                return (Class) type;
        }
    }

    public sj0(Member member, Type type, Type[] typeArr) {
        this.c = member;
        this.d = type;
        this.b = qs.p1(typeArr);
    }
}
