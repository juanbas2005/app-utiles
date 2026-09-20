.class public final Lxk3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:La96;

.field public final b:Ljz0;


# direct methods
.method public constructor <init>(La96;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxk3;->a:La96;

    .line 5
    .line 6
    new-instance p1, Ljz0;

    .line 7
    .line 8
    new-instance v0, Lvk3;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lvk3;-><init>(Lxk3;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lwk3;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lwk3;-><init>(Lxk3;)V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x15

    .line 19
    .line 20
    invoke-direct {p1, v2, v0, v1}, Ljz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxk3;->b:Ljz0;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static a(Ljava/lang/String;)Lq97;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, -0x6a65f2d1

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const v1, 0x24a738

    .line 11
    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const v1, 0x77f979ab

    .line 16
    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    const-string v0, "DELETE"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    sget-object p0, Lq97;->y:Lq97;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string v0, "NONE"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    sget-object p0, Lq97;->w:Lq97;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    const-string v0, "UPSERT"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object p0, Lq97;->x:Lq97;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    const-string v0, "Can\'t convert value to enum, unknown value: "

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static final b(Lxk3;Lq97;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    if-eq p0, p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const-string p0, "DELETE"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lh;->c()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "UPSERT"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    const-string p0, "NONE"

    .line 25
    .line 26
    return-object p0
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
