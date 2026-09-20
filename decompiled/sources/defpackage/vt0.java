package defpackage;

/* renamed from: vt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vt0 {
    public static final float[] a;
    public static final float[] b;
    public static final ll7 c;
    public static final ll7 d;
    public static final t76 e;
    public static final t76 f;
    public static final t76 g;
    public static final t76 h;
    public static final t76 i;
    public static final t76 j;
    public static final t76 k;
    public static final t76 l;
    public static final t76 m;
    public static final t76 n;
    public static final t76 o;
    public static final t76 p;
    public static final t76 q;
    public static final t76 r;
    public static final vx3 s;
    public static final vx3 t;
    public static final t76 u;
    public static final t76 v;
    public static final t76 w;
    public static final k45 x;
    public static final tt0[] y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: tt0[]} */
    /* JADX WARNING: type inference failed for: r0v2, types: [tt0, k45] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        ll7 ll7 = new ll7(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        ll7 ll72 = new ll7(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        ll7 ll73 = new ll7(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = ll73;
        ll7 ll74 = new ll7(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = ll74;
        t88 t88 = kl8.k;
        t76 t76 = new t76("sRGB IEC61966-2.1", fArr, t88, ll7, 0);
        e = t76;
        t76 t762 = new t76("sRGB IEC61966-2.1 (Linear)", fArr, t88, 1.0d, 0.0f, 1.0f, 1);
        f = t762;
        t76 t763 = new t76("scRGB-nl IEC 61966-2-2:2003", fArr, t88, (float[]) null, new h(15), new h(16), -0.799f, 2.399f, ll7, 2);
        g = t763;
        t76 t764 = new t76("scRGB IEC 61966-2-2:2003", fArr, t88, 1.0d, -0.5f, 7.499f, 3);
        h = t764;
        t88 t882 = t88;
        t76 t765 = new t76("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, t882, new ll7(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        t88 t883 = t882;
        i = t765;
        t76 t766 = new t76("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, t882, new ll7(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        t88 t884 = t882;
        j = t766;
        t76 t767 = new t76("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new t88(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = t767;
        t76 t768 = new t76("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, t882, ll7, 7);
        l = t768;
        t76 t769 = new t76("NTSC (1953)", fArr2, kl8.h, new ll7(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = t769;
        t88 t885 = t882;
        t88 t886 = t885;
        t76 t7610 = new t76("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, t885, new ll7(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        t88 t887 = t886;
        n = t7610;
        t76 t7611 = new t76("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, t887, 2.2d, 0.0f, 1.0f, 10);
        o = t7611;
        t76 t7612 = new t76("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kl8.i, new ll7(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = t7612;
        t88 t888 = kl8.j;
        t76 t7613 = new t76("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, t888, 1.0d, -65504.0f, 65504.0f, 12);
        q = t7613;
        t76 t7614 = new t76("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, t888, 1.0d, -65504.0f, 65504.0f, 13);
        r = t7614;
        vx3 vx3 = new vx3(14, 1, 12884901889L, "Generic XYZ");
        s = vx3;
        vx3 vx32 = new vx3(15, 0, 12884901890L, "Generic L*a*b*");
        t = vx32;
        t76 t7615 = new t76("None", fArr, t887, ll72, 16);
        u = t7615;
        t88 t889 = t887;
        ll7 ll75 = ll73;
        t76 t7616 = new t76("Hybrid Log Gamma encoding", fArr3, t889, (float[]) null, new h(17), new h(18), 0.0f, 1.0f, ll75, 17);
        v = t7616;
        t76 t7617 = new t76("Perceptual Quantizer encoding", fArr3, t889, (float[]) null, new h(19), new h(20), 0.0f, 1.0f, ll74, 18);
        w = t7617;
        ? tt0 = new tt0(19, 12884901890L, "Oklab");
        x = tt0;
        y = new tt0[]{t76, t762, t763, t764, t765, t766, t767, t768, t769, t7610, t7611, t7612, t7613, t7614, vx3, vx32, t7615, t7616, t7617, tt0};
    }

    public static double a(ll7 ll7, double d2) {
        double d3;
        double d4;
        ll7 ll72 = ll7;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = ll72.b;
        double d7 = ll72.c;
        double d8 = ll72.d;
        double d9 = ll72.e;
        double d10 = ll72.f;
        double d11 = ll72.g + 1.0d;
        double d12 = d6 * d5;
        if (d12 <= 1.0d) {
            d4 = Math.pow(d12, d7);
        } else {
            d4 = Math.exp((d5 - d10) * d8) + d9;
        }
        return d11 * d3 * d4;
    }

    public static double b(ll7 ll7, double d2) {
        double d3;
        double d4;
        ll7 ll72 = ll7;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = 1.0d / ll72.b;
        double d6 = 1.0d / ll72.c;
        double d7 = 1.0d / ll72.d;
        double d8 = ll72.e;
        double d9 = ll72.f;
        double d10 = (d2 * d3) / (ll72.g + 1.0d);
        if (d10 <= 1.0d) {
            d4 = Math.pow(d10, d6) * d5;
        } else {
            d4 = (Math.log(d10 - d8) * d7) + d9;
        }
        return d3 * d4;
    }

    public static double c(ll7 ll7, double d2) {
        double d3;
        double d4 = 0.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = ll7.b;
        double d7 = ll7.d;
        double pow = (Math.pow(d5, d7) * ll7.c) + d6;
        if (pow >= 0.0d) {
            d4 = pow;
        }
        return Math.pow(d4 / ((Math.pow(d5, d7) * ll7.f) + ll7.e), ll7.g) * d3;
    }

    public static double d(ll7 ll7, double d2) {
        double d3;
        ll7 ll72 = ll7;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = ll72.e;
        double d6 = 1.0d / ll72.g;
        return Math.pow(Math.max((Math.pow(d4, d6) * d5) + (-ll72.b), 0.0d) / ((Math.pow(d4, d6) * (-ll72.f)) + ll72.c), 1.0d / ll72.d) * d3;
    }
}
