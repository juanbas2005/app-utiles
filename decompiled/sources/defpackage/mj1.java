package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: mj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mj1 extends BaseAdapter {
    public static final int d;
    public final Calendar a;
    public final int b;
    public final int c;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        d = i;
    }

    public mj1() {
        Calendar c2 = a08.c((Calendar) null);
        this.a = c2;
        this.b = c2.getMaximum(7);
        this.c = c2.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.b;
    }

    public final Object getItem(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.c;
        int i3 = this.b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), new Object[]{calendar.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }

    public mj1(int i) {
        Calendar c2 = a08.c((Calendar) null);
        this.a = c2;
        this.b = c2.getMaximum(7);
        this.c = i;
    }
}
