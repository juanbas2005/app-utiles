package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import cu.lestebang.utiletecsa.R;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int w = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
    public final int x = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.w * 2), this.x), 1073741824), i2);
    }
}
