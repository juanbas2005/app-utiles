package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* renamed from: ri  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ri {
    public final si a;
    public final pi b;
    public final pi c;
    public final View d;

    public ri(si siVar, pi piVar, pi piVar2, View view) {
        this.a = siVar;
        this.b = piVar;
        this.c = piVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        int i3;
        int i4;
        Menu menu2 = menu;
        yc7 yc7 = (yc7) this.b.b();
        int i5 = 0;
        if (sg3.e(yc7, (Object) null)) {
            return false;
        }
        menu2.clear();
        List list = yc7.a;
        int size = list.size();
        int i6 = 0;
        int i7 = 1;
        int i8 = 1;
        while (i6 < size) {
            xc7 xc7 = (xc7) list.get(i6);
            int i9 = 2;
            if (xc7 instanceof hd7) {
                i = i7 + 1;
                Object obj = xc7.a;
                if (sg3.e(obj, hj8.k)) {
                    i4 = 16908320;
                } else if (sg3.e(obj, hj8.l)) {
                    i4 = 16908321;
                } else if (sg3.e(obj, hj8.m)) {
                    i4 = 16908322;
                } else if (sg3.e(obj, hj8.n)) {
                    i4 = 16908319;
                } else if (sg3.e(obj, hj8.o)) {
                    i4 = 16908355;
                } else {
                    i4 = i7;
                }
                hd7 hd7 = (hd7) xc7;
                MenuItem add = menu2.add(i8, i4, i7, hd7.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new qi(i5, hd7, this));
            } else {
                if (xc7 instanceof nd7) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i7 + 1;
                        Context context = this.d.getContext();
                        nd7 nd7 = (nd7) xc7;
                        TextClassification textClassification = nd7.b;
                        int i10 = nd7.c;
                        Drawable drawable = nd7.d;
                        if (i10 < 0) {
                            MenuItem add2 = menu2.add(16908353, 16908353, i7, textClassification.getLabel());
                            add2.setShowAsAction(2);
                            add2.setIcon(drawable);
                            add2.setOnMenuItemClickListener(new qi(1, context, textClassification));
                        } else {
                            if (i10 == 0) {
                                i2 = 1;
                            } else {
                                i2 = i5;
                            }
                            RemoteAction e = pc7.e(textClassification.getActions().get(i10));
                            if (i2 != 0) {
                                i3 = 16908353;
                            } else {
                                i3 = i5;
                            }
                            MenuItem add3 = menu2.add(16908353, i3, i7, e.getTitle());
                            if (i2 == 0) {
                                i9 = 0;
                            }
                            add3.setShowAsAction(i9);
                            if (drawable != null) {
                                add3.setIcon(drawable);
                            }
                            add3.setOnMenuItemClickListener(new vg7(e));
                        }
                    }
                } else if (xc7 instanceof ld7) {
                    i8++;
                }
                i6++;
                i5 = 0;
            }
            i7 = i;
            i6++;
            i5 = 0;
        }
        return true;
    }
}
