package defpackage;

/* renamed from: d21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d21 extends x15 {
    public final String c;

    public d21(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    public final y15 a(Object obj, CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        String obj2 = charSequence.subSequence(i, i2).toString();
        String str = this.c;
        if (sg3.e(obj2, str)) {
            return null;
        }
        return new py2(str);
    }
}
