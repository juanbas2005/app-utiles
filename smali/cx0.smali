.class public final Lcx0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lt54;


# instance fields
.field public final w:Lw54;

.field public x:Lk54;

.field public y:Lk54;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw54;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lw54;-><init>(Lt54;Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcx0;->w:Lw54;

    .line 11
    .line 12
    sget-object v0, Lk54;->x:Lk54;

    .line 13
    .line 14
    iput-object v0, p0, Lcx0;->x:Lk54;

    .line 15
    .line 16
    iput-object v0, p0, Lcx0;->y:Lk54;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcx0;->x:Lk54;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcx0;->y:Lk54;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcx0;->x:Lk54;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcx0;->y:Lk54;

    .line 19
    .line 20
    :goto_0
    iget-object p0, p0, Lcx0;->w:Lw54;

    .line 21
    .line 22
    iget-object v1, p0, Lw54;->E:Lk54;

    .line 23
    .line 24
    sget-object v2, Lk54;->x:Lk54;

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    sget-object v1, Lk54;->w:Lk54;

    .line 29
    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, v0}, Lw54;->h1(Lk54;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public final k()Lin8;
    .locals 0

    .line 1
    iget-object p0, p0, Lcx0;->w:Lw54;

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
