package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: at  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class at implements jc2 {
    public final /* synthetic */ int a;
    public final Uri b;
    public final v75 c;

    public /* synthetic */ at(Uri uri, v75 v75, int i) {
        this.a = i;
        this.b = uri;
        this.c = v75;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: type inference failed for: r11v6, types: [ie1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v11, types: [ie1, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cd  */
    public final Object a(f61 f61) {
        InputStream inputStream;
        List<String> pathSegments;
        int size;
        bv1 bv1;
        Bundle bundle;
        AssetFileDescriptor d;
        InputStream inputStream2;
        bv1 bv12;
        Integer v0;
        Resources resources;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        v75 v75 = this.c;
        boolean z = true;
        pe1 pe1 = pe1.y;
        switch (i) {
            case b85.b /*0*/:
                String E0 = dt0.E0(dt0.s0(1, uri.getPathSegments()), "/", (String) null, (String) null, (vr2) null, 62);
                return new xy6(new ty6(new zw5(j45.q(v75.a.getAssets().open(E0))), new Object()), i.b(MimeTypeMap.getSingleton(), E0), pe1);
            case 1:
                ContentResolver contentResolver = v75.a.getContentResolver();
                if (sg3.e(uri.getAuthority(), "com.android.contacts") && sg3.e(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (openAssetFileDescriptor != null) {
                        inputStream = openAssetFileDescriptor.createInputStream();
                    } else {
                        inputStream = null;
                    }
                    if (inputStream == null) {
                        h.p(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                } else if (Build.VERSION.SDK_INT < 29 || !sg3.e(uri.getAuthority(), "media") || (size = pathSegments.size()) < 3 || !sg3.e(pathSegments.get(size - 3), "audio") || !sg3.e((pathSegments = uri.getPathSegments()).get(size - 2), "albums")) {
                    inputStream = contentResolver.openInputStream(uri);
                    if (inputStream == null) {
                        h.p(uri, "'.", "Unable to open '");
                        return null;
                    }
                } else {
                    uu6 uu6 = v75.d;
                    mp7 mp7 = uu6.a;
                    if (mp7 instanceof bv1) {
                        bv1 = (bv1) mp7;
                    } else {
                        bv1 = null;
                    }
                    if (bv1 != null) {
                        int i2 = bv1.L;
                        mp7 mp72 = uu6.b;
                        if (mp72 instanceof bv1) {
                            bv12 = (bv1) mp72;
                        } else {
                            bv12 = null;
                        }
                        if (bv12 != null) {
                            int i3 = bv12.L;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                            d = contentResolver.openTypedAssetFile(uri, "image/*", bundle, (CancellationSignal) null);
                            if (d == null) {
                                inputStream2 = d.createInputStream();
                            } else {
                                inputStream2 = null;
                            }
                            if (inputStream == null) {
                                h.p(uri, "'.", "Unable to find a music thumbnail associated with '");
                                return null;
                            }
                        }
                    }
                    bundle = null;
                    d = contentResolver.openTypedAssetFile(uri, "image/*", bundle, (CancellationSignal) null);
                    if (d == null) {
                    }
                    if (inputStream == null) {
                    }
                }
                return new xy6(new ty6(new zw5(j45.q(inputStream)), new Object()), contentResolver.getType(uri), pe1);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (d57.I0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) dt0.H0(uri.getPathSegments());
                        if (str == null || (v0 = k57.v0(str)) == null) {
                            ku4.t("Invalid android.resource URI: ", uri);
                            return null;
                        }
                        int intValue = v0.intValue();
                        Context context = v75.a;
                        if (authority.equals(context.getPackageName())) {
                            resources = context.getResources();
                        } else {
                            resources = context.getPackageManager().getResourcesForApplication(authority);
                        }
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b2 = i.b(MimeTypeMap.getSingleton(), charSequence.subSequence(d57.L0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (sg3.e(b2, "text/xml")) {
                            if (authority.equals(context.getPackageName())) {
                                drawable = rc9.N(context, intValue);
                                if (drawable == null) {
                                    ku4.g(hl6.k(intValue, "Invalid resource ID: "));
                                    return null;
                                }
                            } else {
                                XmlResourceParser xml = resources.getXml(intValue);
                                int next = xml.next();
                                while (next != 2 && next != 1) {
                                    next = xml.next();
                                }
                                if (next == 2) {
                                    Resources.Theme theme = context.getTheme();
                                    ThreadLocal threadLocal = x56.a;
                                    drawable = resources.getDrawable(intValue, theme);
                                    if (drawable == null) {
                                        ku4.g(hl6.k(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                } else {
                                    throw new XmlPullParserException("No start tag found.");
                                }
                            }
                            if (!(drawable instanceof VectorDrawable) && !(drawable instanceof z28)) {
                                z = false;
                            }
                            if (z) {
                                drawable = new BitmapDrawable(context.getResources(), su0.j(drawable, v75.b, v75.d, v75.e, v75.f));
                            }
                            return new pz1(drawable, z, pe1);
                        }
                        TypedValue typedValue2 = new TypedValue();
                        return new xy6(new ty6(new zw5(j45.q(resources.openRawResource(intValue, typedValue2))), new u56(typedValue2.density)), b2, pe1);
                    }
                }
                ku4.t("Invalid android.resource URI: ", uri);
                return null;
        }
    }
}
