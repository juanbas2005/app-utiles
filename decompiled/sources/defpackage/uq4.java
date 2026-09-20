package defpackage;

/* renamed from: uq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uq4 implements Comparable {
    public final String w;
    public final boolean x;

    public uq4(String str, boolean z) {
        if (str != null) {
            this.w = str;
            this.x = z;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static uq4 d(String str) {
        if (str == null) {
            a(9);
            throw null;
        } else if (str.startsWith("<")) {
            return g(str);
        } else {
            return e(str);
        }
    }

    public static uq4 e(String str) {
        if (str != null) {
            return new uq4(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    public static uq4 g(String str) {
        if (str == null) {
            a(8);
            throw null;
        } else if (str.startsWith("<")) {
            return new uq4(str, true);
        } else {
            h.q("special name must start with '<': ".concat(str));
            return null;
        }
    }

    public final String b() {
        String str = this.w;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (!this.x) {
            String b = b();
            if (b != null) {
                return b;
            }
            a(2);
            throw null;
        }
        ku4.t("not identifier: ", this);
        return null;
    }

    public final int compareTo(Object obj) {
        return this.w.compareTo(((uq4) obj).w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq4)) {
            return false;
        }
        uq4 uq4 = (uq4) obj;
        if (this.x == uq4.x && this.w.equals(uq4.w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.w.hashCode() * 31) + (this.x ? 1 : 0);
    }

    public final String toString() {
        return this.w;
    }
}
