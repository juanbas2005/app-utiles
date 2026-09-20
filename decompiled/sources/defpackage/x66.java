package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.widget.ResumenWidgetProvider;

/* renamed from: x66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x66 extends h61 {
    public String A;
    public String B;
    public String C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ResumenWidgetProvider E;
    public int F;
    public Context z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x66(ResumenWidgetProvider resumenWidgetProvider, h61 h61) {
        super(h61);
        this.E = resumenWidgetProvider;
    }

    public final Object s(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return ResumenWidgetProvider.a(this.E, (Context) null, this);
    }
}
