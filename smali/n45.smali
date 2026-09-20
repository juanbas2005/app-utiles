.class public final Ln45;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lo45;


# direct methods
.method public constructor <init>(Lo45;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln45;->a:Lo45;

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
.method public final onBackCancelled()V
    .locals 5

    .line 1
    iget-object p0, p0, Ln45;->a:Lo45;

    .line 2
    .line 3
    iget-object v0, p0, Lzv4;->a:Lrv4;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v1, p0, Lzv4;->b:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p0, v2}, Lrv4;->e(Lzv4;Lqv4;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Lrv4;->d()V

    .line 16
    .line 17
    .line 18
    iget-boolean v1, v0, Lrv4;->c:Z

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, v0, Lrv4;->d:Law4;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Law4;->h:Lzv4;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget v1, v0, Law4;->g:I

    .line 38
    .line 39
    const/4 v4, -0x1

    .line 40
    if-eq v4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v1, v0, Law4;->f:Ltv4;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Law4;->c(I)Ltv4;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :cond_3
    iput-object v2, v0, Law4;->f:Ltv4;

    .line 52
    .line 53
    iput v3, v0, Law4;->g:I

    .line 54
    .line 55
    iput-object v2, v0, Law4;->h:Lzv4;

    .line 56
    .line 57
    sget-object v4, Lcw4;->a:Lcw4;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iput-object v4, v1, Ltv4;->d:Lew4;

    .line 62
    .line 63
    invoke-virtual {v1}, Ltv4;->c()V

    .line 64
    .line 65
    .line 66
    :cond_4
    iget-object v0, v0, Law4;->a:Ld37;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2, v4}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_0
    iput-boolean v3, p0, Lzv4;->b:Z

    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    const-string p0, "This input is not added to any dispatcher."

    .line 78
    .line 79
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
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

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln45;->a:Lo45;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzv4;->a()V

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
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lag8;->K(Landroid/window/BackEvent;)Lqv4;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, Ln45;->a:Lo45;

    .line 9
    .line 10
    iget-object v0, p0, Lzv4;->a:Lrv4;

    .line 11
    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget-boolean v1, p0, Lzv4;->b:Z

    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-virtual {v0}, Lrv4;->d()V

    .line 19
    .line 20
    .line 21
    iget-boolean v1, v0, Lrv4;->c:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, v0, Lrv4;->d:Law4;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Law4;->h:Lzv4;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_4

    .line 38
    .line 39
    iget p0, v0, Law4;->g:I

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    if-eq v1, p0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object p0, v0, Law4;->f:Ltv4;

    .line 46
    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Law4;->c(I)Ltv4;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_2
    if-eqz p0, :cond_3

    .line 54
    .line 55
    new-instance v2, Ldw4;

    .line 56
    .line 57
    invoke-direct {v2, p1, v1}, Ldw4;-><init>(Lqv4;I)V

    .line 58
    .line 59
    .line 60
    iput-object v2, p0, Ltv4;->d:Lew4;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ltv4;->e(Lqv4;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object p0, v0, Law4;->a:Ld37;

    .line 66
    .line 67
    new-instance v0, Ldw4;

    .line 68
    .line 69
    invoke-direct {v0, p1, v1}, Ldw4;-><init>(Lqv4;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    return-void

    .line 80
    :cond_5
    const-string p0, "This input is not added to any dispatcher."

    .line 81
    .line 82
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
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

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lag8;->K(Landroid/window/BackEvent;)Lqv4;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p0, p0, Ln45;->a:Lo45;

    .line 9
    .line 10
    iget-object v0, p0, Lzv4;->a:Lrv4;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lzv4;->b:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p0, p1}, Lrv4;->e(Lzv4;Lqv4;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lzv4;->b:Z

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    const-string p0, "This input is not added to any dispatcher."

    .line 26
    .line 27
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method
