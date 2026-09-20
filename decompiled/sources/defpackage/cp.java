package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: cp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class cp extends ImageButton {
    public final ao w;
    public final ig x;
    public boolean y = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vi7.a(context);
        eh7.a(this, getContext());
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, i);
        ig igVar = new ig((ImageView) this);
        this.x = igVar;
        igVar.j(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.a();
        }
        ig igVar = this.x;
        if (igVar != null) {
            igVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ao aoVar = this.w;
        if (aoVar != null) {
            return aoVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ao aoVar = this.w;
        if (aoVar != null) {
            return aoVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        w70 w70;
        ig igVar = this.x;
        if (igVar == null || (w70 = (w70) igVar.d) == null) {
            return null;
        }
        return (ColorStateList) w70.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        w70 w70;
        ig igVar = this.x;
        if (igVar == null || (w70 = (w70) igVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) w70.d;
    }

    public final boolean hasOverlappingRendering() {
        if ((((ImageView) this.x.c).getBackground() instanceof RippleDrawable) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.f();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ig igVar = this.x;
        if (igVar != null) {
            igVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        ig igVar = this.x;
        if (!(igVar == null || drawable == null || this.y)) {
            igVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (igVar != null) {
            igVar.b();
            if (!this.y) {
                ImageView imageView = (ImageView) igVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(igVar.b);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.y = true;
    }

    public void setImageResource(int i) {
        ig igVar = this.x;
        ImageView imageView = (ImageView) igVar.c;
        if (i != 0) {
            Drawable N = rc9.N(imageView.getContext(), i);
            if (N != null) {
                sz1.a(N);
            }
            imageView.setImageDrawable(N);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        igVar.b();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ig igVar = this.x;
        if (igVar != null) {
            igVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.k(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ig igVar = this.x;
        if (igVar != null) {
            if (((w70) igVar.d) == null) {
                igVar.d = new Object();
            }
            w70 w70 = (w70) igVar.d;
            w70.c = colorStateList;
            w70.b = true;
            igVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ig igVar = this.x;
        if (igVar != null) {
            if (((w70) igVar.d) == null) {
                igVar.d = new Object();
            }
            w70 w70 = (w70) igVar.d;
            w70.d = mode;
            w70.a = true;
            igVar.b();
        }
    }
}
