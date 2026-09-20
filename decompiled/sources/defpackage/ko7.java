package defpackage;

/* renamed from: ko7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ko7 {
    public static ko7 e;
    public final /* synthetic */ int a = 0;
    public int b;
    public long c;
    public long d;

    public ko7(int i) {
        this.b = i;
    }

    public static void c(ko7 ko7, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (ko7) {
            if (j < 0) {
                throw new IllegalStateException("Check failed.");
            } else if (j2 >= 0) {
                try {
                    long j3 = ko7.c + j;
                    ko7.c = j3;
                    long j4 = ko7.d + j2;
                    ko7.d = j4;
                    if (j4 > j3) {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public void a(double d2, double d3, long j) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d4 = (double) f2;
        double sin = (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d4) * 0.0053d) + ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d5)) + 9.0E-4f)) + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.b = 1;
            this.c = -1;
            this.d = -1;
        } else if (sin3 <= -1.0d) {
            this.b = 0;
            this.c = -1;
            this.d = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.d = round;
            if (round >= j || this.c <= j) {
                this.b = 1;
            } else {
                this.b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.c - this.d;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "WindowCounter(streamId=" + this.b + ", total=" + this.c + ", acknowledged=" + this.d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ko7() {
    }
}
