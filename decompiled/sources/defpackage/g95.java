package defpackage;

/* renamed from: g95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g95 {
    public static final g95 c = new g95(1, "SUCCESS");
    public final int a;
    public final String b;

    public g95(int i, String str) {
        if (i != 0) {
            this.a = i;
            this.b = str;
            return;
        }
        a(3);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        String format;
        Throwable th;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[0] = "success";
            } else if (i != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i != 1) {
                objArr[2] = "incompatible";
            } else if (i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "<init>";
            }
            format = String.format(str, objArr);
            if (i != 1 || i == 2 || i == 3 || i == 4) {
                th = new IllegalArgumentException(format);
            } else {
                th = new IllegalStateException(format);
            }
            throw th;
        }
        objArr[0] = "debugMessage";
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        if (i != 1) {
        }
        format = String.format(str, objArr);
        if (i != 1) {
        }
        th = new IllegalArgumentException(format);
        throw th;
    }

    public static g95 c(String str) {
        return new g95(2, str);
    }

    public final int b() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 1) {
            str = "OVERRIDABLE";
        } else if (i == 2) {
            str = "INCOMPATIBLE";
        } else if (i != 3) {
            str = "null";
        } else {
            str = "CONFLICT";
        }
        sb.append(str);
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }
}
