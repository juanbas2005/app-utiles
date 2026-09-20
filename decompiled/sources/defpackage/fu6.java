package defpackage;

/* renamed from: fu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fu6 extends du7 implements hu6, po7 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (fm p : getAnnotations()) {
            String[] strArr = {"[", ms1.e.p(p, (mm) null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(L());
        if (!G().isEmpty()) {
            dt0.D0(G(), sb, ", ", "<", ">", (vr2) null, 112);
        }
        if (Q()) {
            sb.append("?");
        }
        return sb.toString();
    }

    /* renamed from: w0 */
    public abstract fu6 o0(boolean z);

    /* renamed from: x0 */
    public abstract fu6 v0(ro7 ro7);
}
