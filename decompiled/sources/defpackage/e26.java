package defpackage;

/* renamed from: e26  reason: default package */
public final class e26 implements vr2 {
    public final boolean w;

    public e26(boolean z) {
        this.w = z;
    }

    public final Object y(Object obj) {
        String str;
        gs3 gs3 = (gs3) obj;
        gs3.getClass();
        StringBuilder sb = new StringBuilder();
        if (this.w) {
            str = "(raw) ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(gs3);
        return sb.toString();
    }
}
