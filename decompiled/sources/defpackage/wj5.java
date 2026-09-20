package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: wj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj5 {
    public final e81 a;
    public final Context b;
    public final hj6 c;
    public final ya4 d;
    public final qq4 e = new qq4();
    public TextClassifier f;
    public final ed5 g = u55.p((Object) null);
    public final Object h = new Object();

    public wj5(e81 e81, Context context, hj6 hj6, ya4 ya4) {
        this.a = e81;
        this.b = context;
        this.c = hj6;
        this.d = ya4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f A[SYNTHETIC, Splitter:B:21:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public static final Object a(wj5 wj5, CharSequence charSequence, long j, TextClassifier textClassifier, h61 h61) {
        uj5 uj5;
        int i;
        oq4 oq4;
        qq4 qq4;
        uc7 uc7;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        long j2;
        qq4 qq42;
        Object obj;
        uc7 uc72;
        p81 p81;
        Object obj2;
        Object a2;
        boolean z;
        wj5 wj52 = wj5;
        h61 h612 = h61;
        qq4 qq43 = wj52.e;
        ed5 ed5 = wj52.g;
        if (h612 instanceof uj5) {
            uj5 = (uj5) h612;
            int i2 = uj5.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj5.F = i2 - Integer.MIN_VALUE;
                Object obj3 = uj5.D;
                i = uj5.F;
                vs7 vs7 = vs7.a;
                p81 p812 = p81.w;
                if (i != 0) {
                    o85.q(obj3);
                    CharSequence charSequence3 = charSequence;
                    uj5.z = charSequence3;
                    TextClassifier textClassifier3 = textClassifier;
                    uj5.A = textClassifier3;
                    uj5.B = qq43;
                    j2 = j;
                    uj5.C = j2;
                    uj5.F = 1;
                    if (qq43.a(uj5) == p812) {
                        return p812;
                    }
                    charSequence2 = charSequence3;
                    textClassifier2 = textClassifier3;
                    qq42 = qq43;
                } else if (i == 1) {
                    j2 = uj5.C;
                    qq42 = uj5.B;
                    textClassifier2 = pa4.i(uj5.A);
                    charSequence2 = (CharSequence) uj5.z;
                    o85.q(obj3);
                } else if (i == 2) {
                    uc7 = (uc7) uj5.z;
                    o85.q(obj3);
                    qq4 = null;
                    oq4 = (oq4) uj5.A;
                    ed5.setValue(uc7);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uc72 = (uc7) ed5.getValue();
                if (uc72 == null) {
                    try {
                        t37 t37 = xj5.a;
                        p81 = p812;
                        if (!lg7.b(j2, uc72.b) || !sg3.e(charSequence2, uc72.a)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            qq42.k((Object) null);
                            return vs7;
                        }
                        obj2 = null;
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                        qq42.k(obj);
                        throw th;
                    }
                } else {
                    p81 = p812;
                    obj2 = null;
                }
                qq42.k(obj2);
                tj5.q();
                uc7 = wj52.b(charSequence2, j2, textClassifier2.classifyText(tj5.h(charSequence2, lg7.f(j2), lg7.e(j2)).setDefaultLocales(wj52.c()).build()));
                uj5.z = uc7;
                uj5.A = qq43;
                qq4 = null;
                uj5.B = qq4;
                uj5.F = 2;
                a2 = qq43.a(uj5);
                oq4 = qq43;
                if (a2 == p81) {
                    return p81;
                }
                ed5.setValue(uc7);
                return vs7;
            }
        }
        uj5 = new uj5(wj52, h612);
        Object obj32 = uj5.D;
        i = uj5.F;
        vs7 vs72 = vs7.a;
        p81 p8122 = p81.w;
        if (i != 0) {
        }
        try {
            uc72 = (uc7) ed5.getValue();
            if (uc72 == null) {
            }
            qq42.k(obj2);
            tj5.q();
            uc7 = wj52.b(charSequence2, j2, textClassifier2.classifyText(tj5.h(charSequence2, lg7.f(j2), lg7.e(j2)).setDefaultLocales(wj52.c()).build()));
            uj5.z = uc7;
            uj5.A = qq43;
            qq4 = null;
            uj5.B = qq4;
            uj5.F = 2;
            a2 = qq43.a(uj5);
            oq4 = qq43;
            if (a2 == p81) {
            }
            try {
                ed5.setValue(uc7);
                return vs72;
            } finally {
                oq4.k(qq4);
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
            qq42.k(obj);
            throw th;
        }
    }

    public final uc7 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon g2;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction e2 = pc7.e(obj);
            Drawable drawable = null;
            if (i != 0 && !e2.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction e3 = pc7.e(obj);
            if (!(e3 == null || (g2 = e3.getIcon()) == null)) {
                drawable = g2.loadDrawable(this.b);
            }
            arrayList.add(drawable);
        }
        return new uc7(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        ya4 ya4 = this.d;
        if (ya4 == null) {
            return new LocaleList(new Locale[]{((xa4) kj5.a.G().w.get(0)).a});
        }
        ArrayList arrayList = new ArrayList(et0.e0(ya4, 10));
        for (xa4 xa4 : ya4.w) {
            arrayList.add(xa4.a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
