package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jg4 extends az5 {
    public final /* synthetic */ c a;
    public final /* synthetic */ kg4 b;

    public jg4(kg4 kg4, c cVar) {
        this.b = kg4;
        this.a = cVar;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        sh0 sh0 = this.a.d;
        kg4 kg4 = this.b;
        RecyclerView recyclerView2 = kg4.A0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            if (N0 == null) {
                i3 = -1;
            } else {
                i3 = xy5.H(N0);
            }
        } else {
            i3 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).L0();
        }
        Calendar a2 = a08.a(sh0.w.w);
        a2.add(2, i3);
        zl4 zl4 = new zl4(a2);
        kg4.w0 = zl4;
        MaterialButton materialButton = kg4.F0;
        Calendar a3 = a08.a(sh0.w.w);
        a3.add(2, i3);
        a3.set(5, 1);
        Calendar a4 = a08.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = a08.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        kg4.R(sh0.w.d(zl4));
    }
}
