package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: b87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b87 extends ActionMode {
    public final Context a;
    public final h8 b;

    public b87(Context context, h8 h8Var) {
        this.a = context;
        this.b = h8Var;
    }

    public final void finish() {
        this.b.b();
    }

    public final View getCustomView() {
        return this.b.c();
    }

    public final Menu getMenu() {
        return new uj4(this.a, this.b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public final CharSequence getSubtitle() {
        return this.b.h();
    }

    public final Object getTag() {
        return this.b.y;
    }

    public final CharSequence getTitle() {
        return this.b.i();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.x;
    }

    public final void invalidate() {
        this.b.j();
    }

    public final boolean isTitleOptional() {
        return this.b.k();
    }

    public final void setCustomView(View view) {
        this.b.m(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public final void setTag(Object obj) {
        this.b.y = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.q(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.b.r(z);
    }

    public final void setSubtitle(int i) {
        this.b.n(i);
    }

    public final void setTitle(int i) {
        this.b.p(i);
    }
}
