package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010\u001b¨\u0006>"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageUpdateDto;", "", "", "userId", "authorName", "category", "title", "body", "image", "imagePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageUpdateDto;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostImageUpdateDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getAuthorName", "getAuthorName$annotations", "getCategory", "getCategory$annotations", "getTitle", "getTitle$annotations", "getBody", "getBody$annotations", "getImage", "getImage$annotations", "getImagePath", "getImagePath$annotations", "Companion", "ln2", "mn2", "data"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ForumPostImageUpdateDto {
    public static final mn2 Companion = new Object();
    private final String authorName;
    private final String body;
    private final String category;
    private final String image;
    private final String imagePath;
    private final String title;
    private final String userId;

    public /* synthetic */ ForumPostImageUpdateDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, rl6 rl6) {
        if (127 == (i & 127)) {
            this.userId = str;
            this.authorName = str2;
            this.category = str3;
            this.title = str4;
            this.body = str5;
            this.image = str6;
            this.imagePath = str7;
            return;
        }
        wn6.x(i, 127, ln2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumPostImageUpdateDto copy$default(ForumPostImageUpdateDto forumPostImageUpdateDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forumPostImageUpdateDto.userId;
        }
        if ((i & 2) != 0) {
            str2 = forumPostImageUpdateDto.authorName;
        }
        if ((i & 4) != 0) {
            str3 = forumPostImageUpdateDto.category;
        }
        if ((i & 8) != 0) {
            str4 = forumPostImageUpdateDto.title;
        }
        if ((i & 16) != 0) {
            str5 = forumPostImageUpdateDto.body;
        }
        if ((i & 32) != 0) {
            str6 = forumPostImageUpdateDto.image;
        }
        if ((i & 64) != 0) {
            str7 = forumPostImageUpdateDto.imagePath;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return forumPostImageUpdateDto.copy(str, str2, str3, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostImageUpdateDto forumPostImageUpdateDto, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, forumPostImageUpdateDto.userId);
        hy0.x(ll6, 1, forumPostImageUpdateDto.authorName);
        hy0.x(ll6, 2, forumPostImageUpdateDto.category);
        hy0.x(ll6, 3, forumPostImageUpdateDto.title);
        hy0.x(ll6, 4, forumPostImageUpdateDto.body);
        t47 t47 = t47.a;
        hy0.A(ll6, 5, t47, forumPostImageUpdateDto.image);
        hy0.A(ll6, 6, t47, forumPostImageUpdateDto.imagePath);
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
        return this.image;
    }

    public final String component7() {
        return this.imagePath;
    }

    public final ForumPostImageUpdateDto copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new ForumPostImageUpdateDto(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostImageUpdateDto)) {
            return false;
        }
        ForumPostImageUpdateDto forumPostImageUpdateDto = (ForumPostImageUpdateDto) obj;
        if (sg3.e(this.userId, forumPostImageUpdateDto.userId) && sg3.e(this.authorName, forumPostImageUpdateDto.authorName) && sg3.e(this.category, forumPostImageUpdateDto.category) && sg3.e(this.title, forumPostImageUpdateDto.title) && sg3.e(this.body, forumPostImageUpdateDto.body) && sg3.e(this.image, forumPostImageUpdateDto.image) && sg3.e(this.imagePath, forumPostImageUpdateDto.imagePath)) {
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

    public final String getImage() {
        return this.image;
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
        int i;
        int h = hl6.h(hl6.h(hl6.h(hl6.h(this.userId.hashCode() * 31, 31, this.authorName), 31, this.category), 31, this.title), 31, this.body);
        String str = this.image;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (h + i) * 31;
        String str2 = this.imagePath;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.authorName;
        String str3 = this.category;
        String str4 = this.title;
        String str5 = this.body;
        String str6 = this.image;
        String str7 = this.imagePath;
        StringBuilder o = f21.o("ForumPostImageUpdateDto(userId=", str, ", authorName=", str2, ", category=");
        f21.v(o, str3, ", title=", str4, ", body=");
        f21.v(o, str5, ", image=", str6, ", imagePath=");
        return f21.l(o, str7, ")");
    }

    public static /* synthetic */ void getAuthorName$annotations() {
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getImage$annotations() {
    }

    public static /* synthetic */ void getImagePath$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public ForumPostImageUpdateDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        hl6.t(str, str2, str3, str4, str5);
        this.userId = str;
        this.authorName = str2;
        this.category = str3;
        this.title = str4;
        this.body = str5;
        this.image = str6;
        this.imagePath = str7;
    }
}
