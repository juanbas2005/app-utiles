.class public final synthetic Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lav2;"
    }
.end annotation

.annotation runtime Lfq1;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "cu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile.$serializer",
        "Lav2;",
        "Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;",
        "<init>",
        "()V",
        "Lj42;",
        "encoder",
        "value",
        "Lvs7;",
        "serialize",
        "(Lj42;Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;)V",
        "Lok1;",
        "decoder",
        "deserialize",
        "(Lok1;)Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;",
        "",
        "Lzr3;",
        "childSerializers",
        "()[Lzr3;",
        "Lll6;",
        "descriptor",
        "Lll6;",
        "getDescriptor",
        "()Lll6;",
        "preferences"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->INSTANCE:Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "cu.lestebang.utiletecsa.core.preferences.model.PreferencesUserProfile"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "id"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "userName"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "profilePictureUriString"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->descriptor:Lll6;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lzr3;"
        }
    .end annotation

    .line 1
    sget-object p0, Lt47;->a:Lt47;

    .line 2
    .line 3
    invoke-static {p0}, Lhj8;->x(Lzr3;)Lzr3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x3

    .line 8
    new-array v1, v1, [Lzr3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p0, v1, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object p0, v1, v2

    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    aput-object v0, v1, p0

    .line 18
    .line 19
    return-object v1
    .line 20
    .line 21
.end method

.method public final deserialize(Lok1;)Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->descriptor:Lll6;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v0

    .line 14
    move v5, v1

    .line 15
    move-object v6, v2

    .line 16
    move-object v7, v6

    .line 17
    move-object v8, v7

    .line 18
    :goto_0
    if-eqz v3, :cond_4

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v9, -0x1

    .line 25
    if-eq v4, v9, :cond_3

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    if-eq v4, v0, :cond_1

    .line 30
    .line 31
    const/4 v9, 0x2

    .line 32
    if-ne v4, v9, :cond_0

    .line 33
    .line 34
    sget-object v4, Lt47;->a:Lt47;

    .line 35
    .line 36
    invoke-interface {p1, p0, v9, v4, v8}, Lgy0;->x(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    move-object v8, v4

    .line 41
    check-cast v8, Ljava/lang/String;

    .line 42
    .line 43
    or-int/lit8 v5, v5, 0x4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v4}, Lh;->e(I)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_1
    invoke-interface {p1, p0, v0}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    or-int/lit8 v5, v5, 0x2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-interface {p1, p0, v1}, Lgy0;->n(Lll6;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    or-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v3, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    invoke-direct/range {v4 .. v9}, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V

    .line 73
    .line 74
    .line 75
    return-object v4
    .line 76
.end method

.method public bridge synthetic deserialize(Lok1;)Ljava/lang/Object;
    .locals 0

    .line 76
    invoke-virtual {p0, p1}, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->deserialize(Lok1;)Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;

    move-result-object p0

    return-object p0
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->descriptor:Lll6;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;->write$Self$preferences(Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;Lhy0;Lll6;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public bridge synthetic serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 20
    check-cast p2, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;

    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile$$serializer;->serialize(Lj42;Lcu/lestebang/utiletecsa/core/preferences/model/PreferencesUserProfile;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lzr3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lzr3;"
        }
    .end annotation

    .line 1
    sget-object p0, Ldh4;->x:[Lzr3;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
