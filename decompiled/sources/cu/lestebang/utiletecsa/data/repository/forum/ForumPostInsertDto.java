package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\u001a¨\u0006:"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostInsertDto;", "", "", "userId", "authorName", "category", "title", "body", "imagePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostInsertDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostInsertDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getAuthorName", "getAuthorName$annotations", "getCategory", "getCategory$annotations", "getTitle", "getTitle$annotations", "getBody", "getBody$annotations", "getImagePath", "getImagePath$annotations", "Companion", "nn2", "on2", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class ForumPostInsertDto {
    public static final on2 Companion = new Object();
    private final String authorName;
    private final String body;
    private final String category;
    private final String imagePath;
    private final String title;
    private final String userId;

    public /* synthetic */ ForumPostInsertDto(int i, String str, String str2, String str3, String str4, String str5, String str6, rl6 rl6Var) {
        if (31 == (i & 31)) {
            this.userId = str;
            this.authorName = str2;
            this.category = str3;
            this.title = str4;
            this.body = str5;
            if ((i & 32) == 0) {
                this.imagePath = null;
                return;
            } else {
                this.imagePath = str6;
                return;
            }
        }
        wn6.x(i, 31, nn2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumPostInsertDto copy$default(ForumPostInsertDto forumPostInsertDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumPostInsertDto.userId;
        }
        if ((i & 2) != 0) {
            str2 = forumPostInsertDto.authorName;
        }
        if ((i & 4) != 0) {
            str3 = forumPostInsertDto.category;
        }
        if ((i & 8) != 0) {
            str4 = forumPostInsertDto.title;
        }
        if ((i & 16) != 0) {
            str5 = forumPostInsertDto.body;
        }
        if ((i & 32) != 0) {
            str6 = forumPostInsertDto.imagePath;
        }
        String str7 = str5;
        String str8 = str6;
        return forumPostInsertDto.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostInsertDto forumPostInsertDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, forumPostInsertDto.userId);
        hy0Var.x(ll6Var, 1, forumPostInsertDto.authorName);
        hy0Var.x(ll6Var, 2, forumPostInsertDto.category);
        hy0Var.x(ll6Var, 3, forumPostInsertDto.title);
        hy0Var.x(ll6Var, 4, forumPostInsertDto.body);
        if (hy0Var.f(ll6Var) || forumPostInsertDto.imagePath != null) {
            hy0Var.A(ll6Var, 5, t47.a, forumPostInsertDto.imagePath);
        }
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.authorName;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.imagePath;
    }

    public final ForumPostInsertDto copy(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new ForumPostInsertDto(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostInsertDto)) {
            return false;
        }
        ForumPostInsertDto forumPostInsertDto = (ForumPostInsertDto) obj;
        if (sg3.e(this.userId, forumPostInsertDto.userId) && sg3.e(this.authorName, forumPostInsertDto.authorName) && sg3.e(this.category, forumPostInsertDto.category) && sg3.e(this.title, forumPostInsertDto.title) && sg3.e(this.body, forumPostInsertDto.body) && sg3.e(this.imagePath, forumPostInsertDto.imagePath)) {
            return true;
        }
        return false;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int h = hl6.h(hl6.h(hl6.h(hl6.h(this.userId.hashCode() * 31, 31, this.authorName), 31, this.category), 31, this.title), 31, this.body);
        String str = this.imagePath;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return h + hashCode;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.authorName;
        String str3 = this.category;
        String str4 = this.title;
        String str5 = this.body;
        String str6 = this.imagePath;
        StringBuilder o = f21.o("ForumPostInsertDto(userId=", str, ", authorName=", str2, ", category=");
        f21.v(o, str3, ", title=", str4, ", body=");
        return pb4.n(o, str5, ", imagePath=", str6, ")");
    }

    public static /* synthetic */ void getAuthorName$annotations() {
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getImagePath$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public ForumPostInsertDto(String str, String str2, String str3, String str4, String str5, String str6) {
        hl6.t(str, str2, str3, str4, str5);
        this.userId = str;
        this.authorName = str2;
        this.category = str3;
        this.title = str4;
        this.body = str5;
        this.imagePath = str6;
    }

    public /* synthetic */ ForumPostInsertDto(String str, String str2, String str3, String str4, String str5, String str6, int i, hl1 hl1Var) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
    }
}
