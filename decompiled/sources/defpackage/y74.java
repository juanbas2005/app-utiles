package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: y74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y74 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ z74 b;

    public y74(z74 z74) {
        this.b = z74;
        a();
    }

    public final void a() {
        ti4 ti4 = this.b.y;
        yi4 yi4 = ti4.v;
        if (yi4 != null) {
            ti4.i();
            ArrayList arrayList = ti4.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((yi4) arrayList.get(i)) == yi4) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    /* renamed from: b */
    public final yi4 getItem(int i) {
        z74 z74 = this.b;
        ti4 ti4 = z74.y;
        ti4.i();
        ArrayList arrayList = ti4.j;
        z74.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (yi4) arrayList.get(i);
    }

    public final int getCount() {
        z74 z74 = this.b;
        ti4 ti4 = z74.y;
        ti4.i();
        int size = ti4.j.size();
        z74.getClass();
        if (this.a < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.x.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((sj4) view).c(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
