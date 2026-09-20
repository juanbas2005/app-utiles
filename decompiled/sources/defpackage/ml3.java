package defpackage;

/* renamed from: ml3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ml3 {
    public static final py2 a = new py2("COMPLETING_ALREADY", 4);
    public static final py2 b = new py2("COMPLETING_WAITING_CHILDREN", 4);
    public static final py2 c = new py2("COMPLETING_RETRY", 4);
    public static final py2 d = new py2("TOO_LATE_TO_CANCEL", 4);
    public static final py2 e = new py2("SEALED", 4);
    public static final q32 f = new q32(false);
    public static final q32 g = new q32(true);

    public static final Object a(Object obj) {
        ea3 ea3;
        aa3 aa3;
        if (obj instanceof ea3) {
            ea3 = (ea3) obj;
        } else {
            ea3 = null;
        }
        if (ea3 == null || (aa3 = ea3.a) == null) {
            return obj;
        }
        return aa3;
    }
}
