package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.Locale;

/* renamed from: kf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kf8 extends py5 {
    public final kg4 d;

    public kf8(kg4 kg4) {
        this.d = kg4;
    }

    public final int a() {
        return this.d.v0.B;
    }

    public final void c(lz5 lz5, int i) {
        String str;
        kg4 kg4 = this.d;
        int i2 = kg4.v0.w.y + i;
        TextView textView = ((jf8) lz5).u;
        textView.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        Context context = textView.getContext();
        if (a08.b().get(1) == i2) {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i2)});
        } else {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i2)});
        }
        textView.setContentDescription(str);
        qc3 qc3 = kg4.y0;
        if (a08.b().get(1) == i2) {
            Object obj = qc3.y;
        } else {
            Object obj2 = qc3.x;
        }
        throw null;
    }

    public final lz5 d(ViewGroup viewGroup) {
        return new jf8((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
