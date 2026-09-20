package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* renamed from: ap  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ap extends EditText implements h55 {
    public final qc3 A;
    public zo B;
    public final ao w;
    public final cq x;
    public final qc3 y;
    public final zg7 z = new Object();

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, zg7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        vi7.a(context);
        eh7.a(this, getContext());
        ao aoVar = new ao(this);
        this.w = aoVar;
        aoVar.d(attributeSet, R.attr.editTextStyle);
        cq cqVar = new cq(this);
        this.x = cqVar;
        cqVar.f(attributeSet, R.attr.editTextStyle);
        cqVar.b();
        qc3 qc3 = new qc3(15, false);
        qc3.x = this;
        this.y = qc3;
        qc3 qc32 = new qc3((EditText) this);
        this.A = qc32;
        qc32.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener B2 = qc32.B(keyListener);
            if (B2 != keyListener) {
                super.setKeyListener(B2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private zo getSuperCaller() {
        if (this.B == null) {
            this.B = new zo(this);
        }
        return this.B;
    }

    public final x41 a(x41 x41) {
        this.z.getClass();
        return zg7.a(this, x41);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ao aoVar = this.w;
        if (aoVar != null) {
            aoVar.a();
        }
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return za5.D(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.x.e();
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        qc3 qc3;
        if (Build.VERSION.SDK_INT >= 28 || (qc3 = this.y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) qc3.y;
        if (textClassifier == null) {
            return wp.a((TextView) qc3.x);
        }
        return textClassifier;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r1 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r1 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection mc3;
        String[] stringArray;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.x.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            h49.P(editorInfo, getText());
        }
        t49.T(editorInfo, onCreateInputConnection, this);
        if (!(onCreateInputConnection == null || i > 30 || (g = e58.g(this)) == null)) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = g;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g);
            }
            c9 c9Var = new c9(12, this);
            if (i >= 25) {
                mc3 = new lc3(onCreateInputConnection, c9Var);
            } else {
                String[] strArr = h49.z;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        mc3 = new mc3(onCreateInputConnection, c9Var);
                    }
                }
                strArr = stringArray;
                if (strArr.length != 0) {
                }
            }
            onCreateInputConnection = mc3;
        }
        return this.A.F(onCreateInputConnection, editorInfo);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && e58.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = ip.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        f96 f96;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || e58.g(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            if (i3 >= 31) {
                f96 = new f96(clipData, 1);
            } else {
                u41 u41 = new u41();
                u41.x = clipData;
                u41.y = 1;
                f96 = u41;
            }
            if (i == 16908322) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            f96.g(i2);
            e58.i(this, f96.build());
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

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(za5.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.A.L(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A.B(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        cq cqVar = this.x;
        cqVar.k(colorStateList);
        cqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        cq cqVar = this.x;
        cqVar.l(mode);
        cqVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        cq cqVar = this.x;
        if (cqVar != null) {
            cqVar.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        qc3 qc3;
        if (Build.VERSION.SDK_INT >= 28 || (qc3 = this.y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            qc3.y = textClassifier;
        }
    }
}
