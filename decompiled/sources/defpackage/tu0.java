package defpackage;

/* renamed from: tu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tu0 extends yb4 {
    public final void a(hq6 hq6, String str, String str2, Throwable th) {
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hq6);
        sb2.append(':');
        sb.append(sb2.toString());
        sb.append(" ");
        if (str2.length() > 0) {
            sb.append("(" + str2 + ')');
            sb.append(" ");
        }
        sb.append(str);
        System.out.println(sb.toString());
        if (th != null) {
            th.printStackTrace();
        }
    }
}
