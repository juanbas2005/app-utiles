package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: k80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k80 {
    public static final String b = Character.toString(8206);
    public static final String c = Character.toString(8207);
    public static final k80 d = new k80(false);
    public static final k80 e = new k80(true);
    public final boolean a;

    static {
        v70 v70 = vd7.c;
    }

    public k80(boolean z) {
        v70 v70 = vd7.a;
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        return 0;
     */
    public static int a(CharSequence charSequence) {
        byte b2;
        j80 j80 = new j80(charSequence);
        j80.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = j80.c;
            if (i4 >= j80.b || i != 0) {
                if (i != 0) {
                    if (i2 == 0) {
                        while (j80.c > 0) {
                            switch (j80.a()) {
                                case 14:
                                case h75.g:
                                    if (i == i3) {
                                        break;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i == i3) {
                                        break;
                                    }
                                    break;
                                case 18:
                                    i3++;
                                    break;
                            }
                        }
                    } else {
                        return i2;
                    }
                }
            } else {
                CharSequence charSequence2 = j80.a;
                char charAt = charSequence2.charAt(i4);
                j80.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = j80.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    j80.c = Character.charCount(codePointAt) + j80.c;
                    b2 = Character.getDirectionality(codePointAt);
                } else {
                    j80.c = i5 + 1;
                    char c2 = j80.d;
                    if (c2 < 1792) {
                        b2 = j80.e[c2];
                    } else {
                        b2 = Character.getDirectionality(c2);
                    }
                }
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case h75.g:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r1 = r1 - 1;
     */
    public static int b(CharSequence charSequence) {
        j80 j80 = new j80(charSequence);
        j80.c = j80.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (j80.c > 0) {
                byte a2 = j80.a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                            }
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case h75.g:
                                if (i2 == i) {
                                    return -1;
                                }
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        v70 v70;
        String str;
        v70 v702;
        char c2;
        v70 v703 = vd7.c;
        if (charSequence == null) {
            return null;
        }
        boolean c3 = v703.c(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c3) {
            v70 = vd7.b;
        } else {
            v70 = vd7.a;
        }
        boolean c4 = v70.c(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (!z && (c4 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z || (c4 && a(charSequence) != -1)) {
            str = str2;
        } else {
            str = str3;
        }
        spannableStringBuilder.append(str);
        if (c3 != z) {
            if (c3) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (c3) {
            v702 = vd7.b;
        } else {
            v702 = vd7.a;
        }
        boolean c5 = v702.c(charSequence.length(), charSequence);
        if (!z && (c5 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!c5 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
