package defpackage;

import java.util.Iterator;

/* renamed from: mo5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mo5 extends bt0 {
    public final lo5 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo5(zr3 zr3) {
        super(zr3);
        zr3.getClass();
        this.b = new lo5(zr3.getDescriptor());
    }

    public final Object a() {
        return (ko5) g(j());
    }

    public final int b(Object obj) {
        ko5 ko5 = (ko5) obj;
        ko5.getClass();
        return ko5.d();
    }

    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    public final Object deserialize(ok1 ok1) {
        return e(ok1);
    }

    public final ll6 getDescriptor() {
        return this.b;
    }

    public final Object h(Object obj) {
        ko5 ko5 = (ko5) obj;
        ko5.getClass();
        return ko5.a();
    }

    public final void i(int i, Object obj, Object obj2) {
        ((ko5) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(hy0 hy0, Object obj, int i);

    public final void serialize(j42 j42, Object obj) {
        int d = d(obj);
        lo5 lo5 = this.b;
        lo5.getClass();
        hy0 c = j42.c(lo5);
        k(c, obj, d);
        c.b(lo5);
    }
}
