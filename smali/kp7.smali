.class public abstract enum Lkp7;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic A:[Lkp7;

.field public static final enum w:Lip7;

.field public static final enum x:Lgp7;

.field public static final enum y:Ljp7;

.field public static final enum z:Lhp7;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lip7;

    .line 2
    .line 3
    invoke-direct {v0}, Lip7;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkp7;->w:Lip7;

    .line 7
    .line 8
    new-instance v1, Lgp7;

    .line 9
    .line 10
    invoke-direct {v1}, Lgp7;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lkp7;->x:Lgp7;

    .line 14
    .line 15
    new-instance v2, Ljp7;

    .line 16
    .line 17
    invoke-direct {v2}, Ljp7;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lkp7;->y:Ljp7;

    .line 21
    .line 22
    new-instance v3, Lhp7;

    .line 23
    .line 24
    invoke-direct {v3}, Lhp7;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v3, Lkp7;->z:Lhp7;

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    new-array v4, v4, [Lkp7;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aput-object v0, v4, v5

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v4, v0

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    aput-object v2, v4, v0

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    aput-object v3, v4, v0

    .line 43
    .line 44
    sput-object v4, Lkp7;->A:[Lkp7;

    .line 45
    .line 46
    return-void
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

.method public static b(Ldu7;)Lkp7;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lvw3;->Q()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkp7;->x:Lgp7;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Lhz2;->L:Lhz2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lhz2;->L0()Luo7;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0}, Lmp7;->f0(Lvw3;)Lfu6;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v1, Lto7;->e:Lto7;

    .line 24
    .line 25
    invoke-static {v0, p0, v1}, Lrj1;->y(Luo7;Lv76;Lo85;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    sget-object p0, Lkp7;->z:Lhp7;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    sget-object p0, Lkp7;->y:Ljp7;

    .line 35
    .line 36
    return-object p0
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

.method public static valueOf(Ljava/lang/String;)Lkp7;
    .locals 1

    .line 1
    const-class v0, Lkp7;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkp7;

    .line 8
    .line 9
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static values()[Lkp7;
    .locals 1

    .line 1
    sget-object v0, Lkp7;->A:[Lkp7;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkp7;

    .line 8
    .line 9
    return-object v0
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
.method public abstract a(Ldu7;)Lkp7;
.end method
