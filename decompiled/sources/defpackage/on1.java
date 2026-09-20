package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import cu.lestebang.utiletecsa.R;

/* renamed from: on1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class on1 extends in8 {
    public final boolean x;
    public boolean y;
    public jz0 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public on1(gz6 gz6, boolean z2) {
        super(gz6);
        gz6.getClass();
        this.x = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00e1 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1 A[SYNTHETIC, Splitter:B:73:0x00e1] */
    public final jz0 d1(Context context) {
        boolean z2;
        int i;
        int i2;
        jz0 jz0;
        int i3;
        if (this.y) {
            return this.z;
        }
        gz6 gz6 = (gz6) this.w;
        bq2 bq2 = gz6.c;
        if (gz6.a == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        aq2 aq2 = bq2.f0;
        if (aq2 == null) {
            i = 0;
        } else {
            i = aq2.f;
        }
        if (this.x) {
            if (z2) {
                if (aq2 != null) {
                    i2 = aq2.d;
                    bq2.N(0, 0, 0, 0);
                    ViewGroup viewGroup = bq2.b0;
                    jz0 jz02 = null;
                    if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
                        bq2.b0.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
                    }
                    ViewGroup viewGroup2 = bq2.b0;
                    if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                        if (i2 == 0 && i != 0) {
                            if (i != 4097) {
                                if (i != 8194) {
                                    if (i != 8197) {
                                        if (i != 4099) {
                                            if (i != 4100) {
                                                i3 = -1;
                                            } else if (z2) {
                                                i3 = b96.R(context, 16842936);
                                            } else {
                                                i3 = b96.R(context, 16842937);
                                            }
                                        } else if (z2) {
                                            i3 = R.animator.fragment_fade_enter;
                                        } else {
                                            i3 = R.animator.fragment_fade_exit;
                                        }
                                    } else if (z2) {
                                        i3 = b96.R(context, 16842938);
                                    } else {
                                        i3 = b96.R(context, 16842939);
                                    }
                                } else if (z2) {
                                    i3 = R.animator.fragment_close_enter;
                                } else {
                                    i3 = R.animator.fragment_close_exit;
                                }
                            } else if (z2) {
                                i3 = R.animator.fragment_open_enter;
                            } else {
                                i3 = R.animator.fragment_open_exit;
                            }
                            i2 = i3;
                        }
                        if (i2 != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
                                    if (loadAnimation != null) {
                                        jz0 = new jz0(26, (Object) loadAnimation);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException ) {
                                }
                            } else {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                                    if (loadAnimator != null) {
                                        jz0 = new jz0(loadAnimator);
                                    }
                                } catch (RuntimeException e2) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                                        if (loadAnimation2 != null) {
                                            jz02 = new jz0(26, (Object) loadAnimation2);
                                        }
                                    } else {
                                        throw e2;
                                    }
                                }
                            }
                            jz02 = jz0;
                        }
                    }
                    this.z = jz02;
                    this.y = true;
                    return jz02;
                }
            } else if (aq2 != null) {
                i2 = aq2.e;
                bq2.N(0, 0, 0, 0);
                ViewGroup viewGroup3 = bq2.b0;
                jz0 jz022 = null;
                bq2.b0.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
                ViewGroup viewGroup22 = bq2.b0;
                if (i != 4097) {
                }
                i2 = i3;
                if (i2 != 0) {
                }
                this.z = jz022;
                this.y = true;
                return jz022;
            }
        } else if (z2) {
            if (aq2 != null) {
                i2 = aq2.b;
                bq2.N(0, 0, 0, 0);
                ViewGroup viewGroup32 = bq2.b0;
                jz0 jz0222 = null;
                bq2.b0.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
                ViewGroup viewGroup222 = bq2.b0;
                if (i != 4097) {
                }
                i2 = i3;
                if (i2 != 0) {
                }
                this.z = jz0222;
                this.y = true;
                return jz0222;
            }
        } else if (aq2 != null) {
            i2 = aq2.c;
            bq2.N(0, 0, 0, 0);
            ViewGroup viewGroup322 = bq2.b0;
            jz0 jz02222 = null;
            bq2.b0.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
            ViewGroup viewGroup2222 = bq2.b0;
            if (i != 4097) {
            }
            i2 = i3;
            if (i2 != 0) {
            }
            this.z = jz02222;
            this.y = true;
            return jz02222;
        }
        i2 = 0;
        bq2.N(0, 0, 0, 0);
        ViewGroup viewGroup3222 = bq2.b0;
        jz0 jz022222 = null;
        bq2.b0.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
        ViewGroup viewGroup22222 = bq2.b0;
        if (i != 4097) {
        }
        i2 = i3;
        if (i2 != 0) {
        }
        this.z = jz022222;
        this.y = true;
        return jz022222;
    }
}
