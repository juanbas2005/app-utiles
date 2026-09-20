package defpackage;

import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.shortcuts.UssdShortcutActivity;
import cu.lestebang.utiletecsa.widget.LteOnlyActivity;
import cu.lestebang.utiletecsa.widget.VpnToggleActivity;

/* renamed from: xn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xn implements b55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ xn(rv0 rv0, int i) {
        this.a = i;
        this.b = rv0;
    }

    public final void a(rv0 rv0) {
        int i = this.a;
        rv0 rv02 = this.b;
        switch (i) {
            case b85.b:
                yn ynVar = (yn) rv02;
                ko r = ynVar.r();
                r.c();
                ((kg5) ynVar.z.y).i("androidx:appcompat");
                r.e();
                return;
            case 1:
                LteOnlyActivity lteOnlyActivity = (LteOnlyActivity) rv02;
                if (!lteOnlyActivity.T) {
                    lteOnlyActivity.T = true;
                    lteOnlyActivity.U = (p7) ((pd1) ((od4) lteOnlyActivity.a())).a.S.get();
                    return;
                }
                return;
            case 2:
                MainActivity mainActivity = (MainActivity) rv02;
                if (!mainActivity.Z) {
                    mainActivity.Z = true;
                    vd1 vd1 = ((pd1) ((oe4) mainActivity.a())).a;
                    mainActivity.b0 = (az4) vd1.N.get();
                    mainActivity.c0 = (f91) vd1.O.get();
                    return;
                }
                return;
            case 3:
                UssdShortcutActivity ussdShortcutActivity = (UssdShortcutActivity) rv02;
                if (!ussdShortcutActivity.T) {
                    ussdShortcutActivity.T = true;
                    vd1 vd12 = ((pd1) ((zz7) ussdShortcutActivity.a())).a;
                    ussdShortcutActivity.U = (nz7) vd12.m.get();
                    ussdShortcutActivity.V = (vp6) vd12.x.get();
                    ussdShortcutActivity.W = (rg5) vd12.P.get();
                    return;
                }
                return;
            default:
                VpnToggleActivity vpnToggleActivity = (VpnToggleActivity) rv02;
                if (!vpnToggleActivity.T) {
                    vpnToggleActivity.T = true;
                    vd1 vd13 = ((pd1) ((d88) vpnToggleActivity.a())).a;
                    vpnToggleActivity.U = (p7) vd13.S.get();
                    vpnToggleActivity.V = (v78) vd13.L.get();
                    return;
                }
                return;
        }
    }
}
