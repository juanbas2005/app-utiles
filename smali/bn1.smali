.class public final Lbn1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lh81;

.field public final b:Lh81;

.field public final c:Lh81;

.field public final d:Lh81;

.field public final e:Ll05;

.field public final f:Lqm5;

.field public final g:Landroid/graphics/Bitmap$Config;

.field public final h:Z

.field public final i:Leh0;

.field public final j:Leh0;

.field public final k:Leh0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Law1;->a:Ldn1;

    .line 2
    .line 3
    sget-object v0, Lpe4;->a:Lgy2;

    .line 4
    .line 5
    iget-object v0, v0, Lgy2;->B:Lgy2;

    .line 6
    .line 7
    sget-object v1, Lcm1;->y:Lcm1;

    .line 8
    .line 9
    sget-object v2, Li;->b:Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lbn1;->a:Lh81;

    .line 15
    .line 16
    iput-object v1, p0, Lbn1;->b:Lh81;

    .line 17
    .line 18
    iput-object v1, p0, Lbn1;->c:Lh81;

    .line 19
    .line 20
    iput-object v1, p0, Lbn1;->d:Lh81;

    .line 21
    .line 22
    sget-object v0, Lcm7;->a:Ll05;

    .line 23
    .line 24
    iput-object v0, p0, Lbn1;->e:Ll05;

    .line 25
    .line 26
    sget-object v0, Lqm5;->y:Lqm5;

    .line 27
    .line 28
    iput-object v0, p0, Lbn1;->f:Lqm5;

    .line 29
    .line 30
    iput-object v2, p0, Lbn1;->g:Landroid/graphics/Bitmap$Config;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lbn1;->h:Z

    .line 34
    .line 35
    sget-object v0, Leh0;->y:Leh0;

    .line 36
    .line 37
    iput-object v0, p0, Lbn1;->i:Leh0;

    .line 38
    .line 39
    iput-object v0, p0, Lbn1;->j:Leh0;

    .line 40
    .line 41
    iput-object v0, p0, Lbn1;->k:Leh0;

    .line 42
    .line 43
    return-void
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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lbn1;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lbn1;

    .line 9
    .line 10
    iget-object v0, p1, Lbn1;->a:Lh81;

    .line 11
    .line 12
    iget-object v1, p0, Lbn1;->a:Lh81;

    .line 13
    .line 14
    invoke-static {v1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lbn1;->b:Lh81;

    .line 21
    .line 22
    iget-object v1, p1, Lbn1;->b:Lh81;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lbn1;->c:Lh81;

    .line 31
    .line 32
    iget-object v1, p1, Lbn1;->c:Lh81;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lbn1;->d:Lh81;

    .line 41
    .line 42
    iget-object v1, p1, Lbn1;->d:Lh81;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lbn1;->e:Ll05;

    .line 51
    .line 52
    iget-object v1, p1, Lbn1;->e:Ll05;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lbn1;->f:Lqm5;

    .line 61
    .line 62
    iget-object v1, p1, Lbn1;->f:Lqm5;

    .line 63
    .line 64
    if-ne v0, v1, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lbn1;->g:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    iget-object v1, p1, Lbn1;->g:Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    if-ne v0, v1, :cond_1

    .line 71
    .line 72
    iget-boolean v0, p0, Lbn1;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, Lbn1;->h:Z

    .line 75
    .line 76
    if-ne v0, v1, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, Lbn1;->i:Leh0;

    .line 79
    .line 80
    iget-object v1, p1, Lbn1;->i:Leh0;

    .line 81
    .line 82
    if-ne v0, v1, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Lbn1;->j:Leh0;

    .line 85
    .line 86
    iget-object v1, p1, Lbn1;->j:Leh0;

    .line 87
    .line 88
    if-ne v0, v1, :cond_1

    .line 89
    .line 90
    iget-object p0, p0, Lbn1;->k:Leh0;

    .line 91
    .line 92
    iget-object p1, p1, Lbn1;->k:Leh0;

    .line 93
    .line 94
    if-ne p0, p1, :cond_1

    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x1

    .line 97
    return p0

    .line 98
    :cond_1
    const/4 p0, 0x0

    .line 99
    return p0
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

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lbn1;->a:Lh81;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lbn1;->b:Lh81;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lbn1;->c:Lh81;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lbn1;->d:Lh81;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, Lbn1;->e:Ll05;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-class v0, Ll05;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v0, v2

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v2, p0, Lbn1;->f:Lqm5;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/2addr v2, v0

    .line 54
    mul-int/2addr v2, v1

    .line 55
    iget-object v0, p0, Lbn1;->g:Landroid/graphics/Bitmap$Config;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v0, v2

    .line 62
    mul-int/2addr v0, v1

    .line 63
    iget-boolean v2, p0, Lbn1;->h:Z

    .line 64
    .line 65
    invoke-static {v0, v1, v2}, Lhl6;->i(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v2, 0x0

    .line 70
    const v3, 0xe1781

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3, v2}, Lhl6;->i(IIZ)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v2, p0, Lbn1;->i:Leh0;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    add-int/2addr v2, v0

    .line 84
    mul-int/2addr v2, v1

    .line 85
    iget-object v0, p0, Lbn1;->j:Leh0;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    add-int/2addr v0, v2

    .line 92
    mul-int/2addr v0, v1

    .line 93
    iget-object p0, p0, Lbn1;->k:Leh0;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    add-int/2addr p0, v0

    .line 100
    return p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
