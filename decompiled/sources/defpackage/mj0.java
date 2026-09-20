package defpackage;

import java.lang.reflect.Field;

/* renamed from: mj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj0 extends nj0 {
    public final /* synthetic */ int g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mj0(Field field, boolean z) {
        super(field, z, true);
        this.g = 0;
        field.getClass();
    }

    public void f(Object[] objArr) {
        switch (this.g) {
            case 1:
                super.f(objArr);
                g(qs.X0(objArr));
                return;
            default:
                super.f(objArr);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj0(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }
}
