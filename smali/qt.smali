.class public final Lqt;
.super Lvb5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lv36;


# static fields
.field public static final P:Lj5;


# instance fields
.field public A:Lig0;

.field public final B:Ld37;

.field public final C:Led5;

.field public final D:Lad5;

.field public final E:Led5;

.field public F:Lmt;

.field public G:Lvb5;

.field public H:Lvr2;

.field public I:Lvr2;

.field public J:Lj51;

.field public K:I

.field public L:Z

.field public final M:Led5;

.field public final N:Led5;

.field public final O:Led5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj5;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj5;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqt;->P:Lj5;

    .line 9
    .line 10
    return-void
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

.method public constructor <init>(Ls83;Ljx5;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lvb5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwu6;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lwu6;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lqt;->B:Ld37;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Lqt;->C:Led5;

    .line 23
    .line 24
    new-instance v1, Lad5;

    .line 25
    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-direct {v1, v2}, Lad5;-><init>(F)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lqt;->D:Lad5;

    .line 32
    .line 33
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lqt;->E:Led5;

    .line 38
    .line 39
    sget-object v0, Lht;->a:Lht;

    .line 40
    .line 41
    iput-object v0, p0, Lqt;->F:Lmt;

    .line 42
    .line 43
    sget-object v1, Lqt;->P:Lj5;

    .line 44
    .line 45
    iput-object v1, p0, Lqt;->H:Lvr2;

    .line 46
    .line 47
    sget-object v1, Li51;->b:Ld63;

    .line 48
    .line 49
    iput-object v1, p0, Lqt;->J:Lj51;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    iput v1, p0, Lqt;->K:I

    .line 53
    .line 54
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lqt;->M:Led5;

    .line 59
    .line 60
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lqt;->N:Led5;

    .line 65
    .line 66
    invoke-static {p2}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lqt;->O:Led5;

    .line 71
    .line 72
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqt;->A:Lig0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lqt;->A:Lig0;

    .line 10
    .line 11
    iget-object p0, p0, Lqt;->G:Lvb5;

    .line 12
    .line 13
    instance-of v0, p0, Lv36;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    check-cast v1, Lv36;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Lv36;->a()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
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
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqt;->A:Lig0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lqt;->A:Lig0;

    .line 10
    .line 11
    iget-object p0, p0, Lqt;->G:Lvb5;

    .line 12
    .line 13
    instance-of v0, p0, Lv36;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    check-cast v1, Lv36;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Lv36;->b()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
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
.end method

.method public final c()V
    .locals 4

    .line 1
    const-string v0, "AsyncImagePainter.onRemembered"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lqt;->A:Lig0;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, Lb85;->d()Lw77;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Law1;->a:Ldn1;

    .line 15
    .line 16
    sget-object v1, Lpe4;->a:Lgy2;

    .line 17
    .line 18
    iget-object v1, v1, Lgy2;->B:Lgy2;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lqt;->A:Lig0;

    .line 29
    .line 30
    iget-object v1, p0, Lqt;->G:Lvb5;

    .line 31
    .line 32
    instance-of v2, v1, Lv36;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, Lv36;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, v3

    .line 41
    :goto_0
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Lv36;->c()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-boolean v1, p0, Lqt;->L:Z

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lqt;->N:Led5;

    .line 51
    .line 52
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ls83;

    .line 57
    .line 58
    invoke-static {v0}, Ls83;->a(Ls83;)Lr83;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lqt;->O:Led5;

    .line 63
    .line 64
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljx5;

    .line 69
    .line 70
    iget-object v1, v1, Ljx5;->b:Lbn1;

    .line 71
    .line 72
    iput-object v1, v0, Lr83;->b:Lbn1;

    .line 73
    .line 74
    iput-object v3, v0, Lr83;->r:Lwf6;

    .line 75
    .line 76
    invoke-virtual {v0}, Lr83;->a()Ls83;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Lkt;

    .line 81
    .line 82
    iget-object v0, v0, Ls83;->A:Lbn1;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v0, Lg;->a:Lbn1;

    .line 88
    .line 89
    invoke-direct {v1, v3}, Lkt;-><init>(Lvb5;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1}, Lqt;->l(Lmt;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    new-instance v1, Lot;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-direct {v1, p0, v3, v2}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x3

    .line 103
    invoke-static {v0, v3, v3, v1, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 112
    .line 113
    .line 114
    throw p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final d(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqt;->D:Lad5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lad5;->e(F)V

    .line 4
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

.method public final e(Llt0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqt;->E:Led5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 4
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

.method public final i()J
    .locals 2

    .line 1
    iget-object p0, p0, Lqt;->C:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvb5;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lvb5;->i()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    return-wide v0
.end method

.method public final j(Lwy3;)V
    .locals 8

    .line 1
    iget-object v0, p1, Lwy3;->w:Ltk0;

    .line 2
    .line 3
    invoke-interface {v0}, Lhz1;->e()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    new-instance v3, Lwu6;

    .line 8
    .line 9
    invoke-direct {v3, v1, v2}, Lwu6;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lqt;->B:Ld37;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lqt;->C:Led5;

    .line 22
    .line 23
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lvb5;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Lhz1;->e()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    iget-object v0, p0, Lqt;->D:Lad5;

    .line 37
    .line 38
    invoke-virtual {v0}, Lad5;->d()F

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object p0, p0, Lqt;->E:Led5;

    .line 43
    .line 44
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object v7, p0

    .line 49
    check-cast v7, Llt0;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lvb5;->g(Lwy3;JFLlt0;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
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

.method public final k(Landroid/graphics/drawable/Drawable;)Lvb5;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lhg;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lhg;-><init>(Landroid/graphics/Bitmap;)V

    .line 14
    .line 15
    .line 16
    iget p0, p0, Lqt;->K:I

    .line 17
    .line 18
    invoke-static {v0, p0}, Lie1;->f(Lhg;I)Ls90;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p0, Lnz1;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Lnz1;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    return-object p0
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
.end method

.method public final l(Lmt;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lqt;->F:Lmt;

    .line 2
    .line 3
    iget-object v1, p0, Lqt;->H:Lvr2;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lmt;

    .line 10
    .line 11
    iput-object p1, p0, Lqt;->F:Lmt;

    .line 12
    .line 13
    iget-object v1, p0, Lqt;->M:Led5;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v1, p1, Llt;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, p1

    .line 24
    check-cast v1, Llt;

    .line 25
    .line 26
    iget-object v1, v1, Llt;->b:Lf77;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v1, p1, Ljt;

    .line 30
    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    check-cast v1, Ljt;

    .line 35
    .line 36
    iget-object v1, v1, Ljt;->b:Ls62;

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v1}, Lt83;->b()Ls83;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v3, v3, Ls83;->h:Lcm7;

    .line 43
    .line 44
    sget-object v4, Ldh4;->a:Lrt;

    .line 45
    .line 46
    invoke-interface {v3, v4, v1}, Lcm7;->a(Lrt;Lt83;)Llm7;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    instance-of v4, v3, Ljc1;

    .line 51
    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    invoke-virtual {v0}, Lmt;->a()Lvb5;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    instance-of v5, v0, Lkt;

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    move-object v7, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v7, v2

    .line 65
    :goto_1
    invoke-virtual {p1}, Lmt;->a()Lvb5;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    iget-object v9, p0, Lqt;->J:Lj51;

    .line 70
    .line 71
    check-cast v3, Ljc1;

    .line 72
    .line 73
    iget v10, v3, Ljc1;->c:I

    .line 74
    .line 75
    instance-of v3, v1, Lf77;

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    check-cast v1, Lf77;

    .line 80
    .line 81
    iget-boolean v1, v1, Lf77;->g:Z

    .line 82
    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    const/4 v1, 0x0

    .line 87
    :goto_2
    move v11, v1

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    :goto_3
    const/4 v1, 0x1

    .line 90
    goto :goto_2

    .line 91
    :goto_4
    new-instance v6, Lhc1;

    .line 92
    .line 93
    invoke-direct/range {v6 .. v11}, Lhc1;-><init>(Lvb5;Lvb5;Lj51;IZ)V

    .line 94
    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_4
    move-object v6, v2

    .line 98
    :goto_5
    if-eqz v6, :cond_5

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_5
    invoke-virtual {p1}, Lmt;->a()Lvb5;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    :goto_6
    iput-object v6, p0, Lqt;->G:Lvb5;

    .line 106
    .line 107
    iget-object v1, p0, Lqt;->C:Led5;

    .line 108
    .line 109
    invoke-virtual {v1, v6}, Led5;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lqt;->A:Lig0;

    .line 113
    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    invoke-virtual {v0}, Lmt;->a()Lvb5;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p1}, Lmt;->a()Lvb5;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eq v1, v3, :cond_9

    .line 125
    .line 126
    invoke-virtual {v0}, Lmt;->a()Lvb5;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    instance-of v1, v0, Lv36;

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    check-cast v0, Lv36;

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_6
    move-object v0, v2

    .line 138
    :goto_7
    if-eqz v0, :cond_7

    .line 139
    .line 140
    invoke-interface {v0}, Lv36;->b()V

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual {p1}, Lmt;->a()Lvb5;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    instance-of v1, v0, Lv36;

    .line 148
    .line 149
    if-eqz v1, :cond_8

    .line 150
    .line 151
    move-object v2, v0

    .line 152
    check-cast v2, Lv36;

    .line 153
    .line 154
    :cond_8
    if-eqz v2, :cond_9

    .line 155
    .line 156
    invoke-interface {v2}, Lv36;->c()V

    .line 157
    .line 158
    .line 159
    :cond_9
    iget-object p0, p0, Lqt;->I:Lvr2;

    .line 160
    .line 161
    if-eqz p0, :cond_a

    .line 162
    .line 163
    invoke-interface {p0, p1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :cond_a
    return-void
    .line 167
.end method
