.class public final Lhd6;
.super Lz65;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic c:I

.field public d:F

.field public final e:F

.field public final synthetic f:Lkd6;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkd6;FF)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lhd6;->c:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhd6;->f:Lkd6;

    .line 8
    .line 9
    new-instance p1, Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lhd6;->g:Ljava/lang/Object;

    .line 15
    .line 16
    iput p2, p0, Lhd6;->d:F

    .line 17
    .line 18
    iput p3, p0, Lhd6;->e:F

    .line 19
    .line 20
    return-void
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

.method public constructor <init>(Lkd6;FFLandroid/graphics/Path;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhd6;->c:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lhd6;->f:Lkd6;

    .line 23
    iput p2, p0, Lhd6;->d:F

    .line 24
    iput p3, p0, Lhd6;->e:F

    .line 25
    iput-object p4, p0, Lhd6;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/String;)V
    .locals 10

    .line 1
    iget v0, p0, Lhd6;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lhd6;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lhd6;->f:Lkd6;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lkd6;->N0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v3, v2, Lkd6;->z:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lid6;

    .line 24
    .line 25
    iget-object v3, v3, Lid6;->d:Landroid/graphics/Paint;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v3, p1, v4, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-direct {v3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lhd6;->d:F

    .line 41
    .line 42
    iget v4, p0, Lhd6;->e:F

    .line 43
    .line 44
    invoke-virtual {v3, v0, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 45
    .line 46
    .line 47
    check-cast v1, Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget v0, p0, Lhd6;->d:F

    .line 53
    .line 54
    iget-object v1, v2, Lkd6;->z:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lid6;

    .line 57
    .line 58
    iget-object v1, v1, Lid6;->d:Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    add-float/2addr p1, v0

    .line 65
    iput p1, p0, Lhd6;->d:F

    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_0
    invoke-virtual {v2}, Lkd6;->N0()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    new-instance v9, Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v0, v2, Lkd6;->z:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lid6;

    .line 82
    .line 83
    iget-object v3, v0, Lid6;->d:Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    iget v7, p0, Lhd6;->d:F

    .line 90
    .line 91
    iget v8, p0, Lhd6;->e:F

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    move-object v4, p1

    .line 95
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 96
    .line 97
    .line 98
    check-cast v1, Landroid/graphics/Path;

    .line 99
    .line 100
    invoke-virtual {v1, v9}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    move-object v4, p1

    .line 105
    :goto_0
    iget p1, p0, Lhd6;->d:F

    .line 106
    .line 107
    iget-object v0, v2, Lkd6;->z:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lid6;

    .line 110
    .line 111
    iget-object v0, v0, Lid6;->d:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-float/2addr v0, p1

    .line 118
    iput v0, p0, Lhd6;->d:F

    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final t(Lwc6;)Z
    .locals 4

    .line 1
    iget v0, p0, Lhd6;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p1, Lxc6;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lxc6;

    .line 14
    .line 15
    iget-object p1, p1, Llc6;->a:Lcf4;

    .line 16
    .line 17
    iget-object v3, v0, Lxc6;->n:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Lcf4;->B(Ljava/lang/String;)Ljc6;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p0, v0, Lxc6;->n:Ljava/lang/String;

    .line 26
    .line 27
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string p1, "TextPath path reference \'%s\' not found"

    .line 32
    .line 33
    invoke-static {p1, p0}, Lkd6;->O(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    check-cast p1, Lvb6;

    .line 38
    .line 39
    new-instance v0, Led6;

    .line 40
    .line 41
    iget-object v3, p1, Lvb6;->o:Lxs0;

    .line 42
    .line 43
    invoke-direct {v0, v3}, Led6;-><init>(Lxs0;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, Llb6;->n:Landroid/graphics/Matrix;

    .line 47
    .line 48
    iget-object v0, v0, Led6;->a:Landroid/graphics/Path;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    .line 56
    .line 57
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lhd6;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Landroid/graphics/RectF;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v1, v2

    .line 72
    :goto_0
    return v1

    .line 73
    :pswitch_0
    instance-of p0, p1, Lxc6;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    const-string p0, "SVGAndroidRenderer"

    .line 78
    .line 79
    const-string p1, "Using <textPath> elements in a clip path is not supported."

    .line 80
    .line 81
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move v1, v2

    .line 86
    :goto_1
    return v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
