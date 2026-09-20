.class public abstract Lwv5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lp2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Luh3;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lpb2;

    .line 15
    .line 16
    invoke-direct {v0}, Lpb2;-><init>()V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    new-instance v0, Lek5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_1
    sput-object v0, Lwv5;->a:Lp2;

    .line 26
    .line 27
    return-void
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


# virtual methods
.method public abstract a()I
.end method

.method public b()I
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Lwv5;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    rem-int/lit16 v1, v0, 0xc6

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    add-int/lit16 v0, v0, 0xc5

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x3

    .line 15
    add-int/2addr p0, v1

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract c()J
.end method

.method public d()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwv5;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public e()J
    .locals 6

    .line 1
    :cond_0
    invoke-virtual {p0}, Lwv5;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x1

    .line 6
    ushr-long/2addr v0, v2

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    rem-long v2, v0, v2

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    const-wide/16 v4, 0x3e7

    .line 13
    .line 14
    add-long/2addr v0, v4

    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v4

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    return-wide v2
.end method
