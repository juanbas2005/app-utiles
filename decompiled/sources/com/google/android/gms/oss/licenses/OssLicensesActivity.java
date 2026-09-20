package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import cu.lestebang.utiletecsa.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class OssLicensesActivity extends yn {
    public jb9 X;
    public String Y = "";
    public ScrollView Z = null;
    public TextView a0 = null;
    public int b0 = 0;
    public k68 c0;
    public s47 d0;

    /* JADX WARNING: type inference failed for: r0v10, types: [y99, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (qi8.a) {
            y12.b(this);
            o55.s(getWindow(), true);
        }
        setContentView((int) R.layout.libraries_social_licenses_license_activity);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        this.a0 = textView;
        textView.setText(getString(R.string.license_is_loading));
        this.c0 = k68.m(this);
        this.X = (jb9) getIntent().getParcelableExtra("license");
        if (s() != null) {
            u98 s = s();
            String str2 = this.X.w;
            sj7 sj7 = (sj7) s.e;
            sj7.g = true;
            Toolbar toolbar = sj7.a;
            sj7.h = str2;
            if ((sj7.b & 8) != 0) {
                toolbar.setTitle((CharSequence) str2);
                if (sj7.g) {
                    e58.n(toolbar.getRootView(), str2);
                }
            }
            u98 s2 = s();
            s2.getClass();
            sj7 sj72 = (sj7) s2.e;
            sj72.a((sj72.b & -3) | 2);
            u98 s3 = s();
            s3.getClass();
            sj7 sj73 = (sj7) s3.e;
            int i = sj73.b;
            s3.h = true;
            sj73.a((i & -5) | 4);
            sj7 sj74 = (sj7) s().e;
            sj74.e = null;
            sj74.c();
        }
        s47 q = k68.q(this, this.c0.t(getPackageName()));
        this.d0 = q;
        this.Z = (ScrollView) findViewById(q.a.getIdentifier("license_activity_scrollview", "id", q.b));
        s47 s47 = this.d0;
        this.a0 = (TextView) findViewById(s47.a.getIdentifier("license_activity_textview", "id", s47.b));
        k68 k68 = this.c0;
        jb9 jb9 = this.X;
        k68.getClass();
        try {
            yf3 yf3 = (yf3) k68.x;
            yb9 b = yf3.b(0, new xg8(yf3, jb9));
            ? obj = new Object();
            obj.D = b;
            b.c(vw8.w, new n49(4, obj));
            str = (String) obj.get(2, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OssLicenses", "Failed to get license detail from OssLicensesClient", e);
            str = "";
        }
        this.Y = str;
        if (str == null || str.isEmpty()) {
            jb9 jb92 = this.X;
            this.Y = z65.Z(this, "third_party_licenses", jb92.x, jb92.y);
        }
        if (this.Y == null) {
            this.Y = getString(R.string.license_content_error);
        }
        this.a0.setText(this.Y);
        if (this.b0 != 0) {
            this.Z.post(new ge(24, (Object) this));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.b0 = bundle.getInt("scroll_pos");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.a0;
        if (textView != null && this.Z != null) {
            bundle.putInt("scroll_pos", this.a0.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.Z.getScrollY())));
        }
    }
}
