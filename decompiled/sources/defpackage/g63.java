package defpackage;

/* renamed from: g63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g63 {
    public final String a;
    public int b;

    public g63(String str) {
        str.getClass();
        this.a = str;
    }

    public boolean a(vr2 vr2) {
        vr2.getClass();
        boolean c = c(vr2);
        if (c) {
            this.b++;
        }
        return c;
    }

    public void b(vr2 vr2) {
        if (c(vr2)) {
            while (c(vr2)) {
                this.b++;
            }
        }
    }

    public boolean c(vr2 vr2) {
        vr2.getClass();
        int i = this.b;
        String str = this.a;
        if (i >= str.length() || !((Boolean) vr2.y(Character.valueOf(str.charAt(this.b)))).booleanValue()) {
            return false;
        }
        return true;
    }

    public g63(int i, String str) {
        this.b = i;
        this.a = str;
    }
}
