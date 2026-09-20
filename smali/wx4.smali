.class final Lwx4;
.super Lpl4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lwx4;",
        "Lpl4;",
        "Lzx4;",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ltx4;


# direct methods
.method public constructor <init>(Ltx4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwx4;->w:Ltx4;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lwx4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lwx4;

    .line 7
    .line 8
    iget-object p1, p1, Lwx4;->w:Ltx4;

    .line 9
    .line 10
    iget-object p0, p0, Lwx4;->w:Ltx4;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g()Lll4;
    .locals 2

    .line 1
    new-instance v0, Lzx4;

    .line 2
    .line 3
    iget-object p0, p0, Lwx4;->w:Ltx4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lzx4;-><init>(Ltx4;Lam6;)V

    .line 7
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

.method public final h(Lll4;)V
    .locals 2

    .line 1
    check-cast p1, Lzx4;

    .line 2
    .line 3
    iget-object p0, p0, Lwx4;->w:Ltx4;

    .line 4
    .line 5
    iput-object p0, p1, Lzx4;->K:Ltx4;

    .line 6
    .line 7
    iget-object p0, p1, Lzx4;->L:Lam6;

    .line 8
    .line 9
    iget-object v0, p0, Lam6;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lzx4;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lam6;->x:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    new-instance p0, Lam6;

    .line 19
    .line 20
    const/16 v0, 0x12

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lam6;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p0, p1, Lzx4;->L:Lam6;

    .line 26
    .line 27
    iget-boolean v0, p1, Lll4;->J:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iput-object p1, p0, Lam6;->x:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v1, p0, Lam6;->y:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v1, p1, Lzx4;->M:Lzx4;

    .line 36
    .line 37
    new-instance v0, Lkh;

    .line 38
    .line 39
    const/16 v1, 0xc

    .line 40
    .line 41
    invoke-direct {v0, v1, p1}, Lkh;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lam6;->z:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1}, Lll4;->J0()Lo81;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lam6;->A:Ljava/lang/Object;

    .line 51
    .line 52
    :cond_1
    return-void
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lwx4;->w:Ltx4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    return p0
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
