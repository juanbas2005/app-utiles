package defpackage;

import java.util.Arrays;

/* renamed from: io0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class io0 extends af3 {
    public final vw3 a(sl4 sl4) {
        sl4.getClass();
        fv3 g = sl4.g();
        g.getClass();
        return g.t(ro5.CHAR);
    }

    public final String toString() {
        String str;
        Object obj = this.a;
        Integer valueOf = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        switch (charValue) {
            case 8:
                str = "\\b";
                break;
            case 9:
                str = "\\t";
                break;
            case 10:
                str = "\\n";
                break;
            case 12:
                str = "\\f";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                str = "\\r";
                break;
            default:
                byte type = (byte) Character.getType(charValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    str = String.valueOf(charValue);
                    break;
                } else {
                    str = "?";
                    break;
                }
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf, str}, 2));
    }
}
