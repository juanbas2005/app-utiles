package cu.lestebang.utiletecsa.feature.registro.navigation;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcu/lestebang/utiletecsa/feature/registro/navigation/ContactDetail;", "", "", "name", "phone", "tab", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$registro", "(Lcu/lestebang/utiletecsa/feature/registro/navigation/ContactDetail;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/feature/registro/navigation/ContactDetail;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getPhone", "getTab", "Companion", "z31", "a41", "registro"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class ContactDetail {
    public static final int $stable = 0;
    public static final a41 Companion = new Object();
    private final String name;
    private final String phone;
    private final String tab;

    public /* synthetic */ ContactDetail(int i, String str, String str2, String str3, rl6 rl6Var) {
        if (3 == (i & 3)) {
            this.name = str;
            this.phone = str2;
            if ((i & 4) == 0) {
                this.tab = "calls";
                return;
            } else {
                this.tab = str3;
                return;
            }
        }
        wn6.x(i, 3, z31.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ContactDetail copy$default(ContactDetail contactDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactDetail.name;
        }
        if ((i & 2) != 0) {
            str2 = contactDetail.phone;
        }
        if ((i & 4) != 0) {
            str3 = contactDetail.tab;
        }
        return contactDetail.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$registro(ContactDetail contactDetail, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, contactDetail.name);
        hy0Var.x(ll6Var, 1, contactDetail.phone);
        if (hy0Var.f(ll6Var) || !sg3.e(contactDetail.tab, "calls")) {
            hy0Var.x(ll6Var, 2, contactDetail.tab);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.tab;
    }

    public final ContactDetail copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ContactDetail(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetail)) {
            return false;
        }
        ContactDetail contactDetail = (ContactDetail) obj;
        if (sg3.e(this.name, contactDetail.name) && sg3.e(this.phone, contactDetail.phone) && sg3.e(this.tab, contactDetail.tab)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getTab() {
        return this.tab;
    }

    public int hashCode() {
        return this.tab.hashCode() + hl6.h(this.name.hashCode() * 31, 31, this.phone);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.phone;
        return f21.l(f21.o("ContactDetail(name=", str, ", phone=", str2, ", tab="), this.tab, ")");
    }

    public ContactDetail(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.name = str;
        this.phone = str2;
        this.tab = str3;
    }

    public /* synthetic */ ContactDetail(String str, String str2, String str3, int i, hl1 hl1Var) {
        this(str, str2, (i & 4) != 0 ? "calls" : str3);
    }
}
