package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ec5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ec5 {
    public static final k26 a = new k26(qs.r1(new l26[]{l26.x, l26.y}));
    public static final k26 b = new k26("<[^>]+>");
    public static final k26 c = new k26("\\s+");
    public static final k26 d = new k26("&#(\\d+);");
    public static final Map e = sf4.V(new yb5("&nbsp;", " "), new yb5("&amp;", "&"), new yb5("&lt;", "<"), new yb5("&gt;", ">"), new yb5("&quot;", "\""), new yb5("&aacute;", "á"), new yb5("&eacute;", "é"), new yb5("&iacute;", "í"), new yb5("&oacute;", "ó"), new yb5("&uacute;", "ú"), new yb5("&ntilde;", "ñ"), new yb5("&uuml;", "ü"), new yb5("&Aacute;", "Á"), new yb5("&Eacute;", "É"), new yb5("&Iacute;", "Í"), new yb5("&Oacute;", "Ó"), new yb5("&Uacute;", "Ú"), new yb5("&Ntilde;", "Ñ"), new yb5("&Uuml;", "Ü"), new yb5("&VerticalLine;", "|"));

    public static final String a(String str) {
        String g = b.g(str, " ");
        for (Map.Entry entry : e.entrySet()) {
            g = k57.s0(g, (String) entry.getKey(), (String) entry.getValue());
        }
        return d57.k1(c.g(d.f(g, new ot4(22)), " ")).toString();
    }

    public static final ArrayList b(String str, String str2, String str3) {
        String str4;
        int i;
        Pattern compile = Pattern.compile("<" + str2 + "\\b[^>]*>", 66);
        compile.getClass();
        Pattern compile2 = Pattern.compile("class\\s*=\\s*\"([^\"]*)\"", 66);
        compile2.getClass();
        Pattern compile3 = Pattern.compile("<" + str2 + "\\b|</" + str2 + ">", 66);
        compile3.getClass();
        ArrayList arrayList = new ArrayList();
        str.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        xf4 g = t35.g(matcher, 0, str);
        while (g != null) {
            String group = g.a.group();
            group.getClass();
            Matcher matcher2 = compile2.matcher(group);
            matcher2.getClass();
            xf4 g2 = t35.g(matcher2, 0, group);
            if (g2 != null) {
                str4 = (String) ((vf4) g2.a()).get(1);
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            if (str3 != null) {
                List X0 = d57.X0(str4, new char[]{' ', 9, 10, 13});
                if (!X0.isEmpty()) {
                    Iterator it = X0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (sg3.e((String) it.next(), str3)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Matcher matcher3 = compile.matcher(str);
                matcher3.getClass();
                g = t35.g(matcher3, g.b().x + 1, str);
            } else {
                int length = str.length();
                Matcher matcher4 = compile3.matcher(str);
                matcher4.getClass();
                xf4 g3 = t35.g(matcher4, g.b().x + 1, str);
                int i2 = 1;
                while (true) {
                    if (g3 == null) {
                        break;
                    }
                    String group2 = g3.a.group();
                    group2.getClass();
                    if (k57.u0(group2, "</", false)) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    i2 += i;
                    if (i2 == 0) {
                        length = g3.b().w;
                        break;
                    }
                    Matcher matcher5 = compile3.matcher(str);
                    matcher5.getClass();
                    g3 = t35.g(matcher5, g3.b().x + 1, str);
                }
                arrayList.add(str.substring(g.b().x + 1, length));
                Matcher matcher6 = compile.matcher(str);
                matcher6.getClass();
                g = t35.g(matcher6, length, str);
            }
        }
        return arrayList;
    }
}
