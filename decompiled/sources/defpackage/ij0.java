package defpackage;

import java.lang.reflect.Field;

/* renamed from: ij0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ij0 extends jj0 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ij0(Field field) {
        super(field, true);
        this.f = 0;
        field.getClass();
    }

    public void f(Object[] objArr) {
        switch (this.f) {
            case 1:
                e(objArr.length);
                g(qs.X0(objArr));
                return;
            default:
                super.f(objArr);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij0(Field field, boolean z, int i) {
        super(field, z);
        this.f = i;
    }
}
