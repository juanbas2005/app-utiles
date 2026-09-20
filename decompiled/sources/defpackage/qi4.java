package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: qi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qi4 extends BaseAdapter {
    public final ti4 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public qi4(ti4 ti4, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = ti4;
        this.f = i;
        a();
    }

    public final void a() {
        ti4 ti4 = this.a;
        yi4 yi4 = ti4.v;
        if (yi4 != null) {
            ti4.i();
            ArrayList arrayList = ti4.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((yi4) arrayList.get(i)) == yi4) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    /* renamed from: b */
    public final yi4 getItem(int i) {
        ArrayList arrayList;
        boolean z = this.d;
        ti4 ti4 = this.a;
        if (z) {
            ti4.i();
            arrayList = ti4.j;
        } else {
            arrayList = ti4.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (yi4) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        boolean z = this.d;
        ti4 ti4 = this.a;
        if (z) {
            ti4.i();
            arrayList = ti4.j;
        } else {
            arrayList = ti4.l();
        }
        if (this.b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        sj4 sj4 = (sj4) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        sj4.c(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
