package defpackage;

/* renamed from: gh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gh7 {
    public static final py2 a = new py2("NO_THREAD_ELEMENTS", 4);
    public static final of6 b = new of6(14);
    public static final of6 c = new of6(15);
    public static final of6 d = new of6(16);

    public static final void a(e81 e81, Object obj) {
        if (obj != a) {
            if (obj instanceof mh7) {
                mh7 mh7 = (mh7) obj;
                fh7[] fh7Arr = mh7.c;
                int length = fh7Arr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        fh7 fh7 = fh7Arr[length];
                        fh7.getClass();
                        fh7.b0(e81, mh7.b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object G = e81.G(c, (Object) null);
                G.getClass();
                ((fh7) G).b0(e81, obj);
            }
        }
    }

    public static final Object b(e81 e81) {
        Object G = e81.G(b, 0);
        G.getClass();
        return G;
    }

    public static final Object c(e81 e81, Object obj) {
        if (obj == null) {
            obj = b(e81);
        }
        if (obj == 0) {
            return a;
        }
        if (!(obj instanceof Integer)) {
            return ((fh7) obj).h0(e81);
        }
        return e81.G(d, new mh7(((Number) obj).intValue(), e81));
    }
}
