package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.widget.SaldoWidgetProvider;

/* renamed from: ke6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ke6 extends h61 {
    public /* synthetic */ Object A;
    public final /* synthetic */ SaldoWidgetProvider B;
    public int C;
    public Context z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ke6(SaldoWidgetProvider saldoWidgetProvider, h61 h61) {
        super(h61);
        this.B = saldoWidgetProvider;
    }

    public final Object s(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return SaldoWidgetProvider.a(this.B, (Context) null, this);
    }
}
