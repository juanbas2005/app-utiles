package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* renamed from: fg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fg4 implements View.OnClickListener {
    public final /* synthetic */ int w;
    public final Object x;
    public final /* synthetic */ Object y;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, x7] */
    public fg4(sj7 sj7) {
        this.w = 2;
        this.y = sj7;
        Context context = sj7.a.getContext();
        CharSequence charSequence = sj7.h;
        ? obj = new Object();
        obj.e = 4096;
        obj.g = 4096;
        obj.l = null;
        obj.m = null;
        obj.n = false;
        obj.o = false;
        obj.p = 16;
        obj.i = context;
        obj.a = charSequence;
        this.x = obj;
    }

    public final void onClick(View view) {
        int i;
        int i2 = this.w;
        Object obj = this.x;
        Object obj2 = this.y;
        switch (i2) {
            case b85.b:
                kg4 kg4 = (kg4) obj2;
                Calendar a = a08.a(((c) obj).d.w.w);
                a.add(2, ((LinearLayoutManager) kg4.A0.getLayoutManager()).L0() - 1);
                kg4.P(new zl4(a));
                return;
            case 1:
                kg4 kg42 = (kg4) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kg42.A0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                if (N0 == null) {
                    i = -1;
                } else {
                    i = xy5.H(N0);
                }
                Calendar a2 = a08.a(((c) obj).d.w.w);
                a2.add(2, i + 1);
                kg42.P(new zl4(a2));
                return;
            default:
                sj7 sj7 = (sj7) obj2;
                Window.Callback callback = sj7.k;
                if (callback != null && sj7.l) {
                    callback.onMenuItemSelected(0, (x7) obj);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fg4(kg4 kg4, c cVar, int i) {
        this.w = i;
        this.y = kg4;
        this.x = cVar;
    }
}
