package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f87 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public f87(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        char c2;
        char c3;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        e87 e87 = new e87(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    rf2.r("Expecting menu, got ".concat(name));
                    return;
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser3 = xmlPullParser;
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = e87.a;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z3 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z3 = false;
                            str = null;
                            eventType = xmlPullParser2.next();
                            i = 2;
                        } else if (name2.equals("group")) {
                            e87.b = 0;
                            e87.c = 0;
                            e87.d = 0;
                            e87.e = 0;
                            e87.f = true;
                            e87.g = true;
                        } else if (name2.equals("item")) {
                            if (!e87.h) {
                                zi4 zi4 = e87.z;
                                if (zi4 == null || !zi4.b.hasSubMenu()) {
                                    e87.h = true;
                                    e87.b(menu2.add(e87.b, e87.i, e87.j, e87.k));
                                } else {
                                    e87.h = true;
                                    e87.b(menu2.addSubMenu(e87.b, e87.i, e87.j, e87.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z2 = true;
                            eventType = xmlPullParser2.next();
                            i = 2;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, qv5.p);
                        e87.b = obtainStyledAttributes.getResourceId(1, 0);
                        e87.c = obtainStyledAttributes.getInt(3, 0);
                        e87.d = obtainStyledAttributes.getInt(4, 0);
                        e87.e = obtainStyledAttributes.getInt(5, 0);
                        e87.f = obtainStyledAttributes.getBoolean(2, true);
                        e87.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, qv5.q);
                            e87.i = obtainStyledAttributes2.getResourceId(2, 0);
                            e87.j = (obtainStyledAttributes2.getInt(5, e87.c) & -65536) | (obtainStyledAttributes2.getInt(6, e87.d) & 65535);
                            e87.k = obtainStyledAttributes2.getText(7);
                            e87.l = obtainStyledAttributes2.getText(8);
                            e87.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            if (string == null) {
                                c2 = 0;
                            } else {
                                c2 = string.charAt(0);
                            }
                            e87.n = c2;
                            e87.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            if (string2 == null) {
                                c3 = 0;
                            } else {
                                c3 = string2.charAt(0);
                            }
                            e87.p = c3;
                            e87.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                e87.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                e87.r = e87.e;
                            }
                            e87.s = obtainStyledAttributes2.getBoolean(3, false);
                            e87.t = obtainStyledAttributes2.getBoolean(4, e87.f);
                            e87.u = obtainStyledAttributes2.getBoolean(1, e87.g);
                            e87.v = obtainStyledAttributes2.getInt(21, -1);
                            e87.y = obtainStyledAttributes2.getString(12);
                            e87.w = obtainStyledAttributes2.getResourceId(13, 0);
                            e87.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if (string3 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && e87.w == 0 && e87.x == null) {
                                e87.z = (zi4) e87.a(string3, f, this.b);
                            } else {
                                if (z) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                e87.z = null;
                            }
                            e87.A = obtainStyledAttributes2.getText(17);
                            e87.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                e87.D = sz1.b(obtainStyledAttributes2.getInt(19, -1), e87.D);
                            } else {
                                e87.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ag8.r(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                e87.C = colorStateList;
                            } else {
                                e87.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            e87.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            e87.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(e87.b, e87.i, e87.j, e87.k);
                            e87.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet2, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                i = 2;
            } else {
                rf2.r("Unexpected end of document");
                return;
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof ti4)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof ti4) {
                ti4 ti4 = (ti4) menu;
                if (!ti4.p) {
                    ti4.w();
                    z = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z) {
                ((ti4) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                ((ti4) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
