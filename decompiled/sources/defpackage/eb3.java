package defpackage;

import android.net.InetAddresses;
import android.os.Build;
import com.wireguard.config.ParseException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* renamed from: eb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class eb3 {
    public static final Method a;
    public static final Pattern b = Pattern.compile("^(((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?)|((?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))$");
    public static final Pattern c = Pattern.compile("^(?=.{1,255}$)[0-9A-Za-z](?:(?:[0-9A-Za-z]|-){0,61}[0-9A-Za-z])?(?:\\.[0-9A-Za-z](?:(?:[0-9A-Za-z]|-){0,61}[0-9A-Za-z])?)*\\.?$");

    static {
        Method method = null;
        try {
            if (Build.VERSION.SDK_INT < 29) {
                method = InetAddress.class.getMethod("parseNumericAddress", new Class[]{String.class});
            }
        } catch (Exception unused) {
        }
        a = method;
    }

    public static InetAddress a(String str) {
        Class<InetAddress> cls = InetAddress.class;
        if (!str.isEmpty()) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    return InetAddresses.parseNumericAddress(str);
                }
                Method method = a;
                if (method != null) {
                    return (InetAddress) method.invoke((Object) null, new Object[]{str});
                }
                throw new NoSuchMethodException("parseNumericAddress");
            } catch (IllegalArgumentException e) {
                throw new ParseException(cls, str, (String) null, e);
            } catch (Exception e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IllegalArgumentException) {
                    throw new ParseException(cls, str, (String) null, (Exception) cause);
                } else if (b.matcher(str).matches()) {
                    return InetAddress.getByName(str);
                } else {
                    throw new ParseException(cls, str, "Not an IP address", (Exception) null);
                }
            } catch (UnknownHostException e3) {
                throw new ParseException(cls, str, (String) null, e3);
            }
        } else {
            throw new ParseException(cls, str, "Empty address", (Exception) null);
        }
    }
}
