.class public final Lcr;
.super Lpl4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lbk6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpl4;",
        "Lbk6;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcr;",
        "Lpl4;",
        "Lf71;",
        "Lbk6;",
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
.field public final w:Z

.field public final x:Lvr2;


# direct methods
.method public constructor <init>(Lvr2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lcr;->w:Z

    .line 5
    .line 6
    iput-object p1, p0, Lcr;->x:Lvr2;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lcr;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lcr;

    .line 10
    .line 11
    iget-boolean v0, p1, Lcr;->w:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Lcr;->w:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object p0, p0, Lcr;->x:Lvr2;

    .line 19
    .line 20
    iget-object p1, p1, Lcr;->x:Lvr2;

    .line 21
    .line 22
    if-eq p0, p1, :cond_3

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 27
    return p0
    .line 28
    .line 29
.end method

.method public final f()Lak6;
    .locals 2

    .line 1
    new-instance v0, Lak6;

    .line 2
    .line 3
    invoke-direct {v0}, Lak6;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lcr;->w:Z

    .line 7
    .line 8
    iput-boolean v1, v0, Lak6;->y:Z

    .line 9
    .line 10
    iget-object p0, p0, Lcr;->x:Lvr2;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g()Lll4;
    .locals 3

    .line 1
    new-instance v0, Lf71;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcr;->x:Lvr2;

    .line 5
    .line 6
    iget-boolean p0, p0, Lcr;->w:Z

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, Lf71;-><init>(ZZLvr2;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
    .locals 1

    .line 1
    check-cast p1, Lf71;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcr;->w:Z

    .line 4
    .line 5
    iput-boolean v0, p1, Lf71;->K:Z

    .line 6
    .line 7
    iget-object p0, p0, Lcr;->x:Lvr2;

    .line 8
    .line 9
    iput-object p0, p1, Lf71;->M:Lvr2;

    .line 10
    .line 11
    return-void
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcr;->w:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcr;->x:Lvr2;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
