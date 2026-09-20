package androidx.compose.runtime.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DiagnosticComposeException extends RuntimeException {
    public final qx0 w;

    public DiagnosticComposeException(qx0 qx0) {
        this.w = qx0;
        if (!qx0.b) {
            int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
            List list = qx0.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                sx0 sx0 = (sx0) list.get(i);
                if (!qs.G0(iArr, sx0.a)) {
                    if (sx0.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((sx0) list.get(i3)).a == 1000) {
                            break;
                        }
                        it0.l0(arrayList);
                    } else {
                        arrayList.add(sx0);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", hl6.k(((sx0) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getMessage() {
        qx0 qx0 = this.w;
        if (!qx0.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        n74 m = sg3.m();
        List list = qx0.a;
        list.getClass();
        vf4 vf4 = new vf4(list);
        int f = vf4.f();
        for (int i = 0; i < f; i++) {
            ((sx0) vf4.get(i)).getClass();
        }
        n74 i2 = sg3.i(m);
        i2.getClass();
        vf4 vf42 = new vf4((List) i2);
        int f2 = vf42.f();
        for (int i3 = 0; i3 < f2; i3++) {
            sb.append("\tat ");
            sb.append((String) vf42.get(i3));
            sb.append(10);
        }
        return sb.toString();
    }
}
