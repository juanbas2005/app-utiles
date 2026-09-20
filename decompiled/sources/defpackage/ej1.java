package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.widget.DatosWidgetProvider;

/* renamed from: ej1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ej1 extends h61 {
    public /* synthetic */ Object A;
    public final /* synthetic */ DatosWidgetProvider B;
    public int C;
    public Context z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ej1(DatosWidgetProvider datosWidgetProvider, h61 h61) {
        super(h61);
        this.B = datosWidgetProvider;
    }

    public final Object s(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return DatosWidgetProvider.a(this.B, (Context) null, this);
    }
}
