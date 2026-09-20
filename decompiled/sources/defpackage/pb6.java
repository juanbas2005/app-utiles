package defpackage;

/* renamed from: pb6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pb6 implements Cloneable {
    public final float w;
    public final int x;

    public pb6(float f) {
        this.w = f;
        this.x = 1;
    }

    public final float a(kd6 kd6) {
        if (this.x != 9) {
            return d(kd6);
        }
        id6 id6 = (id6) kd6.z;
        sp4 sp4 = id6.g;
        if (sp4 == null) {
            sp4 = id6.f;
        }
        float f = this.w;
        if (sp4 == null) {
            return f;
        }
        float f2 = sp4.d;
        float f3 = sp4.e;
        if (f2 != f3) {
            f2 = (float) (Math.sqrt((double) ((f3 * f3) + (f2 * f2))) / 1.414213562373095d);
        }
        return (f * f2) / 100.0f;
    }

    public final float b(kd6 kd6, float f) {
        if (this.x == 9) {
            return (this.w * f) / 100.0f;
        }
        return d(kd6);
    }

    public final float c() {
        float f;
        float f2;
        int B = b81.B(this.x);
        float f3 = this.w;
        if (B == 0) {
            return f3;
        }
        if (B == 3) {
            return f3 * 96.0f;
        }
        if (B == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (B == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (B == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else if (B != 7) {
            return f3;
        } else {
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return r3 * r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        return r2;
     */
    public final float d(kd6 kd6) {
        float textSize;
        int B = b81.B(this.x);
        float f = this.w;
        switch (B) {
            case 1:
                textSize = ((id6) kd6.z).d.getTextSize();
                break;
            case 2:
                textSize = ((id6) kd6.z).d.getTextSize() / 2.0f;
                break;
            case 3:
                kd6.getClass();
                return f * 96.0f;
            case 4:
                kd6.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                kd6.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                kd6.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                kd6.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                id6 id6 = (id6) kd6.z;
                sp4 sp4 = id6.g;
                if (sp4 == null) {
                    sp4 = id6.f;
                }
                if (sp4 != null) {
                    return (f * sp4.d) / 100.0f;
                }
                break;
        }
    }

    public final float e(kd6 kd6) {
        if (this.x != 9) {
            return d(kd6);
        }
        id6 id6 = (id6) kd6.z;
        sp4 sp4 = id6.g;
        if (sp4 == null) {
            sp4 = id6.f;
        }
        float f = this.w;
        if (sp4 == null) {
            return f;
        }
        return (f * sp4.e) / 100.0f;
    }

    public final boolean f() {
        if (this.w < 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.w == 0.0f) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.w));
        switch (this.x) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public pb6(int i, float f) {
        this.w = f;
        this.x = i;
    }
}
