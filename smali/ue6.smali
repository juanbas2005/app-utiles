.class public final Lue6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lre6;
.implements Lif6;


# instance fields
.field public final synthetic w:Lse6;

.field public x:Lw54;

.field public y:Lkg5;


# direct methods
.method public constructor <init>(Lse6;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lue6;->w:Lse6;

    .line 5
    .line 6
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lse6;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/os/Bundle;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lue6;->y:Lkg5;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    new-instance v2, Lhf6;

    .line 27
    .line 28
    new-instance v3, Lhx4;

    .line 29
    .line 30
    const/16 v4, 0x12

    .line 31
    .line 32
    invoke-direct {v3, v4, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, p0, v3}, Lhf6;-><init>(Lif6;Lhx4;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lkg5;

    .line 39
    .line 40
    invoke-direct {v3, v2}, Lkg5;-><init>(Lhf6;)V

    .line 41
    .line 42
    .line 43
    iput-object v3, p0, Lue6;->y:Lkg5;

    .line 44
    .line 45
    invoke-virtual {v3, v1}, Lkg5;->G(Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    new-instance v1, Lhx4;

    .line 49
    .line 50
    const/16 v2, 0x10

    .line 51
    .line 52
    invoke-direct {v1, v2, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1, v0}, Lse6;->a(Lsr2;Ljava/lang/String;)Lcf4;

    .line 56
    .line 57
    .line 58
    return-void
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


# virtual methods
.method public final a(Lsr2;Ljava/lang/String;)Lcf4;
    .locals 0

    .line 1
    iget-object p0, p0, Lue6;->w:Lse6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lse6;->a(Lsr2;Ljava/lang/String;)Lcf4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lue6;->w:Lse6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lse6;->c(Ljava/lang/Object;)Z

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lue6;->w:Lse6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lse6;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lue6;->w:Lse6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lse6;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final h()Lkg5;
    .locals 3

    .line 1
    iget-object v0, p0, Lue6;->y:Lkg5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhf6;

    .line 6
    .line 7
    new-instance v1, Lhx4;

    .line 8
    .line 9
    const/16 v2, 0x12

    .line 10
    .line 11
    invoke-direct {v1, v2, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lhf6;-><init>(Lif6;Lhx4;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lkg5;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lkg5;-><init>(Lhf6;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lue6;->y:Lkg5;

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    invoke-virtual {v1, p0}, Lkg5;->G(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_0
    iget-object p0, v0, Lkg5;->y:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lkg5;

    .line 32
    .line 33
    return-object p0
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

.method public final k()Lin8;
    .locals 2

    .line 1
    iget-object v0, p0, Lue6;->x:Lw54;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw54;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lw54;-><init>(Lt54;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lue6;->x:Lw54;

    .line 12
    .line 13
    :cond_0
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
