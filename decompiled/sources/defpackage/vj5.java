package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* renamed from: vj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vj5 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ long E;
    public Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vj5(long j, f61 f61, wj5 wj5, CharSequence charSequence) {
        super(2, f61);
        this.I = charSequence;
        this.E = j;
        this.H = wj5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((vj5) o((f61) obj2, pa4.i(obj))).s(vs7);
            default:
                return ((vj5) o((f61) obj2, (xh6) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case b85.b:
                vj5 vj5 = new vj5(this.E, f61, (wj5) obj3, (CharSequence) obj2);
                vj5.D = obj;
                return vj5;
            default:
                vj5 vj52 = new vj5((zh6) obj3, (g06) obj2, this.E, f61);
                vj52.D = obj;
                return vj52;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: wj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        long j;
        uc7 uc7;
        qq4 qq4;
        long j2;
        zh6 zh6;
        zh6 zh62;
        Object obj2;
        g06 g06;
        long j3;
        float f;
        int i = this.A;
        long j4 = this.E;
        Object obj3 = p81.w;
        Object obj4 = this.I;
        Object obj5 = this.H;
        switch (i) {
            case b85.b:
                CharSequence charSequence = (CharSequence) obj4;
                wj5 wj5 = (wj5) obj5;
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    TextClassifier i3 = pa4.i(this.D);
                    tj5.B();
                    TextSelection.Request.Builder l = tj5.m(charSequence, lg7.f(j4), lg7.e(j4)).setDefaultLocales(wj5.c());
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        l.setIncludeTextClassification(true);
                    }
                    TextSelection o = i3.suggestSelection(l.build());
                    long a = i95.a(o.getSelectionStartIndex(), o.getSelectionEndIndex());
                    if (i4 < 31 || o.getTextClassification() == null) {
                        this.B = a;
                        this.C = 2;
                        long j5 = a;
                        if (wj5.a((wj5) obj5, (CharSequence) obj4, j5, i3, this) == obj3) {
                            return obj3;
                        }
                        j = j5;
                        return new lg7(j);
                    }
                    TextClassification q = o.getTextClassification();
                    q.getClass();
                    uc7 = wj5.b(charSequence, a, q);
                    qq4 = wj5.e;
                    this.D = uc7;
                    this.F = qq4;
                    this.G = wj5;
                    this.B = a;
                    this.C = 1;
                    if (qq4.a(this) == obj3) {
                        return obj3;
                    }
                    j = a;
                } else if (i2 == 1) {
                    j = this.B;
                    wj5 = this.G;
                    qq4 = (qq4) this.F;
                    uc7 = (uc7) this.D;
                    o85.q(obj);
                } else if (i2 == 2) {
                    j = this.B;
                    o85.q(obj);
                    return new lg7(j);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    wj5.g.setValue(uc7);
                    return new lg7(j);
                } finally {
                    qq4.k((Object) null);
                }
            default:
                int i5 = this.C;
                z75 z75 = z75.x;
                if (i5 == 0) {
                    o85.q(obj);
                    zh6 zh63 = (zh6) obj5;
                    tc tcVar = new tc(1, zh63, (xh6) this.D);
                    g06 = (g06) obj4;
                    eh2 eh2 = zh63.c;
                    j2 = g06.w;
                    if (zh63.d == z75) {
                        f = x38.b(j4);
                    } else {
                        f = x38.c(j4);
                    }
                    float e = zh63.e(f);
                    this.D = zh63;
                    this.F = zh63;
                    this.G = g06;
                    this.B = j2;
                    this.C = 1;
                    obj2 = eh2.a(tcVar, e, this);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    zh62 = zh63;
                    zh6 = zh62;
                } else if (i5 == 1) {
                    long j6 = this.B;
                    g06 = (g06) this.G;
                    zh62 = (zh6) this.F;
                    zh6 = (zh6) this.D;
                    o85.q(obj);
                    j2 = j6;
                    obj2 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float e2 = zh6.e(((Number) obj2).floatValue());
                if (zh62.d == z75) {
                    j3 = x38.a(j2, e2, 0.0f, 2);
                } else {
                    j3 = x38.a(j2, 0.0f, e2, 1);
                }
                g06.w = j3;
                return vs7.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vj5(zh6 zh6, g06 g06, long j, f61 f61) {
        super(2, f61);
        this.H = zh6;
        this.I = g06;
        this.E = j;
    }
}
