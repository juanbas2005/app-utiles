package defpackage;

import java.lang.reflect.Field;

/* renamed from: gj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gj0 extends jj0 implements db0 {
    public final Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj0(Field field, Object obj) {
        super(field, false);
        field.getClass();
        this.f = obj;
    }

    public final Object d(Object[] objArr) {
        e(objArr.length);
        return ((Field) this.c).get(this.f);
    }
}
