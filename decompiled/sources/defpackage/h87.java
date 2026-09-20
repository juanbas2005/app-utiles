package defpackage;

import java.util.Locale;

/* renamed from: h87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h87 implements ua6 {
    public final ir2 w;

    public h87(ir2 ir2) {
        ir2.getClass();
        this.w = ir2;
    }

    public final boolean Z() {
        return this.w.Z();
    }

    public final void close() {
        this.w.close();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        if (r2.equals("END") == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r2.equals("COM") == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        r4 = defpackage.l87.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        if (r4 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        return new defpackage.m87(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        if (r2.equals("PRA") == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fe, code lost:
        r0 = r0.toLowerCase(java.util.Locale.ROOT);
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0115, code lost:
        if (defpackage.d57.x0(defpackage.d57.c1(r0, "journal_mode", ""), "=", false) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0117, code lost:
        r1 = defpackage.hz2.M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0119, code lost:
        if (r1 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        return new defpackage.m87(r11, r12, new defpackage.n87(r11, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0126, code lost:
        r0 = r2.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r0 == 79487) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0132, code lost:
        if (r0 == 81978) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0137, code lost:
        if (r0 == 85954) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0140, code lost:
        if (r2.equals("WIT") != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0149, code lost:
        if (r2.equals("SEL") != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0150, code lost:
        if (r2.equals("PRA") == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0157, code lost:
        return new defpackage.n87(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015d, code lost:
        return new defpackage.m87(r11, r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0079 A[EDGE_INSN: B:88:0x0079->B:27:0x0079 ?: BREAK  , SYNTHETIC] */
    public final ab6 k0(String str) {
        String str2;
        l87 l87;
        int i;
        str.getClass();
        ir2 ir2 = this.w;
        hz2 hz2 = null;
        if (ir2.isOpen()) {
            String upperCase = d57.k1(str).toString().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int length = upperCase.length() - 2;
            int i2 = -1;
            if (length >= 0) {
                int i3 = 0;
                loop0:
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    char charAt = upperCase.charAt(i3);
                    if (sg3.k(charAt, 32) > 0) {
                        if (charAt != '-') {
                            if (charAt != '/') {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) != '*') {
                                break;
                            }
                            do {
                                i4 = d57.F0(upperCase, '*', i4 + 1, 4);
                                if (i4 >= 0) {
                                    break loop0;
                                }
                                i = i4 + 1;
                                if (i >= length || upperCase.charAt(i) == '/') {
                                    i3 = i4 + 2;
                                }
                                i4 = d57.F0(upperCase, '*', i4 + 1, 4);
                                if (i4 >= 0) {
                                }
                            } while (upperCase.charAt(i) == '/');
                            i3 = i4 + 2;
                        } else if (upperCase.charAt(i3 + 1) == '-') {
                            i3 = d57.F0(upperCase, 10, i3 + 2, 4);
                            if (i3 < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
            }
            if (i2 < 0 || i2 > upperCase.length()) {
                str2 = null;
            } else {
                str2 = upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
            }
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case 65636:
                        if (str2.equals("BEG")) {
                            if (!d57.x0(upperCase, "EXCLUSIVE", false)) {
                                if (!d57.x0(upperCase, "IMMEDIATE", false)) {
                                    l87 = l87.A;
                                    break;
                                } else {
                                    l87 = l87.z;
                                    break;
                                }
                            } else {
                                l87 = l87.y;
                                break;
                            }
                        }
                    case 66913:
                        break;
                    case 68795:
                        break;
                    case 81327:
                        if (str2.equals("ROL") && !d57.x0(upperCase, " TO ", false)) {
                            l87 = l87.x;
                            break;
                        }
                }
            } else {
                return new m87(ir2, str);
            }
        } else {
            l55.w(21, "connection is closed");
            throw null;
        }
    }
}
