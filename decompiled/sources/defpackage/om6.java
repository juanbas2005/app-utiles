package defpackage;

/* renamed from: om6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class om6 implements cb2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ om6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static om6 a(Object obj) {
        if (obj != null) {
            return new om6(2, obj);
        }
        ku4.j("instance cannot be null");
        return null;
    }

    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                return new nm6((wm6) ((ku5) obj).get());
            case 1:
                return new pn6((es6) ((ku5) obj).get());
            default:
                return obj;
        }
    }
}
