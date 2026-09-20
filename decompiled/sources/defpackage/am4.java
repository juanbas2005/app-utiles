package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.Calendar;

/* renamed from: am4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am4 extends BaseAdapter {
    public static final int d = a08.c((Calendar) null).getMaximum(4);
    public static final int e = ((a08.c((Calendar) null).getMaximum(7) + a08.c((Calendar) null).getMaximum(5)) - 1);
    public final zl4 a;
    public qc3 b;
    public final sh0 c;

    public am4(zl4 zl4, sh0 sh0) {
        this.a = zl4;
        this.c = sh0;
        throw null;
    }

    public final int a() {
        int i = this.c.A;
        zl4 zl4 = this.a;
        Calendar calendar = zl4.w;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + zl4.z;
        }
        return i3;
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        Calendar a2 = a08.a(this.a.w);
        a2.set(5, (i - a()) + 1);
        return Long.valueOf(a2.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.A) - 1;
    }

    public final int getCount() {
        return e;
    }

    public final long getItemId(int i) {
        return (long) (i / this.a.z);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new qc3(context, 22);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a2 = i - a();
        if (a2 >= 0) {
            zl4 zl4 = this.a;
            if (a2 < zl4.A) {
                textView.setTag(zl4);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(a2 + 1)}));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                a08.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            a08.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
