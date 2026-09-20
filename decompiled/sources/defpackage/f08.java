package defpackage;

/* renamed from: f08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f08 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ f08(je2 je2) {
        this.w = 27;
    }

    public final Object y(Object obj) {
        int i = this.w;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                si1 si1 = (si1) obj;
                si1.getClass();
                si1.a("z");
                return vs7;
            case 1:
                si1 si12 = (si1) obj;
                si12.getClass();
                ar7.L(si12, "Z", new f08(3));
                return vs7;
            case 2:
                si1 si13 = (si1) obj;
                si13.getClass();
                si1.m(si13);
                ar7.l(si13, ':');
                si1.l(si13);
                ar7.L(si13, "", new ha7(26));
                return vs7;
            case 3:
                si1 si14 = (si1) obj;
                si14.getClass();
                si1.m(si14);
                ar7.L(si14, "", new f08(4));
                return vs7;
            case 4:
                si1 si15 = (si1) obj;
                si15.getClass();
                si1.l(si15);
                ar7.L(si15, "", new ha7(27));
                return vs7;
            case 5:
                ul3 ul3 = (ul3) obj;
                ul3.getClass();
                ul3.b = true;
                ul3.a = false;
                return vs7;
            case 6:
                return new kl(((Float) obj).floatValue());
            case 7:
                return new kl((float) ((Integer) obj).intValue());
            case 8:
                return Integer.valueOf((int) ((kl) obj).a);
            case 9:
                return new kl(((lx1) obj).w);
            case 10:
                return new lx1(((kl) obj).a);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ox1 ox1 = (ox1) obj;
                return new ll(ox1.a(ox1.a), ox1.b(ox1.a));
            case 12:
                ll llVar = (ll) obj;
                float f = llVar.a;
                return new ox1((((long) Float.floatToRawIntBits(llVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                wu6 wu6 = (wu6) obj;
                return new ll(Float.intBitsToFloat((int) (wu6.a >> 32)), Float.intBitsToFloat((int) (wu6.a & 4294967295L)));
            case 14:
                ll llVar2 = (ll) obj;
                float f2 = llVar2.a;
                return new wu6((((long) Float.floatToRawIntBits(llVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
            case h75.g /*15*/:
                l35 l35 = (l35) obj;
                return new ll(Float.intBitsToFloat((int) (l35.a >> 32)), Float.intBitsToFloat((int) (l35.a & 4294967295L)));
            case 16:
                ll llVar3 = (ll) obj;
                float f3 = llVar3.a;
                return new l35((((long) Float.floatToRawIntBits(llVar3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
            case 17:
                long j = ((oe3) obj).a;
                return new ll((float) ((int) (j >> 32)), (float) ((int) (j & 4294967295L)));
            case 18:
                ll llVar4 = (ll) obj;
                return new oe3((((long) Math.round(llVar4.b)) & 4294967295L) | (((long) Math.round(llVar4.a)) << 32));
            case 19:
                long j2 = ((we3) obj).a;
                return new ll((float) ((int) (j2 >> 32)), (float) ((int) (j2 & 4294967295L)));
            case 20:
                ll llVar5 = (ll) obj;
                int round = Math.round(llVar5.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(llVar5.b);
                if (round2 >= 0) {
                    i2 = round2;
                }
                return new we3((((long) round) << 32) | (((long) i2) & 4294967295L));
            case 21:
                ly5 ly5 = (ly5) obj;
                return new nl(ly5.a, ly5.b, ly5.c, ly5.d);
            case 22:
                nl nlVar = (nl) obj;
                return new ly5(nlVar.a, nlVar.b, nlVar.c, nlVar.d);
            case 23:
                return Float.valueOf(((kl) obj).a);
            case 24:
                return ((gb3) obj).toString();
            case 25:
                return ((hb3) obj).toString();
            case 26:
                mk6.i((ok6) obj);
                return vs7;
            case 27:
                return new c98((d98) obj);
            case 28:
                return ((ib8) obj).g;
            default:
                return ((ib8) obj).e;
        }
    }

    public /* synthetic */ f08(int i) {
        this.w = i;
    }
}
