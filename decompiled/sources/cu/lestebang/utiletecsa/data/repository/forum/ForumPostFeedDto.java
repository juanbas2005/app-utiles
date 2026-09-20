package cu.lestebang.utiletecsa.data.repository.forum;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u0000 T2\u00020\u0001:\u0002UVBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010$J\u008c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b?\u0010;\u001a\u0004\b>\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010\u0019R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010\u0019R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\bL\u0010;\u001a\u0004\bK\u0010\u0019R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010M\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010$R \u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010M\u0012\u0004\bQ\u0010;\u001a\u0004\bP\u0010$R \u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010M\u0012\u0004\bS\u0010;\u001a\u0004\bR\u0010$¨\u0006W"}, d2 = {"Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostFeedDto;", "", "", "id", "userId", "authorName", "category", "title", "body", "", "hasImage", "imagePath", "createdAt", "", "likes", "dislikes", "commentCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJ)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJLrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "component10", "()J", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJ)Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostFeedDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$data", "(Lcu/lestebang/utiletecsa/data/repository/forum/ForumPostFeedDto;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getUserId", "getUserId$annotations", "getAuthorName", "getAuthorName$annotations", "getCategory", "getCategory$annotations", "getTitle", "getTitle$annotations", "getBody", "getBody$annotations", "Z", "getHasImage", "getHasImage$annotations", "getImagePath", "getImagePath$annotations", "getCreatedAt", "getCreatedAt$annotations", "J", "getLikes", "getLikes$annotations", "getDislikes", "getDislikes$annotations", "getCommentCount", "getCommentCount$annotations", "Companion", "hn2", "in2", "data"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class ForumPostFeedDto {
    public static final in2 Companion = new Object();
    private final String authorName;
    private final String body;
    private final String category;
    private final long commentCount;
    private final String createdAt;
    private final long dislikes;
    private final boolean hasImage;
    private final String id;
    private final String imagePath;
    private final long likes;
    private final String title;
    private final String userId;

    public /* synthetic */ ForumPostFeedDto(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, long j, long j2, long j3, rl6 rl6Var) {
        if (313 == (i & 313)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.userId = null;
            } else {
                this.userId = str2;
            }
            if ((i & 4) == 0) {
                this.authorName = "";
            } else {
                this.authorName = str3;
            }
            this.category = str4;
            this.title = str5;
            this.body = str6;
            if ((i & 64) == 0) {
                this.hasImage = false;
            } else {
                this.hasImage = z;
            }
            if ((i & 128) == 0) {
                this.imagePath = null;
            } else {
                this.imagePath = str7;
            }
            this.createdAt = str8;
            if ((i & 512) == 0) {
                this.likes = 0L;
            } else {
                this.likes = j;
            }
            if ((i & 1024) == 0) {
                this.dislikes = 0L;
            } else {
                this.dislikes = j2;
            }
            if ((i & 2048) == 0) {
                this.commentCount = 0L;
                return;
            } else {
                this.commentCount = j3;
                return;
            }
        }
        wn6.x(i, 313, hn2.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ForumPostFeedDto copy$default(ForumPostFeedDto forumPostFeedDto, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, long j, long j2, long j3, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z2;
        String str15;
        String str16;
        long j4;
        long j5;
        long j6;
        String str17;
        ForumPostFeedDto forumPostFeedDto2;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        boolean z3;
        String str23;
        String str24;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            str9 = forumPostFeedDto.id;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = forumPostFeedDto.userId;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            str11 = forumPostFeedDto.authorName;
        } else {
            str11 = str3;
        }
        if ((i & 8) != 0) {
            str12 = forumPostFeedDto.category;
        } else {
            str12 = str4;
        }
        if ((i & 16) != 0) {
            str13 = forumPostFeedDto.title;
        } else {
            str13 = str5;
        }
        if ((i & 32) != 0) {
            str14 = forumPostFeedDto.body;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            z2 = forumPostFeedDto.hasImage;
        } else {
            z2 = z;
        }
        if ((i & 128) != 0) {
            str15 = forumPostFeedDto.imagePath;
        } else {
            str15 = str7;
        }
        if ((i & 256) != 0) {
            str16 = forumPostFeedDto.createdAt;
        } else {
            str16 = str8;
        }
        if ((i & 512) != 0) {
            j4 = forumPostFeedDto.likes;
        } else {
            j4 = j;
        }
        if ((i & 1024) != 0) {
            j5 = forumPostFeedDto.dislikes;
        } else {
            j5 = j2;
        }
        if ((i & 2048) != 0) {
            str17 = str9;
            j6 = forumPostFeedDto.commentCount;
            str18 = str10;
            str19 = str11;
            str20 = str12;
            str21 = str13;
            str22 = str14;
            z3 = z2;
            str23 = str15;
            str24 = str16;
            j7 = j4;
            j8 = j5;
            forumPostFeedDto2 = forumPostFeedDto;
        } else {
            j6 = j3;
            str17 = str9;
            forumPostFeedDto2 = forumPostFeedDto;
            str18 = str10;
            str19 = str11;
            str20 = str12;
            str21 = str13;
            str22 = str14;
            z3 = z2;
            str23 = str15;
            str24 = str16;
            j7 = j4;
            j8 = j5;
        }
        return forumPostFeedDto2.copy(str17, str18, str19, str20, str21, str22, z3, str23, str24, j7, j8, j6);
    }

    public static final /* synthetic */ void write$Self$data(ForumPostFeedDto forumPostFeedDto, hy0 hy0Var, ll6 ll6Var) {
        hy0Var.x(ll6Var, 0, forumPostFeedDto.id);
        if (hy0Var.f(ll6Var) || forumPostFeedDto.userId != null) {
            hy0Var.A(ll6Var, 1, t47.a, forumPostFeedDto.userId);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(forumPostFeedDto.authorName, "")) {
            hy0Var.x(ll6Var, 2, forumPostFeedDto.authorName);
        }
        hy0Var.x(ll6Var, 3, forumPostFeedDto.category);
        hy0Var.x(ll6Var, 4, forumPostFeedDto.title);
        hy0Var.x(ll6Var, 5, forumPostFeedDto.body);
        if (hy0Var.f(ll6Var) || forumPostFeedDto.hasImage) {
            hy0Var.n(ll6Var, 6, forumPostFeedDto.hasImage);
        }
        if (hy0Var.f(ll6Var) || forumPostFeedDto.imagePath != null) {
            hy0Var.A(ll6Var, 7, t47.a, forumPostFeedDto.imagePath);
        }
        hy0Var.x(ll6Var, 8, forumPostFeedDto.createdAt);
        if (hy0Var.f(ll6Var) || forumPostFeedDto.likes != 0) {
            hy0Var.j(ll6Var, 9, forumPostFeedDto.likes);
        }
        if (hy0Var.f(ll6Var) || forumPostFeedDto.dislikes != 0) {
            hy0Var.j(ll6Var, 10, forumPostFeedDto.dislikes);
        }
        if (hy0Var.f(ll6Var) || forumPostFeedDto.commentCount != 0) {
            hy0Var.j(ll6Var, 11, forumPostFeedDto.commentCount);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.likes;
    }

    public final long component11() {
        return this.dislikes;
    }

    public final long component12() {
        return this.commentCount;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.authorName;
    }

    public final String component4() {
        return this.category;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.body;
    }

    public final boolean component7() {
        return this.hasImage;
    }

    public final String component8() {
        return this.imagePath;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final ForumPostFeedDto copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, long j, long j2, long j3) {
        hl6.t(str, str3, str4, str5, str6);
        str8.getClass();
        return new ForumPostFeedDto(str, str2, str3, str4, str5, str6, z, str7, str8, j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForumPostFeedDto)) {
            return false;
        }
        ForumPostFeedDto forumPostFeedDto = (ForumPostFeedDto) obj;
        if (sg3.e(this.id, forumPostFeedDto.id) && sg3.e(this.userId, forumPostFeedDto.userId) && sg3.e(this.authorName, forumPostFeedDto.authorName) && sg3.e(this.category, forumPostFeedDto.category) && sg3.e(this.title, forumPostFeedDto.title) && sg3.e(this.body, forumPostFeedDto.body) && this.hasImage == forumPostFeedDto.hasImage && sg3.e(this.imagePath, forumPostFeedDto.imagePath) && sg3.e(this.createdAt, forumPostFeedDto.createdAt) && this.likes == forumPostFeedDto.likes && this.dislikes == forumPostFeedDto.dislikes && this.commentCount == forumPostFeedDto.commentCount) {
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

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getDislikes() {
        return this.dislikes;
    }

    public final boolean getHasImage() {
        return this.hasImage;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final long getLikes() {
        return this.likes;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.userId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hl6.i(hl6.h(hl6.h(hl6.h(hl6.h((hashCode2 + hashCode) * 31, 31, this.authorName), 31, this.category), 31, this.title), 31, this.body), 31, this.hasImage);
        String str2 = this.imagePath;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Long.hashCode(this.commentCount) + pb4.b(pb4.b(hl6.h((i2 + i) * 31, 31, this.createdAt), 31, this.likes), 31, this.dislikes);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.authorName;
        String str4 = this.category;
        String str5 = this.title;
        String str6 = this.body;
        boolean z = this.hasImage;
        String str7 = this.imagePath;
        String str8 = this.createdAt;
        long j = this.likes;
        long j2 = this.dislikes;
        long j3 = this.commentCount;
        StringBuilder o = f21.o("ForumPostFeedDto(id=", str, ", userId=", str2, ", authorName=");
        f21.v(o, str3, ", category=", str4, ", title=");
        f21.v(o, str5, ", body=", str6, ", hasImage=");
        o.append(z);
        o.append(", imagePath=");
        o.append(str7);
        o.append(", createdAt=");
        o.append(str8);
        o.append(", likes=");
        o.append(j);
        o.append(", dislikes=");
        o.append(j2);
        o.append(", commentCount=");
        return f21.k(o, j3, ")");
    }

    public static /* synthetic */ void getAuthorName$annotations() {
    }

    public static /* synthetic */ void getBody$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCommentCount$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDislikes$annotations() {
    }

    public static /* synthetic */ void getHasImage$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImagePath$annotations() {
    }

    public static /* synthetic */ void getLikes$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUserId$annotations() {
    }

    public ForumPostFeedDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, long j, long j2, long j3) {
        hl6.t(str, str3, str4, str5, str6);
        str8.getClass();
        this.id = str;
        this.userId = str2;
        this.authorName = str3;
        this.category = str4;
        this.title = str5;
        this.body = str6;
        this.hasImage = z;
        this.imagePath = str7;
        this.createdAt = str8;
        this.likes = j;
        this.dislikes = j2;
        this.commentCount = j3;
    }

    public /* synthetic */ ForumPostFeedDto(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, long j, long j2, long j3, int i, hl1 hl1Var) {
        long j4;
        ForumPostFeedDto forumPostFeedDto;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14 = (i & 2) != 0 ? null : str2;
        String str15 = (i & 4) != 0 ? "" : str3;
        boolean z2 = (i & 64) != 0 ? false : z;
        String str16 = (i & 128) != 0 ? null : str7;
        long j5 = (i & 512) != 0 ? 0L : j;
        long j6 = (i & 1024) != 0 ? 0L : j2;
        if ((i & 2048) != 0) {
            j4 = 0;
            str9 = str;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            str13 = str8;
            forumPostFeedDto = this;
        } else {
            j4 = j3;
            forumPostFeedDto = this;
            str9 = str;
            str10 = str4;
            str11 = str5;
            str12 = str6;
            str13 = str8;
        }
        new ForumPostFeedDto(str9, str14, str15, str10, str11, str12, z2, str16, str13, j5, j6, j4);
    }
}
