.class final Ljq1;
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
        "Ljq1;",
        "Lpl4;",
        "Lkq1;",
        "foundation-layout"
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
.field public final w:Laa8;


# direct methods
.method public constructor <init>(Laa8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljq1;->w:Laa8;

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
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ljq1;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ljq1;

    .line 11
    .line 12
    iget-object p1, p1, Ljq1;->w:Laa8;

    .line 13
    .line 14
    iget-object p0, p0, Ljq1;->w:Laa8;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    return v0

    .line 23
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g()Lll4;
    .locals 2

    .line 1
    new-instance v0, Lkq1;

    .line 2
    .line 3
    sget-object v1, Lfd1;->j:Lkj6;

    .line 4
    .line 5
    invoke-direct {v0}, Ldd3;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ljq1;->w:Laa8;

    .line 9
    .line 10
    iput-object p0, v0, Lkq1;->M:Laa8;

    .line 11
    .line 12
    iput-object v1, v0, Lkq1;->N:Lkj6;

    .line 13
    .line 14
    sget-object p0, Lgl0;->u:Lfg2;

    .line 15
    .line 16
    iput-object p0, v0, Lkq1;->O:Laa8;

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public final h(Lll4;)V
    .locals 2

    .line 1
    check-cast p1, Lkq1;

    .line 2
    .line 3
    sget-object v0, Lfd1;->j:Lkj6;

    .line 4
    .line 5
    iget-object v1, p1, Lkq1;->M:Laa8;

    .line 6
    .line 7
    iget-object p0, p0, Ljq1;->w:Laa8;

    .line 8
    .line 9
    invoke-static {v1, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p1, Lkq1;->N:Lkj6;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    iput-object p0, p1, Lkq1;->M:Laa8;

    .line 22
    .line 23
    iput-object v0, p1, Lkq1;->N:Lkj6;

    .line 24
    .line 25
    iget-object v0, p1, Ldd3;->K:Laa8;

    .line 26
    .line 27
    new-instance v1, Ly72;

    .line 28
    .line 29
    invoke-direct {v1, p0, v0}, Ly72;-><init>(Laa8;Laa8;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p1, Lkq1;->O:Laa8;

    .line 33
    .line 34
    invoke-static {p1}, Lsu0;->B(Lmy3;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, Ljq1;->w:Laa8;

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
    sget-object v0, Lfd1;->j:Lkj6;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
