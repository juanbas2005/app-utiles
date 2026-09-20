.class public final Lcq4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lef3;

.field public final b:Lay6;

.field public final c:Lbd5;


# direct methods
.method public constructor <init>(Lef3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcq4;->a:Lef3;

    .line 5
    .line 6
    new-instance p1, Lay6;

    .line 7
    .line 8
    invoke-direct {p1}, Lay6;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcq4;->b:Lay6;

    .line 12
    .line 13
    new-instance p1, Lbd5;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lbd5;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcq4;->c:Lbd5;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcq4;->c:Lbd5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbd5;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit8 v0, v0, -0x5

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    or-int/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final b(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcq4;->c:Lbd5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbd5;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit8 v0, v0, -0x3

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    or-int/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final c(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcq4;->c:Lbd5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbd5;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit8 v0, v0, -0x2

    .line 8
    .line 9
    or-int/2addr p1, v0

    .line 10
    invoke-virtual {p0, p1}, Lbd5;->e(I)V

    .line 11
    .line 12
    .line 13
    return-void
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
