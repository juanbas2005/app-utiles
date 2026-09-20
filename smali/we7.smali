.class public final Lwe7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lwd7;


# instance fields
.field public final synthetic a:Lze7;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lze7;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwe7;->a:Lze7;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwe7;->b:Z

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
.method public final a(JLlj6;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final b()V
    .locals 2

    .line 1
    iget-object p0, p0, Lwe7;->a:Lze7;

    .line 2
    .line 3
    iget-object v0, p0, Lze7;->r:Led5;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lze7;->s:Led5;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lze7;->t(Z)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object p0, p0, Lwe7;->a:Lze7;

    .line 2
    .line 3
    iget-object v0, p0, Lze7;->r:Led5;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lze7;->s:Led5;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lze7;->t(Z)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwe7;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcy2;->x:Lcy2;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Lcy2;->y:Lcy2;

    .line 9
    .line 10
    :goto_0
    iget-object p0, p0, Lwe7;->a:Lze7;

    .line 11
    .line 12
    iget-object v2, p0, Lze7;->r:Led5;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lze7;->l(Z)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Lvj6;->a(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object v2, p0, Lze7;->d:Lu44;

    .line 26
    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-virtual {v2}, Lu44;->d()Lcg7;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v2, v0, v1}, Lcg7;->e(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, Lze7;->o:J

    .line 41
    .line 42
    new-instance v2, Ll35;

    .line 43
    .line 44
    invoke-direct {v2, v0, v1}, Ll35;-><init>(J)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lze7;->s:Led5;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Led5;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    iput-wide v0, p0, Lze7;->q:J

    .line 55
    .line 56
    const/4 v0, -0x1

    .line 57
    iput v0, p0, Lze7;->t:I

    .line 58
    .line 59
    iget-object v0, p0, Lze7;->d:Lu44;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object v0, v0, Lu44;->q:Led5;

    .line 64
    .line 65
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, v0}, Lze7;->t(Z)V

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_1
    return-void
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

.method public final e(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lwe7;->a:Lze7;

    .line 2
    .line 3
    iget-wide v1, v0, Lze7;->q:J

    .line 4
    .line 5
    invoke-static {v1, v2, p1, p2}, Ll35;->e(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iput-wide p1, v0, Lze7;->q:J

    .line 10
    .line 11
    iget-wide v1, v0, Lze7;->o:J

    .line 12
    .line 13
    invoke-static {v1, v2, p1, p2}, Ll35;->e(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    new-instance v1, Ll35;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Ll35;-><init>(J)V

    .line 20
    .line 21
    .line 22
    iget-object p1, v0, Lze7;->s:Led5;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lze7;->n()Lhf7;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lze7;->i()Ll35;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-wide v2, p1, Ll35;->a:J

    .line 39
    .line 40
    sget-object v6, Ld63;->N:Lkj6;

    .line 41
    .line 42
    new-instance v8, Lny2;

    .line 43
    .line 44
    const/16 p1, 0x9

    .line 45
    .line 46
    invoke-direct {v8, p1}, Lny2;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    iget-boolean v5, p0, Lwe7;->b:Z

    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    invoke-static/range {v0 .. v8}, Lze7;->c(Lze7;Lhf7;JZZLlj6;ZLny2;)J

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    invoke-virtual {v0, p0}, Lze7;->t(Z)V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public final onCancel()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
