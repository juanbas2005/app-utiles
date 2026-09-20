package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import cu.lestebang.utiletecsa.widget.DatosWidgetProvider;

/* renamed from: dj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dj1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ DatosWidgetProvider C;
    public final /* synthetic */ Context D;
    public final /* synthetic */ BroadcastReceiver.PendingResult E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj1(DatosWidgetProvider datosWidgetProvider, Context context, BroadcastReceiver.PendingResult pendingResult, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = datosWidgetProvider;
        this.D = context;
        this.E = pendingResult;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((dj1) o(f61, o81)).s(vs7);
            default:
                return ((dj1) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new dj1(this.C, this.D, this.E, f612, 0);
            default:
                return new dj1(this.C, this.D, this.E, f61, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (cu.lestebang.utiletecsa.widget.DatosWidgetProvider.a(r3, r2, r10) == r5) goto L_0x0070;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Context context = this.D;
        DatosWidgetProvider datosWidgetProvider = this.C;
        p81 p81 = p81.w;
        BroadcastReceiver.PendingResult pendingResult = this.E;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    k40 k40 = datosWidgetProvider.c;
                    if (k40 != null) {
                        this.B = 1;
                        if (((c50) k40).g(this) == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("balanceRepository");
                        throw null;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                } else if (i2 == 2) {
                    try {
                        o85.q(obj);
                        pendingResult.finish();
                        return vs7;
                    } catch (Throwable th) {
                        pendingResult.finish();
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (DatosWidgetProvider.a(datosWidgetProvider, context, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        pendingResult.finish();
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pendingResult.finish();
                return vs7;
        }
    }
}
