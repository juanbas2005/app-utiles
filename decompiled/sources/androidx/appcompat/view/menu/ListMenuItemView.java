package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ListMenuItemView extends LinearLayout implements sj4, AbsListView.SelectionBoundsAdjuster {
    public CheckBox A;
    public TextView B;
    public ImageView C;
    public ImageView D;
    public LinearLayout E;
    public final Drawable F;
    public final int G;
    public final Context H;
    public boolean I;
    public final Drawable J;
    public final boolean K;
    public LayoutInflater L;
    public boolean M;
    public yi4 w;
    public ImageView x;
    public RadioButton y;
    public TextView z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cf4 w2 = cf4.w(getContext(), attributeSet, qv5.r, R.attr.listMenuViewStyle);
        this.F = w2.i(5);
        TypedArray typedArray = (TypedArray) w2.y;
        this.G = typedArray.getResourceId(1, -1);
        this.I = typedArray.getBoolean(7, false);
        this.H = context;
        this.J = w2.i(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.K = obtainStyledAttributes.hasValue(0);
        w2.A();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.L == null) {
            this.L = LayoutInflater.from(getContext());
        }
        return this.L;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        int i;
        ImageView imageView = this.C;
        if (imageView != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.D;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
            rect.top = this.D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r0 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    public final void c(yi4 yi4) {
        int i;
        boolean z2;
        char c;
        String str;
        int i2;
        char c2;
        char c3;
        this.w = yi4;
        boolean isVisible = yi4.isVisible();
        ti4 ti4 = yi4.n;
        int i3 = 0;
        if (isVisible) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setTitle(yi4.e);
        setCheckable(yi4.isCheckable());
        if (ti4.o()) {
            if (ti4.n()) {
                c3 = yi4.j;
            } else {
                c3 = yi4.h;
            }
            if (c3 != 0) {
                z2 = true;
                ti4.n();
                if (z2) {
                    yi4 yi42 = this.w;
                    ti4 ti42 = yi42.n;
                    if (ti42.o()) {
                        if (ti42.n()) {
                            c2 = yi42.j;
                        } else {
                            c2 = yi42.h;
                        }
                    }
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.B;
                    yi4 yi43 = this.w;
                    ti4 ti43 = yi43.n;
                    Context context = ti43.a;
                    if (ti43.n()) {
                        c = yi43.j;
                    } else {
                        c = yi43.h;
                    }
                    if (c == 0) {
                        str = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (ti43.n()) {
                            i2 = yi43.k;
                        } else {
                            i2 = yi43.i;
                        }
                        yi4.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                        yi4.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                        yi4.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                        yi4.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                        yi4.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                        yi4.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                        if (c == 8) {
                            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == 10) {
                            sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb.append(c);
                        } else {
                            sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        str = sb.toString();
                    }
                    textView.setText(str);
                }
                if (this.B.getVisibility() != i3) {
                    this.B.setVisibility(i3);
                }
                setIcon(yi4.getIcon());
                setEnabled(yi4.isEnabled());
                setSubMenuArrowVisible(yi4.hasSubMenu());
                setContentDescription(yi4.q);
            }
        }
        z2 = false;
        ti4.n();
        if (z2) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.B.getVisibility() != i3) {
        }
        setIcon(yi4.getIcon());
        setEnabled(yi4.isEnabled());
        setSubMenuArrowVisible(yi4.hasSubMenu());
        setContentDescription(yi4.q);
    }

    public yi4 getItemData() {
        return this.w;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.F);
        TextView textView = (TextView) findViewById(R.id.title);
        this.z = textView;
        int i = this.G;
        if (i != -1) {
            textView.setTextAppearance(this.H, i);
        }
        this.B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.J);
        }
        this.D = (ImageView) findViewById(R.id.group_divider);
        this.E = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i, int i2) {
        if (this.x != null && this.I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        View view;
        CompoundButton compoundButton;
        if (z2 || this.y != null || this.A != null) {
            if ((this.w.x & 4) != 0) {
                if (this.y == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.y = radioButton;
                    LinearLayout linearLayout = this.E;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.y;
                view = this.A;
            } else {
                if (this.A == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.A = checkBox;
                    LinearLayout linearLayout2 = this.E;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.A;
                view = this.y;
            }
            if (z2) {
                compoundButton.setChecked(this.w.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.A;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.y;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.w.x & 4) != 0) {
            if (this.y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.y = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.y;
        } else {
            if (this.A == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.A = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.M = z2;
        this.I = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        int i;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (this.K || !z2) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        ti4 ti4 = this.w.n;
        boolean z2 = this.M;
        if (z2 || this.I) {
            ImageView imageView = this.x;
            if (imageView != null || drawable != null || this.I) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.x = imageView2;
                    LinearLayout linearLayout = this.E;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.I) {
                    ImageView imageView3 = this.x;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.x.getVisibility() != 0) {
                        this.x.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.x.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.z;
        if (charSequence != null) {
            textView.setText(charSequence);
            if (this.z.getVisibility() != 0) {
                this.z.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.z.setVisibility(8);
        }
    }
}
