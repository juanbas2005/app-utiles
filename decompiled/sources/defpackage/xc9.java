package defpackage;

/* renamed from: xc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xc9 {
    public static final id9 a = new id9("cause", Throwable.class, false, false);
    public static final id9 b;
    public static final id9 c;
    public static final id9 d = new id9("ratelimit_period", rc9.class, false, false);
    public static final id9 e;
    public static final wc9 f = new wc9("group_by", Object.class, true, true, 0);
    public static final id9 g = new id9("forced", Boolean.class, false, false);
    public static final wc9 h = new wc9("tags", yj8.class, false, true, 1);
    public static final id9 i = new id9("stack_size", pd9.class, false, false);

    static {
        Class<Integer> cls = Integer.class;
        b = new id9("ratelimit_count", cls, false, false);
        c = new id9("sampling_count", cls, false, false);
        e = new id9("skipped", cls, false, false);
    }
}
