package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: fq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fq2 extends AnimationSet implements Runnable {
    public boolean A = true;
    public final ViewGroup w;
    public final View x;
    public boolean y;
    public boolean z;

    public fq2(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.w = viewGroup;
        this.x = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        this.A = true;
        if (this.y) {
            return !this.z;
        }
        if (!super.getTransformation(j, transformation)) {
            this.y = true;
            q55.a(this.w, this);
        }
        return true;
    }

    public final void run() {
        boolean z2 = this.y;
        ViewGroup viewGroup = this.w;
        if (z2 || !this.A) {
            viewGroup.endViewTransition(this.x);
            this.z = true;
            return;
        }
        this.A = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.A = true;
        if (this.y) {
            return !this.z;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.y = true;
            q55.a(this.w, this);
        }
        return true;
    }
}
