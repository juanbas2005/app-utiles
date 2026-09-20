package defpackage;

import android.os.Build;
import android.service.quicksettings.Tile;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService;

/* renamed from: b23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b23 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public boolean B;
    public int C;
    public Object D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b23(c23 c23, String str, boolean z, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.D = c23;
        this.E = str;
        this.B = z;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((b23) o(f61, o81)).s(vs7);
            case 1:
                return ((b23) o(f61, o81)).s(vs7);
            case 2:
                return ((b23) o(f61, o81)).s(vs7);
            default:
                return ((b23) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.E;
        switch (i) {
            case b85.b /*0*/:
                return new b23((c23) this.D, (String) obj2, this.B, f61);
            case 1:
                return new b23((NautaTileService) obj2, f61);
            case 2:
                return new b23((uj) this.D, this.B, (hl) obj2, f61, 2);
            default:
                return new b23((dy7) this.D, this.B, (String) obj2, f61, 3);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        if (r15 == r4) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        if (r14 == r4) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0106, code lost:
        r14 = defpackage.o66.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        if (r14 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        r15 = cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService.D;
        r14 = r14.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0112, code lost:
        if (r14 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        r14 = r2.getString(cu.lestebang.utiletecsa.R.string.tile_error);
        r14.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011b, code lost:
        android.widget.Toast.makeText(r2, r14, 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        if (r15 == r4) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        r14 = (defpackage.yb5) defpackage.dt0.y0((java.util.List) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        if (r14 != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015b, code lost:
        r14 = cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService.D;
        r14 = r2.getPackageManager().getLaunchIntentForPackage(r2.getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0169, code lost:
        if (r14 != null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016d, code lost:
        r14.addFlags(805306368);
        r14.putExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 34) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017d, code lost:
        r2.startActivityAndCollapse(android.app.PendingIntent.getActivity(r2, 0, r14, 201326592));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0187, code lost:
        r2.startActivityAndCollapse(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018b, code lost:
        r15 = r2.getString(cu.lestebang.utiletecsa.R.string.tile_connecting);
        r15.getClass();
        r3 = r2.getQsTile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0199, code lost:
        if (r3 != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a0, code lost:
        r3.setSubtitle(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a3, code lost:
        r3.updateTile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a6, code lost:
        r15 = r2.c();
        r11.D = null;
        r11.C = 4;
        r14 = ((defpackage.gs4) r15).e((java.lang.String) r14.w, (java.lang.String) r14.x, false, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bd, code lost:
        if (r14 != r4) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c0, code lost:
        r14 = defpackage.o66.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c4, code lost:
        if (r14 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c6, code lost:
        r15 = cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService.D;
        r14 = r14.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cc, code lost:
        if (r14 != null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ce, code lost:
        r14 = r2.getString(cu.lestebang.utiletecsa.R.string.tile_error);
        r14.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d5, code lost:
        android.widget.Toast.makeText(r2, r14, 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01dc, code lost:
        r14 = ((defpackage.gs4) r2.c()).h();
        r11.D = r2;
        r11.C = 5;
        r15 = defpackage.gr8.H(r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ef, code lost:
        if (r15 != r4) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f2, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f3, code lost:
        r15 = ((java.lang.Boolean) r15).booleanValue();
        r2 = ((defpackage.gs4) r2.c()).g();
        r11.D = r14;
        r11.B = r15;
        r11.C = 6;
        r0 = defpackage.gr8.H(r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020d, code lost:
        if (r0 != r4) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0211, code lost:
        r13 = r0;
        r0 = r14;
        r14 = r15;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0215, code lost:
        cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService.b(r0, r14, (java.lang.String) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return r4;
     */
    public final Object s(Object obj) {
        Object obj2;
        float f;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj3 = this.E;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    this.C = 1;
                    if (((c23) this.D).d.n((String) obj3, !this.B, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                NautaTileService nautaTileService = (NautaTileService) obj3;
                switch (this.C) {
                    case b85.b /*0*/:
                        o85.q(obj);
                        di2 h = ((gs4) nautaTileService.c()).h();
                        this.C = 1;
                        obj = gr8.H(h, this);
                        break;
                    case 1:
                        o85.q(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            gs4 gs4 = (gs4) nautaTileService.c();
                            o40 o40 = new o40(6, t49.E(gs4.b.a.a, false, new String[]{"nauta_accounts"}, new tm3(22)), gs4);
                            this.C = 3;
                            obj = gr8.H(o40, this);
                            break;
                        } else {
                            String string = nautaTileService.getString(R.string.tile_disconnecting);
                            string.getClass();
                            Tile qsTile = nautaTileService.getQsTile();
                            if (qsTile != null) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    qsTile.setSubtitle(string);
                                }
                                qsTile.updateTile();
                            }
                            ur4 c = nautaTileService.c();
                            this.C = 2;
                            obj2 = ((gs4) c).f(this);
                            break;
                        }
                    case 2:
                        o85.q(obj);
                        obj2 = ((o66) obj).w;
                        break;
                    case 3:
                        o85.q(obj);
                        break;
                    case 4:
                        yb5 yb5 = (yb5) ((NautaTileService) this.D);
                        o85.q(obj);
                        Object obj4 = ((o66) obj).w;
                        break;
                    case 5:
                        NautaTileService nautaTileService2 = (NautaTileService) this.D;
                        o85.q(obj);
                        break;
                    case 6:
                        boolean z = this.B;
                        NautaTileService nautaTileService3 = (NautaTileService) this.D;
                        o85.q(obj);
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 2:
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    uj ujVar = (uj) this.D;
                    if (this.B) {
                        f = 1.0f;
                    } else {
                        f = 0.8f;
                    }
                    this.C = 1;
                    if (uj.c(ujVar, new Float(f), (hl) obj3, (Float) null, (vr2) null, this, 12) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i4 = this.C;
                if (i4 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.D).a;
                    fq5 fq5 = new fq5(this.B, (String) obj3, (f61) null);
                    this.C = 1;
                    Object a = qe1.a(fq5, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b23(NautaTileService nautaTileService, f61 f61) {
        super(2, f61);
        this.A = 1;
        this.E = nautaTileService;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b23(Object obj, boolean z, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = obj;
        this.B = z;
        this.E = obj2;
    }
}
