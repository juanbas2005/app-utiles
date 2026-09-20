package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: xc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xc extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(Object obj, Object obj2, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        Object obj = this.D;
        switch (i) {
            case b85.b:
                return new xc((bd) this.C, (hs2) obj, f61, 0);
            case 1:
                return new xc((ui) this.C, (zc7) obj, f61, 1);
            case 2:
                return new xc((a) this.C, (UserSession) obj, f61, 2);
            case 3:
                return new xc((p60) this.C, (o60) obj, f61, 3);
            case 4:
                return new xc((jf1) obj, f61, 4);
            default:
                return new xc((fd2) obj, f61, 5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        defpackage.ed1.i(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        throw r2;
     */
    public final Object s(Object obj) {
        Looper looper;
        Looper looper2;
        ri riVar;
        Looper looper3;
        y27 y27;
        Throwable th;
        Throwable th2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj2 = this.D;
        switch (i) {
            case b85.b:
                bd bdVar = (bd) this.C;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    wc wcVar = new wc(bdVar, 2);
                    p0 p0Var = new p0((Object) (hs2) obj2, (Object) bdVar, (f61) null, 5);
                    this.B = 1;
                    if (rc.c(wcVar, p0Var, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ll1 b = bdVar.b();
                ad5 ad5 = bdVar.j;
                Object a = b.a(ad5.d());
                if (a == null) {
                    return vs7;
                }
                if (Math.abs(ad5.d() - bdVar.b().c(a)) >= 0.5f || !((Boolean) bdVar.a.y(a)).booleanValue()) {
                    return vs7;
                }
                bdVar.h.setValue(a);
                bdVar.f(a);
                return vs7;
            case 1:
                ui uiVar = (ui) this.C;
                cy6 cy6 = uiVar.e;
                View view = uiVar.a;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    si siVar = new si();
                    zc7 zc7 = (zc7) obj2;
                    ri riVar2 = new ri(siVar, new pi(uiVar, zc7, 0), new pi(uiVar, zc7, 1), view);
                    vr2 vr2 = uiVar.b;
                    if (!(vr2 == null || (riVar = (ri) vr2.y(riVar2)) == null)) {
                        riVar2 = riVar;
                    }
                    Looper myLooper = Looper.myLooper();
                    Handler handler = view.getHandler();
                    if (handler != null) {
                        looper2 = handler.getLooper();
                    } else {
                        looper2 = null;
                    }
                    if (myLooper != looper2) {
                        ti tiVar = uiVar.i;
                        if (tiVar == null) {
                            tiVar = new ti(uiVar, riVar2, siVar, 0);
                            uiVar.i = tiVar;
                        }
                        view.post(tiVar);
                    } else {
                        ActionMode startActionMode = view.startActionMode(new bi2(riVar2), 1);
                        if (startActionMode == null) {
                            return vs7;
                        }
                        uiVar.h = startActionMode;
                    }
                    this.B = 1;
                    ad0 ad0 = siVar.a;
                    ad0.getClass();
                    Object J = ad0.J(ad0, this);
                    if (J != p81) {
                        J = vs7;
                    }
                    if (J == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        cy6.a();
                        Looper myLooper2 = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (handler2 != null) {
                            looper3 = handler2.getLooper();
                        } else {
                            looper3 = null;
                        }
                        if (myLooper2 != looper3) {
                            Runnable runnable = uiVar.j;
                            if (runnable == null) {
                                runnable = new y0(3, uiVar);
                                uiVar.j = runnable;
                            }
                            view.post(runnable);
                        } else {
                            ActionMode actionMode = uiVar.h;
                            if (actionMode != null) {
                                actionMode.finish();
                            }
                        }
                        ti tiVar2 = uiVar.i;
                        if (tiVar2 != null) {
                            view.removeCallbacks(tiVar2);
                        }
                        uiVar.h = null;
                        throw th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cy6.a();
                Looper myLooper3 = Looper.myLooper();
                Handler handler3 = view.getHandler();
                if (handler3 != null) {
                    looper = handler3.getLooper();
                } else {
                    looper = null;
                }
                if (myLooper3 != looper) {
                    Runnable runnable2 = uiVar.j;
                    if (runnable2 == null) {
                        runnable2 = new y0(3, uiVar);
                        uiVar.j = runnable2;
                    }
                    view.post(runnable2);
                } else {
                    ActionMode actionMode2 = uiVar.h;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                }
                ti tiVar3 = uiVar.i;
                if (tiVar3 != null) {
                    view.removeCallbacks(tiVar3);
                }
                uiVar.h = null;
                return vs7;
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    a aVar = (a) this.C;
                    boolean z = aVar.c.v;
                    this.B = 1;
                    if (a.l(aVar, (UserSession) obj2, z, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 3:
                o60 o60 = (o60) obj2;
                ed5 ed5 = ((p60) this.C).c;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ed5.setValue(o60);
                    this.B = 1;
                    ad0 ad02 = o60.b;
                    ad02.getClass();
                    Object J2 = ad0.J(ad02, this);
                    if (J2 != p81) {
                        J2 = vs7;
                    }
                    if (J2 == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th4) {
                        ed5.setValue((Object) null);
                        throw th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ed5.setValue((Object) null);
                return vs7;
            case 4:
                jf1 jf1 = (jf1) obj2;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = jf1.h(jf1, true, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th5) {
                        cf3 i7 = jf1.i();
                        this.C = th5;
                        this.B = 2;
                        Object a2 = i7.a(this);
                        if (a2 == p81) {
                            return p81;
                        }
                        Throwable th6 = th5;
                        obj = a2;
                        th = th6;
                    }
                } else if (i6 == 2) {
                    th = (Throwable) this.C;
                    o85.q(obj);
                    y27 = new lw5(th, ((Number) obj).intValue());
                    return new yb5(y27, Boolean.TRUE);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y27 = (y27) obj;
                return new yb5(y27, Boolean.TRUE);
            default:
                fd2 fd2 = (fd2) obj2;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    try {
                        fileInputStream2 = new FileInputStream(fd2.a);
                        tl6 tl6 = fd2.b;
                        this.C = fileInputStream2;
                        this.B = 1;
                        obj = tl6.M(fileInputStream2);
                        if (obj == p81) {
                            return p81;
                        }
                    } catch (FileNotFoundException unused) {
                        File file = fd2.a;
                        tl6 tl62 = fd2.b;
                        if (!file.exists()) {
                            return tl62.l();
                        }
                        try {
                            FileInputStream fileInputStream3 = new FileInputStream(fd2.a);
                            try {
                                this.C = fileInputStream3;
                                this.B = 2;
                                Object M = tl62.M(fileInputStream3);
                                if (M == p81) {
                                    return p81;
                                }
                                FileInputStream fileInputStream4 = fileInputStream3;
                                obj = M;
                                fileInputStream = fileInputStream4;
                            } catch (Throwable th7) {
                                FileInputStream fileInputStream5 = fileInputStream3;
                                th2 = th7;
                                fileInputStream = fileInputStream5;
                                throw th2;
                            }
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof FileNotFoundException) {
                                e = ar7.f0(fd2.a.getParent(), (FileNotFoundException) e);
                            }
                            throw e;
                        } catch (Throwable th8) {
                            ed1.i(fileInputStream, th2);
                            throw th8;
                        }
                    }
                } else if (i8 == 1) {
                    fileInputStream2 = (FileInputStream) this.C;
                    o85.q(obj);
                } else if (i8 == 2) {
                    fileInputStream = (FileInputStream) this.C;
                    try {
                        o85.q(obj);
                        ed1.i(fileInputStream, (Throwable) null);
                        return obj;
                    } catch (Throwable th9) {
                        th2 = th9;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ed1.i(fileInputStream2, (Throwable) null);
                return obj;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((xc) l(f61)).s(vs7);
            case 1:
                return ((xc) l(f61)).s(vs7);
            case 2:
                return ((xc) l(f61)).s(vs7);
            case 3:
                return ((xc) l(f61)).s(vs7);
            case 4:
                return ((xc) l(f61)).s(vs7);
            default:
                return ((xc) l(f61)).s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(Object obj, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.D = obj;
    }
}
