package defpackage;

/* renamed from: ca  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ca {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public ca(String str, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = str;
    }

    public String toString() {
        switch (this.a) {
            case b85.b:
                String str = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ca(int i, String str, boolean z) {
        this.a = i;
        this.c = str;
        this.b = z;
    }
}
