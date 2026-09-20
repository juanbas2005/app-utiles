package defpackage;

import java.lang.reflect.Field;

/* renamed from: kj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kj0 extends nj0 implements db0 {
    public final Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kj0(Field field, boolean z, Object obj) {
        super(field, z, false);
        field.getClass();
        this.g = obj;
    }

    public final Object d(Object[] objArr) {
        f(objArr);
        ((Field) this.c).set(this.g, qs.W0(objArr));
        return vs7.a;
    }
}
