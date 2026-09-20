.class public final Lsa5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lc24;


# instance fields
.field public final a:Lob5;


# direct methods
.method public constructor <init>(Lob5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsa5;->a:Lob5;

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
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lsa5;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->n()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final b()I
    .locals 1

    .line 1
    iget-object p0, p0, Lsa5;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->n()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Ldb5;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {p0}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lph4;

    .line 20
    .line 21
    iget p0, p0, Lph4;->a:I

    .line 22
    .line 23
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
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

.method public final c()I
    .locals 2

    .line 1
    iget-object p0, p0, Lsa5;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Ldb5;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lza5;->q(Ldb5;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v1, v1, Ldb5;->b:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget p0, p0, Ldb5;->c:I

    .line 36
    .line 37
    add-int/2addr v1, p0

    .line 38
    const/4 p0, 0x1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    return p0

    .line 42
    :cond_1
    div-int/2addr v0, v1

    .line 43
    if-ge v0, p0, :cond_2

    .line 44
    .line 45
    return p0

    .line 46
    :cond_2
    return v0
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

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsa5;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Ldb5;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, Lsa5;->a:Lob5;

    .line 2
    .line 3
    iget p0, p0, Lob5;->e:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
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
