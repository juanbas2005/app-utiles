package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import cu.lestebang.utiletecsa.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: h37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h37 {
    public final int a;
    public final rq6 b;
    public final int[][] c;
    public final rq6[] d;
    public final g37 e;
    public final g37 f;
    public final g37 g;
    public final g37 h;

    public h37(f73 f73) {
        this.a = f73.b;
        this.b = (rq6) f73.c;
        this.c = (int[][]) f73.d;
        this.d = (rq6[]) f73.e;
        this.e = (g37) f73.f;
        this.f = (g37) f73.g;
        this.g = (g37) f73.h;
        this.h = (g37) f73.i;
    }

    public static void a(f73 f73, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                    Resources resources = context.getResources();
                    int[] iArr = ov5.r;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    rq6 a2 = rq6.a(context, typedArray.getResourceId(0, 0), typedArray.getResourceId(1, 0), new a0(0.0f)).a();
                    typedArray.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i = 0;
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                        if (!(attributeNameResource == R.attr.shapeAppearance || attributeNameResource == R.attr.shapeAppearanceOverlay)) {
                            int i3 = i + 1;
                            if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i] = attributeNameResource;
                            i = i3;
                        }
                    }
                    f73.b(StateSet.trimStateSet(iArr2, i), a2);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b A[Catch:{ all -> 0x004f, all -> 0x0063, NotFoundException | IOException | XmlPullParserException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[SYNTHETIC, Splitter:B:21:0x0055] */
    public static h37 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        f73 f73 = new f73(1);
        f73.e();
        try {
            xml = context.getResources().getXml(resourceId);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        if (xml.getName().equals("selector")) {
                            a(f73, context, xml, asAttributeSet, context.getTheme());
                        }
                        xml.close();
                        if (f73.b == 0) {
                            return null;
                        }
                        return new h37(f73);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next != 2) {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            f73.e();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final rq6 c() {
        rq6 rq6 = this.b;
        g37 g37 = this.h;
        g37 g372 = this.g;
        g37 g373 = this.f;
        g37 g374 = this.e;
        if (g374 == null && g373 == null && g372 == null && g37 == null) {
            return rq6;
        }
        qq6 f2 = rq6.f();
        if (g374 != null) {
            f2.e = g374.b;
        }
        if (g373 != null) {
            f2.f = g373.b;
        }
        if (g372 != null) {
            f2.h = g372.b;
        }
        if (g37 != null) {
            f2.g = g37.b;
        }
        return f2.a();
    }

    public final boolean d() {
        g37 g37;
        g37 g372;
        g37 g373;
        g37 g374;
        if (this.a > 1 || (((g37 = this.e) != null && g37.a > 1) || (((g372 = this.f) != null && g372.a > 1) || (((g373 = this.g) != null && g373.a > 1) || ((g374 = this.h) != null && g374.a > 1))))) {
            return true;
        }
        return false;
    }
}
