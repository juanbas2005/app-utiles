package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: zd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zd extends wx3 implements sr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ je y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(je jeVar, int i) {
        super(0);
        this.x = i;
        this.y = jeVar;
    }

    public final Object b() {
        Method method;
        int i = 0;
        switch (this.x) {
            case b85.b:
                Boolean bool = (Boolean) this.y.K.getValue();
                bool.getClass();
                return bool;
            case 1:
                this.y.getAndroidViewsHandler();
                return vs7.a;
            case 2:
                za4 za4 = new za4(new ab4(this.y.getConfiguration().getLocales()));
                if (za4.b()) {
                    za4 = new za4(new ab4(LocaleList.getDefault()));
                }
                ab4 ab4 = za4.a;
                int size = ab4.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale locale = ab4.a.get(i);
                    locale.getClass();
                    arrayList.add(new xa4(locale));
                    i++;
                }
                return new ya4(arrayList);
            case 3:
                d63 d63 = je.b1;
                je jeVar = this.y;
                if (Build.VERSION.SDK_INT > 28 && jeVar.isAttachedToWindow()) {
                    if (je.g1 == null) {
                        ka kaVar = new ka(1);
                        je.g1 = kaVar;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (je.c1 == null) {
                                je.c1 = Class.forName("android.os.SystemProperties");
                            }
                            if (je.e1 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = je.c1;
                                if (cls != null) {
                                    method = cls.getDeclaredMethod("addChangeCallback", new Class[]{Runnable.class});
                                } else {
                                    method = null;
                                }
                                je.e1 = method;
                            }
                            Method method2 = je.e1;
                            if (method2 != null) {
                                method2.invoke((Object) null, new Object[]{kaVar});
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    lp4 lp4 = je.f1;
                    synchronized (lp4) {
                        lp4.a(jeVar);
                    }
                }
                return vs7.a;
            default:
                je jeVar2 = this.y;
                MotionEvent motionEvent = jeVar2.G0;
                if (motionEvent != null) {
                    boolean contains = sg3.E(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = jeVar2.G0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (contains && i != 0) {
                        jeVar2.H0 = SystemClock.uptimeMillis();
                        jeVar2.post(jeVar2.O0);
                    }
                }
                jeVar2.U0.b();
                return vs7.a;
        }
    }
}
