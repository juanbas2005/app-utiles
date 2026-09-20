package defpackage;

/* renamed from: sd9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum sd9 {
    HEX('x', 4, "-#0(", true);
    
    public static final sd9[] B = null;
    public final char w;
    public final int x;
    public final int y;
    public final String z;

    static {
        B = new sd9[26];
        for (sd9 sd9 : values()) {
            B[(sd9.w | ' ') - 'a'] = sd9;
        }
    }

    /* access modifiers changed from: public */
    sd9(char c, int i, String str, boolean z2) {
        int i2;
        this.w = c;
        this.x = i;
        td9 td9 = td9.e;
        int i3 = 0;
        if (true != z2) {
            i2 = 0;
        } else {
            i2 = 128;
        }
        while (i3 < str.length()) {
            int charAt = ((int) ((td9.d >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt >= 0) {
                i2 |= 1 << charAt;
                i3++;
            } else {
                h.q("invalid flags: ".concat(str));
                throw null;
            }
        }
        this.y = i2;
        this.z = hl6.o(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
