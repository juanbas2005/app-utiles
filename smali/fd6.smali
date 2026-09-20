.class public final Lfd6;
.super Lgd6;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final f:Landroid/graphics/Path;

.field public final synthetic g:Lkd6;


# direct methods
.method public constructor <init>(Lkd6;Landroid/graphics/Path;F)V
    .locals 1

    .line 1
    iput-object p1, p0, Lfd6;->g:Lkd6;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p3, v0}, Lgd6;-><init>(Lkd6;FF)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lfd6;->f:Landroid/graphics/Path;

    .line 8
    .line 9
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final K(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lfd6;->g:Lkd6;

    .line 2
    .line 3
    iget-object v1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Landroid/graphics/Canvas;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkd6;->N0()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v1, v0, Lkd6;->z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lid6;

    .line 17
    .line 18
    iget-boolean v3, v1, Lid6;->b:Z

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget v5, p0, Lgd6;->c:F

    .line 23
    .line 24
    iget v6, p0, Lgd6;->d:F

    .line 25
    .line 26
    iget-object v7, v1, Lid6;->d:Landroid/graphics/Paint;

    .line 27
    .line 28
    iget-object v4, p0, Lfd6;->f:Landroid/graphics/Path;

    .line 29
    .line 30
    move-object v3, p1

    .line 31
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v3, p1

    .line 36
    :goto_0
    iget-object p1, v0, Lkd6;->z:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lid6;

    .line 39
    .line 40
    iget-boolean v1, p1, Lid6;->c:Z

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget v5, p0, Lgd6;->c:F

    .line 45
    .line 46
    iget v6, p0, Lgd6;->d:F

    .line 47
    .line 48
    iget-object v7, p1, Lid6;->e:Landroid/graphics/Paint;

    .line 49
    .line 50
    iget-object v4, p0, Lfd6;->f:Landroid/graphics/Path;

    .line 51
    .line 52
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v3, p1

    .line 57
    :cond_2
    :goto_1
    iget p1, p0, Lgd6;->c:F

    .line 58
    .line 59
    iget-object v0, v0, Lkd6;->z:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lid6;

    .line 62
    .line 63
    iget-object v0, v0, Lid6;->d:Landroid/graphics/Paint;

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-float/2addr v0, p1

    .line 70
    iput v0, p0, Lgd6;->c:F

    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
.end method
