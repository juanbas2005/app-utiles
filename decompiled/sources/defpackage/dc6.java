package defpackage;

import java.util.ArrayList;

/* renamed from: dc6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dc6 implements Cloneable {
    public Float A;
    public pb6 B;
    public Float C;
    public pb6[] D;
    public pb6 E;
    public Float F;
    public gb6 G;
    public ArrayList H;
    public pb6 I;
    public Integer J;
    public Boolean K;
    public am6 L;
    public String M;
    public String N;
    public String O;
    public Boolean P;
    public Boolean Q;
    public mc6 R;
    public Float S;
    public String T;
    public String U;
    public mc6 V;
    public Float W;
    public mc6 X;
    public Float Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public long w = 0;
    public mc6 x;
    public Float y;
    public mc6 z;

    public static dc6 a() {
        dc6 dc6 = new dc6();
        dc6.w = -1;
        gb6 gb6 = gb6.x;
        dc6.x = gb6;
        dc6.Z = 1;
        Float valueOf = Float.valueOf(1.0f);
        dc6.y = valueOf;
        dc6.z = null;
        dc6.A = valueOf;
        dc6.B = new pb6(1.0f);
        dc6.a0 = 1;
        dc6.b0 = 1;
        dc6.C = Float.valueOf(4.0f);
        dc6.D = null;
        dc6.E = new pb6(0.0f);
        dc6.F = valueOf;
        dc6.G = gb6;
        dc6.H = null;
        dc6.I = new pb6(7, 12.0f);
        dc6.J = 400;
        dc6.c0 = 1;
        dc6.d0 = 1;
        dc6.e0 = 1;
        dc6.f0 = 1;
        Boolean bool = Boolean.TRUE;
        dc6.K = bool;
        dc6.L = null;
        dc6.M = null;
        dc6.N = null;
        dc6.O = null;
        dc6.P = bool;
        dc6.Q = bool;
        dc6.R = gb6;
        dc6.S = valueOf;
        dc6.T = null;
        dc6.g0 = 1;
        dc6.U = null;
        dc6.V = null;
        dc6.W = valueOf;
        dc6.X = null;
        dc6.Y = valueOf;
        dc6.h0 = 1;
        dc6.i0 = 1;
        return dc6;
    }

    public final Object clone() {
        dc6 dc6 = (dc6) super.clone();
        pb6[] pb6Arr = this.D;
        if (pb6Arr != null) {
            dc6.D = (pb6[]) pb6Arr.clone();
        }
        return dc6;
    }
}
